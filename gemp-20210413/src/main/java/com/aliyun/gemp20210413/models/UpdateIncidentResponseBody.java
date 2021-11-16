// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateIncidentResponseBody extends TeaModel {
    @NameInMap("data")
    public UpdateIncidentResponseBodyData data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static UpdateIncidentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIncidentResponseBody self = new UpdateIncidentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIncidentResponseBody setData(UpdateIncidentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateIncidentResponseBodyData getData() {
        return this.data;
    }

    public UpdateIncidentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateIncidentResponseBodyData extends TeaModel {
        // 事件id
        @NameInMap("incidentId")
        public Long incidentId;

        public static UpdateIncidentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateIncidentResponseBodyData self = new UpdateIncidentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateIncidentResponseBodyData setIncidentId(Long incidentId) {
            this.incidentId = incidentId;
            return this;
        }
        public Long getIncidentId() {
            return this.incidentId;
        }

    }

}
