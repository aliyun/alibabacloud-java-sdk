// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class ImportProductsRequest extends TeaModel {
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
    public java.util.List<ImportProductsRequestMultiViewImages> multiViewImages;

    public static ImportProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportProductsRequest self = new ImportProductsRequest();
        return TeaModel.build(map, self);
    }

    public ImportProductsRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ImportProductsRequest setExtraImages(java.util.List<String> extraImages) {
        this.extraImages = extraImages;
        return this;
    }
    public java.util.List<String> getExtraImages() {
        return this.extraImages;
    }

    public ImportProductsRequest setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
        return this;
    }
    public String getImageTitle() {
        return this.imageTitle;
    }

    public ImportProductsRequest setItemUniqueId(String itemUniqueId) {
        this.itemUniqueId = itemUniqueId;
        return this;
    }
    public String getItemUniqueId() {
        return this.itemUniqueId;
    }

    public ImportProductsRequest setMainImage(java.util.List<String> mainImage) {
        this.mainImage = mainImage;
        return this;
    }
    public java.util.List<String> getMainImage() {
        return this.mainImage;
    }

    public ImportProductsRequest setMultiViewImages(java.util.List<ImportProductsRequestMultiViewImages> multiViewImages) {
        this.multiViewImages = multiViewImages;
        return this;
    }
    public java.util.List<ImportProductsRequestMultiViewImages> getMultiViewImages() {
        return this.multiViewImages;
    }

    public static class ImportProductsRequestMultiViewImages extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Angle")
        public String angle;

        /**
         * <strong>example:</strong>
         * <p><a href="https://img5-parcel.oss-cn-hangzhou.aliyuncs.com/2026/01/12/78568805914464s.jpeg?07">https://img5-parcel.oss-cn-hangzhou.aliyuncs.com/2026/01/12/78568805914464s.jpeg?07</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ImportProductsRequestMultiViewImages build(java.util.Map<String, ?> map) throws Exception {
            ImportProductsRequestMultiViewImages self = new ImportProductsRequestMultiViewImages();
            return TeaModel.build(map, self);
        }

        public ImportProductsRequestMultiViewImages setAngle(String angle) {
            this.angle = angle;
            return this;
        }
        public String getAngle() {
            return this.angle;
        }

        public ImportProductsRequestMultiViewImages setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
