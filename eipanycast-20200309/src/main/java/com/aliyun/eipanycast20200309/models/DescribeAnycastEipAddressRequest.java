// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class DescribeAnycastEipAddressRequest extends TeaModel {
    @NameInMap("AnycastId")
    public String anycastId;

    @NameInMap("BindInstanceId")
    public String bindInstanceId;

    @NameInMap("Ip")
    public String ip;

    public static DescribeAnycastEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnycastEipAddressRequest self = new DescribeAnycastEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAnycastEipAddressRequest setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public DescribeAnycastEipAddressRequest setBindInstanceId(String bindInstanceId) {
        this.bindInstanceId = bindInstanceId;
        return this;
    }
    public String getBindInstanceId() {
        return this.bindInstanceId;
    }

    public DescribeAnycastEipAddressRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
