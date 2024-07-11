// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteHBaseSlbServerRequest extends TeaModel {
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

    public static DeleteHBaseSlbServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHBaseSlbServerRequest self = new DeleteHBaseSlbServerRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHBaseSlbServerRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteHBaseSlbServerRequest setSlbServer(String slbServer) {
        this.slbServer = slbServer;
        return this;
    }
    public String getSlbServer() {
        return this.slbServer;
    }

}
