// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ModifyIpWhiteListRequest extends TeaModel {
    @NameInMap("LedgerId")
    public String ledgerId;

    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("IpList")
    public String ipList;

    public static ModifyIpWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpWhiteListRequest self = new ModifyIpWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIpWhiteListRequest setLedgerId(String ledgerId) {
        this.ledgerId = ledgerId;
        return this;
    }
    public String getLedgerId() {
        return this.ledgerId;
    }

    public ModifyIpWhiteListRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public ModifyIpWhiteListRequest setIpList(String ipList) {
        this.ipList = ipList;
        return this;
    }
    public String getIpList() {
        return this.ipList;
    }

}
