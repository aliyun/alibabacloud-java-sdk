// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CheckMobilesCardSupportRequest extends TeaModel {
    /**
     * <p>The list of mobile phone numbers that receive messages.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mobiles")
    public java.util.List<java.util.Map<String, ?>> mobiles;

    /**
     * <p>The code of the message template. You can view the template code in the <strong>Template Code</strong> column on the <strong>Templates</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
     * <blockquote>
     * <p>Make sure that the message template has been approved.</p>
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
