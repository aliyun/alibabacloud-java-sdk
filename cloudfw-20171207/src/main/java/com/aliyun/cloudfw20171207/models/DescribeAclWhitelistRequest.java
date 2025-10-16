// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclWhitelistRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>101.36.65.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeAclWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclWhitelistRequest self = new DescribeAclWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAclWhitelistRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAclWhitelistRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
