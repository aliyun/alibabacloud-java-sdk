// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListRealtimeLogDeliveryInfosResponseBody extends TeaModel {
    /**
     * <p>The information about real-time log delivery.</p>
     */
    @NameInMap("Content")
    public ListRealtimeLogDeliveryInfosResponseBodyContent content;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The name of the Logstore that collects log data from Alibaba Cloud CDN in real time.</p>
         */
        @NameInMap("Logstore")
        public String logstore;

        /**
         * <p>The name of the Log Service project that is used for real-time log delivery.</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The ID of the region where the Log Service project is deployed. For more information, see [Regions that support real-time log delivery](https://help.aliyun.com/document_detail/144883.html).</p>
         */
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
