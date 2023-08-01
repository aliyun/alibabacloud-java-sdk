// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class BindSlbRequest extends TeaModel {
    /**
     * <p>The ID of the EDAS application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The listener port for the SLB instance.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The ID of the SLB instance.</p>
     */
    @NameInMap("SlbId")
    public String slbId;

    /**
     * <p>The IP address of the SLB instance.</p>
     */
    @NameInMap("SlbIp")
    public String slbIp;

    /**
     * <p>The type of the SLB instance. Valid values:</p>
     * <br>
     * <p>*   internet: Internet-facing SLB instance</p>
     * <p>*   intranet: internal-facing SLB instance</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the vServer group for the internal-facing SLB instance.</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    public static BindSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        BindSlbRequest self = new BindSlbRequest();
        return TeaModel.build(map, self);
    }

    public BindSlbRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindSlbRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public BindSlbRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

    public BindSlbRequest setSlbIp(String slbIp) {
        this.slbIp = slbIp;
        return this;
    }
    public String getSlbIp() {
        return this.slbIp;
    }

    public BindSlbRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public BindSlbRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

}
