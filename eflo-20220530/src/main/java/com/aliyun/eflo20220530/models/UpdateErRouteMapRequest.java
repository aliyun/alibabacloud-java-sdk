// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateErRouteMapRequest extends TeaModel {
    /**
     * <p>The description of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>test-example</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Lingjun HUB ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-kkopgtne</p>
     */
    @NameInMap("ErId")
    public String erId;

    /**
     * <p>routing policy ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-rmap-uwglhzom</p>
     */
    @NameInMap("ErRouteMapId")
    public String erRouteMapId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
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
