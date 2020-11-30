// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DeleteBlackholeRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("PackId")
    @Validation(required = true)
    public String packId;

    @NameInMap("Ip")
    @Validation(required = true)
    public String ip;

    public static DeleteBlackholeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlackholeRequest self = new DeleteBlackholeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBlackholeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteBlackholeRequest setPackId(String packId) {
        this.packId = packId;
        return this;
    }
    public String getPackId() {
        return this.packId;
    }

    public DeleteBlackholeRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
