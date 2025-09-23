// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetBiddingRemainLimitNumResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetBiddingRemainLimitNumResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetBiddingRemainLimitNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBiddingRemainLimitNumResponseBody self = new GetBiddingRemainLimitNumResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBiddingRemainLimitNumResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBiddingRemainLimitNumResponseBody setData(GetBiddingRemainLimitNumResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBiddingRemainLimitNumResponseBodyData getData() {
        return this.data;
    }

    public GetBiddingRemainLimitNumResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBiddingRemainLimitNumResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBiddingRemainLimitNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBiddingRemainLimitNumResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBiddingRemainLimitNumResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RemainNum")
        public Integer remainNum;

        public static GetBiddingRemainLimitNumResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBiddingRemainLimitNumResponseBodyData self = new GetBiddingRemainLimitNumResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBiddingRemainLimitNumResponseBodyData setRemainNum(Integer remainNum) {
            this.remainNum = remainNum;
            return this;
        }
        public Integer getRemainNum() {
            return this.remainNum;
        }

    }

}
