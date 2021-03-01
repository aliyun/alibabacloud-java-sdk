// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListSwimmingLaneGroupResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListSwimmingLaneGroupResponseBodyData> data;

    @NameInMap("Code")
    public Integer code;

    public static ListSwimmingLaneGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSwimmingLaneGroupResponseBody self = new ListSwimmingLaneGroupResponseBody();
        return TeaModel.build(map, self);
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

    public ListSwimmingLaneGroupResponseBody setData(java.util.List<ListSwimmingLaneGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSwimmingLaneGroupResponseBodyData> getData() {
        return this.data;
    }

    public ListSwimmingLaneGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListSwimmingLaneGroupResponseBodyDataApplicationList extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppId")
        public String appId;

        public static ListSwimmingLaneGroupResponseBodyDataApplicationList build(java.util.Map<String, ?> map) throws Exception {
            ListSwimmingLaneGroupResponseBodyDataApplicationList self = new ListSwimmingLaneGroupResponseBodyDataApplicationList();
            return TeaModel.build(map, self);
        }

        public ListSwimmingLaneGroupResponseBodyDataApplicationList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListSwimmingLaneGroupResponseBodyDataApplicationList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

    public static class ListSwimmingLaneGroupResponseBodyDataEntryApplication extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Source")
        public String source;

        public static ListSwimmingLaneGroupResponseBodyDataEntryApplication build(java.util.Map<String, ?> map) throws Exception {
            ListSwimmingLaneGroupResponseBodyDataEntryApplication self = new ListSwimmingLaneGroupResponseBodyDataEntryApplication();
            return TeaModel.build(map, self);
        }

        public ListSwimmingLaneGroupResponseBodyDataEntryApplication setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListSwimmingLaneGroupResponseBodyDataEntryApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
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
        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("ApplicationList")
        public java.util.List<ListSwimmingLaneGroupResponseBodyDataApplicationList> applicationList;

        @NameInMap("EntryApplication")
        public ListSwimmingLaneGroupResponseBodyDataEntryApplication entryApplication;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static ListSwimmingLaneGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSwimmingLaneGroupResponseBodyData self = new ListSwimmingLaneGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSwimmingLaneGroupResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
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

        public ListSwimmingLaneGroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSwimmingLaneGroupResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
