// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterComponentRequest extends TeaModel {
    @NameInMap("CaptionLayerContent")
    public String captionLayerContent;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("ComponentLayer")
    public String componentLayer;

    @NameInMap("ComponentName")
    public String componentName;

    @NameInMap("ComponentType")
    public String componentType;

    @NameInMap("Effect")
    public String effect;

    @NameInMap("HtmlLayerContent")
    public String htmlLayerContent;

    @NameInMap("ImageLayerContent")
    public String imageLayerContent;

    @NameInMap("LayerOrder")
    public String layerOrder;

    @NameInMap("LocationId")
    public String locationId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("TextLayerContent")
    public String textLayerContent;

    public static AddCasterComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCasterComponentRequest self = new AddCasterComponentRequest();
        return TeaModel.build(map, self);
    }

    public AddCasterComponentRequest setCaptionLayerContent(String captionLayerContent) {
        this.captionLayerContent = captionLayerContent;
        return this;
    }
    public String getCaptionLayerContent() {
        return this.captionLayerContent;
    }

    public AddCasterComponentRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public AddCasterComponentRequest setComponentLayer(String componentLayer) {
        this.componentLayer = componentLayer;
        return this;
    }
    public String getComponentLayer() {
        return this.componentLayer;
    }

    public AddCasterComponentRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
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

    public AddCasterComponentRequest setHtmlLayerContent(String htmlLayerContent) {
        this.htmlLayerContent = htmlLayerContent;
        return this;
    }
    public String getHtmlLayerContent() {
        return this.htmlLayerContent;
    }

    public AddCasterComponentRequest setImageLayerContent(String imageLayerContent) {
        this.imageLayerContent = imageLayerContent;
        return this;
    }
    public String getImageLayerContent() {
        return this.imageLayerContent;
    }

    public AddCasterComponentRequest setLayerOrder(String layerOrder) {
        this.layerOrder = layerOrder;
        return this;
    }
    public String getLayerOrder() {
        return this.layerOrder;
    }

    public AddCasterComponentRequest setLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }
    public String getLocationId() {
        return this.locationId;
    }

    public AddCasterComponentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCasterComponentRequest setTextLayerContent(String textLayerContent) {
        this.textLayerContent = textLayerContent;
        return this;
    }
    public String getTextLayerContent() {
        return this.textLayerContent;
    }

}
