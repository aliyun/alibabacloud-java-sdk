// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeOssUploadTokenRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeOssUploadTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssUploadTokenRequest self = new DescribeOssUploadTokenRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssUploadTokenRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
