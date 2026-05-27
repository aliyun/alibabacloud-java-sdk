// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeWuyingServerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-bp1234567890abcde</p>
     */
    @NameInMap("WuyingServerId")
    public String wuyingServerId;

    public static DescribeWuyingServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWuyingServerRequest self = new DescribeWuyingServerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWuyingServerRequest setWuyingServerId(String wuyingServerId) {
        this.wuyingServerId = wuyingServerId;
        return this;
    }
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

}
