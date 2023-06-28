// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DeleteIpRequest extends TeaModel {
    @NameInMap("IpList")
    public String ipList;

    @NameInMap("PackId")
    public String packId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteIpRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpRequest self = new DeleteIpRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

    public DeleteIpRequest setPackId(String packId) {
        this.packId = packId;
        return this;
    }
    public String getPackId() {
        return this.packId;
    }

    public DeleteIpRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
