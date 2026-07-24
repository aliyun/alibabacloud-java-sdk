// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateKeywordLibRequest extends TeaModel {
    /**
     * <p>The ID of the keyword library.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_xxxx</p>
     */
    @NameInMap("LibId")
    public String libId;

    /**
     * <p>The name of the keyword library.</p>
     * 
     * <strong>example:</strong>
     * <p>TestLibrary.</p>
     */
    @NameInMap("LibName")
    public String libName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The keyword library code.</p>
     * <ul>
     * <li>desensitize: desensitization keyword library</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desensitize</p>
     */
    @NameInMap("TenantCode")
    public String tenantCode;

    public static UpdateKeywordLibRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKeywordLibRequest self = new UpdateKeywordLibRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKeywordLibRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public UpdateKeywordLibRequest setLibName(String libName) {
        this.libName = libName;
        return this;
    }
    public String getLibName() {
        return this.libName;
    }

    public UpdateKeywordLibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateKeywordLibRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

}
