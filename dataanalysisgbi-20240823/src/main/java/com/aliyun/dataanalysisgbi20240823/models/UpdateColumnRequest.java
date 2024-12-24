// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class UpdateColumnRequest extends TeaModel {
    @NameInMap("chineseName")
    public String chineseName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>column-AAAAAAAAh6cWOUPagYstkg</p>
     */
    @NameInMap("columnIdKey")
    public String columnIdKey;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("enumType")
    public Integer enumType;

    @NameInMap("enumValues")
    public java.util.List<String> enumValues;

    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("rangeMax")
    public Long rangeMax;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("rangeMin")
    public Long rangeMin;

    @NameInMap("samples")
    public java.util.List<String> samples;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>table-AAAAAAAAFQBwSLJkUj4CYg</p>
     */
    @NameInMap("tableIdKey")
    public String tableIdKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-2v3934xtp49esw64</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static UpdateColumnRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateColumnRequest self = new UpdateColumnRequest();
        return TeaModel.build(map, self);
    }

    public UpdateColumnRequest setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public UpdateColumnRequest setColumnIdKey(String columnIdKey) {
        this.columnIdKey = columnIdKey;
        return this;
    }
    public String getColumnIdKey() {
        return this.columnIdKey;
    }

    public UpdateColumnRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateColumnRequest setEnumType(Integer enumType) {
        this.enumType = enumType;
        return this;
    }
    public Integer getEnumType() {
        return this.enumType;
    }

    public UpdateColumnRequest setEnumValues(java.util.List<String> enumValues) {
        this.enumValues = enumValues;
        return this;
    }
    public java.util.List<String> getEnumValues() {
        return this.enumValues;
    }

    public UpdateColumnRequest setRangeMax(Long rangeMax) {
        this.rangeMax = rangeMax;
        return this;
    }
    public Long getRangeMax() {
        return this.rangeMax;
    }

    public UpdateColumnRequest setRangeMin(Long rangeMin) {
        this.rangeMin = rangeMin;
        return this;
    }
    public Long getRangeMin() {
        return this.rangeMin;
    }

    public UpdateColumnRequest setSamples(java.util.List<String> samples) {
        this.samples = samples;
        return this;
    }
    public java.util.List<String> getSamples() {
        return this.samples;
    }

    public UpdateColumnRequest setTableIdKey(String tableIdKey) {
        this.tableIdKey = tableIdKey;
        return this;
    }
    public String getTableIdKey() {
        return this.tableIdKey;
    }

    public UpdateColumnRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
