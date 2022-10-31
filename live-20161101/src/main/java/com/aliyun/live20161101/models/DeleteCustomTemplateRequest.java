// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCustomTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Template")
    public String template;

    public static DeleteCustomTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomTemplateRequest self = new DeleteCustomTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteCustomTemplateRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
