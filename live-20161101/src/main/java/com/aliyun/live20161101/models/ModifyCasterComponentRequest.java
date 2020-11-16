// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterComponentRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("ComponentId")
    @Validation(required = true)
    public String componentId;

    @NameInMap("ComponentName")
    public String componentName;

    @NameInMap("ComponentType")
    public String componentType;

    @NameInMap("Effect")
    public String effect;

    @NameInMap("ComponentLayer")
    public String componentLayer;

    @NameInMap("TextLayerContent")
    public String textLayerContent;

    @NameInMap("ImageLayerContent")
    public String imageLayerContent;

    @NameInMap("CaptionLayerContent")
    public String captionLayerContent;

    public static ModifyCasterComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterComponentRequest self = new ModifyCasterComponentRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCasterComponentRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public ModifyCasterComponentRequest setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public ModifyCasterComponentRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public ModifyCasterComponentRequest setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }
    public String getComponentType() {
        return this.componentType;
    }

    public ModifyCasterComponentRequest setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public ModifyCasterComponentRequest setComponentLayer(String componentLayer) {
        this.componentLayer = componentLayer;
        return this;
    }
    public String getComponentLayer() {
        return this.componentLayer;
    }

    public ModifyCasterComponentRequest setTextLayerContent(String textLayerContent) {
        this.textLayerContent = textLayerContent;
        return this;
    }
    public String getTextLayerContent() {
        return this.textLayerContent;
    }

    public ModifyCasterComponentRequest setImageLayerContent(String imageLayerContent) {
        this.imageLayerContent = imageLayerContent;
        return this;
    }
    public String getImageLayerContent() {
        return this.imageLayerContent;
    }

    public ModifyCasterComponentRequest setCaptionLayerContent(String captionLayerContent) {
        this.captionLayerContent = captionLayerContent;
        return this;
    }
    public String getCaptionLayerContent() {
        return this.captionLayerContent;
    }

}
