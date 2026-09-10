// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class UpdateVariableRequest extends TeaModel {
    /**
     * <p>The ID of the Model Studio business unit.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-0rxabdztx7rsdi7n</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <p>The description of the variable.</p>
     * 
     * <strong>example:</strong>
     * <p>用户当前年龄</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name of the variable.</p>
     * 
     * <strong>example:</strong>
     * <p>年龄</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The ID of the variable.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
     */
    @NameInMap("VariableId")
    public String variableId;

    public static UpdateVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVariableRequest self = new UpdateVariableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVariableRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public UpdateVariableRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateVariableRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateVariableRequest setVariableId(String variableId) {
        this.variableId = variableId;
        return this;
    }
    public String getVariableId() {
        return this.variableId;
    }

}
