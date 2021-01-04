// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeBlackListClientsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Clients")
    public String clients;

    public static DescribeBlackListClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlackListClientsResponseBody self = new DescribeBlackListClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlackListClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlackListClientsResponseBody setClients(String clients) {
        this.clients = clients;
        return this;
    }
    public String getClients() {
        return this.clients;
    }

}
