// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryMobilesCardSupportResponseBody extends TeaModel {
    /**
     * <p>请求状态码。</p>
     * <ul>
     * <li>返回OK代表请求成功。</li>
     * <li>其他错误码，请参见<a href="https://help.aliyun.com/document_detail/101346.html">错误码列表</a>。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public QueryMobilesCardSupportResponseBodyData data;

    /**
     * <p>阿里云为该请求生成的唯一标识符。</p>
     * 
     * <strong>example:</strong>
     * <p>08C17DFE-2E10-54F4-BAFB-7180039CC217</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>调用接口是否成功。取值：</p>
     * <ul>
     * <li><p><strong>true</strong>：调用成功。</p>
     * </li>
     * <li><p><strong>false</strong>：调用失败。</p>
     * </li>
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
         * <p>查询的手机号码。</p>
         * 
         * <strong>example:</strong>
         * <p>1380000****</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>是否支持卡片短信。取值：</p>
         * <ul>
         * <li><strong>true</strong>：支持。</li>
         * <li><strong>false</strong>：不支持。</li>
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
         * <p>查询值。</p>
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
