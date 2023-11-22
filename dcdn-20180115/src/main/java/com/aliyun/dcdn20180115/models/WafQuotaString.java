// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class WafQuotaString extends TeaModel {
    @NameInMap("Regexp")
    public String regexp;

    public static WafQuotaString build(java.util.Map<String, ?> map) throws Exception {
        WafQuotaString self = new WafQuotaString();
        return TeaModel.build(map, self);
    }

    public WafQuotaString setRegexp(String regexp) {
        this.regexp = regexp;
        return this;
    }
    public String getRegexp() {
        return this.regexp;
    }

}
