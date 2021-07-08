// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetRoomStatisticsResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 请求是否成功。
    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    // 错误码，请求异常时返回。
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息，请求异常时返回。
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求的返回结果。
    @NameInMap("Result")
    public GetRoomStatisticsResponseBodyResult result;

    public static GetRoomStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoomStatisticsResponseBody self = new GetRoomStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoomStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoomStatisticsResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public GetRoomStatisticsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetRoomStatisticsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRoomStatisticsResponseBody setResult(GetRoomStatisticsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRoomStatisticsResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetRoomStatisticsResponseBodyResult extends TeaModel {
        // 当前房间的在线观众数。
        @NameInMap("OnlineCount")
        public Integer onlineCount;

        // 当前房间的历史用户访问数目（UV）。
        @NameInMap("UV")
        public Integer UV;

        // 当前房间的历史访问数目（PV）。
        @NameInMap("PV")
        public Integer PV;

        public static GetRoomStatisticsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRoomStatisticsResponseBodyResult self = new GetRoomStatisticsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRoomStatisticsResponseBodyResult setOnlineCount(Integer onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Integer getOnlineCount() {
            return this.onlineCount;
        }

        public GetRoomStatisticsResponseBodyResult setUV(Integer UV) {
            this.UV = UV;
            return this;
        }
        public Integer getUV() {
            return this.UV;
        }

        public GetRoomStatisticsResponseBodyResult setPV(Integer PV) {
            this.PV = PV;
            return this;
        }
        public Integer getPV() {
            return this.PV;
        }

    }

}
