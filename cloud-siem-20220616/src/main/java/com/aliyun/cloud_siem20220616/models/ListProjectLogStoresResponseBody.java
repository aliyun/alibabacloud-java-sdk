// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListProjectLogStoresResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListProjectLogStoresResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProjectLogStoresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectLogStoresResponseBody self = new ListProjectLogStoresResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectLogStoresResponseBody setData(java.util.List<ListProjectLogStoresResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProjectLogStoresResponseBodyData> getData() {
        return this.data;
    }

    public ListProjectLogStoresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProjectLogStoresResponseBodyData extends TeaModel {
        /**
         * <p>The endpoint of the Simple Log Service project.</p>
         */
        @NameInMap("EndPoint")
        public String endPoint;

        /**
         * <p>The name of the region in which the Simple Log Service project resides.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The name of the Simple Log Service Logstore.</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.</p>
         */
        @NameInMap("MainUserId")
        public Long mainUserId;

        /**
         * <p>The name of the Simple Log Service project.</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The ID of the region in which the Simple Log Service project resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the Alibaba Cloud account that can be used to perform operations supported by the threat analysis feature.</p>
         */
        @NameInMap("SubUserId")
        public Long subUserId;

        /**
         * <p>The username of the Alibaba Cloud account that can be used to perform operations supported by the threat analysis feature.</p>
         */
        @NameInMap("SubUserName")
        public String subUserName;

        public static ListProjectLogStoresResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectLogStoresResponseBodyData self = new ListProjectLogStoresResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectLogStoresResponseBodyData setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public ListProjectLogStoresResponseBodyData setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListProjectLogStoresResponseBodyData setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public ListProjectLogStoresResponseBodyData setMainUserId(Long mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public Long getMainUserId() {
            return this.mainUserId;
        }

        public ListProjectLogStoresResponseBodyData setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public ListProjectLogStoresResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListProjectLogStoresResponseBodyData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

        public ListProjectLogStoresResponseBodyData setSubUserName(String subUserName) {
            this.subUserName = subUserName;
            return this;
        }
        public String getSubUserName() {
            return this.subUserName;
        }

    }

}
