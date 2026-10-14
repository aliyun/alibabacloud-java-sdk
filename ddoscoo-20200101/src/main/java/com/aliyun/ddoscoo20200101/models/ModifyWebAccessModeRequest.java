// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAccessModeRequest extends TeaModel {
    /**
     * <p>The access mode for website services. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: A record</li>
     * <li><strong>1</strong>: Anti-DDoS Pro mode</li>
     * <li><strong>2</strong>: Back-to-origin mode</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AccessMode")
    public Integer accessMode;

    /**
     * <p>The domain name of the website service.</p>
     * <blockquote>
     * <p>The domain name must have forwarding rules configured. You can call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
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
