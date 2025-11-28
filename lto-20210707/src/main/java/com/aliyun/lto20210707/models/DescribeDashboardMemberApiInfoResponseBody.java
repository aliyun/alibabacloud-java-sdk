// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeDashboardMemberApiInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeDashboardMemberApiInfoResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDashboardMemberApiInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardMemberApiInfoResponseBody self = new DescribeDashboardMemberApiInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardMemberApiInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDashboardMemberApiInfoResponseBody setData(java.util.List<DescribeDashboardMemberApiInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDashboardMemberApiInfoResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDashboardMemberApiInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDashboardMemberApiInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDashboardMemberApiInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDashboardMemberApiInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDashboardMemberApiInfoResponseBodyDataMemberInfoList extends TeaModel {
        @NameInMap("ApiInvokeCount")
        public Long apiInvokeCount;

        @NameInMap("Time")
        public Long time;

        public static DescribeDashboardMemberApiInfoResponseBodyDataMemberInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDashboardMemberApiInfoResponseBodyDataMemberInfoList self = new DescribeDashboardMemberApiInfoResponseBodyDataMemberInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeDashboardMemberApiInfoResponseBodyDataMemberInfoList setApiInvokeCount(Long apiInvokeCount) {
            this.apiInvokeCount = apiInvokeCount;
            return this;
        }
        public Long getApiInvokeCount() {
            return this.apiInvokeCount;
        }

        public DescribeDashboardMemberApiInfoResponseBodyDataMemberInfoList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

    public static class DescribeDashboardMemberApiInfoResponseBodyData extends TeaModel {
        @NameInMap("MemberInfoList")
        public java.util.List<DescribeDashboardMemberApiInfoResponseBodyDataMemberInfoList> memberInfoList;

        @NameInMap("MemberName")
        public String memberName;

        public static DescribeDashboardMemberApiInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDashboardMemberApiInfoResponseBodyData self = new DescribeDashboardMemberApiInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDashboardMemberApiInfoResponseBodyData setMemberInfoList(java.util.List<DescribeDashboardMemberApiInfoResponseBodyDataMemberInfoList> memberInfoList) {
            this.memberInfoList = memberInfoList;
            return this;
        }
        public java.util.List<DescribeDashboardMemberApiInfoResponseBodyDataMemberInfoList> getMemberInfoList() {
            return this.memberInfoList;
        }

        public DescribeDashboardMemberApiInfoResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

    }

}
