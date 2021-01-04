// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddVideoDnaGroupRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static AddVideoDnaGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVideoDnaGroupRequest self = new AddVideoDnaGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddVideoDnaGroupRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
