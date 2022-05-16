// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class UpdateAutoRechargeSwitchRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("Open")
    public Boolean open;

    public static UpdateAutoRechargeSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoRechargeSwitchRequest self = new UpdateAutoRechargeSwitchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoRechargeSwitchRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public UpdateAutoRechargeSwitchRequest setOpen(Boolean open) {
        this.open = open;
        return this;
    }
    public Boolean getOpen() {
        return this.open;
    }

}
