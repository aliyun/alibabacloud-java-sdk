// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallSummaryInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>buy</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static DescribeVpcFirewallSummaryInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallSummaryInfoRequest self = new DescribeVpcFirewallSummaryInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallSummaryInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallSummaryInfoRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
