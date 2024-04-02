// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeWebsiteInstanceIdRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeWebsiteInstanceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebsiteInstanceIdRequest self = new DescribeWebsiteInstanceIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebsiteInstanceIdRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeWebsiteInstanceIdRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
