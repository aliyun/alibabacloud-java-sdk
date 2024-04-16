// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListAppModulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListAppModulesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAppModulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppModulesResponseBody self = new ListAppModulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppModulesResponseBody setData(ListAppModulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAppModulesResponseBodyData getData() {
        return this.data;
    }

    public ListAppModulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAppModulesResponseBodyDataItems extends TeaModel {
        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("Description")
        public String description;

        @NameInMap("DirectDependency")
        public Boolean directDependency;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("MinimumPlatformVersion")
        public String minimumPlatformVersion;

        @NameInMap("ModuleId")
        public String moduleId;

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("OwnerUserId")
        public String ownerUserId;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Version")
        public String version;

        public static ListAppModulesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListAppModulesResponseBodyDataItems self = new ListAppModulesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListAppModulesResponseBodyDataItems setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListAppModulesResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAppModulesResponseBodyDataItems setDirectDependency(Boolean directDependency) {
            this.directDependency = directDependency;
            return this;
        }
        public Boolean getDirectDependency() {
            return this.directDependency;
        }

        public ListAppModulesResponseBodyDataItems setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListAppModulesResponseBodyDataItems setMinimumPlatformVersion(String minimumPlatformVersion) {
            this.minimumPlatformVersion = minimumPlatformVersion;
            return this;
        }
        public String getMinimumPlatformVersion() {
            return this.minimumPlatformVersion;
        }

        public ListAppModulesResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListAppModulesResponseBodyDataItems setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListAppModulesResponseBodyDataItems setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public ListAppModulesResponseBodyDataItems setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListAppModulesResponseBodyDataItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
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
