// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeBlackListClientsResponseBody extends TeaModel {
    /**
     * <p>The IDs of clients and the status of each client. This parameter contains a JSON object, for example, {"client1": "EVICTING","client2":"EVICTED"}.</p>
     * <br>
     * <p>Available client statuses include:</p>
     * <br>
     * <p>*   EVICTING indicates that a client is being removed</p>
     * <p>*   EVICTED indicates that a client is removed</p>
     * <p>*   ACCEPTING indicates that the write access to the file system is being granted to a client</p>
     * <p>*   ACCEPTABLE indicates that the write access to the file system is granted to a client</p>
     */
    @NameInMap("Clients")
    public String clients;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBlackListClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlackListClientsResponseBody self = new DescribeBlackListClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlackListClientsResponseBody setClients(String clients) {
        this.clients = clients;
        return this;
    }
    public String getClients() {
        return this.clients;
    }

    public DescribeBlackListClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
