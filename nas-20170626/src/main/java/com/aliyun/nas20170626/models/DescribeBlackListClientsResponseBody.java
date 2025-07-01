// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeBlackListClientsResponseBody extends TeaModel {
    /**
     * <p>The IDs of clients and the status of each client. The parameter value is a JSON string, for example, <code>{&quot;client1&quot;: &quot;EVICTING&quot;,&quot;client2&quot;:&quot;EVICTED&quot;}</code>.</p>
     * <p>Available client statuses include:</p>
     * <ul>
     * <li>EVICTING: The client is being evicted.</li>
     * <li>EVICTED: The client is evicted.</li>
     * <li>ACCEPTING: The write access to the file system is being granted to the client.</li>
     * <li>ACCEPTABLE: The write access to the file system is granted to the client.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;client1&quot;: &quot;EVICTING&quot;,&quot;client2&quot;:&quot;EVICTED&quot;}</p>
     */
    @NameInMap("Clients")
    public String clients;

    /**
     * <p>The request ID.</p>
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
