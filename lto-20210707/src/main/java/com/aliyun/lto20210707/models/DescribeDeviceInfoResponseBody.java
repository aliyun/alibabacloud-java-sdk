// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeDeviceInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeDeviceInfoResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceInfoResponseBody self = new DescribeDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDeviceInfoResponseBody setData(DescribeDeviceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDeviceInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeDeviceInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDeviceInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeviceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDeviceInfoResponseBodyData extends TeaModel {
        @NameInMap("AuthorizedCount")
        public Integer authorizedCount;

        @NameInMap("DeviceCount")
        public Integer deviceCount;

        @NameInMap("DistributableCount")
        public Integer distributableCount;

        public static DescribeDeviceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeviceInfoResponseBodyData self = new DescribeDeviceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDeviceInfoResponseBodyData setAuthorizedCount(Integer authorizedCount) {
            this.authorizedCount = authorizedCount;
            return this;
        }
        public Integer getAuthorizedCount() {
            return this.authorizedCount;
        }

        public DescribeDeviceInfoResponseBodyData setDeviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        public DescribeDeviceInfoResponseBodyData setDistributableCount(Integer distributableCount) {
            this.distributableCount = distributableCount;
            return this;
        }
        public Integer getDistributableCount() {
            return this.distributableCount;
        }

    }

}
