// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportKeywordRequest extends TeaModel {
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
     * <p>The vocabulary encoding.</p>
     * <ul>
     * <li>desensitize: sensitive data masking vocabulary</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desensitize</p>
     */
    @NameInMap("TenantCode")
    public String tenantCode;

    public static ExportKeywordRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportKeywordRequest self = new ExportKeywordRequest();
        return TeaModel.build(map, self);
    }

    public ExportKeywordRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public ExportKeywordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ExportKeywordRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

}
