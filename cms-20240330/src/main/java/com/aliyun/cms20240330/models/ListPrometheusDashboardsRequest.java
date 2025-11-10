// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListPrometheusDashboardsRequest extends TeaModel {
    /**
     * <p>Language environment, default is Chinese zh | en</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("aliyunLang")
    public String aliyunLang;

    /**
     * <p>Resource Group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3gn5i6bigbi</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    public static ListPrometheusDashboardsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusDashboardsRequest self = new ListPrometheusDashboardsRequest();
        return TeaModel.build(map, self);
    }

    public ListPrometheusDashboardsRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public ListPrometheusDashboardsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
