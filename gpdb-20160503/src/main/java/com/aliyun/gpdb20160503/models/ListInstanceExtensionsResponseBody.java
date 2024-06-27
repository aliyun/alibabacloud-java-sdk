// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListInstanceExtensionsResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<ListInstanceExtensionsResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7565770E-7C45-462D-BA4A-8A5396F2CAD1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The current version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("CurrentVersion")
        public String currentVersion;

        /**
         * <p>The description of the extension.</p>
         * 
         * <strong>example:</strong>
         * <p>citext usage</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The extension ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ExtensionId")
        public String extensionId;

        /**
         * <p>The names of the databases in which the extension is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstalledDatabases")
        public String installedDatabases;

        /**
         * <p>Indicates whether an instance restart is required after you install the extension for the extension to take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsInstallNeedRestart")
        public Boolean isInstallNeedRestart;

        /**
         * <p>The latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1</p>
         */
        @NameInMap("LatestVersion")
        public String latestVersion;

        /**
         * <p>The name of the extension.</p>
         * 
         * <strong>example:</strong>
         * <p>citext</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the extension.</p>
         * 
         * <strong>example:</strong>
         * <p>installed</p>
         */
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
