// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryProductInfoResponseBody extends TeaModel {
    @NameInMap("ProductInfo")
    public QueryProductInfoResponseBodyProductInfo productInfo;

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
        @NameInMap("IndustryId")
        public Integer industryId;

        @NameInMap("EncodedIcon")
        public String encodedIcon;

        @NameInMap("Name")
        public String name;

        @NameInMap("Readonly")
        public Boolean readonly;

        @NameInMap("IconName")
        public String iconName;

        public static QueryProductInfoResponseBodyProductInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryProductInfoResponseBodyProductInfo self = new QueryProductInfoResponseBodyProductInfo();
            return TeaModel.build(map, self);
        }

        public QueryProductInfoResponseBodyProductInfo setIndustryId(Integer industryId) {
            this.industryId = industryId;
            return this;
        }
        public Integer getIndustryId() {
            return this.industryId;
        }

        public QueryProductInfoResponseBodyProductInfo setEncodedIcon(String encodedIcon) {
            this.encodedIcon = encodedIcon;
            return this;
        }
        public String getEncodedIcon() {
            return this.encodedIcon;
        }

        public QueryProductInfoResponseBodyProductInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryProductInfoResponseBodyProductInfo setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public QueryProductInfoResponseBodyProductInfo setIconName(String iconName) {
            this.iconName = iconName;
            return this;
        }
        public String getIconName() {
            return this.iconName;
        }

    }

}
