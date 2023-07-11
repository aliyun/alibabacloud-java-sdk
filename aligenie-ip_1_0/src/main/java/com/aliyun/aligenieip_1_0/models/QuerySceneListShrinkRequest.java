// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QuerySceneListShrinkRequest extends TeaModel {
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("SceneStates")
    public String sceneStatesShrink;

    @NameInMap("SceneTypes")
    public String sceneTypesShrink;

    @NameInMap("TemplateInfoIds")
    public String templateInfoIdsShrink;

    public static QuerySceneListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySceneListShrinkRequest self = new QuerySceneListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QuerySceneListShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public QuerySceneListShrinkRequest setSceneStatesShrink(String sceneStatesShrink) {
        this.sceneStatesShrink = sceneStatesShrink;
        return this;
    }
    public String getSceneStatesShrink() {
        return this.sceneStatesShrink;
    }

    public QuerySceneListShrinkRequest setSceneTypesShrink(String sceneTypesShrink) {
        this.sceneTypesShrink = sceneTypesShrink;
        return this;
    }
    public String getSceneTypesShrink() {
        return this.sceneTypesShrink;
    }

    public QuerySceneListShrinkRequest setTemplateInfoIdsShrink(String templateInfoIdsShrink) {
        this.templateInfoIdsShrink = templateInfoIdsShrink;
        return this;
    }
    public String getTemplateInfoIdsShrink() {
        return this.templateInfoIdsShrink;
    }

}
