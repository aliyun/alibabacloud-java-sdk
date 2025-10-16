// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSecurityModeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>218.108.54.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeSecurityModeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityModeRequest self = new DescribeSecurityModeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityModeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSecurityModeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
