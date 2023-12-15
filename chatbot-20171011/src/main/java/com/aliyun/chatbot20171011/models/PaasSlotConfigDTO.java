// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class PaasSlotConfigDTO extends TeaModel {
    @NameInMap("IsArray")
    public Boolean isArray;

    @NameInMap("IsNecessary")
    public Boolean isNecessary;

    @NameInMap("LifeSpan")
    public Integer lifeSpan;

    @NameInMap("Name")
    public String name;

    @NameInMap("Question")
    public java.util.List<String> question;

    @NameInMap("Value")
    public String value;

    public static PaasSlotConfigDTO build(java.util.Map<String, ?> map) throws Exception {
        PaasSlotConfigDTO self = new PaasSlotConfigDTO();
        return TeaModel.build(map, self);
    }

    public PaasSlotConfigDTO setIsArray(Boolean isArray) {
        this.isArray = isArray;
        return this;
    }
    public Boolean getIsArray() {
        return this.isArray;
    }

    public PaasSlotConfigDTO setIsNecessary(Boolean isNecessary) {
        this.isNecessary = isNecessary;
        return this;
    }
    public Boolean getIsNecessary() {
        return this.isNecessary;
    }

    public PaasSlotConfigDTO setLifeSpan(Integer lifeSpan) {
        this.lifeSpan = lifeSpan;
        return this;
    }
    public Integer getLifeSpan() {
        return this.lifeSpan;
    }

    public PaasSlotConfigDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PaasSlotConfigDTO setQuestion(java.util.List<String> question) {
        this.question = question;
        return this;
    }
    public java.util.List<String> getQuestion() {
        return this.question;
    }

    public PaasSlotConfigDTO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
