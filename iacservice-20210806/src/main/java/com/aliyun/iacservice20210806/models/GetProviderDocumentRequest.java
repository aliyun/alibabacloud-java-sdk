// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetProviderDocumentRequest extends TeaModel {
    @NameInMap("providerVersion")
    public String providerVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("terraformResourceType")
    public String terraformResourceType;

    public static GetProviderDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProviderDocumentRequest self = new GetProviderDocumentRequest();
        return TeaModel.build(map, self);
    }

    public GetProviderDocumentRequest setProviderVersion(String providerVersion) {
        this.providerVersion = providerVersion;
        return this;
    }
    public String getProviderVersion() {
        return this.providerVersion;
    }

    public GetProviderDocumentRequest setTerraformResourceType(String terraformResourceType) {
        this.terraformResourceType = terraformResourceType;
        return this;
    }
    public String getTerraformResourceType() {
        return this.terraformResourceType;
    }

}
