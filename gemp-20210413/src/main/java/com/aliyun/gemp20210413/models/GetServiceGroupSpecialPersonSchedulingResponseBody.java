// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupSpecialPersonSchedulingResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<GetServiceGroupSpecialPersonSchedulingResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     */
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
        @NameInMap("schedulingDate")
        public String schedulingDate;

        @NameInMap("schedulingEndTime")
        public String schedulingEndTime;

        @NameInMap("schedulingStartTime")
        public String schedulingStartTime;

        @NameInMap("schedulingUserId")
        public Long schedulingUserId;

        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

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
