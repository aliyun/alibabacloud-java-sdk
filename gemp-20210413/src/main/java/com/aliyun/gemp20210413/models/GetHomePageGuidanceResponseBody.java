// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetHomePageGuidanceResponseBody extends TeaModel {
    @NameInMap("data")
    public GetHomePageGuidanceResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetHomePageGuidanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHomePageGuidanceResponseBody self = new GetHomePageGuidanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHomePageGuidanceResponseBody setData(GetHomePageGuidanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHomePageGuidanceResponseBodyData getData() {
        return this.data;
    }

    public GetHomePageGuidanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHomePageGuidanceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("notifySubscriptionStatus")
        public Boolean notifySubscriptionStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("serviceGroupStatus")
        public Boolean serviceGroupStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("serviceStatus")
        public Boolean serviceStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("usersStatus")
        public Boolean usersStatus;

        public static GetHomePageGuidanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHomePageGuidanceResponseBodyData self = new GetHomePageGuidanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHomePageGuidanceResponseBodyData setNotifySubscriptionStatus(Boolean notifySubscriptionStatus) {
            this.notifySubscriptionStatus = notifySubscriptionStatus;
            return this;
        }
        public Boolean getNotifySubscriptionStatus() {
            return this.notifySubscriptionStatus;
        }

        public GetHomePageGuidanceResponseBodyData setServiceGroupStatus(Boolean serviceGroupStatus) {
            this.serviceGroupStatus = serviceGroupStatus;
            return this;
        }
        public Boolean getServiceGroupStatus() {
            return this.serviceGroupStatus;
        }

        public GetHomePageGuidanceResponseBodyData setServiceStatus(Boolean serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public Boolean getServiceStatus() {
            return this.serviceStatus;
        }

        public GetHomePageGuidanceResponseBodyData setUsersStatus(Boolean usersStatus) {
            this.usersStatus = usersStatus;
            return this;
        }
        public Boolean getUsersStatus() {
            return this.usersStatus;
        }

    }

}
