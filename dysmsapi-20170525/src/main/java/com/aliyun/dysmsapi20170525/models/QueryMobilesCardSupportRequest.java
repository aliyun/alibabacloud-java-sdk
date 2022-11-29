// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryMobilesCardSupportRequest extends TeaModel {
    @NameInMap("Mobiles")
    public java.util.List<java.util.Map<String, ?>> mobiles;

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
