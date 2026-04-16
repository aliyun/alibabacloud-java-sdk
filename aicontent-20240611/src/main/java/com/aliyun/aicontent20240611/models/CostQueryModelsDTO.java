// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class CostQueryModelsDTO extends TeaModel {
    @NameInMap("columns")
    public java.util.List<MetricDefRespDTO> columns;

    /**
     * <strong>example:</strong>
     * <p>model_id</p>
     */
    @NameInMap("idField")
    public String idField;

    /**
     * <strong>example:</strong>
     * <p>model_name</p>
     */
    @NameInMap("nameField")
    public String nameField;

    @NameInMap("rows")
    public java.util.List<ModelRowDTO> rows;

    public static CostQueryModelsDTO build(java.util.Map<String, ?> map) throws Exception {
        CostQueryModelsDTO self = new CostQueryModelsDTO();
        return TeaModel.build(map, self);
    }

    public CostQueryModelsDTO setColumns(java.util.List<MetricDefRespDTO> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<MetricDefRespDTO> getColumns() {
        return this.columns;
    }

    public CostQueryModelsDTO setIdField(String idField) {
        this.idField = idField;
        return this;
    }
    public String getIdField() {
        return this.idField;
    }

    public CostQueryModelsDTO setNameField(String nameField) {
        this.nameField = nameField;
        return this;
    }
    public String getNameField() {
        return this.nameField;
    }

    public CostQueryModelsDTO setRows(java.util.List<ModelRowDTO> rows) {
        this.rows = rows;
        return this;
    }
    public java.util.List<ModelRowDTO> getRows() {
        return this.rows;
    }

}
