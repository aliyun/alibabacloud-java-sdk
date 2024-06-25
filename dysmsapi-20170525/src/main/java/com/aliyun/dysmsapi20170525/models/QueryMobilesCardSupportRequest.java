// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryMobilesCardSupportRequest extends TeaModel {
    /**
     * <p>The list of mobile phone numbers.</p>
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
     * <p>CARD_SMS_0000</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    public static QueryMobilesCardSupportRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMobilesCardSupportRequest self = new QueryMobilesCardSupportRequest();
        return TeaModel.build(map, self);
    }

    public QueryMobilesCardSupportRequest setMobiles(java.util.List<java.util.Map<String, ?>> mobiles) {
        this.mobiles = mobiles;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getMobiles() {
        return this.mobiles;
    }

    public QueryMobilesCardSupportRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
