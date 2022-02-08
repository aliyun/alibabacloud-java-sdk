// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class GetDISyncInstanceInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetDISyncInstanceInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDISyncInstanceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDISyncInstanceInfoResponseBody self = new GetDISyncInstanceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDISyncInstanceInfoResponseBody setData(GetDISyncInstanceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDISyncInstanceInfoResponseBodyData getData() {
        return this.data;
    }

    public GetDISyncInstanceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDISyncInstanceInfoResponseBodyData extends TeaModel {
        @NameInMap("EventTimedelayInMills")
        public Long eventTimedelayInMills;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        public static GetDISyncInstanceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDISyncInstanceInfoResponseBodyData self = new GetDISyncInstanceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDISyncInstanceInfoResponseBodyData setEventTimedelayInMills(Long eventTimedelayInMills) {
            this.eventTimedelayInMills = eventTimedelayInMills;
            return this;
        }
        public Long getEventTimedelayInMills() {
            return this.eventTimedelayInMills;
        }

        public GetDISyncInstanceInfoResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDISyncInstanceInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
