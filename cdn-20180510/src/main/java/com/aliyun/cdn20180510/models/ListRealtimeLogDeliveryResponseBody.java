// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListRealtimeLogDeliveryResponseBody extends TeaModel {
    /**
     * <p>The logging information.</p>
     */
    @NameInMap("Content")
    public ListRealtimeLogDeliveryResponseBodyContent content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>30559C03-86C9-4EEC-B840-0DC5F5A2189B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeLogDeliveryResponseBody self = new ListRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRealtimeLogDeliveryResponseBody setContent(ListRealtimeLogDeliveryResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListRealtimeLogDeliveryResponseBodyContent getContent() {
        return this.content;
    }

    public ListRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo extends TeaModel {
        /**
         * <p>The domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001010</p>
         */
        @NameInMap("DmId")
        public Integer dmId;

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The name of the Logstore where log entries are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Logstore")
        public String logstore;

        /**
         * <p>The name of the Log Service project that is used for real-time log delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The ID of the region where the Log Service project is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-corp</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The status of real-time log delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo self = new ListRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo();
            return TeaModel.build(map, self);
        }

        public ListRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setDmId(Integer dmId) {
            this.dmId = dmId;
            return this;
        }
        public Integer getDmId() {
            return this.dmId;
        }

        public ListRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ListRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListRealtimeLogDeliveryResponseBodyContent extends TeaModel {
        @NameInMap("RealtimeLogDeliveryInfo")
        public java.util.List<ListRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo> realtimeLogDeliveryInfo;

        public static ListRealtimeLogDeliveryResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListRealtimeLogDeliveryResponseBodyContent self = new ListRealtimeLogDeliveryResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListRealtimeLogDeliveryResponseBodyContent setRealtimeLogDeliveryInfo(java.util.List<ListRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo> realtimeLogDeliveryInfo) {
            this.realtimeLogDeliveryInfo = realtimeLogDeliveryInfo;
            return this;
        }
        public java.util.List<ListRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo> getRealtimeLogDeliveryInfo() {
            return this.realtimeLogDeliveryInfo;
        }

    }

}
