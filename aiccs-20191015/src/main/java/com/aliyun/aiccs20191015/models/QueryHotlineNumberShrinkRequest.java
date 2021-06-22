// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryHotlineNumberShrinkRequest extends TeaModel {
    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 当前页码
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // 每页大小
    @NameInMap("PageSize")
    public Integer pageSize;

    // 号码（支持模糊查询）
    @NameInMap("HotlineNumber")
    public String hotlineNumber;

    // 部门id（技能组分组）
    @NameInMap("DepartmentId")
    public Long departmentId;

    // 技能组列表
    @NameInMap("GroupIds")
    public String groupIdsShrink;

    public static QueryHotlineNumberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineNumberShrinkRequest self = new QueryHotlineNumberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotlineNumberShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryHotlineNumberShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryHotlineNumberShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryHotlineNumberShrinkRequest setHotlineNumber(String hotlineNumber) {
        this.hotlineNumber = hotlineNumber;
        return this;
    }
    public String getHotlineNumber() {
        return this.hotlineNumber;
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

}
