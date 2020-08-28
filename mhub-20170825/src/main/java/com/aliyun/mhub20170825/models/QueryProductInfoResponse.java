// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryProductInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ProductInfo")
    @Validation(required = true)
    public QueryProductInfoResponseProductInfo productInfo;

    public static QueryProductInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProductInfoResponse self = new QueryProductInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryProductInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProductInfoResponse setProductInfo(QueryProductInfoResponseProductInfo productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    public QueryProductInfoResponseProductInfo getProductInfo() {
        return this.productInfo;
    }

    public static class QueryProductInfoResponseProductInfo extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("IndustryId")
        @Validation(required = true)
        public Integer industryId;

        @NameInMap("EncodedIcon")
        @Validation(required = true)
        public String encodedIcon;

        @NameInMap("IconName")
        @Validation(required = true)
        public String iconName;

        @NameInMap("Readonly")
        @Validation(required = true)
        public Boolean readonly;

        public static QueryProductInfoResponseProductInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryProductInfoResponseProductInfo self = new QueryProductInfoResponseProductInfo();
            return TeaModel.build(map, self);
        }

        public QueryProductInfoResponseProductInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryProductInfoResponseProductInfo setIndustryId(Integer industryId) {
            this.industryId = industryId;
            return this;
        }
        public Integer getIndustryId() {
            return this.industryId;
        }

        public QueryProductInfoResponseProductInfo setEncodedIcon(String encodedIcon) {
            this.encodedIcon = encodedIcon;
            return this;
        }
        public String getEncodedIcon() {
            return this.encodedIcon;
        }

        public QueryProductInfoResponseProductInfo setIconName(String iconName) {
            this.iconName = iconName;
            return this;
        }
        public String getIconName() {
            return this.iconName;
        }

        public QueryProductInfoResponseProductInfo setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

    }

}
