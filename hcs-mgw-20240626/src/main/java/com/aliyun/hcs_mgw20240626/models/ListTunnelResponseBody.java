// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class ListTunnelResponseBody extends TeaModel {
    /**
     * <p>The details of the tunnels.</p>
     */
    @NameInMap("ImportTunnelList")
    public ListTunnelResp importTunnelList;

    public static ListTunnelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTunnelResponseBody self = new ListTunnelResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTunnelResponseBody setImportTunnelList(ListTunnelResp importTunnelList) {
        this.importTunnelList = importTunnelList;
        return this;
    }
    public ListTunnelResp getImportTunnelList() {
        return this.importTunnelList;
    }

}
