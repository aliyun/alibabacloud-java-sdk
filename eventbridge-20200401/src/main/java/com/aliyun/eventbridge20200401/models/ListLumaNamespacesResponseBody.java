// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaNamespacesResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates a successful call. A specific error code is returned upon failure.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of namespaces bound to the Agent. All results are returned at once without pagination.</p>
     */
    @NameInMap("Data")
    public ListLumaNamespacesResponseBodyData data;

    /**
     * <p>The message returned by the operation. The value is Operation success when the call succeeds, or a specific error description when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, used for troubleshooting and ticket feedback.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListLumaNamespacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLumaNamespacesResponseBody self = new ListLumaNamespacesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLumaNamespacesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLumaNamespacesResponseBody setData(ListLumaNamespacesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLumaNamespacesResponseBodyData getData() {
        return this.data;
    }

    public ListLumaNamespacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLumaNamespacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLumaNamespacesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLumaNamespacesResponseBodyData extends TeaModel {
        /**
         * <p>本次请求实际生效的每页数量。未传 Limit 时为服务端默认值，超出上限时为收敛后的值</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Limit")
        public Integer limit;

        /**
         * <p>The list of namespaces bound to the Agent.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Name&quot;:&quot;my_namespace&quot;}]</p>
         */
        @NameInMap("Namespaces")
        public java.util.List<Namespace> namespaces;

        /**
         * <p>下一页起始Token，传入下次请求的 NextToken 可获取下一页；为空表示已无更多数据</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>Agent 绑定的命名空间总数，与本页返回条数无关</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListLumaNamespacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLumaNamespacesResponseBodyData self = new ListLumaNamespacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLumaNamespacesResponseBodyData setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public ListLumaNamespacesResponseBodyData setNamespaces(java.util.List<Namespace> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<Namespace> getNamespaces() {
            return this.namespaces;
        }

        public ListLumaNamespacesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListLumaNamespacesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
