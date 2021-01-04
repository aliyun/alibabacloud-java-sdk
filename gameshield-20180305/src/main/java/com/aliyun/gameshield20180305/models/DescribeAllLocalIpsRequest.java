// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAllLocalIpsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    public static DescribeAllLocalIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllLocalIpsRequest self = new DescribeAllLocalIpsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAllLocalIpsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeAllLocalIpsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
