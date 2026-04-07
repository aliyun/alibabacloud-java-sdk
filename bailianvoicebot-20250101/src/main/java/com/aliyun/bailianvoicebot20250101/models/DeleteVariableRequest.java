// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class DeleteVariableRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-rj6aqmctjcit4acy</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <strong>example:</strong>
     * <p>82ea16d1-425c-4c03-9be5-cc91de9779ed</p>
     */
    @NameInMap("VariableId")
    public String variableId;

    public static DeleteVariableRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVariableRequest self = new DeleteVariableRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVariableRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public DeleteVariableRequest setVariableId(String variableId) {
        this.variableId = variableId;
        return this;
    }
    public String getVariableId() {
        return this.variableId;
    }

}
