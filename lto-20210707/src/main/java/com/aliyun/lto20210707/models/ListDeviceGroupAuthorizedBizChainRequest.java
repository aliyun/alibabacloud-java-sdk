// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListDeviceGroupAuthorizedBizChainRequest extends TeaModel {
    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    public static ListDeviceGroupAuthorizedBizChainRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceGroupAuthorizedBizChainRequest self = new ListDeviceGroupAuthorizedBizChainRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceGroupAuthorizedBizChainRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

}
