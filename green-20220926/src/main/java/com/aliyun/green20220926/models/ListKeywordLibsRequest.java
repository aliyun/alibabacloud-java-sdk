// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListKeywordLibsRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The library code.</p>
     * <ul>
     * <li>desensitize: desensitization library.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desensitize</p>
     */
    @NameInMap("TenantCode")
    public String tenantCode;

    public static ListKeywordLibsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKeywordLibsRequest self = new ListKeywordLibsRequest();
        return TeaModel.build(map, self);
    }

    public ListKeywordLibsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListKeywordLibsRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

}
