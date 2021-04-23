// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyStudioLayoutRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("LayoutId")
    public String layoutId;

    @NameInMap("LayoutName")
    public String layoutName;

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

    public static ModifyStudioLayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyStudioLayoutRequest self = new ModifyStudioLayoutRequest();
        return TeaModel.build(map, self);
    }

    public ModifyStudioLayoutRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyStudioLayoutRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public ModifyStudioLayoutRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public ModifyStudioLayoutRequest setLayoutName(String layoutName) {
        this.layoutName = layoutName;
        return this;
    }
    public String getLayoutName() {
        return this.layoutName;
    }

    public ModifyStudioLayoutRequest setCommonConfig(String commonConfig) {
        this.commonConfig = commonConfig;
        return this;
    }
    public String getCommonConfig() {
        return this.commonConfig;
    }

    public ModifyStudioLayoutRequest setBgImageConfig(String bgImageConfig) {
        this.bgImageConfig = bgImageConfig;
        return this;
    }
    public String getBgImageConfig() {
        return this.bgImageConfig;
    }

    public ModifyStudioLayoutRequest setScreenInputConfigList(String screenInputConfigList) {
        this.screenInputConfigList = screenInputConfigList;
        return this;
    }
    public String getScreenInputConfigList() {
        return this.screenInputConfigList;
    }

    public ModifyStudioLayoutRequest setMediaInputConfigList(String mediaInputConfigList) {
        this.mediaInputConfigList = mediaInputConfigList;
        return this;
    }
    public String getMediaInputConfigList() {
        return this.mediaInputConfigList;
    }

    public ModifyStudioLayoutRequest setLayerOrderConfigList(String layerOrderConfigList) {
        this.layerOrderConfigList = layerOrderConfigList;
        return this;
    }
    public String getLayerOrderConfigList() {
        return this.layerOrderConfigList;
    }

}
