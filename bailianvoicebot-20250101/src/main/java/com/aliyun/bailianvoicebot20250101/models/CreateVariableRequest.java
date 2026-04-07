// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class CreateVariableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-baployoyopf22m2r</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>userType</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVariableRequest self = new CreateVariableRequest();
        return TeaModel.build(map, self);
    }

    public CreateVariableRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public CreateVariableRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVariableRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateVariableRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
