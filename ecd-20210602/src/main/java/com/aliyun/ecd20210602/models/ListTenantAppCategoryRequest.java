// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListTenantAppCategoryRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("PId")
    public Long PId;

    @NameInMap("RegionId")
    public String regionId;

    public static ListTenantAppCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTenantAppCategoryRequest self = new ListTenantAppCategoryRequest();
        return TeaModel.build(map, self);
    }

    public ListTenantAppCategoryRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListTenantAppCategoryRequest setPId(Long PId) {
        this.PId = PId;
        return this;
    }
    public Long getPId() {
        return this.PId;
    }

    public ListTenantAppCategoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
