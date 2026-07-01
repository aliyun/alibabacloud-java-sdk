// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CheckMobilesCardSupportRequest extends TeaModel {
    /**
     * <p>The list of phone numbers to be queried.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mobiles")
    public java.util.List<java.util.Map<String, ?>> mobiles;

    /**
     * <p>The code of the card SMS template.
     * Log on to the SMS Service console and go to the <a href="https://dysms.console.aliyun.com/domestic/card">Domestic Card SMS</a> page. On the <strong>Template Management</strong> tab, you can view the list of card SMS templates.</p>
     * <blockquote>
     * <p>The template must be added and approved.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CARD_SMS_****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    public static CheckMobilesCardSupportRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMobilesCardSupportRequest self = new CheckMobilesCardSupportRequest();
        return TeaModel.build(map, self);
    }

    public CheckMobilesCardSupportRequest setMobiles(java.util.List<java.util.Map<String, ?>> mobiles) {
        this.mobiles = mobiles;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getMobiles() {
        return this.mobiles;
    }

    public CheckMobilesCardSupportRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
