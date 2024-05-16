// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCalcEnginesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CalcEngineType")
    public String calcEngineType;

    @NameInMap("EnvType")
    public String envType;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
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
