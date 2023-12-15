// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasConditionEntryDTO extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Term")
    public String term;

    @NameInMap("Type")
    public String type;

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

    public PaasConditionEntryDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PaasConditionEntryDTO setTerm(String term) {
        this.term = term;
        return this;
    }
    public String getTerm() {
        return this.term;
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
