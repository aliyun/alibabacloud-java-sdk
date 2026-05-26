// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class ImportProductsShrinkRequest extends TeaModel {
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

    public static ImportProductsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportProductsShrinkRequest self = new ImportProductsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportProductsShrinkRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ImportProductsShrinkRequest setExtraImagesShrink(String extraImagesShrink) {
        this.extraImagesShrink = extraImagesShrink;
        return this;
    }
    public String getExtraImagesShrink() {
        return this.extraImagesShrink;
    }

    public ImportProductsShrinkRequest setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
        return this;
    }
    public String getImageTitle() {
        return this.imageTitle;
    }

    public ImportProductsShrinkRequest setItemUniqueId(String itemUniqueId) {
        this.itemUniqueId = itemUniqueId;
        return this;
    }
    public String getItemUniqueId() {
        return this.itemUniqueId;
    }

    public ImportProductsShrinkRequest setMainImageShrink(String mainImageShrink) {
        this.mainImageShrink = mainImageShrink;
        return this;
    }
    public String getMainImageShrink() {
        return this.mainImageShrink;
    }

    public ImportProductsShrinkRequest setMultiViewImagesShrink(String multiViewImagesShrink) {
        this.multiViewImagesShrink = multiViewImagesShrink;
        return this;
    }
    public String getMultiViewImagesShrink() {
        return this.multiViewImagesShrink;
    }

}
