// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForUserRequest extends TeaModel {
    /**
     * <p>非必填，如果填写则可以基于应用ID进行过滤，列表中最多包含100个元素。</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

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

    /**
     * <p>有两种查询模式，IncludeInherit-包含继承的权限，OnlyDirect-不包含继承的权限，默认值：OnlyDirect</p>
     */
    @NameInMap("QueryMode")
    public String queryMode;

    /**
     * <p>账户的唯一标识。</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ListApplicationsForUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForUserRequest self = new ListApplicationsForUserRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForUserRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public ListApplicationsForUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListApplicationsForUserRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListApplicationsForUserRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListApplicationsForUserRequest setQueryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }
    public String getQueryMode() {
        return this.queryMode;
    }

    public ListApplicationsForUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
