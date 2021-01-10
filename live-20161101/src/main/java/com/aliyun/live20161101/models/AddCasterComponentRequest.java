// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterComponentRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("ComponentName")
    public String componentName;

    @NameInMap("LocationId")
    public String locationId;

    @NameInMap("ComponentType")
    public String componentType;

    @NameInMap("Effect")
    public String effect;

    @NameInMap("ComponentLayer")
    public String componentLayer;

    @NameInMap("LayerOrder")
    public String layerOrder;

    @NameInMap("TextLayerContent")
    public String textLayerContent;

    @NameInMap("ImageLayerContent")
    public String imageLayerContent;

    @NameInMap("CaptionLayerContent")
    public String captionLayerContent;

    @NameInMap("HtmlLayerContent")
    public String htmlLayerContent;

    public static AddCasterComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCasterComponentRequest self = new AddCasterComponentRequest();
        return TeaModel.build(map, self);
    }

    public AddCasterComponentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCasterComponentRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public AddCasterComponentRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public AddCasterComponentRequest setLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }
    public String getLocationId() {
        return this.locationId;
    }

    public AddCasterComponentRequest setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }
    public String getComponentType() {
        return this.componentType;
    }

    public AddCasterComponentRequest setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public AddCasterComponentRequest setComponentLayer(String componentLayer) {
        this.componentLayer = componentLayer;
        return this;
    }
    public String getComponentLayer() {
        return this.componentLayer;
    }

    public AddCasterComponentRequest setLayerOrder(String layerOrder) {
        this.layerOrder = layerOrder;
        return this;
    }
    public String getLayerOrder() {
        return this.layerOrder;
    }

    public AddCasterComponentRequest setTextLayerContent(String textLayerContent) {
        this.textLayerContent = textLayerContent;
        return this;
    }
    public String getTextLayerContent() {
        return this.textLayerContent;
    }

    public AddCasterComponentRequest setImageLayerContent(String imageLayerContent) {
        this.imageLayerContent = imageLayerContent;
        return this;
    }
    public String getImageLayerContent() {
        return this.imageLayerContent;
    }

    public AddCasterComponentRequest setCaptionLayerContent(String captionLayerContent) {
        this.captionLayerContent = captionLayerContent;
        return this;
    }
    public String getCaptionLayerContent() {
        return this.captionLayerContent;
    }

    public AddCasterComponentRequest setHtmlLayerContent(String htmlLayerContent) {
        this.htmlLayerContent = htmlLayerContent;
        return this;
    }
    public String getHtmlLayerContent() {
        return this.htmlLayerContent;
    }

}
