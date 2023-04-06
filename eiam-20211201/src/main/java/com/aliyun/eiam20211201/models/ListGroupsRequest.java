// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsRequest extends TeaModel {
    /**
     * <p>组外部ID。</p>
     */
    @NameInMap("GroupExternalId")
    public String groupExternalId;

    /**
     * <p>组ID列表，size最大限制100。</p>
     */
    @NameInMap("GroupIds")
    public java.util.List<String> groupIds;

    /**
     * <p>组名称，长度最大限制64。</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>组名称，长度最大限制64。</p>
     */
    @NameInMap("GroupNameStartsWith")
    public String groupNameStartsWith;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>当前查询的列表页码，默认为1。</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>当前查询的列表页码，默认为20。</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static ListGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsRequest self = new ListGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupsRequest setGroupExternalId(String groupExternalId) {
        this.groupExternalId = groupExternalId;
        return this;
    }
    public String getGroupExternalId() {
        return this.groupExternalId;
    }

    public ListGroupsRequest setGroupIds(java.util.List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    public ListGroupsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListGroupsRequest setGroupNameStartsWith(String groupNameStartsWith) {
        this.groupNameStartsWith = groupNameStartsWith;
        return this;
    }
    public String getGroupNameStartsWith() {
        return this.groupNameStartsWith;
    }

    public ListGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListGroupsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListGroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
