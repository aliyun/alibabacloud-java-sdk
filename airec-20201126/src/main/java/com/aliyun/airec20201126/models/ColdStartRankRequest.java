// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ColdStartRankRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eg: k1:v1|k2:v2|k3:v1,v2,v3</p>
     */
    @NameInMap("features")
    public String features;

    /**
     * <strong>example:</strong>
     * <p>abfsc</p>
     */
    @NameInMap("imei")
    public String imei;

    /**
     * <strong>example:</strong>
     * <p>16240:video</p>
     */
    @NameInMap("items")
    public String items;

    /**
     * <strong>example:</strong>
     * <p>sceneId</p>
     */
    @NameInMap("sceneId")
    public String sceneId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("userId")
    public String userId;

    public static ColdStartRankRequest build(java.util.Map<String, ?> map) throws Exception {
        ColdStartRankRequest self = new ColdStartRankRequest();
        return TeaModel.build(map, self);
    }

    public ColdStartRankRequest setFeatures(String features) {
        this.features = features;
        return this;
    }
    public String getFeatures() {
        return this.features;
    }

    public ColdStartRankRequest setImei(String imei) {
        this.imei = imei;
        return this;
    }
    public String getImei() {
        return this.imei;
    }

    public ColdStartRankRequest setItems(String items) {
        this.items = items;
        return this;
    }
    public String getItems() {
        return this.items;
    }

    public ColdStartRankRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public ColdStartRankRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
