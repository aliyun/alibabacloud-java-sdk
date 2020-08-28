// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeBlackListClientsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Clients")
    @Validation(required = true)
    public String clients;

    public static DescribeBlackListClientsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlackListClientsResponse self = new DescribeBlackListClientsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlackListClientsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlackListClientsResponse setClients(String clients) {
        this.clients = clients;
        return this;
    }
    public String getClients() {
        return this.clients;
    }

}
