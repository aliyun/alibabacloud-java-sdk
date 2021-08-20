// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityResultsByEntityRequest extends TeaModel {
    @NameInMap("EntityId")
    public Integer entityId;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ProjectName")
    public String projectName;

    public static ListQualityResultsByEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQualityResultsByEntityRequest self = new ListQualityResultsByEntityRequest();
        return TeaModel.build(map, self);
    }

    public ListQualityResultsByEntityRequest setEntityId(Integer entityId) {
        this.entityId = entityId;
        return this;
    }
    public Integer getEntityId() {
        return this.entityId;
    }

    public ListQualityResultsByEntityRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ListQualityResultsByEntityRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListQualityResultsByEntityRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListQualityResultsByEntityRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListQualityResultsByEntityRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
