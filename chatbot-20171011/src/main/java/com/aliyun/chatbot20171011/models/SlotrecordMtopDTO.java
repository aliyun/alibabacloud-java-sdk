// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class SlotrecordMtopDTO extends TeaModel {
    // Id
    @NameInMap("Id")
    public String id;

    // Question
    @NameInMap("Question")
    public java.util.List<String> question;

    // LifeSpan
    @NameInMap("LifeSpan")
    public Integer lifeSpan;

    // Name
    @NameInMap("Name")
    public String name;

    // IsArray
    @NameInMap("IsArray")
    public Boolean isArray;

    // Value
    @NameInMap("Value")
    public String value;

    // IsNecessary
    @NameInMap("IsNecessary")
    public Boolean isNecessary;

    // Tags
    @NameInMap("Tags")
    public java.util.List<TagMtopDTO> tags;

    public static SlotrecordMtopDTO build(java.util.Map<String, ?> map) throws Exception {
        SlotrecordMtopDTO self = new SlotrecordMtopDTO();
        return TeaModel.build(map, self);
    }

    public SlotrecordMtopDTO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SlotrecordMtopDTO setQuestion(java.util.List<String> question) {
        this.question = question;
        return this;
    }
    public java.util.List<String> getQuestion() {
        return this.question;
    }

    public SlotrecordMtopDTO setLifeSpan(Integer lifeSpan) {
        this.lifeSpan = lifeSpan;
        return this;
    }
    public Integer getLifeSpan() {
        return this.lifeSpan;
    }

    public SlotrecordMtopDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SlotrecordMtopDTO setIsArray(Boolean isArray) {
        this.isArray = isArray;
        return this;
    }
    public Boolean getIsArray() {
        return this.isArray;
    }

    public SlotrecordMtopDTO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public SlotrecordMtopDTO setIsNecessary(Boolean isNecessary) {
        this.isNecessary = isNecessary;
        return this;
    }
    public Boolean getIsNecessary() {
        return this.isNecessary;
    }

    public SlotrecordMtopDTO setTags(java.util.List<TagMtopDTO> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<TagMtopDTO> getTags() {
        return this.tags;
    }

}
