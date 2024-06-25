// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCardSmsTemplateRequest extends TeaModel {
    /**
     * <p>The code of the message template.</p>
     * <p>You can view the template code in the <strong>Template Code</strong> column on the <strong>Templates</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
     * <blockquote>
     * <p>Make sure that the message template has been approved.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CARD_SMS_4139</p>
     */
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
