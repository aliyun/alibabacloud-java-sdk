// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201001.models;

import com.aliyun.tea.*;

public class ListMcpToolsRequest extends TeaModel {
    @NameInMap("Authorization")
    public String authorization;

    public static ListMcpToolsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMcpToolsRequest self = new ListMcpToolsRequest();
        return TeaModel.build(map, self);
    }

    public ListMcpToolsRequest setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
