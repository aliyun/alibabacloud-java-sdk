// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AuthorizeDeviceGroupBizChainRequest extends TeaModel {
    @NameInMap("BizChainIdList")
    public String bizChainIdList;

    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    public static AuthorizeDeviceGroupBizChainRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeDeviceGroupBizChainRequest self = new AuthorizeDeviceGroupBizChainRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeDeviceGroupBizChainRequest setBizChainIdList(String bizChainIdList) {
        this.bizChainIdList = bizChainIdList;
        return this;
    }
    public String getBizChainIdList() {
        return this.bizChainIdList;
    }

    public AuthorizeDeviceGroupBizChainRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

}
