// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateHBaseSlbServerRequest extends TeaModel {
    /**
     * <p>The client token.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx-xxxxx-xxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-t4naqsay5gn****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The load balancing service to create. Valid values:</p>
     * <ul>
     * <li><strong>thrift</strong>: the Thrift cross-language and cross-platform remote procedure call (RPC) protocol service.</li>
     * <li><strong>rest</strong>: the HTTP protocol service.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>thrift</p>
     */
    @NameInMap("SlbServer")
    public String slbServer;

    public static CreateHBaseSlbServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHBaseSlbServerRequest self = new CreateHBaseSlbServerRequest();
        return TeaModel.build(map, self);
    }

    public CreateHBaseSlbServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateHBaseSlbServerRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateHBaseSlbServerRequest setSlbServer(String slbServer) {
        this.slbServer = slbServer;
        return this;
    }
    public String getSlbServer() {
        return this.slbServer;
    }

}
