// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QuerySceneListRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("SceneStates")
    public java.util.List<Integer> sceneStates;

    @NameInMap("SceneTypes")
    public java.util.List<String> sceneTypes;

    @NameInMap("TemplateInfoIds")
    public java.util.List<String> templateInfoIds;

    public static QuerySceneListRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneListRequest self = new QuerySceneListRequest();
        return TeaModel.build(map, self);
    }

    public QuerySceneListRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public QuerySceneListRequest setSceneStates(java.util.List<Integer> sceneStates) {
        this.sceneStates = sceneStates;
        return this;
    }
    public java.util.List<Integer> getSceneStates() {
        return this.sceneStates;
    }

    public QuerySceneListRequest setSceneTypes(java.util.List<String> sceneTypes) {
        this.sceneTypes = sceneTypes;
        return this;
    }
    public java.util.List<String> getSceneTypes() {
        return this.sceneTypes;
    }

    public QuerySceneListRequest setTemplateInfoIds(java.util.List<String> templateInfoIds) {
        this.templateInfoIds = templateInfoIds;
        return this;
    }
    public java.util.List<String> getTemplateInfoIds() {
        return this.templateInfoIds;
    }

}
