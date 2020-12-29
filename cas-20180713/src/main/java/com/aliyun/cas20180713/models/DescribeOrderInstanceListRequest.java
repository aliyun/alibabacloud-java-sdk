// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class DescribeOrderInstanceListRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("StartIndex")
    public Integer startIndex;

    public static DescribeOrderInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrderInstanceListRequest self = new DescribeOrderInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrderInstanceListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOrderInstanceListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOrderInstanceListRequest setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Integer getStartIndex() {
        return this.startIndex;
    }

}
