// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetAddVideoDnaResultsRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static GetAddVideoDnaResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAddVideoDnaResultsRequest self = new GetAddVideoDnaResultsRequest();
        return TeaModel.build(map, self);
    }

    public GetAddVideoDnaResultsRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
