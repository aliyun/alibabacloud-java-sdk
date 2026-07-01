// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRCSTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    public static QueryRCSTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRCSTemplateRequest self = new QueryRCSTemplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryRCSTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
