// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeEdgeStatInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeEdgeStatInfoResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEdgeStatInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeStatInfoResponseBody self = new DescribeEdgeStatInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeStatInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEdgeStatInfoResponseBody setData(DescribeEdgeStatInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEdgeStatInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeEdgeStatInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeEdgeStatInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEdgeStatInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEdgeStatInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEdgeStatInfoResponseBodyData extends TeaModel {
        @NameInMap("TotalDeviceLicenseCount")
        public Long totalDeviceLicenseCount;

        @NameInMap("UsedDeviceLicenseCount")
        public Long usedDeviceLicenseCount;

        public static DescribeEdgeStatInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEdgeStatInfoResponseBodyData self = new DescribeEdgeStatInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEdgeStatInfoResponseBodyData setTotalDeviceLicenseCount(Long totalDeviceLicenseCount) {
            this.totalDeviceLicenseCount = totalDeviceLicenseCount;
            return this;
        }
        public Long getTotalDeviceLicenseCount() {
            return this.totalDeviceLicenseCount;
        }

        public DescribeEdgeStatInfoResponseBodyData setUsedDeviceLicenseCount(Long usedDeviceLicenseCount) {
            this.usedDeviceLicenseCount = usedDeviceLicenseCount;
            return this;
        }
        public Long getUsedDeviceLicenseCount() {
            return this.usedDeviceLicenseCount;
        }

    }

}
