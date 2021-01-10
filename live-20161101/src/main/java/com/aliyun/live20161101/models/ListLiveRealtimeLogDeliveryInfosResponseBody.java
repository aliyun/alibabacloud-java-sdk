// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryInfosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public ListLiveRealtimeLogDeliveryInfosResponseBodyContent content;

    public static ListLiveRealtimeLogDeliveryInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRealtimeLogDeliveryInfosResponseBody self = new ListLiveRealtimeLogDeliveryInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveRealtimeLogDeliveryInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLiveRealtimeLogDeliveryInfosResponseBody setContent(ListLiveRealtimeLogDeliveryInfosResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListLiveRealtimeLogDeliveryInfosResponseBodyContent getContent() {
        return this.content;
    }

    public static class ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos extends TeaModel {
        @NameInMap("Project")
        public String project;

        @NameInMap("Logstore")
        public String logstore;

        @NameInMap("Region")
        public String region;

        public static ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos self = new ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos();
            return TeaModel.build(map, self);
        }

        public ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class ListLiveRealtimeLogDeliveryInfosResponseBodyContent extends TeaModel {
        @NameInMap("RealtimeLogDeliveryInfos")
        public java.util.List<ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos> realtimeLogDeliveryInfos;

        public static ListLiveRealtimeLogDeliveryInfosResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRealtimeLogDeliveryInfosResponseBodyContent self = new ListLiveRealtimeLogDeliveryInfosResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListLiveRealtimeLogDeliveryInfosResponseBodyContent setRealtimeLogDeliveryInfos(java.util.List<ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos> realtimeLogDeliveryInfos) {
            this.realtimeLogDeliveryInfos = realtimeLogDeliveryInfos;
            return this;
        }
        public java.util.List<ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos> getRealtimeLogDeliveryInfos() {
            return this.realtimeLogDeliveryInfos;
        }

    }

}
