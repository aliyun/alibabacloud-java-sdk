// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeApiMeteringResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Long count;

    /**
     * <p>fatal</p>
     */
    @NameInMap("Fatal")
    public Boolean fatal;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeApiMeteringResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Version")
    public String version;

    public static DescribeApiMeteringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiMeteringResponseBody self = new DescribeApiMeteringResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiMeteringResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApiMeteringResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public DescribeApiMeteringResponseBody setFatal(Boolean fatal) {
        this.fatal = fatal;
        return this;
    }
    public Boolean getFatal() {
        return this.fatal;
    }

    public DescribeApiMeteringResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApiMeteringResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApiMeteringResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeApiMeteringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiMeteringResponseBody setResult(java.util.List<DescribeApiMeteringResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeApiMeteringResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeApiMeteringResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeApiMeteringResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class DescribeApiMeteringResponseBodyResult extends TeaModel {
        @NameInMap("AliyunPk")
        public Long aliyunPk;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("TotalQuota")
        public Long totalQuota;

        @NameInMap("TotalUsage")
        public Long totalUsage;

        @NameInMap("Unit")
        public String unit;

        public static DescribeApiMeteringResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiMeteringResponseBodyResult self = new DescribeApiMeteringResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeApiMeteringResponseBodyResult setAliyunPk(Long aliyunPk) {
            this.aliyunPk = aliyunPk;
            return this;
        }
        public Long getAliyunPk() {
            return this.aliyunPk;
        }

        public DescribeApiMeteringResponseBodyResult setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeApiMeteringResponseBodyResult setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeApiMeteringResponseBodyResult setTotalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        public DescribeApiMeteringResponseBodyResult setTotalUsage(Long totalUsage) {
            this.totalUsage = totalUsage;
            return this;
        }
        public Long getTotalUsage() {
            return this.totalUsage;
        }

        public DescribeApiMeteringResponseBodyResult setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
