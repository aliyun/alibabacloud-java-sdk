// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListListenersByConfigResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>202</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The information about listeners.</p>
     */
    @NameInMap("Listeners")
    public java.util.List<ListListenersByConfigResponseBodyListeners> listeners;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>75E1442F-11EC-567A-9CF0-5A36F7904F39</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListListenersByConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListListenersByConfigResponseBody self = new ListListenersByConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListListenersByConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListListenersByConfigResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListListenersByConfigResponseBody setListeners(java.util.List<ListListenersByConfigResponseBodyListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<ListListenersByConfigResponseBodyListeners> getListeners() {
        return this.listeners;
    }

    public ListListenersByConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListListenersByConfigResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListListenersByConfigResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListListenersByConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListListenersByConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListListenersByConfigResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListListenersByConfigResponseBodyListeners extends TeaModel {
        /**
         * <p>The IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The label of the listener.</p>
         */
        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        @NameInMap("MatchRuleName")
        public String matchRuleName;

        @NameInMap("MatchRuleType")
        public String matchRuleType;

        /**
         * <p>The verification string.</p>
         * 
         * <strong>example:</strong>
         * <p>23sdfdf</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>beta</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The current version of the listener. Valid values: gray and normal.</p>
         * 
         * <strong>example:</strong>
         * <p>gray</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListListenersByConfigResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            ListListenersByConfigResponseBodyListeners self = new ListListenersByConfigResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public ListListenersByConfigResponseBodyListeners setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListListenersByConfigResponseBodyListeners setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ListListenersByConfigResponseBodyListeners setMatchRuleName(String matchRuleName) {
            this.matchRuleName = matchRuleName;
            return this;
        }
        public String getMatchRuleName() {
            return this.matchRuleName;
        }

        public ListListenersByConfigResponseBodyListeners setMatchRuleType(String matchRuleType) {
            this.matchRuleType = matchRuleType;
            return this;
        }
        public String getMatchRuleType() {
            return this.matchRuleType;
        }

        public ListListenersByConfigResponseBodyListeners setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListListenersByConfigResponseBodyListeners setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListListenersByConfigResponseBodyListeners setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
