// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnWafGroupRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Subscribe")
    public String subscribe;

    @NameInMap("TemplateId")
    public Long templateId;

    public static CreateDcdnWafGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnWafGroupRequest self = new CreateDcdnWafGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDcdnWafGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDcdnWafGroupRequest setSubscribe(String subscribe) {
        this.subscribe = subscribe;
        return this;
    }
    public String getSubscribe() {
        return this.subscribe;
    }

    public CreateDcdnWafGroupRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
