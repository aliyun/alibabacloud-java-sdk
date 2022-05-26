// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class MapPkToHidRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("MappingScenes")
    public String mappingScenes;

    @NameInMap("Pk")
    public String pk;

    public static MapPkToHidRequest build(java.util.Map<String, ?> map) throws Exception {
        MapPkToHidRequest self = new MapPkToHidRequest();
        return TeaModel.build(map, self);
    }

    public MapPkToHidRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public MapPkToHidRequest setMappingScenes(String mappingScenes) {
        this.mappingScenes = mappingScenes;
        return this;
    }
    public String getMappingScenes() {
        return this.mappingScenes;
    }

    public MapPkToHidRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
