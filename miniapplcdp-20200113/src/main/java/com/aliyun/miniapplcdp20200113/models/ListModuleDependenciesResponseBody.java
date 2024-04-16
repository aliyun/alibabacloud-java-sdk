// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModuleDependenciesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListModuleDependenciesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListModuleDependenciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModuleDependenciesResponseBody self = new ListModuleDependenciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModuleDependenciesResponseBody setData(ListModuleDependenciesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListModuleDependenciesResponseBodyData getData() {
        return this.data;
    }

    public ListModuleDependenciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListModuleDependenciesResponseBodyDataItems extends TeaModel {
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

        @NameInMap("Origin")
        public String origin;

        @NameInMap("OwnerUserId")
        public String ownerUserId;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("Version")
        public String version;

        public static ListModuleDependenciesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListModuleDependenciesResponseBodyDataItems self = new ListModuleDependenciesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListModuleDependenciesResponseBodyDataItems setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListModuleDependenciesResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListModuleDependenciesResponseBodyDataItems setDirectDependency(Boolean directDependency) {
            this.directDependency = directDependency;
            return this;
        }
        public Boolean getDirectDependency() {
            return this.directDependency;
        }

        public ListModuleDependenciesResponseBodyDataItems setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListModuleDependenciesResponseBodyDataItems setMinimumPlatformVersion(String minimumPlatformVersion) {
            this.minimumPlatformVersion = minimumPlatformVersion;
            return this;
        }
        public String getMinimumPlatformVersion() {
            return this.minimumPlatformVersion;
        }

        public ListModuleDependenciesResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListModuleDependenciesResponseBodyDataItems setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListModuleDependenciesResponseBodyDataItems setOrigin(String origin) {
            this.origin = origin;
            return this;
        }
        public String getOrigin() {
            return this.origin;
        }

        public ListModuleDependenciesResponseBodyDataItems setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public ListModuleDependenciesResponseBodyDataItems setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public ListModuleDependenciesResponseBodyDataItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListModuleDependenciesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListModuleDependenciesResponseBodyDataItems> items;

        public static ListModuleDependenciesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModuleDependenciesResponseBodyData self = new ListModuleDependenciesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModuleDependenciesResponseBodyData setItems(java.util.List<ListModuleDependenciesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListModuleDependenciesResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
