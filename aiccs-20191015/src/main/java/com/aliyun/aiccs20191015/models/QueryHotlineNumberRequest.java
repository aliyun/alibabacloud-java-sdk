// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryHotlineNumberRequest extends TeaModel {
    /**
     * <p>The current page number. The value must be greater than <strong>0</strong>. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The department ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2256****</p>
     */
    @NameInMap("DepartmentId")
    public Long departmentId;

    /**
     * <p>The list of skill groups.</p>
     */
    @NameInMap("GroupIds")
    public java.util.List<Long> groupIds;

    /**
     * <p>The hotline number. Fuzzy query is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>0571****2211</p>
     */
    @NameInMap("HotlineNumber")
    public String hotlineNumber;

    /**
     * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID.
     * You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries per page. The value must be greater than <strong>0</strong>. Default value: <strong>20</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
