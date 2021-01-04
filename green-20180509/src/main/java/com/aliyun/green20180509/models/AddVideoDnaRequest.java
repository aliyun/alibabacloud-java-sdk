// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddVideoDnaRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static AddVideoDnaRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVideoDnaRequest self = new AddVideoDnaRequest();
        return TeaModel.build(map, self);
    }

    public AddVideoDnaRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
