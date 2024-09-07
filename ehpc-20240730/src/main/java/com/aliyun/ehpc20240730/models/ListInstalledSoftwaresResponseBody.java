// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListInstalledSoftwaresResponseBody extends TeaModel {
    /**
     * <p>The list of installed software.</p>
     */
    @NameInMap("AdditionalPackages")
    public ListInstalledSoftwaresResponseBodyAdditionalPackages additionalPackages;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListInstalledSoftwaresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstalledSoftwaresResponseBody self = new ListInstalledSoftwaresResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstalledSoftwaresResponseBody setAdditionalPackages(ListInstalledSoftwaresResponseBodyAdditionalPackages additionalPackages) {
        this.additionalPackages = additionalPackages;
        return this;
    }
    public ListInstalledSoftwaresResponseBodyAdditionalPackages getAdditionalPackages() {
        return this.additionalPackages;
    }

    public ListInstalledSoftwaresResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListInstalledSoftwaresResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListInstalledSoftwaresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstalledSoftwaresResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstalledSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos extends TeaModel {
        /**
         * <p>The category into which the software falls.</p>
         * 
         * <strong>example:</strong>
         * <p>NWP</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the software was installed.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-05 18:24:08</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The software description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL of the software icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://gw.alicdn.com/imgextra/i2/O1CN01FIkxZ81LmE0fvrAyR_!!6000000001341-55-tps-6349-1603.svg">https://gw.alicdn.com/imgextra/i2/O1CN01FIkxZ81LmE0fvrAyR_!!6000000001341-55-tps-6349-1603.svg</a></p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>The software name.</p>
         * 
         * <strong>example:</strong>
         * <p>gromacs</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The installation status of the software.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Installed</li>
         * <li>Uninstalled</li>
         * <li>Installing</li>
         * <li>Exception</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Installed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The software version.</p>
         * 
         * <strong>example:</strong>
         * <p>2024.1</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListInstalledSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos build(java.util.Map<String, ?> map) throws Exception {
            ListInstalledSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos self = new ListInstalledSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos();
            return TeaModel.build(map, self);
        }

        public ListInstalledSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListInstalledSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListInstalledSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstalledSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListInstalledSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstalledSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstalledSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListInstalledSoftwaresResponseBodyAdditionalPackages extends TeaModel {
        @NameInMap("AdditionalPackageInfos")
        public java.util.List<ListInstalledSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos> additionalPackageInfos;

        public static ListInstalledSoftwaresResponseBodyAdditionalPackages build(java.util.Map<String, ?> map) throws Exception {
            ListInstalledSoftwaresResponseBodyAdditionalPackages self = new ListInstalledSoftwaresResponseBodyAdditionalPackages();
            return TeaModel.build(map, self);
        }

        public ListInstalledSoftwaresResponseBodyAdditionalPackages setAdditionalPackageInfos(java.util.List<ListInstalledSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos> additionalPackageInfos) {
            this.additionalPackageInfos = additionalPackageInfos;
            return this;
        }
        public java.util.List<ListInstalledSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos> getAdditionalPackageInfos() {
            return this.additionalPackageInfos;
        }

    }

}
