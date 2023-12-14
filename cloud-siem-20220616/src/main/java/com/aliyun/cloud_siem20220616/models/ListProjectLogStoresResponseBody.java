// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListProjectLogStoresResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListProjectLogStoresResponseBodyData> data;

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
        @NameInMap("EndPoint")
        public String endPoint;

        @NameInMap("LocalName")
        public String localName;

        @NameInMap("LogStore")
        public String logStore;

        @NameInMap("MainUserId")
        public Long mainUserId;

        @NameInMap("Project")
        public String project;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SubUserId")
        public Long subUserId;

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
