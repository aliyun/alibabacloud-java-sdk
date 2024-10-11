// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetMyTenantsRequest extends TeaModel {
    @NameInMap("FeatureCodeList")
    public java.util.List<String> featureCodeList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetMyTenantsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMyTenantsRequest self = new GetMyTenantsRequest();
        return TeaModel.build(map, self);
    }

    public GetMyTenantsRequest setFeatureCodeList(java.util.List<String> featureCodeList) {
        this.featureCodeList = featureCodeList;
        return this;
    }
    public java.util.List<String> getFeatureCodeList() {
        return this.featureCodeList;
    }

    public GetMyTenantsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
