// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeUploadInfoRequest extends TeaModel {
    @NameInMap("Biz")
    public String biz;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeUploadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadInfoRequest self = new DescribeUploadInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUploadInfoRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public DescribeUploadInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeUploadInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
