// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListAppModulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListAppModulesResponseBodyData data;

    public static ListAppModulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppModulesResponseBody self = new ListAppModulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppModulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppModulesResponseBody setData(ListAppModulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAppModulesResponseBodyData getData() {
        return this.data;
    }

    public static class ListAppModulesResponseBodyDataItems extends TeaModel {
        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ModuleId")
        public String moduleId;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("TargetAppSource")
        public String targetAppSource;

        public static ListAppModulesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListAppModulesResponseBodyDataItems self = new ListAppModulesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListAppModulesResponseBodyDataItems setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListAppModulesResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListAppModulesResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListAppModulesResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppModulesResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAppModulesResponseBodyDataItems setTargetAppSource(String targetAppSource) {
            this.targetAppSource = targetAppSource;
            return this;
        }
        public String getTargetAppSource() {
            return this.targetAppSource;
        }

    }

    public static class ListAppModulesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListAppModulesResponseBodyDataItems> items;

        public static ListAppModulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppModulesResponseBodyData self = new ListAppModulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppModulesResponseBodyData setItems(java.util.List<ListAppModulesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListAppModulesResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
