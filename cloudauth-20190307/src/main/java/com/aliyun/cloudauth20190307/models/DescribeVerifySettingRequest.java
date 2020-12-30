// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifySettingRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DescribeVerifySettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifySettingRequest self = new DescribeVerifySettingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVerifySettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
