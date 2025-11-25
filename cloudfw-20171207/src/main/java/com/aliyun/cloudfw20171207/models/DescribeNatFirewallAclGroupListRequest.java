// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatFirewallAclGroupListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeNatFirewallAclGroupListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatFirewallAclGroupListRequest self = new DescribeNatFirewallAclGroupListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNatFirewallAclGroupListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
