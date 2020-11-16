// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Content")
    @Validation(required = true)
    public ListLiveRealtimeLogDeliveryResponseContent content;

    public static ListLiveRealtimeLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRealtimeLogDeliveryResponse self = new ListLiveRealtimeLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveRealtimeLogDeliveryResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveRealtimeLogDeliveryResponse setContent(ListLiveRealtimeLogDeliveryResponseContent content) {
        this.content = content;
        return this;
    }
    public ListLiveRealtimeLogDeliveryResponseContent getContent() {
        return this.content;
    }

    public static class ListLiveRealtimeLogDeliveryResponseContentRealtimeLogDeliveryInfo extends TeaModel {
        @NameInMap("Project")
        @Validation(required = true)
        public String project;

        @NameInMap("Logstore")
        @Validation(required = true)
        public String logstore;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("DmId")
        @Validation(required = true)
        public Integer dmId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static ListLiveRealtimeLogDeliveryResponseContentRealtimeLogDeliveryInfo build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRealtimeLogDeliveryResponseContentRealtimeLogDeliveryInfo self = new ListLiveRealtimeLogDeliveryResponseContentRealtimeLogDeliveryInfo();
            return TeaModel.build(map, self);
        }

        public ListLiveRealtimeLogDeliveryResponseContentRealtimeLogDeliveryInfo setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListLiveRealtimeLogDeliveryResponseContentRealtimeLogDeliveryInfo setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ListLiveRealtimeLogDeliveryResponseContentRealtimeLogDeliveryInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListLiveRealtimeLogDeliveryResponseContentRealtimeLogDeliveryInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListLiveRealtimeLogDeliveryResponseContentRealtimeLogDeliveryInfo setDmId(Integer dmId) {
            this.dmId = dmId;
            return this;
        }
        public Integer getDmId() {
            return this.dmId;
        }

        public ListLiveRealtimeLogDeliveryResponseContentRealtimeLogDeliveryInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListLiveRealtimeLogDeliveryResponseContent extends TeaModel {
        @NameInMap("RealtimeLogDeliveryInfo")
        @Validation(required = true)
        public java.util.List<ListLiveRealtimeLogDeliveryResponseContentRealtimeLogDeliveryInfo> realtimeLogDeliveryInfo;

        public static ListLiveRealtimeLogDeliveryResponseContent build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRealtimeLogDeliveryResponseContent self = new ListLiveRealtimeLogDeliveryResponseContent();
            return TeaModel.build(map, self);
        }

        public ListLiveRealtimeLogDeliveryResponseContent setRealtimeLogDeliveryInfo(java.util.List<ListLiveRealtimeLogDeliveryResponseContentRealtimeLogDeliveryInfo> realtimeLogDeliveryInfo) {
            this.realtimeLogDeliveryInfo = realtimeLogDeliveryInfo;
            return this;
        }
        public java.util.List<ListLiveRealtimeLogDeliveryResponseContentRealtimeLogDeliveryInfo> getRealtimeLogDeliveryInfo() {
            return this.realtimeLogDeliveryInfo;
        }

    }

}
