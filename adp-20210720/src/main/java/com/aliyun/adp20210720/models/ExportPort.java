// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ExportPort extends TeaModel {
    @NameInMap("cidrIP")
    public String cidrIP;

    @NameInMap("portRange")
    public String portRange;

    @NameInMap("protocol")
    public String protocol;

    @NameInMap("unallowed")
    public Boolean unallowed;

    public static ExportPort build(java.util.Map<String, ?> map) throws Exception {
        ExportPort self = new ExportPort();
        return TeaModel.build(map, self);
    }

    public ExportPort setCidrIP(String cidrIP) {
        this.cidrIP = cidrIP;
        return this;
    }
    public String getCidrIP() {
        return this.cidrIP;
    }

    public ExportPort setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public ExportPort setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ExportPort setUnallowed(Boolean unallowed) {
        this.unallowed = unallowed;
        return this;
    }
    public Boolean getUnallowed() {
        return this.unallowed;
    }

}
