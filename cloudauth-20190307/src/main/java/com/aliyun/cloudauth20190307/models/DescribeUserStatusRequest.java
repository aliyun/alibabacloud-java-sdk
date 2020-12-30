// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeUserStatusRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeUserStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserStatusRequest self = new DescribeUserStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
