// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AssignWuyingServerPrivateAddressesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SecondaryPrivateIpAddressCount")
    public Integer secondaryPrivateIpAddressCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ws-bp1234567890abcde</p>
     */
    @NameInMap("WuyingServerId")
    public String wuyingServerId;

    public static AssignWuyingServerPrivateAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignWuyingServerPrivateAddressesRequest self = new AssignWuyingServerPrivateAddressesRequest();
        return TeaModel.build(map, self);
    }

    public AssignWuyingServerPrivateAddressesRequest setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
        this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
        return this;
    }
    public Integer getSecondaryPrivateIpAddressCount() {
        return this.secondaryPrivateIpAddressCount;
    }

    public AssignWuyingServerPrivateAddressesRequest setWuyingServerId(String wuyingServerId) {
        this.wuyingServerId = wuyingServerId;
        return this;
    }
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

}
