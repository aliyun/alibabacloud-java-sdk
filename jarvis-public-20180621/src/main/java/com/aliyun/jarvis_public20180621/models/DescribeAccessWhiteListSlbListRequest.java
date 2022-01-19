// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeAccessWhiteListSlbListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceCode")
    public String sourceCode;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeAccessWhiteListSlbListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessWhiteListSlbListRequest self = new DescribeAccessWhiteListSlbListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessWhiteListSlbListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAccessWhiteListSlbListRequest setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }
    public String getSourceCode() {
        return this.sourceCode;
    }

    public DescribeAccessWhiteListSlbListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
