// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteVideoDnaRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static DeleteVideoDnaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoDnaRequest self = new DeleteVideoDnaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVideoDnaRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
