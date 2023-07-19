// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyOcspStatusRequest extends TeaModel {
    /**
     * <p>The domain name for which you want to configure the Static Page Caching policy.</p>
     * <br>
     * <p>> You can call the [DescribeDomains](~~91724~~) operation to query all the domain names that are added to Anti-DDoS Pro or Anti-DDoS Premium.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>Specifies whether to enable the OCSP feature. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("Enable")
    public Integer enable;

    public static ModifyOcspStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOcspStatusRequest self = new ModifyOcspStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOcspStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyOcspStatusRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

}
