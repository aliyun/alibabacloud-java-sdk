// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAccessModeRequest extends TeaModel {
    /**
     * <p>The mode in which a website service is added to Anti-DDoS Pro or Anti-DDoS Premium. Valid values:</p>
     * <br>
     * <p>*   **0**: A record mode</p>
     * <p>*   **1**: anti-DDoS mode</p>
     * <p>*   **2**: origin redundancy mode</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccessMode")
    public Integer accessMode;

    /**
     * <p>The domain name of the website.</p>
     * <br>
     * <p>> A forwarding rule must be configured for the domain name. You can call the [DescribeDomains](https://help.aliyun.com/document_detail/91724.html) operation to query all domain names.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    public static ModifyWebAccessModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAccessModeRequest self = new ModifyWebAccessModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebAccessModeRequest setAccessMode(Integer accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public Integer getAccessMode() {
        return this.accessMode;
    }

    public ModifyWebAccessModeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
