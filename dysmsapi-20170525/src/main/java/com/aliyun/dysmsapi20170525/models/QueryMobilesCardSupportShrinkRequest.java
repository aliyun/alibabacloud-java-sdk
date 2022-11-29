// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryMobilesCardSupportShrinkRequest extends TeaModel {
    @NameInMap("Mobiles")
    public String mobilesShrink;

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
