// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryHotlineNumberRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DepartmentId")
    public Long departmentId;

    @NameInMap("GroupIds")
    public java.util.List<Long> groupIds;

    @NameInMap("HotlineNumber")
    public String hotlineNumber;

    @NameInMap("InstanceId")
    public String instanceId;

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
