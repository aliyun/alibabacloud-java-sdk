// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeImageUploadInfoRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeImageUploadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageUploadInfoRequest self = new DescribeImageUploadInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageUploadInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
