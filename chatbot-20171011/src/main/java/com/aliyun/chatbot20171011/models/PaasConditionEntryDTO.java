// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasConditionEntryDTO extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // Term
    @NameInMap("Term")
    public String term;

    // Name
    @NameInMap("Name")
    public String name;

    // Type
    @NameInMap("Type")
    public String type;

    // Value
    @NameInMap("Value")
    public String value;

    public static PaasConditionEntryDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasConditionEntryDTO self = new PaasConditionEntryDTO();
        return TeaModel.build(map, self);
    }

    public PaasConditionEntryDTO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public PaasConditionEntryDTO setTerm(String term) {
        this.term = term;
        return this;
    }
    public String getTerm() {
        return this.term;
    }

    public PaasConditionEntryDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PaasConditionEntryDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PaasConditionEntryDTO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
