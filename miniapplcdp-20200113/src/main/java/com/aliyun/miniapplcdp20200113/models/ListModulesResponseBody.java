// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListModulesResponseBodyData data;

    public static ListModulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModulesResponseBody self = new ListModulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModulesResponseBody setData(ListModulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListModulesResponseBodyData getData() {
        return this.data;
    }

    public static class ListModulesResponseBodyDataItems extends TeaModel {
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

        public static ListModulesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListModulesResponseBodyDataItems self = new ListModulesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListModulesResponseBodyDataItems setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListModulesResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListModulesResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListModulesResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModulesResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListModulesResponseBodyDataItems setTargetAppSource(String targetAppSource) {
            this.targetAppSource = targetAppSource;
            return this;
        }
        public String getTargetAppSource() {
            return this.targetAppSource;
        }

    }

    public static class ListModulesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListModulesResponseBodyDataItems> items;

        public static ListModulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModulesResponseBodyData self = new ListModulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModulesResponseBodyData setItems(java.util.List<ListModulesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListModulesResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
