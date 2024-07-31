// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCalcEnginesRequest extends TeaModel {
    /**
     * <p>The type of the compute engine. The value of this parameter is not case-sensitive. Valid values:</p>
     * <ul>
     * <li><strong>ODPS</strong></li>
     * <li><strong>EMR</strong></li>
     * <li><strong>BLINK</strong></li>
     * <li><strong>HOLO</strong></li>
     * <li><strong>MaxGraph</strong></li>
     * <li><strong>HYBRIDDB_FOR_POSTGRESQL</strong></li>
     * <li><strong>ADB_MYSQL</strong></li>
     * <li><strong>HADOOP_CDH</strong></li>
     * <li><strong>CLICKHOUSE</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ODPS</p>
     */
    @NameInMap("CalcEngineType")
    public String calcEngineType;

    /**
     * <p>The environment in which the compute engine is used. Valid values:</p>
     * <ul>
     * <li><strong>DEV</strong></li>
     * <li><strong>PRD</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRD</p>
     */
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>The name of the compute engine, which must be exactly matched.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
     * <p>The ID of the DataWorks workspace with which the compute engine is associated.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>27</p>
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
