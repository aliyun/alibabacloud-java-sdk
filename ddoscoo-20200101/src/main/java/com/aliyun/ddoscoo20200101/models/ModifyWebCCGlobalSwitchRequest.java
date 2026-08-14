// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCCGlobalSwitchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CcGlobalSwitch")
    public String ccGlobalSwitch;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    public static ModifyWebCCGlobalSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebCCGlobalSwitchRequest self = new ModifyWebCCGlobalSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebCCGlobalSwitchRequest setCcGlobalSwitch(String ccGlobalSwitch) {
        this.ccGlobalSwitch = ccGlobalSwitch;
        return this;
    }
    public String getCcGlobalSwitch() {
        return this.ccGlobalSwitch;
    }

    public ModifyWebCCGlobalSwitchRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
