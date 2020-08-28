// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ListProductsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("UbsmsStatus")
    @Validation(required = true)
    public String ubsmsStatus;

    @NameInMap("ProductInfos")
    @Validation(required = true)
    public ListProductsResponseProductInfos productInfos;

    public static ListProductsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponse self = new ListProductsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListProductsResponse setUbsmsStatus(String ubsmsStatus) {
        this.ubsmsStatus = ubsmsStatus;
        return this;
    }
    public String getUbsmsStatus() {
        return this.ubsmsStatus;
    }

    public ListProductsResponse setProductInfos(ListProductsResponseProductInfos productInfos) {
        this.productInfos = productInfos;
        return this;
    }
    public ListProductsResponseProductInfos getProductInfos() {
        return this.productInfos;
    }

    public static class ListProductsResponseProductInfosProductInfo extends TeaModel {
        @NameInMap("ProductId")
        @Validation(required = true)
        public String productId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("EncodedIcon")
        @Validation(required = true)
        public String encodedIcon;

        @NameInMap("Platforms")
        @Validation(required = true)
        public String platforms;

        @NameInMap("Readonly")
        @Validation(required = true)
        public Boolean readonly;

        @NameInMap("IndustryId")
        @Validation(required = true)
        public Integer industryId;

        public static ListProductsResponseProductInfosProductInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseProductInfosProductInfo self = new ListProductsResponseProductInfosProductInfo();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseProductInfosProductInfo setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListProductsResponseProductInfosProductInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductsResponseProductInfosProductInfo setEncodedIcon(String encodedIcon) {
            this.encodedIcon = encodedIcon;
            return this;
        }
        public String getEncodedIcon() {
            return this.encodedIcon;
        }

        public ListProductsResponseProductInfosProductInfo setPlatforms(String platforms) {
            this.platforms = platforms;
            return this;
        }
        public String getPlatforms() {
            return this.platforms;
        }

        public ListProductsResponseProductInfosProductInfo setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public ListProductsResponseProductInfosProductInfo setIndustryId(Integer industryId) {
            this.industryId = industryId;
            return this;
        }
        public Integer getIndustryId() {
            return this.industryId;
        }

    }

    public static class ListProductsResponseProductInfos extends TeaModel {
        @NameInMap("ProductInfo")
        @Validation(required = true)
        public java.util.List<ListProductsResponseProductInfosProductInfo> productInfo;

        public static ListProductsResponseProductInfos build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseProductInfos self = new ListProductsResponseProductInfos();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseProductInfos setProductInfo(java.util.List<ListProductsResponseProductInfosProductInfo> productInfo) {
            this.productInfo = productInfo;
            return this;
        }
        public java.util.List<ListProductsResponseProductInfosProductInfo> getProductInfo() {
            return this.productInfo;
        }

    }

}
