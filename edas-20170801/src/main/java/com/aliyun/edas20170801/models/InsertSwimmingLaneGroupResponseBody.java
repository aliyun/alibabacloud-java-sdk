// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertSwimmingLaneGroupResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public InsertSwimmingLaneGroupResponseBodyData data;

    @NameInMap("Code")
    public Integer code;

    public static InsertSwimmingLaneGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertSwimmingLaneGroupResponseBody self = new InsertSwimmingLaneGroupResponseBody();
        return TeaModel.build(map, self);
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

    public InsertSwimmingLaneGroupResponseBody setData(InsertSwimmingLaneGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InsertSwimmingLaneGroupResponseBodyData getData() {
        return this.data;
    }

    public InsertSwimmingLaneGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class InsertSwimmingLaneGroupResponseBodyDataApplicationListApplication extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppId")
        public String appId;

        public static InsertSwimmingLaneGroupResponseBodyDataApplicationListApplication build(java.util.Map<String, ?> map) throws Exception {
            InsertSwimmingLaneGroupResponseBodyDataApplicationListApplication self = new InsertSwimmingLaneGroupResponseBodyDataApplicationListApplication();
            return TeaModel.build(map, self);
        }

        public InsertSwimmingLaneGroupResponseBodyDataApplicationListApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public InsertSwimmingLaneGroupResponseBodyDataApplicationListApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
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
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppId")
        public String appId;

        public static InsertSwimmingLaneGroupResponseBodyDataEntryApplication build(java.util.Map<String, ?> map) throws Exception {
            InsertSwimmingLaneGroupResponseBodyDataEntryApplication self = new InsertSwimmingLaneGroupResponseBodyDataEntryApplication();
            return TeaModel.build(map, self);
        }

        public InsertSwimmingLaneGroupResponseBodyDataEntryApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public InsertSwimmingLaneGroupResponseBodyDataEntryApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

    public static class InsertSwimmingLaneGroupResponseBodyData extends TeaModel {
        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("ApplicationList")
        public InsertSwimmingLaneGroupResponseBodyDataApplicationList applicationList;

        @NameInMap("EntryApplication")
        public InsertSwimmingLaneGroupResponseBodyDataEntryApplication entryApplication;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static InsertSwimmingLaneGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InsertSwimmingLaneGroupResponseBodyData self = new InsertSwimmingLaneGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InsertSwimmingLaneGroupResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
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

        public InsertSwimmingLaneGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InsertSwimmingLaneGroupResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
