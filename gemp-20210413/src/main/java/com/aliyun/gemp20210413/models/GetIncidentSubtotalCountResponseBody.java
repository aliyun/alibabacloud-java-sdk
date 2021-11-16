// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetIncidentSubtotalCountResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public GetIncidentSubtotalCountResponseBodyData data;

    public static GetIncidentSubtotalCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIncidentSubtotalCountResponseBody self = new GetIncidentSubtotalCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIncidentSubtotalCountResponseBody setData(GetIncidentSubtotalCountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetIncidentSubtotalCountResponseBodyData getData() {
        return this.data;
    }

    public static class GetIncidentSubtotalCountResponseBodyData extends TeaModel {
        // id of the request
        @NameInMap("requestId")
        public String requestId;

        // map
        @NameInMap("subtotalCount")
        public java.util.Map<String, ?> subtotalCount;

        public static GetIncidentSubtotalCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetIncidentSubtotalCountResponseBodyData self = new GetIncidentSubtotalCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetIncidentSubtotalCountResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetIncidentSubtotalCountResponseBodyData setSubtotalCount(java.util.Map<String, ?> subtotalCount) {
            this.subtotalCount = subtotalCount;
            return this;
        }
        public java.util.Map<String, ?> getSubtotalCount() {
            return this.subtotalCount;
        }

    }

}
