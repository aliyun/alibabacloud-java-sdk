// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CostModelDetailRespDTO extends TeaModel {
    @NameInMap("columns")
    public java.util.List<MetricDefRespDTO> columns;

    /**
     * <strong>example:</strong>
     * <p>hourly</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("modelId")
    public Long modelId;

    @NameInMap("modelName")
    public String modelName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("rows")
    public java.util.List<CostModelDetailRowDTO> rows;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Integer total;

    public static CostModelDetailRespDTO build(java.util.Map<String, ?> map) throws Exception {
        CostModelDetailRespDTO self = new CostModelDetailRespDTO();
        return TeaModel.build(map, self);
    }

    public CostModelDetailRespDTO setColumns(java.util.List<MetricDefRespDTO> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<MetricDefRespDTO> getColumns() {
        return this.columns;
    }

    public CostModelDetailRespDTO setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public CostModelDetailRespDTO setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

    public CostModelDetailRespDTO setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CostModelDetailRespDTO setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public CostModelDetailRespDTO setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CostModelDetailRespDTO setRows(java.util.List<CostModelDetailRowDTO> rows) {
        this.rows = rows;
        return this;
    }
    public java.util.List<CostModelDetailRowDTO> getRows() {
        return this.rows;
    }

    public CostModelDetailRespDTO setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
