// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectMembersRequest extends TeaModel {
    /**
     * <p>The page number. Valid values: 1 to 30. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>27</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListProjectMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMembersRequest self = new ListProjectMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectMembersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectMembersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectMembersRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
