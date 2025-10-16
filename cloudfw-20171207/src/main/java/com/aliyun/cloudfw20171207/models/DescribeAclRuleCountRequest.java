// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclRuleCountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
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
