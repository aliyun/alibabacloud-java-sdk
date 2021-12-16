// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListInstanceRegionRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegionId")
    public String regionId;

    public static ListInstanceRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRegionRequest self = new ListInstanceRegionRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceRegionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListInstanceRegionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
