// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class QueryApplicationAccessIdResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public QueryApplicationAccessIdResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static QueryApplicationAccessIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationAccessIdResponseBody self = new QueryApplicationAccessIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryApplicationAccessIdResponseBody setData(QueryApplicationAccessIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryApplicationAccessIdResponseBodyData getData() {
        return this.data;
    }

    public QueryApplicationAccessIdResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public QueryApplicationAccessIdResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public QueryApplicationAccessIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryApplicationAccessIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryApplicationAccessIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryApplicationAccessIdResponseBodyData extends TeaModel {
        /**
         * <p>The application access ID (appkey).</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("applicationAccessId")
        public String applicationAccessId;

        /**
         * <p>The application access secret. This parameter is returned only for requests from the Alibaba Cloud console.</p>
         * 
         * <strong>example:</strong>
         * <p>MyAppSecret</p>
         */
        @NameInMap("applicationAccessSecret")
        public String applicationAccessSecret;

        public static QueryApplicationAccessIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryApplicationAccessIdResponseBodyData self = new QueryApplicationAccessIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryApplicationAccessIdResponseBodyData setApplicationAccessId(String applicationAccessId) {
            this.applicationAccessId = applicationAccessId;
            return this;
        }
        public String getApplicationAccessId() {
            return this.applicationAccessId;
        }

        public QueryApplicationAccessIdResponseBodyData setApplicationAccessSecret(String applicationAccessSecret) {
            this.applicationAccessSecret = applicationAccessSecret;
            return this;
        }
        public String getApplicationAccessSecret() {
            return this.applicationAccessSecret;
        }

    }

}
