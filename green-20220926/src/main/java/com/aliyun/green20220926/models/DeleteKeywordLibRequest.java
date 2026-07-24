// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DeleteKeywordLibRequest extends TeaModel {
    /**
     * <p>The keyword library ID.</p>
     * 
     * <strong>example:</strong>
     * <p>customxx_xxxx</p>
     */
    @NameInMap("LibId")
    public String libId;

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
     * <li>desensitize: masking library</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desensitize</p>
     */
    @NameInMap("TenantCode")
    public String tenantCode;

    public static DeleteKeywordLibRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeywordLibRequest self = new DeleteKeywordLibRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKeywordLibRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public DeleteKeywordLibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteKeywordLibRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

}
