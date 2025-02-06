// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class QueryAuthenticationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<QueryAuthenticationResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>FBE0F2A8-F115-4FE8-BF80-2D068E2372CB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static QueryAuthenticationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthenticationResponseBody self = new QueryAuthenticationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAuthenticationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryAuthenticationResponseBody setData(java.util.List<QueryAuthenticationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAuthenticationResponseBodyData> getData() {
        return this.data;
    }

    public QueryAuthenticationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAuthenticationResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryAuthenticationResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryAuthenticationResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAuthenticationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAuthenticationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAuthenticationResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryAuthenticationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2b407f02dee5c2ddb94804f95e2ba51fed42926d54650678e3b5992d8fb93612</p>
         */
        @NameInMap("ApkPubkey")
        public String apkPubkey;

        /**
         * <strong>example:</strong>
         * <p>2018-07-18T20:18Z</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <strong>example:</strong>
         * <p>597b86ec9d90f6122e982fde74994226465e90046ece0f958ea4614800577b99</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <strong>example:</strong>
         * <p>testproduct</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <strong>example:</strong>
         * <p>2018-08-18T20:18Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>ZNCZegXwLSfplCSL4SoA00105e1400</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LicenseType")
        public Integer licenseType;

        /**
         * <strong>example:</strong>
         * <p>com.alibaba.security.rp.verifyclient.debug</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <strong>example:</strong>
         * <p>testproduct</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        public static QueryAuthenticationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAuthenticationResponseBodyData self = new QueryAuthenticationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAuthenticationResponseBodyData setApkPubkey(String apkPubkey) {
            this.apkPubkey = apkPubkey;
            return this;
        }
        public String getApkPubkey() {
            return this.apkPubkey;
        }

        public QueryAuthenticationResponseBodyData setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public QueryAuthenticationResponseBodyData setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public QueryAuthenticationResponseBodyData setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryAuthenticationResponseBodyData setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public QueryAuthenticationResponseBodyData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryAuthenticationResponseBodyData setLicenseType(Integer licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Integer getLicenseType() {
            return this.licenseType;
        }

        public QueryAuthenticationResponseBodyData setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public QueryAuthenticationResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

}
