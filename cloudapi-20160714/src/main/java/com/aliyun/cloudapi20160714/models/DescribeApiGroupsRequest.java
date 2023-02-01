// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("EnableTagAuth")
    public Boolean enableTagAuth;

    /**
     * <p>The keyword that can be specified in the name of the API group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The order. Valid values: asc and desc. Default value: desc.</p>
     * <br>
     * <p>*   asc: The API groups are displayed in ascending order of modification time.</p>
     * <p>*   desc: The API groups are displayed in descending order of modification time.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries to return on each page. Maximum value: 50. Default value: 10.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Specifies whether to enable tag verification.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The key of the tag.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeApiGroupsRequestTag> tag;

    public static DescribeApiGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupsRequest self = new DescribeApiGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupsRequest setEnableTagAuth(Boolean enableTagAuth) {
        this.enableTagAuth = enableTagAuth;
        return this;
    }
    public Boolean getEnableTagAuth() {
        return this.enableTagAuth;
    }

    public DescribeApiGroupsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiGroupsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeApiGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeApiGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApiGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApiGroupsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeApiGroupsRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeApiGroupsRequest setTag(java.util.List<DescribeApiGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeApiGroupsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeApiGroupsRequestTag extends TeaModel {
        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The number of pages to return the results on.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeApiGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGroupsRequestTag self = new DescribeApiGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeApiGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApiGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
