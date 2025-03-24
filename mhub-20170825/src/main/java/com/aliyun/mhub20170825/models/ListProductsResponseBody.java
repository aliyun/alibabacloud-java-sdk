// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ListProductsResponseBody extends TeaModel {
    @NameInMap("ProductInfos")
    public ListProductsResponseBodyProductInfos productInfos;

    /**
     * <strong>example:</strong>
     * <p>126D4DDD-05A5-49B1-B18C-39C4A929BFB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Integer total;

    /**
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("UbsmsStatus")
    public String ubsmsStatus;

    public static ListProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductsResponseBody self = new ListProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductsResponseBody setProductInfos(ListProductsResponseBodyProductInfos productInfos) {
        this.productInfos = productInfos;
        return this;
    }
    public ListProductsResponseBodyProductInfos getProductInfos() {
        return this.productInfos;
    }

    public ListProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProductsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListProductsResponseBody setUbsmsStatus(String ubsmsStatus) {
        this.ubsmsStatus = ubsmsStatus;
        return this;
    }
    public String getUbsmsStatus() {
        return this.ubsmsStatus;
    }

    public static class ListProductsResponseBodyProductInfosProductInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-12-16T06:25:52Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("EncodedIcon")
        public String encodedIcon;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IndustryId")
        public Integer industryId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>iOS</p>
         */
        @NameInMap("Platforms")
        public String platforms;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ProductId")
        public Integer productId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Readonly")
        public Boolean readonly;

        public static ListProductsResponseBodyProductInfosProductInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProductsResponseBodyProductInfosProductInfo self = new ListProductsResponseBodyProductInfosProductInfo();
            return TeaModel.build(map, self);
        }

        public ListProductsResponseBodyProductInfosProductInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProductsResponseBodyProductInfosProductInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductsResponseBodyProductInfosProductInfo setEncodedIcon(String encodedIcon) {
            this.encodedIcon = encodedIcon;
            return this;
        }
        public String getEncodedIcon() {
            return this.encodedIcon;
        }

        public ListProductsResponseBodyProductInfosProductInfo setIndustryId(Integer industryId) {
            this.industryId = industryId;
            return this;
        }
        public Integer getIndustryId() {
            return this.industryId;
        }

        public ListProductsResponseBodyProductInfosProductInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductsResponseBodyProductInfosProductInfo setPlatforms(String platforms) {
            this.platforms = platforms;
            return this;
        }
        public String getPlatforms() {
            return this.platforms;
        }

        public ListProductsResponseBodyProductInfosProductInfo setProductId(Integer productId) {
            this.productId = productId;
            return this;
        }
        public Integer getProductId() {
            return this.productId;
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
