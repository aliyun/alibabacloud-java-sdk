// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class GetRoomStatisticsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    @NameInMap("Result")
    public GetRoomStatisticsResponseBodyResult result;

    public static GetRoomStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoomStatisticsResponseBody self = new GetRoomStatisticsResponseBody();
        return TeaModel.build(map, self);
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

    public GetRoomStatisticsResponseBody setResult(GetRoomStatisticsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRoomStatisticsResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetRoomStatisticsResponseBodyResult extends TeaModel {
        @NameInMap("OnlineCount")
        public Integer onlineCount;

        @NameInMap("PV")
        public Integer PV;

        @NameInMap("UV")
        public Integer UV;

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

        public GetRoomStatisticsResponseBodyResult setPV(Integer PV) {
            this.PV = PV;
            return this;
        }
        public Integer getPV() {
            return this.PV;
        }

        public GetRoomStatisticsResponseBodyResult setUV(Integer UV) {
            this.UV = UV;
            return this;
        }
        public Integer getUV() {
            return this.UV;
        }

    }

}
