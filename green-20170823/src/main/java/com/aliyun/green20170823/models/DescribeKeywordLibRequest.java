// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeKeywordLibRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ServiceModule")
    public String serviceModule;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeKeywordLibRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeywordLibRequest self = new DescribeKeywordLibRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKeywordLibRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeKeywordLibRequest setServiceModule(String serviceModule) {
        this.serviceModule = serviceModule;
        return this;
    }
    public String getServiceModule() {
        return this.serviceModule;
    }

    public DescribeKeywordLibRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
