// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetKeywordLibRequest extends TeaModel {
    /**
     * <p>The ID of the keyword library.</p>
     * 
     * <strong>example:</strong>
     * <p>customxx_xxx</p>
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
     * <p>The service code. This parameter is required when you query the preprocessing configurations (PreprocessList) of the library.</p>
     * 
     * <strong>example:</strong>
     * <p>ugc_moderation_byllm_pro</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>The code of the keyword library.</p>
     * <ul>
     * <li>desensitize: Desensitization keyword library.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desensitize</p>
     */
    @NameInMap("TenantCode")
    public String tenantCode;

    public static GetKeywordLibRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKeywordLibRequest self = new GetKeywordLibRequest();
        return TeaModel.build(map, self);
    }

    public GetKeywordLibRequest setLibId(String libId) {
        this.libId = libId;
        return this;
    }
    public String getLibId() {
        return this.libId;
    }

    public GetKeywordLibRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetKeywordLibRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetKeywordLibRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

}
