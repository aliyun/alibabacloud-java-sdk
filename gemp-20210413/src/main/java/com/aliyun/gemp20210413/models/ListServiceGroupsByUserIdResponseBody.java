// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListServiceGroupsByUserIdResponseBody extends TeaModel {
    @NameInMap("data")
    public ListServiceGroupsByUserIdResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static ListServiceGroupsByUserIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceGroupsByUserIdResponseBody self = new ListServiceGroupsByUserIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceGroupsByUserIdResponseBody setData(ListServiceGroupsByUserIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListServiceGroupsByUserIdResponseBodyData getData() {
        return this.data;
    }

    public ListServiceGroupsByUserIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListServiceGroupsByUserIdResponseBodyData extends TeaModel {
        @NameInMap("isScheduled")
        public Boolean isScheduled;

        @NameInMap("serviceGroupId")
        public Long serviceGroupId;

        @NameInMap("serviceGroupName")
        public String serviceGroupName;

        public static ListServiceGroupsByUserIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListServiceGroupsByUserIdResponseBodyData self = new ListServiceGroupsByUserIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListServiceGroupsByUserIdResponseBodyData setIsScheduled(Boolean isScheduled) {
            this.isScheduled = isScheduled;
            return this;
        }
        public Boolean getIsScheduled() {
            return this.isScheduled;
        }

        public ListServiceGroupsByUserIdResponseBodyData setServiceGroupId(Long serviceGroupId) {
            this.serviceGroupId = serviceGroupId;
            return this;
        }
        public Long getServiceGroupId() {
            return this.serviceGroupId;
        }

        public ListServiceGroupsByUserIdResponseBodyData setServiceGroupName(String serviceGroupName) {
            this.serviceGroupName = serviceGroupName;
            return this;
        }
        public String getServiceGroupName() {
            return this.serviceGroupName;
        }

    }

}
