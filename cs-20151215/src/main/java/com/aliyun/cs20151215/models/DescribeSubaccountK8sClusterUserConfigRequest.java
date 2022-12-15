// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeSubaccountK8sClusterUserConfigRequest extends TeaModel {
    @NameInMap("PrivateIpAddress")
    public Boolean privateIpAddress;

    @NameInMap("TemporaryDurationMinutes")
    public Long temporaryDurationMinutes;

    public static DescribeSubaccountK8sClusterUserConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubaccountK8sClusterUserConfigRequest self = new DescribeSubaccountK8sClusterUserConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSubaccountK8sClusterUserConfigRequest setPrivateIpAddress(Boolean privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public Boolean getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public DescribeSubaccountK8sClusterUserConfigRequest setTemporaryDurationMinutes(Long temporaryDurationMinutes) {
        this.temporaryDurationMinutes = temporaryDurationMinutes;
        return this;
    }
    public Long getTemporaryDurationMinutes() {
        return this.temporaryDurationMinutes;
    }

}
