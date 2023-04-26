// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateErRouteMapRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("ErId")
    public String erId;

    @NameInMap("ErRouteMapId")
    public String erRouteMapId;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateErRouteMapRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateErRouteMapRequest self = new UpdateErRouteMapRequest();
        return TeaModel.build(map, self);
    }

    public UpdateErRouteMapRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateErRouteMapRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public UpdateErRouteMapRequest setErRouteMapId(String erRouteMapId) {
        this.erRouteMapId = erRouteMapId;
        return this;
    }
    public String getErRouteMapId() {
        return this.erRouteMapId;
    }

    public UpdateErRouteMapRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
