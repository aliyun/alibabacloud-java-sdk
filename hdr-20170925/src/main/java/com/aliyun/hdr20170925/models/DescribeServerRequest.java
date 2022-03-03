// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeServerRequest extends TeaModel {
    @NameInMap("ServerId")
    public String serverId;

    public static DescribeServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerRequest self = new DescribeServerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServerRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
