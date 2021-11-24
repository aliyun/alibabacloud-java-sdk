// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeListenerRequest extends TeaModel {
    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeListenerRequest self = new DescribeListenerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public DescribeListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
