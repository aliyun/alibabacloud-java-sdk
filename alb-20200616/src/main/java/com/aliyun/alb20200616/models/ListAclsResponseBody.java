// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAclsResponseBody extends TeaModel {
    /**
     * <p>A list of ACLs.</p>
     */
    @NameInMap("Acls")
    public java.util.List<ListAclsResponseBodyAcls> acls;

    /**
     * <p>The maximum number of network ACLs returned. This parameter is optional. Valid values: <strong>1</strong> to <strong>100</strong>. If this parameter is not set, the default value <strong>20</strong> is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, it indicates that no next query is to be sent.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70t****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>593B0448-D13E-4C56-AC0D-FDF0FDE0E9A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
         * <p>The tag key. The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
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
         * <p>The ACL ID.</p>
         * 
         * <strong>example:</strong>
         * <p>nacl-hp34s2h0xx1ht4nwo****</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>The name of the ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>test-acl</p>
         */
        @NameInMap("AclName")
        public String aclName;

        /**
         * <p>The status of the ACL. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The network ACL is being created.</li>
         * <li><strong>Available</strong>: The network ACL is available.</li>
         * <li><strong>Configuring</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("AclStatus")
        public String aclStatus;

        /**
         * <p>The IP version of the ACL. Only <strong>IPv4</strong> may be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        /**
         * <p>Indicates whether configuration management is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ConfigManagedEnabled")
        public Boolean configManagedEnabled;

        /**
         * <p>The time when the ACL was created. The follows the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-15T07:37:33Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rtopty****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tags.</p>
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

        public ListAclsResponseBodyAcls setConfigManagedEnabled(Boolean configManagedEnabled) {
            this.configManagedEnabled = configManagedEnabled;
            return this;
        }
        public Boolean getConfigManagedEnabled() {
            return this.configManagedEnabled;
        }

        public ListAclsResponseBodyAcls setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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
