// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryHotlineNumberRequest extends TeaModel {
    // 当前页码
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // 部门id（技能组分组）
    @NameInMap("DepartmentId")
    public Long departmentId;

    // 技能组列表
    @NameInMap("GroupIds")
    public java.util.List<Long> groupIds;

    // 号码（支持模糊查询）
    @NameInMap("HotlineNumber")
    public String hotlineNumber;

    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 每页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryHotlineNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineNumberRequest self = new QueryHotlineNumberRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotlineNumberRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryHotlineNumberRequest setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public Long getDepartmentId() {
        return this.departmentId;
    }

    public QueryHotlineNumberRequest setGroupIds(java.util.List<Long> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<Long> getGroupIds() {
        return this.groupIds;
    }

    public QueryHotlineNumberRequest setHotlineNumber(String hotlineNumber) {
        this.hotlineNumber = hotlineNumber;
        return this;
    }
    public String getHotlineNumber() {
        return this.hotlineNumber;
    }

    public QueryHotlineNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryHotlineNumberRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
