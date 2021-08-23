// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasSwitchCaseDTO extends TeaModel {
    // Id
    @NameInMap("Id")
    public String id;

    // Label
    @NameInMap("Label")
    public String label;

    // Type
    @NameInMap("Type")
    public String type;

    // Value
    @NameInMap("Value")
    public String value;

    // VariableName
    @NameInMap("VariableName")
    public String variableName;

    public static PaasSwitchCaseDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasSwitchCaseDTO self = new PaasSwitchCaseDTO();
        return TeaModel.build(map, self);
    }

    public PaasSwitchCaseDTO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public PaasSwitchCaseDTO setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public PaasSwitchCaseDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PaasSwitchCaseDTO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public PaasSwitchCaseDTO setVariableName(String variableName) {
        this.variableName = variableName;
        return this;
    }
    public String getVariableName() {
        return this.variableName;
    }

}
