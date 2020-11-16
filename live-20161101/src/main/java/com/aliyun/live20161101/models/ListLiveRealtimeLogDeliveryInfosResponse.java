// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryInfosResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Content")
    @Validation(required = true)
    public ListLiveRealtimeLogDeliveryInfosResponseContent content;

    public static ListLiveRealtimeLogDeliveryInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRealtimeLogDeliveryInfosResponse self = new ListLiveRealtimeLogDeliveryInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveRealtimeLogDeliveryInfosResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveRealtimeLogDeliveryInfosResponse setContent(ListLiveRealtimeLogDeliveryInfosResponseContent content) {
        this.content = content;
        return this;
    }
    public ListLiveRealtimeLogDeliveryInfosResponseContent getContent() {
        return this.content;
    }

    public static class ListLiveRealtimeLogDeliveryInfosResponseContentRealtimeLogDeliveryInfos extends TeaModel {
        @NameInMap("Project")
        @Validation(required = true)
        public String project;

        @NameInMap("Logstore")
        @Validation(required = true)
        public String logstore;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        public static ListLiveRealtimeLogDeliveryInfosResponseContentRealtimeLogDeliveryInfos build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRealtimeLogDeliveryInfosResponseContentRealtimeLogDeliveryInfos self = new ListLiveRealtimeLogDeliveryInfosResponseContentRealtimeLogDeliveryInfos();
            return TeaModel.build(map, self);
        }

        public ListLiveRealtimeLogDeliveryInfosResponseContentRealtimeLogDeliveryInfos setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListLiveRealtimeLogDeliveryInfosResponseContentRealtimeLogDeliveryInfos setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ListLiveRealtimeLogDeliveryInfosResponseContentRealtimeLogDeliveryInfos setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class ListLiveRealtimeLogDeliveryInfosResponseContent extends TeaModel {
        @NameInMap("RealtimeLogDeliveryInfos")
        @Validation(required = true)
        public java.util.List<ListLiveRealtimeLogDeliveryInfosResponseContentRealtimeLogDeliveryInfos> realtimeLogDeliveryInfos;

        public static ListLiveRealtimeLogDeliveryInfosResponseContent build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRealtimeLogDeliveryInfosResponseContent self = new ListLiveRealtimeLogDeliveryInfosResponseContent();
            return TeaModel.build(map, self);
        }

        public ListLiveRealtimeLogDeliveryInfosResponseContent setRealtimeLogDeliveryInfos(java.util.List<ListLiveRealtimeLogDeliveryInfosResponseContentRealtimeLogDeliveryInfos> realtimeLogDeliveryInfos) {
            this.realtimeLogDeliveryInfos = realtimeLogDeliveryInfos;
            return this;
        }
        public java.util.List<ListLiveRealtimeLogDeliveryInfosResponseContentRealtimeLogDeliveryInfos> getRealtimeLogDeliveryInfos() {
            return this.realtimeLogDeliveryInfos;
        }

    }

}
