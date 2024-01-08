// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnWafGroupRequest extends TeaModel {
    /**
     * <p>The name of the WAF rule group. The name can be up to 128 characters in length. This parameter is required when you create a custom WAF rule group.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to enable subscription. Valid values:</p>
     * <br>
     * <p>*   **on**</p>
     * <p>*   **off**</p>
     * <br>
     * <p>When you replicate a custom rule group, do not specify this parameter.</p>
     */
    @NameInMap("Subscribe")
    public String subscribe;

    /**
     * <p>The ID of the rule group to be replicated. This parameter is required when you replicate a custom WAF rule group. You can call the [DescribeDcdnWafGroups](~~DescribeDcdnWafGroups~~) operation to query the ID of the rule group. If no template is used, set the value to 0 or do not specify this parameter.</p>
     */
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
