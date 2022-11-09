// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public UpdateSwimmingLaneGroupResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSwimmingLaneGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimmingLaneGroupResponseBody self = new UpdateSwimmingLaneGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSwimmingLaneGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateSwimmingLaneGroupResponseBody setData(UpdateSwimmingLaneGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateSwimmingLaneGroupResponseBodyData getData() {
        return this.data;
    }

    public UpdateSwimmingLaneGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSwimmingLaneGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateSwimmingLaneGroupResponseBodyDataApplicationList extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        public static UpdateSwimmingLaneGroupResponseBodyDataApplicationList build(java.util.Map<String, ?> map) throws Exception {
            UpdateSwimmingLaneGroupResponseBodyDataApplicationList self = new UpdateSwimmingLaneGroupResponseBodyDataApplicationList();
            return TeaModel.build(map, self);
        }

        public UpdateSwimmingLaneGroupResponseBodyDataApplicationList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateSwimmingLaneGroupResponseBodyDataApplicationList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class UpdateSwimmingLaneGroupResponseBodyDataEntryApplication extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        public static UpdateSwimmingLaneGroupResponseBodyDataEntryApplication build(java.util.Map<String, ?> map) throws Exception {
            UpdateSwimmingLaneGroupResponseBodyDataEntryApplication self = new UpdateSwimmingLaneGroupResponseBodyDataEntryApplication();
            return TeaModel.build(map, self);
        }

        public UpdateSwimmingLaneGroupResponseBodyDataEntryApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateSwimmingLaneGroupResponseBodyDataEntryApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class UpdateSwimmingLaneGroupResponseBodyData extends TeaModel {
        @NameInMap("ApplicationList")
        public java.util.List<UpdateSwimmingLaneGroupResponseBodyDataApplicationList> applicationList;

        @NameInMap("EntryApplication")
        public UpdateSwimmingLaneGroupResponseBodyDataEntryApplication entryApplication;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NamespaceId")
        public String namespaceId;

        public static UpdateSwimmingLaneGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSwimmingLaneGroupResponseBodyData self = new UpdateSwimmingLaneGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateSwimmingLaneGroupResponseBodyData setApplicationList(java.util.List<UpdateSwimmingLaneGroupResponseBodyDataApplicationList> applicationList) {
            this.applicationList = applicationList;
            return this;
        }
        public java.util.List<UpdateSwimmingLaneGroupResponseBodyDataApplicationList> getApplicationList() {
            return this.applicationList;
        }

        public UpdateSwimmingLaneGroupResponseBodyData setEntryApplication(UpdateSwimmingLaneGroupResponseBodyDataEntryApplication entryApplication) {
            this.entryApplication = entryApplication;
            return this;
        }
        public UpdateSwimmingLaneGroupResponseBodyDataEntryApplication getEntryApplication() {
            return this.entryApplication;
        }

        public UpdateSwimmingLaneGroupResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateSwimmingLaneGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateSwimmingLaneGroupResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

    }

}
