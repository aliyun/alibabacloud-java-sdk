// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeUploadPreSignRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeUploadPreSignRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadPreSignRequest self = new DescribeUploadPreSignRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUploadPreSignRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
