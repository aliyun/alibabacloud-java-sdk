// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeDashboardBaseInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeDashboardBaseInfoResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDashboardBaseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardBaseInfoResponseBody self = new DescribeDashboardBaseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardBaseInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDashboardBaseInfoResponseBody setData(DescribeDashboardBaseInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDashboardBaseInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeDashboardBaseInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDashboardBaseInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDashboardBaseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDashboardBaseInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDashboardBaseInfoResponseBodyData extends TeaModel {
        @NameInMap("ApiInvokeCount")
        public Long apiInvokeCount;

        @NameInMap("BizChainCount")
        public Integer bizChainCount;

        @NameInMap("DeviceCount")
        public Integer deviceCount;

        @NameInMap("MemberCount")
        public Integer memberCount;

        public static DescribeDashboardBaseInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDashboardBaseInfoResponseBodyData self = new DescribeDashboardBaseInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDashboardBaseInfoResponseBodyData setApiInvokeCount(Long apiInvokeCount) {
            this.apiInvokeCount = apiInvokeCount;
            return this;
        }
        public Long getApiInvokeCount() {
            return this.apiInvokeCount;
        }

        public DescribeDashboardBaseInfoResponseBodyData setBizChainCount(Integer bizChainCount) {
            this.bizChainCount = bizChainCount;
            return this;
        }
        public Integer getBizChainCount() {
            return this.bizChainCount;
        }

        public DescribeDashboardBaseInfoResponseBodyData setDeviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        public DescribeDashboardBaseInfoResponseBodyData setMemberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Integer getMemberCount() {
            return this.memberCount;
        }

    }

}
