// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceGroupsRequest extends TeaModel {
    /**
     * <p>The keyword of a business process name. The keyword is used to search for business processes whose names contain this keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>Test business process</p>
     */
    @NameInMap("GroupNameKeyword")
    public String groupNameKeyword;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The tenant ID. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    public static ListDataServiceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceGroupsRequest self = new ListDataServiceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceGroupsRequest setGroupNameKeyword(String groupNameKeyword) {
        this.groupNameKeyword = groupNameKeyword;
        return this;
    }
    public String getGroupNameKeyword() {
        return this.groupNameKeyword;
    }

    public ListDataServiceGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataServiceGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataServiceGroupsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataServiceGroupsRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
