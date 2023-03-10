// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QuerySellerLicenseResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QuerySellerLicenseResponseBodyModel model;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QuerySellerLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySellerLicenseResponseBody self = new QuerySellerLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySellerLicenseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySellerLicenseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySellerLicenseResponseBody setModel(QuerySellerLicenseResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QuerySellerLicenseResponseBodyModel getModel() {
        return this.model;
    }

    public QuerySellerLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuerySellerLicenseResponseBodyModel extends TeaModel {
        @NameInMap("LicenseUrl")
        public String licenseUrl;

        @NameInMap("SellerId")
        public String sellerId;

        public static QuerySellerLicenseResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QuerySellerLicenseResponseBodyModel self = new QuerySellerLicenseResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QuerySellerLicenseResponseBodyModel setLicenseUrl(String licenseUrl) {
            this.licenseUrl = licenseUrl;
            return this;
        }
        public String getLicenseUrl() {
            return this.licenseUrl;
        }

        public QuerySellerLicenseResponseBodyModel setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

    }

}
