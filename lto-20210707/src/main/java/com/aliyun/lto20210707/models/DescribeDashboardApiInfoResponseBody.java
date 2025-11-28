// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeDashboardApiInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeDashboardApiInfoResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDashboardApiInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardApiInfoResponseBody self = new DescribeDashboardApiInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardApiInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDashboardApiInfoResponseBody setData(DescribeDashboardApiInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDashboardApiInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeDashboardApiInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDashboardApiInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDashboardApiInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDashboardApiInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDashboardApiInfoResponseBodyData extends TeaModel {
        @NameInMap("AuthorizedCount")
        public Long authorizedCount;

        @NameInMap("UsedCount")
        public Long usedCount;

        public static DescribeDashboardApiInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDashboardApiInfoResponseBodyData self = new DescribeDashboardApiInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDashboardApiInfoResponseBodyData setAuthorizedCount(Long authorizedCount) {
            this.authorizedCount = authorizedCount;
            return this;
        }
        public Long getAuthorizedCount() {
            return this.authorizedCount;
        }

        public DescribeDashboardApiInfoResponseBodyData setUsedCount(Long usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Long getUsedCount() {
            return this.usedCount;
        }

    }

}
