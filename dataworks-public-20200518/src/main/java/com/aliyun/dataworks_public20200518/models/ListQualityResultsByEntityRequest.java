// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListQualityResultsByEntityRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The ID of the partition filter expression. You can call the [GetQualityEntity](~~174003~~) operation to query the ID of the partition filter expression.</p>
     */
    @NameInMap("EntityId")
    public Integer entityId;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the compute engine instance or data source. You can obtain the name from data source configurations.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static ListQualityResultsByEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQualityResultsByEntityRequest self = new ListQualityResultsByEntityRequest();
        return TeaModel.build(map, self);
    }

    public ListQualityResultsByEntityRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListQualityResultsByEntityRequest setEntityId(Integer entityId) {
        this.entityId = entityId;
        return this;
    }
    public Integer getEntityId() {
        return this.entityId;
    }

    public ListQualityResultsByEntityRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListQualityResultsByEntityRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListQualityResultsByEntityRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ListQualityResultsByEntityRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
