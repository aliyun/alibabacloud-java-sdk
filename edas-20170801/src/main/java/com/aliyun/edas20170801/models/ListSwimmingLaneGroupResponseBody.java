// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneGroupResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data of the lane group.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListSwimmingLaneGroupResponseBodyData> data;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSwimmingLaneGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSwimmingLaneGroupResponseBody self = new ListSwimmingLaneGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSwimmingLaneGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListSwimmingLaneGroupResponseBody setData(java.util.List<ListSwimmingLaneGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSwimmingLaneGroupResponseBodyData> getData() {
        return this.data;
    }

    public ListSwimmingLaneGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSwimmingLaneGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSwimmingLaneGroupResponseBodyDataApplicationList extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        public static ListSwimmingLaneGroupResponseBodyDataApplicationList build(java.util.Map<String, ?> map) throws Exception {
            ListSwimmingLaneGroupResponseBodyDataApplicationList self = new ListSwimmingLaneGroupResponseBodyDataApplicationList();
            return TeaModel.build(map, self);
        }

        public ListSwimmingLaneGroupResponseBodyDataApplicationList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListSwimmingLaneGroupResponseBodyDataApplicationList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class ListSwimmingLaneGroupResponseBodyDataEntryApplication extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The data source. Set the value to EDAS.</p>
         */
        @NameInMap("Source")
        public String source;

        public static ListSwimmingLaneGroupResponseBodyDataEntryApplication build(java.util.Map<String, ?> map) throws Exception {
            ListSwimmingLaneGroupResponseBodyDataEntryApplication self = new ListSwimmingLaneGroupResponseBodyDataEntryApplication();
            return TeaModel.build(map, self);
        }

        public ListSwimmingLaneGroupResponseBodyDataEntryApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListSwimmingLaneGroupResponseBodyDataEntryApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListSwimmingLaneGroupResponseBodyDataEntryApplication setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class ListSwimmingLaneGroupResponseBodyData extends TeaModel {
        /**
         * <p>The applications that are related to the lane group.</p>
         */
        @NameInMap("ApplicationList")
        public java.util.List<ListSwimmingLaneGroupResponseBodyDataApplicationList> applicationList;

        /**
         * <p>The information about the Enterprise Distributed Application Service (EDAS) ingress gateway.</p>
         */
        @NameInMap("EntryApplication")
        public ListSwimmingLaneGroupResponseBodyDataEntryApplication entryApplication;

        /**
         * <p>The ID of the lane group.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the lane group.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the microservices namespace.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        public static ListSwimmingLaneGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSwimmingLaneGroupResponseBodyData self = new ListSwimmingLaneGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSwimmingLaneGroupResponseBodyData setApplicationList(java.util.List<ListSwimmingLaneGroupResponseBodyDataApplicationList> applicationList) {
            this.applicationList = applicationList;
            return this;
        }
        public java.util.List<ListSwimmingLaneGroupResponseBodyDataApplicationList> getApplicationList() {
            return this.applicationList;
        }

        public ListSwimmingLaneGroupResponseBodyData setEntryApplication(ListSwimmingLaneGroupResponseBodyDataEntryApplication entryApplication) {
            this.entryApplication = entryApplication;
            return this;
        }
        public ListSwimmingLaneGroupResponseBodyDataEntryApplication getEntryApplication() {
            return this.entryApplication;
        }

        public ListSwimmingLaneGroupResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSwimmingLaneGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSwimmingLaneGroupResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

    }

}
