// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListTopologyViewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListTopologyViewResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListTopologyViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTopologyViewResponseBody self = new ListTopologyViewResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTopologyViewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTopologyViewResponseBody setData(java.util.List<ListTopologyViewResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTopologyViewResponseBodyData> getData() {
        return this.data;
    }

    public ListTopologyViewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTopologyViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTopologyViewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTopologyViewResponseBodyData extends TeaModel {
        @NameInMap("atomicViewId")
        public String atomicViewId;

        @NameInMap("category")
        public String category;

        @NameInMap("deep")
        public String deep;

        @NameInMap("defaultGroupView")
        public Boolean defaultGroupView;

        @NameInMap("defaultView")
        public Boolean defaultView;

        @NameInMap("description")
        public String description;

        @NameInMap("environment")
        public String environment;

        @NameInMap("groupViewId")
        public String groupViewId;

        @NameInMap("viewId")
        public String viewId;

        @NameInMap("viewName")
        public String viewName;

        @NameInMap("visibility")
        public Boolean visibility;

        public static ListTopologyViewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTopologyViewResponseBodyData self = new ListTopologyViewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTopologyViewResponseBodyData setAtomicViewId(String atomicViewId) {
            this.atomicViewId = atomicViewId;
            return this;
        }
        public String getAtomicViewId() {
            return this.atomicViewId;
        }

        public ListTopologyViewResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListTopologyViewResponseBodyData setDeep(String deep) {
            this.deep = deep;
            return this;
        }
        public String getDeep() {
            return this.deep;
        }

        public ListTopologyViewResponseBodyData setDefaultGroupView(Boolean defaultGroupView) {
            this.defaultGroupView = defaultGroupView;
            return this;
        }
        public Boolean getDefaultGroupView() {
            return this.defaultGroupView;
        }

        public ListTopologyViewResponseBodyData setDefaultView(Boolean defaultView) {
            this.defaultView = defaultView;
            return this;
        }
        public Boolean getDefaultView() {
            return this.defaultView;
        }

        public ListTopologyViewResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTopologyViewResponseBodyData setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }
        public String getEnvironment() {
            return this.environment;
        }

        public ListTopologyViewResponseBodyData setGroupViewId(String groupViewId) {
            this.groupViewId = groupViewId;
            return this;
        }
        public String getGroupViewId() {
            return this.groupViewId;
        }

        public ListTopologyViewResponseBodyData setViewId(String viewId) {
            this.viewId = viewId;
            return this;
        }
        public String getViewId() {
            return this.viewId;
        }

        public ListTopologyViewResponseBodyData setViewName(String viewName) {
            this.viewName = viewName;
            return this;
        }
        public String getViewName() {
            return this.viewName;
        }

        public ListTopologyViewResponseBodyData setVisibility(Boolean visibility) {
            this.visibility = visibility;
            return this;
        }
        public Boolean getVisibility() {
            return this.visibility;
        }

    }

}
