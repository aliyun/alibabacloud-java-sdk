// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class StartWuyingServerRequest extends TeaModel {
    @NameInMap("WuyingServerIdList")
    public java.util.List<String> wuyingServerIdList;

    public static StartWuyingServerRequest build(java.util.Map<String, ?> map) throws Exception {
        StartWuyingServerRequest self = new StartWuyingServerRequest();
        return TeaModel.build(map, self);
    }

    public StartWuyingServerRequest setWuyingServerIdList(java.util.List<String> wuyingServerIdList) {
        this.wuyingServerIdList = wuyingServerIdList;
        return this;
    }
    public java.util.List<String> getWuyingServerIdList() {
        return this.wuyingServerIdList;
    }

}
