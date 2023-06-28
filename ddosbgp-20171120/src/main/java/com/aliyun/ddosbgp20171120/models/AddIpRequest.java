// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class AddIpRequest extends TeaModel {
    @NameInMap("IpList")
    public String ipList;

    @NameInMap("PackId")
    public String packId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static AddIpRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIpRequest self = new AddIpRequest();
        return TeaModel.build(map, self);
    }

    public AddIpRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public AddIpRequest setPackId(String packId) {
        this.packId = packId;
        return this;
    }
    public String getPackId() {
        return this.packId;
    }

    public AddIpRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
