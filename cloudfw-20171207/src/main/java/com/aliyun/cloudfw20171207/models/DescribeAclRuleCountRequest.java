// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclRuleCountRequest extends TeaModel {
    /**
     * <p>The language type. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>27.151.85.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeAclRuleCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclRuleCountRequest self = new DescribeAclRuleCountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAclRuleCountRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAclRuleCountRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
