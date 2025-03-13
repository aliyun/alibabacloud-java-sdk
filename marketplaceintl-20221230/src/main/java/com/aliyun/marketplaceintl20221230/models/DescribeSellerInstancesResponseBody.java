// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20221230.models;

import com.aliyun.tea.*;

public class DescribeSellerInstancesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>fatal</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("Fatal")
    public Boolean fatal;

    /**
     * <strong>example:</strong>
     * <p>Instance 5723f7ee-952d-411f-94f4-b942a550d9b8 does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>A6A33748-D573-593C-A3BC-593E33D68311</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeSellerInstancesResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>103</p>
     */
    @NameInMap("Version")
    public String version;

    public static DescribeSellerInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSellerInstancesResponseBody self = new DescribeSellerInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSellerInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSellerInstancesResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public DescribeSellerInstancesResponseBody setFatal(Boolean fatal) {
        this.fatal = fatal;
        return this;
    }
    public Boolean getFatal() {
        return this.fatal;
    }

    public DescribeSellerInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSellerInstancesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSellerInstancesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSellerInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSellerInstancesResponseBody setResult(java.util.List<DescribeSellerInstancesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeSellerInstancesResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeSellerInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSellerInstancesResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class DescribeSellerInstancesResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{\&quot;authUrl\&quot;:\&quot;<a href="https://marketplace.alibabacloud.com/%5C%5C%22%7D">https://marketplace.alibabacloud.com/\\&quot;}</a></p>
         */
        @NameInMap("AppInfo")
        public String appInfo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChargeType")
        public Integer chargeType;

        /**
         * <strong>example:</strong>
         * <p>sgcmgj000356</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>1741752000000</p>
         */
        @NameInMap("CreatedOn")
        public Long createdOn;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;userName\&quot;:\&quot;marketplace\&quot;}</p>
         */
        @NameInMap("HostInfo")
        public String hostInfo;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;userName\&quot;:\&quot;marketplace\&quot;}</p>
         */
        @NameInMap("Info")
        public String info;

        /**
         * <strong>example:</strong>
         * <p>5000002763123</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <strong>example:</strong>
         * <p>OPENED</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <strong>example:</strong>
         * <p>5322460655123456</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static DescribeSellerInstancesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSellerInstancesResponseBodyResult self = new DescribeSellerInstancesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSellerInstancesResponseBodyResult setAppInfo(String appInfo) {
            this.appInfo = appInfo;
            return this;
        }
        public String getAppInfo() {
            return this.appInfo;
        }

        public DescribeSellerInstancesResponseBodyResult setChargeType(Integer chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public Integer getChargeType() {
            return this.chargeType;
        }

        public DescribeSellerInstancesResponseBodyResult setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeSellerInstancesResponseBodyResult setCreatedOn(Long createdOn) {
            this.createdOn = createdOn;
            return this;
        }
        public Long getCreatedOn() {
            return this.createdOn;
        }

        public DescribeSellerInstancesResponseBodyResult setHostInfo(String hostInfo) {
            this.hostInfo = hostInfo;
            return this;
        }
        public String getHostInfo() {
            return this.hostInfo;
        }

        public DescribeSellerInstancesResponseBodyResult setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public DescribeSellerInstancesResponseBodyResult setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public DescribeSellerInstancesResponseBodyResult setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeSellerInstancesResponseBodyResult setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
