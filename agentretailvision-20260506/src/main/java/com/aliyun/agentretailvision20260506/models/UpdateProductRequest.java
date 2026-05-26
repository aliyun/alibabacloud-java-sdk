// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class UpdateProductRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DEVICE_001</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("ExtraImages")
    public java.util.List<String> extraImages;

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
    public java.util.List<String> mainImage;

    @NameInMap("MultiViewImages")
    public java.util.List<UpdateProductRequestMultiViewImages> multiViewImages;

    /**
     * <strong>example:</strong>
     * <p>PLAT_001</p>
     */
    @NameInMap("PlatformItemId")
    public String platformItemId;

    public static UpdateProductRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductRequest self = new UpdateProductRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UpdateProductRequest setExtraImages(java.util.List<String> extraImages) {
        this.extraImages = extraImages;
        return this;
    }
    public java.util.List<String> getExtraImages() {
        return this.extraImages;
    }

    public UpdateProductRequest setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
        return this;
    }
    public String getImageTitle() {
        return this.imageTitle;
    }

    public UpdateProductRequest setItemUniqueId(String itemUniqueId) {
        this.itemUniqueId = itemUniqueId;
        return this;
    }
    public String getItemUniqueId() {
        return this.itemUniqueId;
    }

    public UpdateProductRequest setMainImage(java.util.List<String> mainImage) {
        this.mainImage = mainImage;
        return this;
    }
    public java.util.List<String> getMainImage() {
        return this.mainImage;
    }

    public UpdateProductRequest setMultiViewImages(java.util.List<UpdateProductRequestMultiViewImages> multiViewImages) {
        this.multiViewImages = multiViewImages;
        return this;
    }
    public java.util.List<UpdateProductRequestMultiViewImages> getMultiViewImages() {
        return this.multiViewImages;
    }

    public UpdateProductRequest setPlatformItemId(String platformItemId) {
        this.platformItemId = platformItemId;
        return this;
    }
    public String getPlatformItemId() {
        return this.platformItemId;
    }

    public static class UpdateProductRequestMultiViewImages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Angle")
        public String angle;

        /**
         * <strong>example:</strong>
         * <p><a href="https://nova-tems.oss-cn-shanghai.aliyuncs.com/crop/33dfc602-c9a4-11f0-ac99-ee21a901d6ec.png?OSSAccessKeyId=****&Expires=1764058353&Signature=">https://nova-tems.oss-cn-shanghai.aliyuncs.com/crop/33dfc602-c9a4-11f0-ac99-ee21a901d6ec.png?OSSAccessKeyId=****&amp;Expires=1764058353&amp;Signature=</a>****</p>
         */
        @NameInMap("Url")
        public String url;

        public static UpdateProductRequestMultiViewImages build(java.util.Map<String, ?> map) throws Exception {
            UpdateProductRequestMultiViewImages self = new UpdateProductRequestMultiViewImages();
            return TeaModel.build(map, self);
        }

        public UpdateProductRequestMultiViewImages setAngle(String angle) {
            this.angle = angle;
            return this;
        }
        public String getAngle() {
            return this.angle;
        }

        public UpdateProductRequestMultiViewImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
