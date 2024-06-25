// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryMobilesCardSupportResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryMobilesCardSupportResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>08C17DFE-2E10-54F4-BAFB-7180039CC217</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryMobilesCardSupportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMobilesCardSupportResponseBody self = new QueryMobilesCardSupportResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMobilesCardSupportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryMobilesCardSupportResponseBody setData(QueryMobilesCardSupportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryMobilesCardSupportResponseBodyData getData() {
        return this.data;
    }

    public QueryMobilesCardSupportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMobilesCardSupportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMobilesCardSupportResponseBodyDataQueryResult extends TeaModel {
        /**
         * <p>The mobile phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1380000****</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>Indicates whether the mobile phone number supports card messages. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Support")
        public Boolean support;

        public static QueryMobilesCardSupportResponseBodyDataQueryResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMobilesCardSupportResponseBodyDataQueryResult self = new QueryMobilesCardSupportResponseBodyDataQueryResult();
            return TeaModel.build(map, self);
        }

        public QueryMobilesCardSupportResponseBodyDataQueryResult setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryMobilesCardSupportResponseBodyDataQueryResult setSupport(Boolean support) {
            this.support = support;
            return this;
        }
        public Boolean getSupport() {
            return this.support;
        }

    }

    public static class QueryMobilesCardSupportResponseBodyData extends TeaModel {
        /**
         * <p>The list of returned results.</p>
         */
        @NameInMap("QueryResult")
        public java.util.List<QueryMobilesCardSupportResponseBodyDataQueryResult> queryResult;

        public static QueryMobilesCardSupportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMobilesCardSupportResponseBodyData self = new QueryMobilesCardSupportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMobilesCardSupportResponseBodyData setQueryResult(java.util.List<QueryMobilesCardSupportResponseBodyDataQueryResult> queryResult) {
            this.queryResult = queryResult;
            return this;
        }
        public java.util.List<QueryMobilesCardSupportResponseBodyDataQueryResult> getQueryResult() {
            return this.queryResult;
        }

    }

}
