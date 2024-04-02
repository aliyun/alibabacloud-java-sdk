// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssIncrementCheckSettingRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeOssIncrementCheckSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssIncrementCheckSettingRequest self = new DescribeOssIncrementCheckSettingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssIncrementCheckSettingRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOssIncrementCheckSettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
