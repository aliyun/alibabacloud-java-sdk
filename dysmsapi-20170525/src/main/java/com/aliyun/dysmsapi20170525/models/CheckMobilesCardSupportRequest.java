// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CheckMobilesCardSupportRequest extends TeaModel {
    @NameInMap("Mobiles")
    public java.util.List<java.util.Map<String, ?>> mobiles;

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
