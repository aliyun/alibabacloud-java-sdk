// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCardSmsTemplateRequest extends TeaModel {
    /**
     * <p>The code of the card SMS template. Valid values:</p>
     * <ul>
     * <li><p>After you call the <a href="~~CreateCardSmsTemplate~~">CreateCardSmsTemplate</a> operation, the value of the <strong>TemplateCode</strong> response parameter is the code of the newly created card SMS template.</p>
     * </li>
     * <li><p>You can also log on to the <a href="https://dysms.console.aliyun.com/domestic/card">Domestic Card SMS</a> page in the console and view the card SMS template code on the <strong>Template Management</strong> tab.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CARD_SMS_2****</p>
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
