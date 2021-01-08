// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class RecommendRequest extends TeaModel {
    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Imei")
    public String imei;

    @NameInMap("ReturnCount")
    public Integer returnCount;

    @NameInMap("Items")
    public String items;

    public static RecommendRequest build(java.util.Map<String, ?> map) throws Exception {
        RecommendRequest self = new RecommendRequest();
        return TeaModel.build(map, self);
    }

    public RecommendRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public RecommendRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RecommendRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public RecommendRequest setImei(String imei) {
        this.imei = imei;
        return this;
    }
    public String getImei() {
        return this.imei;
    }

    public RecommendRequest setReturnCount(Integer returnCount) {
        this.returnCount = returnCount;
        return this;
    }
    public Integer getReturnCount() {
        return this.returnCount;
    }

    public RecommendRequest setItems(String items) {
        this.items = items;
        return this;
    }
    public String getItems() {
        return this.items;
    }

}
