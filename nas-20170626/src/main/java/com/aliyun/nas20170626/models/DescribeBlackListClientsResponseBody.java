// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeBlackListClientsResponseBody extends TeaModel {
    /**
     * <p>The eviction status of clients. The value is a JSON string in the map format: <code>{&quot;client1&quot;: &quot;EVICTING&quot;,&quot;client2&quot;:&quot;EVICTED&quot;}</code>.</p>
     * <p>Valid values for client eviction status:</p>
     * <ul>
     * <li>EVICTING: The client is being evicted.</li>
     * <li>EVICTED: The client has been evicted.</li>
     * <li>ACCEPTING: The client is being resumed. </li>
     * <li>ACCEPTABLE: The client has been resumed.</li>
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
