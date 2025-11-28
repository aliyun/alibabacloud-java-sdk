// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeDashboardDeviceInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeDashboardDeviceInfoResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDashboardDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardDeviceInfoResponseBody self = new DescribeDashboardDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardDeviceInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDashboardDeviceInfoResponseBody setData(DescribeDashboardDeviceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDashboardDeviceInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeDashboardDeviceInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDashboardDeviceInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDashboardDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDashboardDeviceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDashboardDeviceInfoResponseBodyData extends TeaModel {
        @NameInMap("AuthorizedCount")
        public Long authorizedCount;

        @NameInMap("UsedCount")
        public Long usedCount;

        public static DescribeDashboardDeviceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDashboardDeviceInfoResponseBodyData self = new DescribeDashboardDeviceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDashboardDeviceInfoResponseBodyData setAuthorizedCount(Long authorizedCount) {
            this.authorizedCount = authorizedCount;
            return this;
        }
        public Long getAuthorizedCount() {
            return this.authorizedCount;
        }

        public DescribeDashboardDeviceInfoResponseBodyData setUsedCount(Long usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Long getUsedCount() {
            return this.usedCount;
        }

    }

}
