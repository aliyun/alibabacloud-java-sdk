// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetTicketTemplateSchemaRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    public static GetTicketTemplateSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTicketTemplateSchemaRequest self = new GetTicketTemplateSchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetTicketTemplateSchemaRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
