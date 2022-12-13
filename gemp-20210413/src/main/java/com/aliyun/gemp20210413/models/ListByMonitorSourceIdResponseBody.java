// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListByMonitorSourceIdResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListByMonitorSourceIdResponseBodyData> data;

    @NameInMap("requestId")
    public String requestId;

    public static ListByMonitorSourceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListByMonitorSourceIdResponseBody self = new ListByMonitorSourceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListByMonitorSourceIdResponseBody setData(java.util.List<ListByMonitorSourceIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListByMonitorSourceIdResponseBodyData> getData() {
        return this.data;
    }

    public ListByMonitorSourceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListByMonitorSourceIdResponseBodyData extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("ruleName")
        public String ruleName;

        public static ListByMonitorSourceIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListByMonitorSourceIdResponseBodyData self = new ListByMonitorSourceIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListByMonitorSourceIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListByMonitorSourceIdResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
