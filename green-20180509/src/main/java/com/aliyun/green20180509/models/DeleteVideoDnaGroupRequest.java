// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeleteVideoDnaGroupRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static DeleteVideoDnaGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVideoDnaGroupRequest self = new DeleteVideoDnaGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVideoDnaGroupRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
