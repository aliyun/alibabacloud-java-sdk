// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryUsageStatisticsByTagIdResponseBody extends TeaModel {
    /**
     * <p>The response code. **OK** indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryUsageStatisticsByTagIdResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryUsageStatisticsByTagIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUsageStatisticsByTagIdResponseBody self = new QueryUsageStatisticsByTagIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUsageStatisticsByTagIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUsageStatisticsByTagIdResponseBody setData(java.util.List<QueryUsageStatisticsByTagIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryUsageStatisticsByTagIdResponseBodyData> getData() {
        return this.data;
    }

    public QueryUsageStatisticsByTagIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUsageStatisticsByTagIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUsageStatisticsByTagIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUsageStatisticsByTagIdResponseBodyData extends TeaModel {
        /**
         * <p>The authorization code.</p>
         */
        @NameInMap("AuthorizationCode")
        public String authorizationCode;

        /**
         * <p>The numbers for which the query failed.</p>
         */
        @NameInMap("FailTotal")
        public Long failTotal;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("GmtDateStr")
        public String gmtDateStr;

        /**
         * <p>The ID of the authorization code usage record.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The industry name.</p>
         */
        @NameInMap("IndustryName")
        public String industryName;

        /**
         * <p>The customer product ID (PID).</p>
         */
        @NameInMap("PartnerId")
        public Long partnerId;

        /**
         * <p>The scene name.</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>The numbers for which the query succeeded.</p>
         */
        @NameInMap("SuccessTotal")
        public Long successTotal;

        /**
         * <p>The tag name.</p>
         */
        @NameInMap("TagId")
        public Long tagId;

        /**
         * <p>The tag name.</p>
         */
        @NameInMap("TagName")
        public String tagName;

        /**
         * <p>The total quantity of numbers that are involved in the query.</p>
         */
        @NameInMap("Total")
        public Long total;

        public static QueryUsageStatisticsByTagIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryUsageStatisticsByTagIdResponseBodyData self = new QueryUsageStatisticsByTagIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryUsageStatisticsByTagIdResponseBodyData setAuthorizationCode(String authorizationCode) {
            this.authorizationCode = authorizationCode;
            return this;
        }
        public String getAuthorizationCode() {
            return this.authorizationCode;
        }

        public QueryUsageStatisticsByTagIdResponseBodyData setFailTotal(Long failTotal) {
            this.failTotal = failTotal;
            return this;
        }
        public Long getFailTotal() {
            return this.failTotal;
        }

        public QueryUsageStatisticsByTagIdResponseBodyData setGmtDateStr(String gmtDateStr) {
            this.gmtDateStr = gmtDateStr;
            return this;
        }
        public String getGmtDateStr() {
            return this.gmtDateStr;
        }

        public QueryUsageStatisticsByTagIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryUsageStatisticsByTagIdResponseBodyData setIndustryName(String industryName) {
            this.industryName = industryName;
            return this;
        }
        public String getIndustryName() {
            return this.industryName;
        }

        public QueryUsageStatisticsByTagIdResponseBodyData setPartnerId(Long partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public Long getPartnerId() {
            return this.partnerId;
        }

        public QueryUsageStatisticsByTagIdResponseBodyData setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryUsageStatisticsByTagIdResponseBodyData setSuccessTotal(Long successTotal) {
            this.successTotal = successTotal;
            return this;
        }
        public Long getSuccessTotal() {
            return this.successTotal;
        }

        public QueryUsageStatisticsByTagIdResponseBodyData setTagId(Long tagId) {
            this.tagId = tagId;
            return this;
        }
        public Long getTagId() {
            return this.tagId;
        }

        public QueryUsageStatisticsByTagIdResponseBodyData setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public QueryUsageStatisticsByTagIdResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
