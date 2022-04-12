// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteConfigTemplateRequest extends TeaModel {
    // 配置模板ID
    @NameInMap("Id")
    public Long id;

    public static DeleteConfigTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigTemplateRequest self = new DeleteConfigTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigTemplateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
