// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListInstanceExtensionsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<ListInstanceExtensionsResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static ListInstanceExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceExtensionsResponseBody self = new ListInstanceExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceExtensionsResponseBody setItems(java.util.List<ListInstanceExtensionsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListInstanceExtensionsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListInstanceExtensionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstanceExtensionsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public ListInstanceExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceExtensionsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class ListInstanceExtensionsResponseBodyItems extends TeaModel {
        @NameInMap("CurrentVersion")
        public String currentVersion;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExtensionId")
        public String extensionId;

        @NameInMap("InstalledDatabases")
        public String installedDatabases;

        @NameInMap("IsInstallNeedRestart")
        public Boolean isInstallNeedRestart;

        @NameInMap("LatestVersion")
        public String latestVersion;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        public static ListInstanceExtensionsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceExtensionsResponseBodyItems self = new ListInstanceExtensionsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListInstanceExtensionsResponseBodyItems setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public ListInstanceExtensionsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstanceExtensionsResponseBodyItems setExtensionId(String extensionId) {
            this.extensionId = extensionId;
            return this;
        }
        public String getExtensionId() {
            return this.extensionId;
        }

        public ListInstanceExtensionsResponseBodyItems setInstalledDatabases(String installedDatabases) {
            this.installedDatabases = installedDatabases;
            return this;
        }
        public String getInstalledDatabases() {
            return this.installedDatabases;
        }

        public ListInstanceExtensionsResponseBodyItems setIsInstallNeedRestart(Boolean isInstallNeedRestart) {
            this.isInstallNeedRestart = isInstallNeedRestart;
            return this;
        }
        public Boolean getIsInstallNeedRestart() {
            return this.isInstallNeedRestart;
        }

        public ListInstanceExtensionsResponseBodyItems setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public ListInstanceExtensionsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstanceExtensionsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
