// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListSoftwaresResponseBody extends TeaModel {
    /**
     * <p>The information about the software that can be installed in the cluster.</p>
     */
    @NameInMap("AdditionalPackages")
    public ListSoftwaresResponseBodyAdditionalPackages additionalPackages;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
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

    public static ListSoftwaresResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSoftwaresResponseBody self = new ListSoftwaresResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSoftwaresResponseBody setAdditionalPackages(ListSoftwaresResponseBodyAdditionalPackages additionalPackages) {
        this.additionalPackages = additionalPackages;
        return this;
    }
    public ListSoftwaresResponseBodyAdditionalPackages getAdditionalPackages() {
        return this.additionalPackages;
    }

    public ListSoftwaresResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListSoftwaresResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListSoftwaresResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSoftwaresResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOsSupportOsInfos extends TeaModel {
        /**
         * <p>The OS architecture. Valid values:</p>
         * <ul>
         * <li>x86_64</li>
         * <li>arm64</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Linux  3.2104 LTS 64 bit ARM Edition</p>
         */
        @NameInMap("OsTag")
        public String osTag;

        public static ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOsSupportOsInfos build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOsSupportOsInfos self = new ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOsSupportOsInfos();
            return TeaModel.build(map, self);
        }

        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOsSupportOsInfos setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOsSupportOsInfos setOsTag(String osTag) {
            this.osTag = osTag;
            return this;
        }
        public String getOsTag() {
            return this.osTag;
        }

    }

    public static class ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOs extends TeaModel {
        @NameInMap("SupportOsInfos")
        public java.util.List<ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOsSupportOsInfos> supportOsInfos;

        public static ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOs build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOs self = new ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOs();
            return TeaModel.build(map, self);
        }

        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOs setSupportOsInfos(java.util.List<ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOsSupportOsInfos> supportOsInfos) {
            this.supportOsInfos = supportOsInfos;
            return this;
        }
        public java.util.List<ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOsSupportOsInfos> getSupportOsInfos() {
            return this.supportOsInfos;
        }

    }

    public static class ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfos extends TeaModel {
        /**
         * <p>Indicates whether the version is the latest.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Latest")
        public String latest;

        /**
         * <p>The information about the supported OSs.</p>
         */
        @NameInMap("SupportOs")
        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOs supportOs;

        /**
         * <p>The software version.</p>
         * 
         * <strong>example:</strong>
         * <p>2024.1</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfos build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfos self = new ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfos();
            return TeaModel.build(map, self);
        }

        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfos setLatest(String latest) {
            this.latest = latest;
            return this;
        }
        public String getLatest() {
            return this.latest;
        }

        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfos setSupportOs(ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOs supportOs) {
            this.supportOs = supportOs;
            return this;
        }
        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfosSupportOs getSupportOs() {
            return this.supportOs;
        }

        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfos setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersions extends TeaModel {
        @NameInMap("VersionInfos")
        public java.util.List<ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfos> versionInfos;

        public static ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersions build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersions self = new ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersions();
            return TeaModel.build(map, self);
        }

        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersions setVersionInfos(java.util.List<ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfos> versionInfos) {
            this.versionInfos = versionInfos;
            return this;
        }
        public java.util.List<ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersionsVersionInfos> getVersionInfos() {
            return this.versionInfos;
        }

    }

    public static class ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos extends TeaModel {
        /**
         * <p>The application category.</p>
         * 
         * <strong>example:</strong>
         * <p>NWP</p>
         */
        @NameInMap("Category")
        public String category;

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
         * <p>The information about the software versions that can be installed in the cluster.</p>
         */
        @NameInMap("Versions")
        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersions versions;

        public static ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos self = new ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos();
            return TeaModel.build(map, self);
        }

        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos setVersions(ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersions versions) {
            this.versions = versions;
            return this;
        }
        public ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfosVersions getVersions() {
            return this.versions;
        }

    }

    public static class ListSoftwaresResponseBodyAdditionalPackages extends TeaModel {
        @NameInMap("AdditionalPackageInfos")
        public java.util.List<ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos> additionalPackageInfos;

        public static ListSoftwaresResponseBodyAdditionalPackages build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwaresResponseBodyAdditionalPackages self = new ListSoftwaresResponseBodyAdditionalPackages();
            return TeaModel.build(map, self);
        }

        public ListSoftwaresResponseBodyAdditionalPackages setAdditionalPackageInfos(java.util.List<ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos> additionalPackageInfos) {
            this.additionalPackageInfos = additionalPackageInfos;
            return this;
        }
        public java.util.List<ListSoftwaresResponseBodyAdditionalPackagesAdditionalPackageInfos> getAdditionalPackageInfos() {
            return this.additionalPackageInfos;
        }

    }

}
