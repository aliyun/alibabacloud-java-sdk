// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPrivateLinkSecurityGroupsResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ListPrivateLinkSecurityGroupsResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>479AE38F-A574-52F7-87EA-E91199999F9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListPrivateLinkSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateLinkSecurityGroupsResponseBody self = new ListPrivateLinkSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivateLinkSecurityGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPrivateLinkSecurityGroupsResponseBody setData(ListPrivateLinkSecurityGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPrivateLinkSecurityGroupsResponseBodyData getData() {
        return this.data;
    }

    public ListPrivateLinkSecurityGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPrivateLinkSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPrivateLinkSecurityGroupsResponseBodyDataItems extends TeaModel {
        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp1ftp5sm9os***</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The security group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Product Center Cluster Security Group</p>
         */
        @NameInMap("securityGroupName")
        public String securityGroupName;

        /**
         * <p>Specifies whether the resource is created by a service account. Valid values:</p>
         * <ul>
         * <li>0: The resource is not created by a service account.</li>
         * <li>1: The resource is created by a service account.</li>
         * </ul>
         */
        @NameInMap("serviceManaged")
        public Boolean serviceManaged;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf61resqa9am***</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static ListPrivateLinkSecurityGroupsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateLinkSecurityGroupsResponseBodyDataItems self = new ListPrivateLinkSecurityGroupsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListPrivateLinkSecurityGroupsResponseBodyDataItems setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListPrivateLinkSecurityGroupsResponseBodyDataItems setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

        public ListPrivateLinkSecurityGroupsResponseBodyDataItems setServiceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        public ListPrivateLinkSecurityGroupsResponseBodyDataItems setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListPrivateLinkSecurityGroupsResponseBodyData extends TeaModel {
        /**
         * <p>The source information.</p>
         */
        @NameInMap("items")
        public java.util.List<ListPrivateLinkSecurityGroupsResponseBodyDataItems> items;

        /**
         * <p>The maximum number of results returned for this query.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("maxResults")
        public Integer maxResults;

        /**
         * <p>The token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("nextToken")
        public String nextToken;

        public static ListPrivateLinkSecurityGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateLinkSecurityGroupsResponseBodyData self = new ListPrivateLinkSecurityGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPrivateLinkSecurityGroupsResponseBodyData setItems(java.util.List<ListPrivateLinkSecurityGroupsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListPrivateLinkSecurityGroupsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListPrivateLinkSecurityGroupsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListPrivateLinkSecurityGroupsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
