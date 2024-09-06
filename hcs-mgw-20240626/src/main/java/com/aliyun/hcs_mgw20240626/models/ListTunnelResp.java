// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListTunnelResp extends TeaModel {
    @NameInMap("ImportTunnel")
    public java.util.List<GetTunnelResp> importTunnel;

    @NameInMap("NextMarker")
    public String nextMarker;

    @NameInMap("Truncated")
    public Boolean truncated;

    public static ListTunnelResp build(java.util.Map<String, ?> map) throws Exception {
        ListTunnelResp self = new ListTunnelResp();
        return TeaModel.build(map, self);
    }

    public ListTunnelResp setImportTunnel(java.util.List<GetTunnelResp> importTunnel) {
        this.importTunnel = importTunnel;
        return this;
    }
    public java.util.List<GetTunnelResp> getImportTunnel() {
        return this.importTunnel;
    }

    public ListTunnelResp setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListTunnelResp setTruncated(Boolean truncated) {
        this.truncated = truncated;
        return this;
    }
    public Boolean getTruncated() {
        return this.truncated;
    }

}
