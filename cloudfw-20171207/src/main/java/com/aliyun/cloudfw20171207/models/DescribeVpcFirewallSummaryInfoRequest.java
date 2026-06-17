// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallSummaryInfoRequest extends TeaModel {
    /**
     * <p>The language of the content. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of the user. Valid values:</p>
     * <p><strong>buy</strong>: Paid user</p>
     * <p><strong>free</strong>: Free user</p>
     * 
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
