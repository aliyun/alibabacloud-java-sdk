// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UbsmsStatus")
    public String ubsmsStatus;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("ProductInfos")
    public ListProductsResponseBodyProductInfos productInfos;

    public static ListProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponseBody self = new ListProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductsResponseBody setUbsmsStatus(String ubsmsStatus) {
        this.ubsmsStatus = ubsmsStatus;
        return this;
    }
    public String getUbsmsStatus() {
        return this.ubsmsStatus;
    }

    public ListProductsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListProductsResponseBody setProductInfos(ListProductsResponseBodyProductInfos productInfos) {
        this.productInfos = productInfos;
        return this;
    }
    public ListProductsResponseBodyProductInfos getProductInfos() {
        return this.productInfos;
    }

    public static class ListProductsResponseBodyProductInfosProductInfo extends TeaModel {
        @NameInMap("IndustryId")
        public Integer industryId;

        @NameInMap("Platforms")
        public String platforms;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EncodedIcon")
        public String encodedIcon;

        @NameInMap("ProductId")
        public Integer productId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Readonly")
        public Boolean readonly;

        public static ListProductsResponseBodyProductInfosProductInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyProductInfosProductInfo self = new ListProductsResponseBodyProductInfosProductInfo();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyProductInfosProductInfo setIndustryId(Integer industryId) {
            this.industryId = industryId;
            return this;
        }
        public Integer getIndustryId() {
            return this.industryId;
        }

        public ListProductsResponseBodyProductInfosProductInfo setPlatforms(String platforms) {
            this.platforms = platforms;
            return this;
        }
        public String getPlatforms() {
            return this.platforms;
        }

        public ListProductsResponseBodyProductInfosProductInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProductsResponseBodyProductInfosProductInfo setEncodedIcon(String encodedIcon) {
            this.encodedIcon = encodedIcon;
            return this;
        }
        public String getEncodedIcon() {
            return this.encodedIcon;
        }

        public ListProductsResponseBodyProductInfosProductInfo setProductId(Integer productId) {
            this.productId = productId;
            return this;
        }
        public Integer getProductId() {
            return this.productId;
        }

        public ListProductsResponseBodyProductInfosProductInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductsResponseBodyProductInfosProductInfo setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

    }

    public static class ListProductsResponseBodyProductInfos extends TeaModel {
        @NameInMap("ProductInfo")
        public java.util.List<ListProductsResponseBodyProductInfosProductInfo> productInfo;

        public static ListProductsResponseBodyProductInfos build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyProductInfos self = new ListProductsResponseBodyProductInfos();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyProductInfos setProductInfo(java.util.List<ListProductsResponseBodyProductInfosProductInfo> productInfo) {
            this.productInfo = productInfo;
            return this;
        }
        public java.util.List<ListProductsResponseBodyProductInfosProductInfo> getProductInfo() {
            return this.productInfo;
        }

    }

}
