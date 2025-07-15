// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveRealtimeLogDeliveryResponseBody extends TeaModel {
    /**
     * <p>The configurations of real-time log delivery.</p>
     */
    @NameInMap("Content")
    public ListLiveRealtimeLogDeliveryResponseBodyContent content;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30559C03-86C9-4EEC-B840-0DC5F5A2189B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListLiveRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRealtimeLogDeliveryResponseBody self = new ListLiveRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLiveRealtimeLogDeliveryResponseBody setContent(ListLiveRealtimeLogDeliveryResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListLiveRealtimeLogDeliveryResponseBodyContent getContent() {
        return this.content;
    }

    public ListLiveRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo extends TeaModel {
        /**
         * <p>The ID of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>1001010</p>
         */
        @NameInMap("DmId")
        public Integer dmId;

        /**
         * <p>The streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The name of the Logstore to which log entries are delivered.</p>
         * 
         * <strong>example:</strong>
         * <p>logstore_example</p>
         */
        @NameInMap("Logstore")
        public String logstore;

        /**
         * <p>The name of the Log Service project that is used for real-time log delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>project_example</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The ID of the region where the Log Service project is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The status of real-time log delivery. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: enabled</li>
         * <li><strong>offline</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo build(java.util.Map<String, ?> map) throws Exception {
            ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo self = new ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo();
            return TeaModel.build(map, self);
        }

        public ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setDmId(Integer dmId) {
            this.dmId = dmId;
            return this;
        }
        public Integer getDmId() {
            return this.dmId;
        }

        public ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListLiveRealtimeLogDeliveryResponseBodyContentRealtimeLogDeliveryInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
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
