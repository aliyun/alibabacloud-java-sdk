// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeUploadInfoRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Biz")
    public String biz;

    public static DescribeUploadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadInfoRequest self = new DescribeUploadInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUploadInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeUploadInfoRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

}
