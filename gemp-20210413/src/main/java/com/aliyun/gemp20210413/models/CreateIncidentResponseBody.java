// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateIncidentResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("data")
    public CreateIncidentResponseBodyData data;

    // requestId
    @NameInMap("requestId")
    public String requestId;

    public static CreateIncidentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIncidentResponseBody self = new CreateIncidentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIncidentResponseBody setData(CreateIncidentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateIncidentResponseBodyData getData() {
        return this.data;
    }

    public CreateIncidentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateIncidentResponseBodyData extends TeaModel {
        // 事件主健Id
        @NameInMap("incidentId")
        public Long incidentId;

        public static CreateIncidentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateIncidentResponseBodyData self = new CreateIncidentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateIncidentResponseBodyData setIncidentId(Long incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Long getIncidentId() {
            return this.incidentId;
        }

    }

}
