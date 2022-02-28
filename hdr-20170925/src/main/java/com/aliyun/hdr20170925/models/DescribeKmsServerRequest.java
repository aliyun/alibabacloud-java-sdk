// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeKmsServerRequest extends TeaModel {
    @NameInMap("HardwareId")
    public String hardwareId;

    public static DescribeKmsServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsServerRequest self = new DescribeKmsServerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKmsServerRequest setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
        return this;
    }
    public String getHardwareId() {
        return this.hardwareId;
    }

}
