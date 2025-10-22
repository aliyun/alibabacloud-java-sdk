// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BatchQueryPushStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Module")
    public BatchQueryPushStatusResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2w6Olxc+cMPjUtUMpkYDWvKnFIdUFubQkRvn9xkmy/JSvFWO/sGLK3bhha5w==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>2DEDFF32-7827-46B1-BE90-3DB8ABD91A58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchQueryPushStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryPushStatusResponseBody self = new BatchQueryPushStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchQueryPushStatusResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public BatchQueryPushStatusResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchQueryPushStatusResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public BatchQueryPushStatusResponseBody setModule(BatchQueryPushStatusResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public BatchQueryPushStatusResponseBodyModule getModule() {
        return this.module;
    }

    public BatchQueryPushStatusResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public BatchQueryPushStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchQueryPushStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchQueryPushStatusResponseBodyModulePushResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20250518100817SjskYtIe</p>
         */
        @NameInMap("OutBizId")
        public String outBizId;

        /**
         * <strong>example:</strong>
         * <p>123213231123</p>
         */
        @NameInMap("PushNo")
        public String pushNo;

        /**
         * <strong>example:</strong>
         * <p>RECEIVE_SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>接收成功</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        public static BatchQueryPushStatusResponseBodyModulePushResults build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryPushStatusResponseBodyModulePushResults self = new BatchQueryPushStatusResponseBodyModulePushResults();
            return TeaModel.build(map, self);
        }

        public BatchQueryPushStatusResponseBodyModulePushResults setOutBizId(String outBizId) {
            this.outBizId = outBizId;
            return this;
        }
        public String getOutBizId() {
            return this.outBizId;
        }

        public BatchQueryPushStatusResponseBodyModulePushResults setPushNo(String pushNo) {
            this.pushNo = pushNo;
            return this;
        }
        public String getPushNo() {
            return this.pushNo;
        }

        public BatchQueryPushStatusResponseBodyModulePushResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchQueryPushStatusResponseBodyModulePushResults setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

    }

    public static class BatchQueryPushStatusResponseBodyModule extends TeaModel {
        @NameInMap("PushResults")
        public java.util.List<BatchQueryPushStatusResponseBodyModulePushResults> pushResults;

        public static BatchQueryPushStatusResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryPushStatusResponseBodyModule self = new BatchQueryPushStatusResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public BatchQueryPushStatusResponseBodyModule setPushResults(java.util.List<BatchQueryPushStatusResponseBodyModulePushResults> pushResults) {
            this.pushResults = pushResults;
            return this;
        }
        public java.util.List<BatchQueryPushStatusResponseBodyModulePushResults> getPushResults() {
            return this.pushResults;
        }

    }

}
