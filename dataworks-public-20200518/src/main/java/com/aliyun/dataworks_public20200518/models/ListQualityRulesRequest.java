// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityRulesRequest extends TeaModel {
    /**
     * <p>The ID of the partition filter expression. You can call the [GetQualityEntity](https://help.aliyun.com/document_detail/174003.html) operation to query the ID of the partition filter expression.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EntityId")
    public Long entityId;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 20.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The name of the compute engine instance or data source. You can obtain the name from data source configurations.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static ListQualityRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQualityRulesRequest self = new ListQualityRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListQualityRulesRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public ListQualityRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListQualityRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListQualityRulesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListQualityRulesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
