// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class NodeInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>172.16.xx.xx</p>
     */
    @NameInMap("host")
    public String host;

    /**
     * <strong>example:</strong>
     * <p>es-cn-tl32vdghe0005cd99-data-b-2</p>
     */
    @NameInMap("hostName")
    public String hostName;

    /**
     * <strong>example:</strong>
     * <p>9200</p>
     */
    @NameInMap("port")
    public Long port;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("zoneId")
    public String zoneId;

    public static NodeInfo build(java.util.Map<String, ?> map) throws Exception {
        NodeInfo self = new NodeInfo();
        return TeaModel.build(map, self);
    }

    public NodeInfo setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public NodeInfo setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public NodeInfo setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public NodeInfo setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
