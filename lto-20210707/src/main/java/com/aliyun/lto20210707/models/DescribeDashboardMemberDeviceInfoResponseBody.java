// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeDashboardMemberDeviceInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeDashboardMemberDeviceInfoResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDashboardMemberDeviceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardMemberDeviceInfoResponseBody self = new DescribeDashboardMemberDeviceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardMemberDeviceInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDashboardMemberDeviceInfoResponseBody setData(java.util.List<DescribeDashboardMemberDeviceInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDashboardMemberDeviceInfoResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDashboardMemberDeviceInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDashboardMemberDeviceInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDashboardMemberDeviceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDashboardMemberDeviceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDashboardMemberDeviceInfoResponseBodyDataMemberInfoList extends TeaModel {
        @NameInMap("DeviceCount")
        public Integer deviceCount;

        @NameInMap("Time")
        public Long time;

        public static DescribeDashboardMemberDeviceInfoResponseBodyDataMemberInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDashboardMemberDeviceInfoResponseBodyDataMemberInfoList self = new DescribeDashboardMemberDeviceInfoResponseBodyDataMemberInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeDashboardMemberDeviceInfoResponseBodyDataMemberInfoList setDeviceCount(Integer deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        public DescribeDashboardMemberDeviceInfoResponseBodyDataMemberInfoList setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

    public static class DescribeDashboardMemberDeviceInfoResponseBodyData extends TeaModel {
        @NameInMap("MemberInfoList")
        public java.util.List<DescribeDashboardMemberDeviceInfoResponseBodyDataMemberInfoList> memberInfoList;

        @NameInMap("MemberName")
        public String memberName;

        public static DescribeDashboardMemberDeviceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDashboardMemberDeviceInfoResponseBodyData self = new DescribeDashboardMemberDeviceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDashboardMemberDeviceInfoResponseBodyData setMemberInfoList(java.util.List<DescribeDashboardMemberDeviceInfoResponseBodyDataMemberInfoList> memberInfoList) {
            this.memberInfoList = memberInfoList;
            return this;
        }
        public java.util.List<DescribeDashboardMemberDeviceInfoResponseBodyDataMemberInfoList> getMemberInfoList() {
            return this.memberInfoList;
        }

        public DescribeDashboardMemberDeviceInfoResponseBodyData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

    }

}
