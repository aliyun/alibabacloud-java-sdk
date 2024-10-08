// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeHttpDDoSAttackProtectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("GlobalMode")
    public String globalMode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>35C66C7B-671H-4297-9187-2C4477247A78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static DescribeHttpDDoSAttackProtectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHttpDDoSAttackProtectionResponseBody self = new DescribeHttpDDoSAttackProtectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHttpDDoSAttackProtectionResponseBody setGlobalMode(String globalMode) {
        this.globalMode = globalMode;
        return this;
    }
    public String getGlobalMode() {
        return this.globalMode;
    }

    public DescribeHttpDDoSAttackProtectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHttpDDoSAttackProtectionResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

}
