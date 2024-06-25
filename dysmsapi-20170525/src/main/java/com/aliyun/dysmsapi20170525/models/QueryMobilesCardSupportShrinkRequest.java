// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryMobilesCardSupportShrinkRequest extends TeaModel {
    /**
     * <p>The list of mobile phone numbers.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mobiles")
    public String mobilesShrink;

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

    public static QueryMobilesCardSupportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMobilesCardSupportShrinkRequest self = new QueryMobilesCardSupportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryMobilesCardSupportShrinkRequest setMobilesShrink(String mobilesShrink) {
        this.mobilesShrink = mobilesShrink;
        return this;
    }
    public String getMobilesShrink() {
        return this.mobilesShrink;
    }

    public QueryMobilesCardSupportShrinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
