// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateHBaseSlbServerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxxx-xxxxx-xxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hb-t4naqsay5gn****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
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
