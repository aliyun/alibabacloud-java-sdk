// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateSwimmingLaneGroupResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public UpdateSwimmingLaneGroupResponseBodyData data;

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
        /**
         * <p>The list of applications related to the lane group.</p>
         */
        @NameInMap("ApplicationList")
        public java.util.List<UpdateSwimmingLaneGroupResponseBodyDataApplicationList> applicationList;

        /**
         * <p>The EDAS ingress gateway information.</p>
         */
        @NameInMap("EntryApplication")
        public UpdateSwimmingLaneGroupResponseBodyDataEntryApplication entryApplication;

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
