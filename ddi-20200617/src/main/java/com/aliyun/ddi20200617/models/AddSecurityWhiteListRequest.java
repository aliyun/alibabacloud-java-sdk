// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class AddSecurityWhiteListRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("PortRange")
    public String portRange;

    @NameInMap("WhiteIpList")
    public java.util.List<String> whiteIpList;

    @NameInMap("Description")
    public String description;

    public static AddSecurityWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSecurityWhiteListRequest self = new AddSecurityWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public AddSecurityWhiteListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddSecurityWhiteListRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public AddSecurityWhiteListRequest setWhiteIpList(java.util.List<String> whiteIpList) {
        this.whiteIpList = whiteIpList;
        return this;
    }
    public java.util.List<String> getWhiteIpList() {
        return this.whiteIpList;
    }

    public AddSecurityWhiteListRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
