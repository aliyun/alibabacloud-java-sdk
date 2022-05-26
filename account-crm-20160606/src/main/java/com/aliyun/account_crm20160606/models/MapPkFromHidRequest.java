// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class MapPkFromHidRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("Hid")
    public String hid;

    @NameInMap("MappingScenes")
    public String mappingScenes;

    public static MapPkFromHidRequest build(java.util.Map<String, ?> map) throws Exception {
        MapPkFromHidRequest self = new MapPkFromHidRequest();
        return TeaModel.build(map, self);
    }

    public MapPkFromHidRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public MapPkFromHidRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public MapPkFromHidRequest setHid(String hid) {
        this.hid = hid;
        return this;
    }
    public String getHid() {
        return this.hid;
    }

    public MapPkFromHidRequest setMappingScenes(String mappingScenes) {
        this.mappingScenes = mappingScenes;
        return this;
    }
    public String getMappingScenes() {
        return this.mappingScenes;
    }

}
