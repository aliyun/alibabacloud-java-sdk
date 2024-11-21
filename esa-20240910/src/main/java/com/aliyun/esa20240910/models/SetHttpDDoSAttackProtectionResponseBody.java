// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetHttpDDoSAttackProtectionResponseBody extends TeaModel {
    /**
     * <p>The level of HTTP DDoS attack protection.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("GlobalMode")
    public String globalMode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The website ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static SetHttpDDoSAttackProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetHttpDDoSAttackProtectionResponseBody self = new SetHttpDDoSAttackProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetHttpDDoSAttackProtectionResponseBody setGlobalMode(String globalMode) {
        this.globalMode = globalMode;
        return this;
    }
    public String getGlobalMode() {
        return this.globalMode;
    }

    public SetHttpDDoSAttackProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetHttpDDoSAttackProtectionResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
