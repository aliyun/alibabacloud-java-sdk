// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertSwimmingLaneGroupResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public InsertSwimmingLaneGroupResponseBodyData data;

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

    public static InsertSwimmingLaneGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertSwimmingLaneGroupResponseBody self = new InsertSwimmingLaneGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertSwimmingLaneGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InsertSwimmingLaneGroupResponseBody setData(InsertSwimmingLaneGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InsertSwimmingLaneGroupResponseBodyData getData() {
        return this.data;
    }

    public InsertSwimmingLaneGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertSwimmingLaneGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InsertSwimmingLaneGroupResponseBodyDataApplicationListApplication extends TeaModel {
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

        public static InsertSwimmingLaneGroupResponseBodyDataApplicationListApplication build(java.util.Map<String, ?> map) throws Exception {
            InsertSwimmingLaneGroupResponseBodyDataApplicationListApplication self = new InsertSwimmingLaneGroupResponseBodyDataApplicationListApplication();
            return TeaModel.build(map, self);
        }

        public InsertSwimmingLaneGroupResponseBodyDataApplicationListApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public InsertSwimmingLaneGroupResponseBodyDataApplicationListApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class InsertSwimmingLaneGroupResponseBodyDataApplicationList extends TeaModel {
        @NameInMap("Application")
        public java.util.List<InsertSwimmingLaneGroupResponseBodyDataApplicationListApplication> application;

        public static InsertSwimmingLaneGroupResponseBodyDataApplicationList build(java.util.Map<String, ?> map) throws Exception {
            InsertSwimmingLaneGroupResponseBodyDataApplicationList self = new InsertSwimmingLaneGroupResponseBodyDataApplicationList();
            return TeaModel.build(map, self);
        }

        public InsertSwimmingLaneGroupResponseBodyDataApplicationList setApplication(java.util.List<InsertSwimmingLaneGroupResponseBodyDataApplicationListApplication> application) {
            this.application = application;
            return this;
        }
        public java.util.List<InsertSwimmingLaneGroupResponseBodyDataApplicationListApplication> getApplication() {
            return this.application;
        }

    }

    public static class InsertSwimmingLaneGroupResponseBodyDataEntryApplication extends TeaModel {
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

        public static InsertSwimmingLaneGroupResponseBodyDataEntryApplication build(java.util.Map<String, ?> map) throws Exception {
            InsertSwimmingLaneGroupResponseBodyDataEntryApplication self = new InsertSwimmingLaneGroupResponseBodyDataEntryApplication();
            return TeaModel.build(map, self);
        }

        public InsertSwimmingLaneGroupResponseBodyDataEntryApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public InsertSwimmingLaneGroupResponseBodyDataEntryApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class InsertSwimmingLaneGroupResponseBodyData extends TeaModel {
        /**
         * <p>The list of all applications that are related to the lane group.</p>
         */
        @NameInMap("ApplicationList")
        public InsertSwimmingLaneGroupResponseBodyDataApplicationList applicationList;

        /**
         * <p>The information about the Enterprise Distributed Application Service (EDAS) ingress gateway.</p>
         */
        @NameInMap("EntryApplication")
        public InsertSwimmingLaneGroupResponseBodyDataEntryApplication entryApplication;

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
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        public static InsertSwimmingLaneGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InsertSwimmingLaneGroupResponseBodyData self = new InsertSwimmingLaneGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InsertSwimmingLaneGroupResponseBodyData setApplicationList(InsertSwimmingLaneGroupResponseBodyDataApplicationList applicationList) {
            this.applicationList = applicationList;
            return this;
        }
        public InsertSwimmingLaneGroupResponseBodyDataApplicationList getApplicationList() {
            return this.applicationList;
        }

        public InsertSwimmingLaneGroupResponseBodyData setEntryApplication(InsertSwimmingLaneGroupResponseBodyDataEntryApplication entryApplication) {
            this.entryApplication = entryApplication;
            return this;
        }
        public InsertSwimmingLaneGroupResponseBodyDataEntryApplication getEntryApplication() {
            return this.entryApplication;
        }

        public InsertSwimmingLaneGroupResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public InsertSwimmingLaneGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InsertSwimmingLaneGroupResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

    }

}
