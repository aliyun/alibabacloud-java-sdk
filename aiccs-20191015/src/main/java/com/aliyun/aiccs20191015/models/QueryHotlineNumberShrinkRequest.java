// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryHotlineNumberShrinkRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DepartmentId")
    public Long departmentId;

    @NameInMap("GroupIds")
    public String groupIdsShrink;

    @NameInMap("HotlineNumber")
    public String hotlineNumber;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryHotlineNumberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineNumberShrinkRequest self = new QueryHotlineNumberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotlineNumberShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryHotlineNumberShrinkRequest setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public Long getDepartmentId() {
        return this.departmentId;
    }

    public QueryHotlineNumberShrinkRequest setGroupIdsShrink(String groupIdsShrink) {
        this.groupIdsShrink = groupIdsShrink;
        return this;
    }
    public String getGroupIdsShrink() {
        return this.groupIdsShrink;
    }

    public QueryHotlineNumberShrinkRequest setHotlineNumber(String hotlineNumber) {
        this.hotlineNumber = hotlineNumber;
        return this;
    }
    public String getHotlineNumber() {
        return this.hotlineNumber;
    }

    public QueryHotlineNumberShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryHotlineNumberShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
