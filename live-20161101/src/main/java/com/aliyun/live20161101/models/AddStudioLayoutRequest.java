// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddStudioLayoutRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("LayoutName")
    public String layoutName;

    @NameInMap("LayoutType")
    public String layoutType;

    @NameInMap("CommonConfig")
    public String commonConfig;

    @NameInMap("BgImageConfig")
    public String bgImageConfig;

    @NameInMap("ScreenInputConfigList")
    public String screenInputConfigList;

    @NameInMap("MediaInputConfigList")
    public String mediaInputConfigList;

    @NameInMap("LayerOrderConfigList")
    public String layerOrderConfigList;

    public static AddStudioLayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        AddStudioLayoutRequest self = new AddStudioLayoutRequest();
        return TeaModel.build(map, self);
    }

    public AddStudioLayoutRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddStudioLayoutRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public AddStudioLayoutRequest setLayoutName(String layoutName) {
        this.layoutName = layoutName;
        return this;
    }
    public String getLayoutName() {
        return this.layoutName;
    }

    public AddStudioLayoutRequest setLayoutType(String layoutType) {
        this.layoutType = layoutType;
        return this;
    }
    public String getLayoutType() {
        return this.layoutType;
    }

    public AddStudioLayoutRequest setCommonConfig(String commonConfig) {
        this.commonConfig = commonConfig;
        return this;
    }
    public String getCommonConfig() {
        return this.commonConfig;
    }

    public AddStudioLayoutRequest setBgImageConfig(String bgImageConfig) {
        this.bgImageConfig = bgImageConfig;
        return this;
    }
    public String getBgImageConfig() {
        return this.bgImageConfig;
    }

    public AddStudioLayoutRequest setScreenInputConfigList(String screenInputConfigList) {
        this.screenInputConfigList = screenInputConfigList;
        return this;
    }
    public String getScreenInputConfigList() {
        return this.screenInputConfigList;
    }

    public AddStudioLayoutRequest setMediaInputConfigList(String mediaInputConfigList) {
        this.mediaInputConfigList = mediaInputConfigList;
        return this;
    }
    public String getMediaInputConfigList() {
        return this.mediaInputConfigList;
    }

    public AddStudioLayoutRequest setLayerOrderConfigList(String layerOrderConfigList) {
        this.layerOrderConfigList = layerOrderConfigList;
        return this;
    }
    public String getLayerOrderConfigList() {
        return this.layerOrderConfigList;
    }

}
