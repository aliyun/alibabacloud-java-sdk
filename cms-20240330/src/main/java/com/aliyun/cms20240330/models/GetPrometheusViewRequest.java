// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetPrometheusViewRequest extends TeaModel {
    /**
     * <p>Language environment, default is Chinese zh | en</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("aliyunLang")
    public String aliyunLang;

    /**
     * <p>Resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2bhocin5e2na</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    public static GetPrometheusViewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusViewRequest self = new GetPrometheusViewRequest();
        return TeaModel.build(map, self);
    }

    public GetPrometheusViewRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public GetPrometheusViewRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
