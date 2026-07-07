// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurchaseBotInstanceRequest extends TeaModel {
    /**
     * <p>The bot instance specifications.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enterprise_bot</p>
     */
    @NameInMap("BotInstanceLevel")
    public String botInstanceLevel;

    /**
     * <p>The site instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-23kde*****</p>
     */
    @NameInMap("SiteInstanceId")
    public String siteInstanceId;

    public static PurchaseBotInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        PurchaseBotInstanceRequest self = new PurchaseBotInstanceRequest();
        return TeaModel.build(map, self);
    }

    public PurchaseBotInstanceRequest setBotInstanceLevel(String botInstanceLevel) {
        this.botInstanceLevel = botInstanceLevel;
        return this;
    }
    public String getBotInstanceLevel() {
        return this.botInstanceLevel;
    }

    public PurchaseBotInstanceRequest setSiteInstanceId(String siteInstanceId) {
        this.siteInstanceId = siteInstanceId;
        return this;
    }
    public String getSiteInstanceId() {
        return this.siteInstanceId;
    }

}
