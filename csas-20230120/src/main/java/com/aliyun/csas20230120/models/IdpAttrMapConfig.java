// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpAttrMapConfig extends TeaModel {
    @NameInMap("MapItems")
    public java.util.List<IdpAttrMapConfigItem> mapItems;

    public static IdpAttrMapConfig build(java.util.Map<String, ?> map) throws Exception {
        IdpAttrMapConfig self = new IdpAttrMapConfig();
        return TeaModel.build(map, self);
    }

    public IdpAttrMapConfig setMapItems(java.util.List<IdpAttrMapConfigItem> mapItems) {
        this.mapItems = mapItems;
        return this;
    }
    public java.util.List<IdpAttrMapConfigItem> getMapItems() {
        return this.mapItems;
    }

}
