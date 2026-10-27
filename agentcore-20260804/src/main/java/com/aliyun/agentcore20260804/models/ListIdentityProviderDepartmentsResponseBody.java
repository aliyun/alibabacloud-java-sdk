// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListIdentityProviderDepartmentsResponseBody extends TeaModel {
    /**
     * <p>The business status code of the API request. SUCCESS indicates that the request is successful, but does not indicate that the asynchronous synchronization task is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code of the API request, which does not indicate the execution result of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The direct child departments on the current page under the current parent department. You must make another query to obtain the details of the child departments.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;id&quot;:&quot;10001&quot;,&quot;name&quot;:&quot;R&amp;D Department&quot;,&quot;parentId&quot;:&quot;1&quot;,&quot;memberCount&quot;:12,&quot;hasChildren&quot;:true}]</p>
     */
    @NameInMap("items")
    public java.util.List<ListIdentityProviderDepartmentsResponseBodyItems> items;

    /**
     * <p>The number of items per page used for this query.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message of the API request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The token for the next page. An empty or missing value indicates that there are no subsequent pages at the current hierarchy level of the parent department, but does not indicate that the entire department tree has been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>example-next-page-token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The unique identifier of the request. Provide this value when troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>01234567-89AB-CDEF-0123-456789ABCDEF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the API request is successful. To check whether an asynchronous task is completed, query the task status.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of departments. This operation does not provide this statistic and may not return this field. Do not treat a missing value as 0.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListIdentityProviderDepartmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityProviderDepartmentsResponseBody self = new ListIdentityProviderDepartmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIdentityProviderDepartmentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIdentityProviderDepartmentsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListIdentityProviderDepartmentsResponseBody setItems(java.util.List<ListIdentityProviderDepartmentsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListIdentityProviderDepartmentsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListIdentityProviderDepartmentsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIdentityProviderDepartmentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIdentityProviderDepartmentsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIdentityProviderDepartmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIdentityProviderDepartmentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListIdentityProviderDepartmentsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIdentityProviderDepartmentsResponseBodyItems extends TeaModel {
        /**
         * <p>Indicates whether the department has child departments. A value of true indicates that the department has child departments and an expansion entry can be displayed accordingly. A value of false indicates a leaf node. If this field is not returned, the status is unknown. You must use the ID of the current node to make another query to obtain the details of the child departments.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("hasChildren")
        public Boolean hasChildren;

        /**
         * <p>The unique identifier of the department returned by the identity provider. When querying the child departments of this node, use this value as the parentDepartmentId.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The number of members in the department returned by the identity provider. This field is not returned when the number is unknown. Do not treat a missing value as 0.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("memberCount")
        public Long memberCount;

        /**
         * <p>The name of the department returned by the identity provider.</p>
         * 
         * <strong>example:</strong>
         * <p>R&amp;D Department</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The ID of the parent department to which this department belongs. This value describes the parent-child relationship and is not used to expand the current node.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("parentId")
        public String parentId;

        public static ListIdentityProviderDepartmentsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListIdentityProviderDepartmentsResponseBodyItems self = new ListIdentityProviderDepartmentsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListIdentityProviderDepartmentsResponseBodyItems setHasChildren(Boolean hasChildren) {
            this.hasChildren = hasChildren;
            return this;
        }
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        public ListIdentityProviderDepartmentsResponseBodyItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListIdentityProviderDepartmentsResponseBodyItems setMemberCount(Long memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Long getMemberCount() {
            return this.memberCount;
        }

        public ListIdentityProviderDepartmentsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIdentityProviderDepartmentsResponseBodyItems setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

    }

}
