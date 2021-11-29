// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCardSmsTemplateRequest extends TeaModel {
    @NameInMap("TemplateCode")
    public String templateCode;

    public static QueryCardSmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsTemplateRequest self = new QueryCardSmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
