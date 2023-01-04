// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListUsersForApplicationRequest extends TeaModel {
    // 应用的唯一标识。
    @NameInMap("ApplicationId")
    public String applicationId;

    // IDaaS EIAM实例的ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 当前查询的列表页码，默认为1。
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 当前查询的列表页码，默认为20。
    @NameInMap("PageSize")
    public Long pageSize;

    // 非必填，如果填写则可以基于账户ID进行过滤，列表中最多包含100个元素。
    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    public static ListUsersForApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersForApplicationRequest self = new ListUsersForApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersForApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListUsersForApplicationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListUsersForApplicationRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersForApplicationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListUsersForApplicationRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

}
