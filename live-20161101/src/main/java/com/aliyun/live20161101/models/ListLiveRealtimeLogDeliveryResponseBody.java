// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public ListLiveRealtimeLogDeliveryResponseBodyContent content;

    public static ListLiveRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRealtimeLogDeliveryResponseBody self = new ListLiveRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveRealtimeLogDeliveryResponseBody setContent(ListLiveRealtimeLogDeliveryResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListLiveRealtimeLogDeliveryResponseBodyContent getContent() {
        return this.content;
    }

    public static class ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo extends TeaModel {
        @NameInMap("Project")
        public String project;

        @NameInMap("Logstore")
        public String logstore;

        @NameInMap("Region")
        public String region;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DmId")
        public Integer dmId;

        @NameInMap("Status")
        public String status;

        public static ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo self = new ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo();
            return TeaModel.build(map, self);
        }

        public ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setDmId(Integer dmId) {
            this.dmId = dmId;
            return this;
        }
        public Integer getDmId() {
            return this.dmId;
        }

        public ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListLiveRealtimeLogDeliveryResponseBodyContent extends TeaModel {
        @NameInMap("RealtimeLogDeliveryInfo")
        public java.util.List<ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo> realtimeLogDeliveryInfo;

        public static ListLiveRealtimeLogDeliveryResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRealtimeLogDeliveryResponseBodyContent self = new ListLiveRealtimeLogDeliveryResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListLiveRealtimeLogDeliveryResponseBodyContent setRealtimeLogDeliveryInfo(java.util.List<ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo> realtimeLogDeliveryInfo) {
            this.realtimeLogDeliveryInfo = realtimeLogDeliveryInfo;
            return this;
        }
        public java.util.List<ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo> getRealtimeLogDeliveryInfo() {
            return this.realtimeLogDeliveryInfo;
        }

    }

}
