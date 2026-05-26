// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class UpdateProductShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DEVICE_001</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("ExtraImages")
    public String extraImagesShrink;

    /**
     * <strong>example:</strong>
     * <p>可口可乐330ml</p>
     */
    @NameInMap("ImageTitle")
    public String imageTitle;

    /**
     * <strong>example:</strong>
     * <p>ITEM_001</p>
     */
    @NameInMap("ItemUniqueId")
    public String itemUniqueId;

    /**
     * <strong>example:</strong>
     * <p>[&quot;<a href="https://img.example.com/item1.jpg%22%5D">https://img.example.com/item1.jpg&quot;]</a></p>
     */
    @NameInMap("MainImage")
    public String mainImageShrink;

    @NameInMap("MultiViewImages")
    public String multiViewImagesShrink;

    /**
     * <strong>example:</strong>
     * <p>PLAT_001</p>
     */
    @NameInMap("PlatformItemId")
    public String platformItemId;

    public static UpdateProductShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductShrinkRequest self = new UpdateProductShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductShrinkRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UpdateProductShrinkRequest setExtraImagesShrink(String extraImagesShrink) {
        this.extraImagesShrink = extraImagesShrink;
        return this;
    }
    public String getExtraImagesShrink() {
        return this.extraImagesShrink;
    }

    public UpdateProductShrinkRequest setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
        return this;
    }
    public String getImageTitle() {
        return this.imageTitle;
    }

    public UpdateProductShrinkRequest setItemUniqueId(String itemUniqueId) {
        this.itemUniqueId = itemUniqueId;
        return this;
    }
    public String getItemUniqueId() {
        return this.itemUniqueId;
    }

    public UpdateProductShrinkRequest setMainImageShrink(String mainImageShrink) {
        this.mainImageShrink = mainImageShrink;
        return this;
    }
    public String getMainImageShrink() {
        return this.mainImageShrink;
    }

    public UpdateProductShrinkRequest setMultiViewImagesShrink(String multiViewImagesShrink) {
        this.multiViewImagesShrink = multiViewImagesShrink;
        return this;
    }
    public String getMultiViewImagesShrink() {
        return this.multiViewImagesShrink;
    }

    public UpdateProductShrinkRequest setPlatformItemId(String platformItemId) {
        this.platformItemId = platformItemId;
        return this;
    }
    public String getPlatformItemId() {
        return this.platformItemId;
    }

}
