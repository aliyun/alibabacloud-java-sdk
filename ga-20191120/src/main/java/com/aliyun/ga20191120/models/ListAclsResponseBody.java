// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListAclsResponseBody extends TeaModel {
    /**
     * <p>The network ACLs.</p>
     */
    @NameInMap("Acls")
    public java.util.List<ListAclsResponseBodyAcls> acls;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If **NextToken** is not returned, it indicates that no additional results exist.</p>
     * <p>*   If **NextToken** is returned, the value is the token that is used for the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAclsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAclsResponseBody self = new ListAclsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAclsResponseBody setAcls(java.util.List<ListAclsResponseBodyAcls> acls) {
        this.acls = acls;
        return this;
    }
    public java.util.List<ListAclsResponseBodyAcls> getAcls() {
        return this.acls;
    }

    public ListAclsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAclsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAclsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAclsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAclsResponseBodyAclsTags extends TeaModel {
        /**
         * <p>The tag key of the network ACL.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the network ACL.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAclsResponseBodyAclsTags build(java.util.Map<String, ?> map) throws Exception {
            ListAclsResponseBodyAclsTags self = new ListAclsResponseBodyAclsTags();
            return TeaModel.build(map, self);
        }

        public ListAclsResponseBodyAclsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAclsResponseBodyAclsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAclsResponseBodyAcls extends TeaModel {
        /**
         * <p>The ID of the network ACL.</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>The name of the network ACL.</p>
         */
        @NameInMap("AclName")
        public String aclName;

        /**
         * <p>The status of the network ACL. Valid values:</p>
         * <br>
         * <p>*   **init**: The network ACL is being initialized.</p>
         * <p>*   **active**: The network ACL is available.</p>
         * <p>*   **configuring**: The network ACL is being configured.</p>
         * <p>*   **updating**: The network ACL is being updated.</p>
         * <p>*   **deleting:** The network ACL is being deleted.</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        /**
         * <p>The IP version of the network ACL. Valid values:</p>
         * <br>
         * <p>*   **IPv4**</p>
         * <p>*   **IPv6**</p>
         */
        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags of the network ACL.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListAclsResponseBodyAclsTags> tags;

        public static ListAclsResponseBodyAcls build(java.util.Map<String, ?> map) throws Exception {
            ListAclsResponseBodyAcls self = new ListAclsResponseBodyAcls();
            return TeaModel.build(map, self);
        }

        public ListAclsResponseBodyAcls setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public ListAclsResponseBodyAcls setAclName(String aclName) {
            this.aclName = aclName;
            return this;
        }
        public String getAclName() {
            return this.aclName;
        }

        public ListAclsResponseBodyAcls setAclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public String getAclStatus() {
            return this.aclStatus;
        }

        public ListAclsResponseBodyAcls setAddressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

        public ListAclsResponseBodyAcls setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListAclsResponseBodyAcls setTags(java.util.List<ListAclsResponseBodyAclsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListAclsResponseBodyAclsTags> getTags() {
            return this.tags;
        }

    }

}
