// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCalcEnginesRequest extends TeaModel {
    /**
     * <p>The type of the compute engine instance. Valid values: `ODPS`, `EMR`, `BLINK`, `HOLO`, `MaxGraph`, `HYBRIDDB_FOR_POSTGRESQL`, `ADB_MYSQL`, and `HADOOP_CDH`. The values are not case-sensitive.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CalcEngineType")
    public String calcEngineType;

    /**
     * <p>The environment in which the compute engine instance runs. Valid values: DEV and PRD. The value DEV indicates the development environment, and the value PRD indicates the production environment.</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The name of the compute engine instance that you want to query. Only exact match is supported.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 100. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The DataWorks workspace with which the compute engine instances are associated.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ListCalcEnginesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCalcEnginesRequest self = new ListCalcEnginesRequest();
        return TeaModel.build(map, self);
    }

    public ListCalcEnginesRequest setCalcEngineType(String calcEngineType) {
        this.calcEngineType = calcEngineType;
        return this;
    }
    public String getCalcEngineType() {
        return this.calcEngineType;
    }

    public ListCalcEnginesRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public ListCalcEnginesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCalcEnginesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCalcEnginesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCalcEnginesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
