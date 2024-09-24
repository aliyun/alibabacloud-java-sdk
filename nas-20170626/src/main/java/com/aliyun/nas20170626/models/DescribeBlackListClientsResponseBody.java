// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeBlackListClientsResponseBody extends TeaModel {
    /**
     * <p>The IDs of clients and the status of each client. This parameter contains a JSON object, for example, {&quot;client1&quot;: &quot;EVICTING&quot;,&quot;client2&quot;:&quot;EVICTED&quot;}.</p>
     * <p>Available client statuses include:</p>
     * <ul>
     * <li>EVICTING indicates that a client is being removed</li>
     * <li>EVICTED indicates that a client is removed</li>
     * <li>ACCEPTING indicates that the write access to the file system is being granted to a client</li>
     * <li>ACCEPTABLE indicates that the write access to the file system is granted to a client</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;client1&quot;: &quot;EVICTING&quot;,&quot;client2&quot;:&quot;EVICTED&quot;}</p>
     */
    @NameInMap("Clients")
    public String clients;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A70BEE5D-76D3-49FB-B58F-1F398211A5C3</p>
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
