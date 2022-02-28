// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeSupportedOperationsRequest extends TeaModel {
    @NameInMap("ServerId")
    public String serverId;

    public static DescribeSupportedOperationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportedOperationsRequest self = new DescribeSupportedOperationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSupportedOperationsRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
