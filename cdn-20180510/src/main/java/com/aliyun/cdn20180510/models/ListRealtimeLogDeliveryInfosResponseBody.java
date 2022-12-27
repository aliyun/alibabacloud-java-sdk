// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListRealtimeLogDeliveryInfosResponseBody extends TeaModel {
    // The content of the log entry.
    @NameInMap("Content")
    public ListRealtimeLogDeliveryInfosResponseBodyContent content;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ListRealtimeLogDeliveryInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeLogDeliveryInfosResponseBody self = new ListRealtimeLogDeliveryInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRealtimeLogDeliveryInfosResponseBody setContent(ListRealtimeLogDeliveryInfosResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListRealtimeLogDeliveryInfosResponseBodyContent getContent() {
        return this.content;
    }

    public ListRealtimeLogDeliveryInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos extends TeaModel {
        // The name of the Logstore that collects log data from Alibaba Cloud Content Delivery Network (CDN) in real time.
        @NameInMap("Logstore")
        public String logstore;

        // The name of the Log Service project that is used for real-time log delivery.
        @NameInMap("Project")
        public String project;

        // The ID of the region where the Log Service project is deployed. For more information, see [Regions that support real-time log delivery](~~144883~~).
        @NameInMap("Region")
        public String region;

        public static ListRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos build(java.util.Map<String, ?> map) throws Exception {
            ListRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos self = new ListRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos();
            return TeaModel.build(map, self);
        }

        public ListRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ListRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class ListRealtimeLogDeliveryInfosResponseBodyContent extends TeaModel {
        @NameInMap("RealtimeLogDeliveryInfos")
        public java.util.List<ListRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos> realtimeLogDeliveryInfos;

        public static ListRealtimeLogDeliveryInfosResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListRealtimeLogDeliveryInfosResponseBodyContent self = new ListRealtimeLogDeliveryInfosResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListRealtimeLogDeliveryInfosResponseBodyContent setRealtimeLogDeliveryInfos(java.util.List<ListRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos> realtimeLogDeliveryInfos) {
            this.realtimeLogDeliveryInfos = realtimeLogDeliveryInfos;
            return this;
        }
        public java.util.List<ListRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos> getRealtimeLogDeliveryInfos() {
            return this.realtimeLogDeliveryInfos;
        }

    }

}
