// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeAccessWhitelistEcsListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceCode")
    public String sourceCode;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeAccessWhitelistEcsListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessWhitelistEcsListRequest self = new DescribeAccessWhitelistEcsListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessWhitelistEcsListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAccessWhitelistEcsListRequest setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }
    public String getSourceCode() {
        return this.sourceCode;
    }

    public DescribeAccessWhitelistEcsListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
