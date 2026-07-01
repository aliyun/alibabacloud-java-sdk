// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryMobilesCardSupportShrinkRequest extends TeaModel {
    /**
     * <p>The encryption method for the phone number. Valid values:</p>
     * <ul>
     * <li>SHA1: SHA1 encryption.</li>
     * <li>NORMAL: no encryption. The phone number is transmitted in plaintext.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EncryptType")
    public String encryptType;

    /**
     * <p>The list of phone numbers.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mobiles")
    public String mobilesShrink;

    /**
     * <p>The code of the card SMS template. To view the code, log on to the console and choose <strong>Domestic Messages</strong> &gt; <a href="https://dysms.console.aliyun.com/domestic/text/template">Template Management</a>.</p>
     * <blockquote>
     * <p>The template must be added and approved.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CARD_SMS_2****</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    public static QueryMobilesCardSupportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMobilesCardSupportShrinkRequest self = new QueryMobilesCardSupportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryMobilesCardSupportShrinkRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
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
