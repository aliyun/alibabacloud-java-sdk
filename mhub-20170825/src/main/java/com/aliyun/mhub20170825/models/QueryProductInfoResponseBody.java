// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryProductInfoResponseBody extends TeaModel {
    @NameInMap("ProductInfo")
    public QueryProductInfoResponseBodyProductInfo productInfo;

    /**
     * <strong>example:</strong>
     * <p>126D4DDD-05A5-49B1-B18C-39C4A929BFB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryProductInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProductInfoResponseBody self = new QueryProductInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProductInfoResponseBody setProductInfo(QueryProductInfoResponseBodyProductInfo productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    public QueryProductInfoResponseBodyProductInfo getProductInfo() {
        return this.productInfo;
    }

    public QueryProductInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryProductInfoResponseBodyProductInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-12-02T09:50:01Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>endpoint for ecs: kangaroo-xuanji-cn-hangzhou-ecs-console-mirror-0(i-bp1fs84ua5zw4aljdlh1)</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>icon图片base64字符串</p>
         */
        @NameInMap("EncodedIcon")
        public String encodedIcon;

        /**
         * <strong>example:</strong>
         * <p>icon图片名称</p>
         */
        @NameInMap("IconName")
        public String iconName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IndustryId")
        public Integer industryId;

        /**
         * <strong>example:</strong>
         * <p>我的项目</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>linux/amd64</p>
         */
        @NameInMap("Platforms")
        public String platforms;

        /**
         * <strong>example:</strong>
         * <p>3910360</p>
         */
        @NameInMap("ProductId")
        public Integer productId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Readonly")
        public Boolean readonly;

        public static QueryProductInfoResponseBodyProductInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryProductInfoResponseBodyProductInfo self = new QueryProductInfoResponseBodyProductInfo();
            return TeaModel.build(map, self);
        }

        public QueryProductInfoResponseBodyProductInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryProductInfoResponseBodyProductInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryProductInfoResponseBodyProductInfo setEncodedIcon(String encodedIcon) {
            this.encodedIcon = encodedIcon;
            return this;
        }
        public String getEncodedIcon() {
            return this.encodedIcon;
        }

        public QueryProductInfoResponseBodyProductInfo setIconName(String iconName) {
            this.iconName = iconName;
            return this;
        }
        public String getIconName() {
            return this.iconName;
        }

        public QueryProductInfoResponseBodyProductInfo setIndustryId(Integer industryId) {
            this.industryId = industryId;
            return this;
        }
        public Integer getIndustryId() {
            return this.industryId;
        }

        public QueryProductInfoResponseBodyProductInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryProductInfoResponseBodyProductInfo setPlatforms(String platforms) {
            this.platforms = platforms;
            return this;
        }
        public String getPlatforms() {
            return this.platforms;
        }

        public QueryProductInfoResponseBodyProductInfo setProductId(Integer productId) {
            this.productId = productId;
            return this;
        }
        public Integer getProductId() {
            return this.productId;
        }

        public QueryProductInfoResponseBodyProductInfo setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

    }

}
