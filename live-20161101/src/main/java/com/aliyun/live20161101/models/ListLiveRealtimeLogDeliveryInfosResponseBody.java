// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryInfosResponseBody extends TeaModel {
    @NameInMap("Content")
    public ListLiveRealtimeLogDeliveryInfosResponseBodyContent content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>95D5B69F-8AEC-419B-8F3A-612B35032B0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListLiveRealtimeLogDeliveryInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRealtimeLogDeliveryInfosResponseBody self = new ListLiveRealtimeLogDeliveryInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveRealtimeLogDeliveryInfosResponseBody setContent(ListLiveRealtimeLogDeliveryInfosResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListLiveRealtimeLogDeliveryInfosResponseBodyContent getContent() {
        return this.content;
    }

    public ListLiveRealtimeLogDeliveryInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos extends TeaModel {
        @NameInMap("Logstore")
        public String logstore;

        @NameInMap("Project")
        public String project;

        @NameInMap("Region")
        public String region;

        public static ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos self = new ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos();
            return TeaModel.build(map, self);
        }

        public ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ListLiveRealtimeLogDeliveryInfosResponseBodyContentRealtimeLogDeliveryInfos setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
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
