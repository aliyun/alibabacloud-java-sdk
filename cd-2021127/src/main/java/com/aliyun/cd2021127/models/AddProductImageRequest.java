// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class AddProductImageRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("ProductImageList")
    public java.util.List<AddProductImageRequestProductImageList> productImageList;

    @NameInMap("ProductName")
    public String productName;

    public static AddProductImageRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProductImageRequest self = new AddProductImageRequest();
        return TeaModel.build(map, self);
    }

    public AddProductImageRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public AddProductImageRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public AddProductImageRequest setProductImageList(java.util.List<AddProductImageRequestProductImageList> productImageList) {
        this.productImageList = productImageList;
        return this;
    }
    public java.util.List<AddProductImageRequestProductImageList> getProductImageList() {
        return this.productImageList;
    }

    public AddProductImageRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public static class AddProductImageRequestProductImageList extends TeaModel {
        @NameInMap("ProductImageCutout")
        public Boolean productImageCutout;

        @NameInMap("ProductImageId")
        public String productImageId;

        @NameInMap("ProductImageLabels")
        public java.util.List<String> productImageLabels;

        @NameInMap("ProductImageType")
        public String productImageType;

        @NameInMap("ProductImageUrl")
        public String productImageUrl;

        public static AddProductImageRequestProductImageList build(java.util.Map<String, ?> map) throws Exception {
            AddProductImageRequestProductImageList self = new AddProductImageRequestProductImageList();
            return TeaModel.build(map, self);
        }

        public AddProductImageRequestProductImageList setProductImageCutout(Boolean productImageCutout) {
            this.productImageCutout = productImageCutout;
            return this;
        }
        public Boolean getProductImageCutout() {
            return this.productImageCutout;
        }

        public AddProductImageRequestProductImageList setProductImageId(String productImageId) {
            this.productImageId = productImageId;
            return this;
        }
        public String getProductImageId() {
            return this.productImageId;
        }

        public AddProductImageRequestProductImageList setProductImageLabels(java.util.List<String> productImageLabels) {
            this.productImageLabels = productImageLabels;
            return this;
        }
        public java.util.List<String> getProductImageLabels() {
            return this.productImageLabels;
        }

        public AddProductImageRequestProductImageList setProductImageType(String productImageType) {
            this.productImageType = productImageType;
            return this;
        }
        public String getProductImageType() {
            return this.productImageType;
        }

        public AddProductImageRequestProductImageList setProductImageUrl(String productImageUrl) {
            this.productImageUrl = productImageUrl;
            return this;
        }
        public String getProductImageUrl() {
            return this.productImageUrl;
        }

    }

}
