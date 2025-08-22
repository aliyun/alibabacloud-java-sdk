// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetResourceTypeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("acceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("filterReadOnly")
    public Boolean filterReadOnly;

    /**
     * <strong>example:</strong>
     * <p>1.227.0</p>
     */
    @NameInMap("terraformProviderVersion")
    public String terraformProviderVersion;

    public static GetResourceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeRequest self = new GetResourceTypeRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetResourceTypeRequest setFilterReadOnly(Boolean filterReadOnly) {
        this.filterReadOnly = filterReadOnly;
        return this;
    }
    public Boolean getFilterReadOnly() {
        return this.filterReadOnly;
    }

    public GetResourceTypeRequest setTerraformProviderVersion(String terraformProviderVersion) {
        this.terraformProviderVersion = terraformProviderVersion;
        return this;
    }
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

}
