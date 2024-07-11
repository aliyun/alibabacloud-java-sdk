// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebCCGlobalSwitchRequest extends TeaModel {
    /**
     * <p>Specifies whether the HTTP flood mitigation feature is enabled. Valid values:</p>
     * <ul>
     * <li><strong>open</strong></li>
     * <li><strong>close</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("CcGlobalSwitch")
    public String ccGlobalSwitch;

    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p> A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
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
