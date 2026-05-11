// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListTunnelResp extends TeaModel {
    /**
     * <p>The queried tunnels.</p>
     */
    @NameInMap("ImportTunnel")
    public java.util.List<GetTunnelResp> importTunnel;

    /**
     * <p>The position from which the next list operation starts.</p>
     * 
     * <strong>example:</strong>
     * <p>test_marker</p>
     */
    @NameInMap("NextMarker")
    public String nextMarker;

    /**
     * <p>Indicates whether the queried results are truncated.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
