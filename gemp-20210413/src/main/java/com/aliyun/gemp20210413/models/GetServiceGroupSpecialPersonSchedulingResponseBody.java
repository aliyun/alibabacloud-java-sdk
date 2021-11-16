// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupSpecialPersonSchedulingResponseBody extends TeaModel {
    // 人员排班信息
    @NameInMap("data")
    public java.util.List<GetServiceGroupSpecialPersonSchedulingResponseBodyData> data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetServiceGroupSpecialPersonSchedulingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupSpecialPersonSchedulingResponseBody self = new GetServiceGroupSpecialPersonSchedulingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupSpecialPersonSchedulingResponseBody setData(java.util.List<GetServiceGroupSpecialPersonSchedulingResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetServiceGroupSpecialPersonSchedulingResponseBodyData> getData() {
        return this.data;
    }

    public GetServiceGroupSpecialPersonSchedulingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetServiceGroupSpecialPersonSchedulingResponseBodyData extends TeaModel {
        // 排班日期
        @NameInMap("schedulingDate")
        public String schedulingDate;

        // 排班结束时间
        @NameInMap("schedulingEndTime")
        public String schedulingEndTime;

        // 排班开始时间
        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        // 排班用户ID
        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        // 服务组id
        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        // 服务组名字
        @NameInMap("serviceGroupName")
        public String serviceGroupName;

        public static GetServiceGroupSpecialPersonSchedulingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceGroupSpecialPersonSchedulingResponseBodyData self = new GetServiceGroupSpecialPersonSchedulingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceGroupSpecialPersonSchedulingResponseBodyData setSchedulingDate(String schedulingDate) {
            this.schedulingDate = schedulingDate;
            return this;
        }
        public String getSchedulingDate() {
            return this.schedulingDate;
        }

        public GetServiceGroupSpecialPersonSchedulingResponseBodyData setSchedulingEndTime(String schedulingEndTime) {
            this.schedulingEndTime = schedulingEndTime;
            return this;
        }
        public String getSchedulingEndTime() {
            return this.schedulingEndTime;
        }

        public GetServiceGroupSpecialPersonSchedulingResponseBodyData setSchedulingStartTime(String schedulingStartTime) {
            this.schedulingStartTime = schedulingStartTime;
            return this;
        }
        public String getSchedulingStartTime() {
            return this.schedulingStartTime;
        }

        public GetServiceGroupSpecialPersonSchedulingResponseBodyData setSchedulingUserId(Long schedulingUserId) {
            this.schedulingUserId = schedulingUserId;
            return this;
        }
        public Long getSchedulingUserId() {
            return this.schedulingUserId;
        }

        public GetServiceGroupSpecialPersonSchedulingResponseBodyData setServiceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        public GetServiceGroupSpecialPersonSchedulingResponseBodyData setServiceGroupName(String serviceGroupName) {
            this.serviceGroupName = serviceGroupName;
            return this;
        }
        public String getServiceGroupName() {
            return this.serviceGroupName;
        }

    }

}
