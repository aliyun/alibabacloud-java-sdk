// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListSoftwarelibSoftwareResponseBody extends TeaModel {
    /**
     * <p>The software list.</p>
     */
    @NameInMap("DataList")
    public java.util.List<ListSoftwarelibSoftwareResponseBodyDataList> dataList;

    /**
     * <p>The maximum number of entries per page. This parameter is not returned by this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. This parameter is not returned by this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>FFM+3L1WZbKngBeLWcDmQrzLuGDDwAw7JA5q2AjvTSJm9WyhQ0MwJoOWpky9ZhgcWfIgtGpZ+4NQX97+EIwsqUNQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of software entries that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSoftwarelibSoftwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSoftwarelibSoftwareResponseBody self = new ListSoftwarelibSoftwareResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSoftwarelibSoftwareResponseBody setDataList(java.util.List<ListSoftwarelibSoftwareResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListSoftwarelibSoftwareResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public ListSoftwarelibSoftwareResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSoftwarelibSoftwareResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSoftwarelibSoftwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSoftwarelibSoftwareResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSoftwarelibSoftwareResponseBodyDataListVersions extends TeaModel {
        /**
         * <p>The time when the software version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-05 18:03:58</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The number of times the software has been downloaded from the client.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DownloadTimes")
        public Long downloadTimes;

        /**
         * <p>The MD5 value of the software package.</p>
         * 
         * <strong>example:</strong>
         * <p>0b5824cdd509d3ed560e2d20d29a1bcb</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The time when the software version was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-05 18:03:58</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The operating system to which the software package applies. Valid values:</p>
         * <ul>
         * <li><strong>Windows</strong>: Windows.</li>
         * <li><strong>Mac(Apple)</strong>: macOS with Apple silicon.</li>
         * <li><strong>Mac(Intel)</strong>: macOS with Intel processors.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The software publisher type. Valid values:</p>
         * <ul>
         * <li><strong>local</strong>: locally uploaded.</li>
         * <li><strong>thirdparty</strong>: third-party link.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        @NameInMap("PublisherType")
        public String publisherType;

        /**
         * <p>The ID of the software to which the version belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>softwarelib-software-1da844a39729****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        /**
         * <p>The name of the software package.</p>
         * 
         * <strong>example:</strong>
         * <p>test softwarename</p>
         */
        @NameInMap("SoftwarePkgName")
        public String softwarePkgName;

        /**
         * <p>The size of the software package.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SoftwarePkgSize")
        public Long softwarePkgSize;

        /**
         * <p>The download URL of the software package.</p>
         * 
         * <strong>example:</strong>
         * <p>https://<strong><strong>.com/</strong></strong></p>
         */
        @NameInMap("SoftwareUrl")
        public String softwareUrl;

        /**
         * <p>The version publish status. Valid values:</p>
         * <ul>
         * <li><strong>published</strong>: Published.</li>
         * <li><strong>unpublished</strong>: Not published.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>published</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The software version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The software version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>softwarelib-version-21ae186e2ac9****</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static ListSoftwarelibSoftwareResponseBodyDataListVersions build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwarelibSoftwareResponseBodyDataListVersions self = new ListSoftwarelibSoftwareResponseBodyDataListVersions();
            return TeaModel.build(map, self);
        }

        public ListSoftwarelibSoftwareResponseBodyDataListVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSoftwarelibSoftwareResponseBodyDataListVersions setDownloadTimes(Long downloadTimes) {
            this.downloadTimes = downloadTimes;
            return this;
        }
        public Long getDownloadTimes() {
            return this.downloadTimes;
        }

        public ListSoftwarelibSoftwareResponseBodyDataListVersions setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListSoftwarelibSoftwareResponseBodyDataListVersions setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListSoftwarelibSoftwareResponseBodyDataListVersions setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListSoftwarelibSoftwareResponseBodyDataListVersions setPublisherType(String publisherType) {
            this.publisherType = publisherType;
            return this;
        }
        public String getPublisherType() {
            return this.publisherType;
        }

        public ListSoftwarelibSoftwareResponseBodyDataListVersions setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

        public ListSoftwarelibSoftwareResponseBodyDataListVersions setSoftwarePkgName(String softwarePkgName) {
            this.softwarePkgName = softwarePkgName;
            return this;
        }
        public String getSoftwarePkgName() {
            return this.softwarePkgName;
        }

        public ListSoftwarelibSoftwareResponseBodyDataListVersions setSoftwarePkgSize(Long softwarePkgSize) {
            this.softwarePkgSize = softwarePkgSize;
            return this;
        }
        public Long getSoftwarePkgSize() {
            return this.softwarePkgSize;
        }

        public ListSoftwarelibSoftwareResponseBodyDataListVersions setSoftwareUrl(String softwareUrl) {
            this.softwareUrl = softwareUrl;
            return this;
        }
        public String getSoftwareUrl() {
            return this.softwareUrl;
        }

        public ListSoftwarelibSoftwareResponseBodyDataListVersions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSoftwarelibSoftwareResponseBodyDataListVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListSoftwarelibSoftwareResponseBodyDataListVersions setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class ListSoftwarelibSoftwareResponseBodyDataList extends TeaModel {
        /**
         * <p>The associated built-in software ID.</p>
         * 
         * <strong>example:</strong>
         * <p>softwarelib-software-1da844a39729****</p>
         */
        @NameInMap("BuiltinSoftwareId")
        public String builtinSoftwareId;

        /**
         * <p>The software BundleId used for verification.</p>
         * 
         * <strong>example:</strong>
         * <p>test software</p>
         */
        @NameInMap("CheckBundleId")
        public String checkBundleId;

        /**
         * <p>The software name used for verification.</p>
         * 
         * <strong>example:</strong>
         * <p>test software</p>
         */
        @NameInMap("CheckSoftwareName")
        public String checkSoftwareName;

        /**
         * <p>The software classification ID.</p>
         * 
         * <strong>example:</strong>
         * <p>softwarelib-classify-61b7ccc63cae****</p>
         */
        @NameInMap("ClassifyId")
        public String classifyId;

        /**
         * <p>The time when the software was created, in seconds-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1781748302</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The software description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a demo software.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of associated terminal device IDs.</p>
         */
        @NameInMap("DevTags")
        public java.util.List<String> devTags;

        /**
         * <p>The list of associated device group IDs.</p>
         */
        @NameInMap("DeviceGroupIds")
        public java.util.List<String> deviceGroupIds;

        /**
         * <p>The number of times the software has been manually downloaded from the client.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DownloadTimes")
        public Long downloadTimes;

        /**
         * <p>Indicates whether a new version is available for the software.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasNewVersion")
        public Boolean hasNewVersion;

        /**
         * <p>The URL of the software logo.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i4/O1CN01mXKAQX1P3a5fbS0Dp_!!6000000001785-2-tps-40-40.png">https://img.alicdn.com/imgextra/i4/O1CN01mXKAQX1P3a5fbS0Dp_!!6000000001785-2-tps-40-40.png</a></p>
         */
        @NameInMap("LogoUrl")
        public String logoUrl;

        /**
         * <p>The latest software version number for Mac (Apple).</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("MacAppleVersion")
        public String macAppleVersion;

        /**
         * <p>The latest software version number for Mac (Intel).</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("MacIntelVersion")
        public String macIntelVersion;

        /**
         * <p>The policy matching target type. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: all users.</li>
         * <li><strong>UserGroupNormal</strong>: specified user groups.</li>
         * <li><strong>DevTagNormal</strong>: specified devices.</li>
         * <li><strong>DeviceGroupNormal</strong>: specified device groups.</li>
         * <li><strong>DevTagAll</strong>: all devices.</li>
         * <li><strong>None</strong>: not configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupAll</p>
         */
        @NameInMap("MatchMode")
        public String matchMode;

        /**
         * <p>The official download URL of the software.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx.com/">http://xxx.com/</a>****</p>
         */
        @NameInMap("OfficialDownloadUrl")
        public String officialDownloadUrl;

        /**
         * <p>The software ID.</p>
         * 
         * <strong>example:</strong>
         * <p>softwarelib-software-1da844a39729****</p>
         */
        @NameInMap("SoftwareId")
        public String softwareId;

        /**
         * <p>The software name.</p>
         * 
         * <strong>example:</strong>
         * <p>Thunder</p>
         */
        @NameInMap("SoftwareName")
        public String softwareName;

        /**
         * <p>Indicates whether the built-in library source has been removed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SourceRemoved")
        public Boolean sourceRemoved;

        /**
         * <p>The software source. Valid values:</p>
         * <ul>
         * <li><strong>custom</strong>: custom software.</li>
         * <li><strong>builtin</strong>: built-in software library.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The list of associated user group IDs.</p>
         */
        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        /**
         * <p>The software version list. This field is not returned by this operation. Call <a href="~~ListSoftwarelibVersion~~">ListSoftwarelibVersion</a> to query software versions.</p>
         */
        @NameInMap("Versions")
        public java.util.List<ListSoftwarelibSoftwareResponseBodyDataListVersions> versions;

        /**
         * <p>The latest software version number for Windows.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("WindowsVersion")
        public String windowsVersion;

        public static ListSoftwarelibSoftwareResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListSoftwarelibSoftwareResponseBodyDataList self = new ListSoftwarelibSoftwareResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setBuiltinSoftwareId(String builtinSoftwareId) {
            this.builtinSoftwareId = builtinSoftwareId;
            return this;
        }
        public String getBuiltinSoftwareId() {
            return this.builtinSoftwareId;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setCheckBundleId(String checkBundleId) {
            this.checkBundleId = checkBundleId;
            return this;
        }
        public String getCheckBundleId() {
            return this.checkBundleId;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setCheckSoftwareName(String checkSoftwareName) {
            this.checkSoftwareName = checkSoftwareName;
            return this;
        }
        public String getCheckSoftwareName() {
            return this.checkSoftwareName;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setClassifyId(String classifyId) {
            this.classifyId = classifyId;
            return this;
        }
        public String getClassifyId() {
            return this.classifyId;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setDevTags(java.util.List<String> devTags) {
            this.devTags = devTags;
            return this;
        }
        public java.util.List<String> getDevTags() {
            return this.devTags;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setDeviceGroupIds(java.util.List<String> deviceGroupIds) {
            this.deviceGroupIds = deviceGroupIds;
            return this;
        }
        public java.util.List<String> getDeviceGroupIds() {
            return this.deviceGroupIds;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setDownloadTimes(Long downloadTimes) {
            this.downloadTimes = downloadTimes;
            return this;
        }
        public Long getDownloadTimes() {
            return this.downloadTimes;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setHasNewVersion(Boolean hasNewVersion) {
            this.hasNewVersion = hasNewVersion;
            return this;
        }
        public Boolean getHasNewVersion() {
            return this.hasNewVersion;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        public String getLogoUrl() {
            return this.logoUrl;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setMacAppleVersion(String macAppleVersion) {
            this.macAppleVersion = macAppleVersion;
            return this;
        }
        public String getMacAppleVersion() {
            return this.macAppleVersion;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setMacIntelVersion(String macIntelVersion) {
            this.macIntelVersion = macIntelVersion;
            return this;
        }
        public String getMacIntelVersion() {
            return this.macIntelVersion;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setOfficialDownloadUrl(String officialDownloadUrl) {
            this.officialDownloadUrl = officialDownloadUrl;
            return this;
        }
        public String getOfficialDownloadUrl() {
            return this.officialDownloadUrl;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setSoftwareId(String softwareId) {
            this.softwareId = softwareId;
            return this;
        }
        public String getSoftwareId() {
            return this.softwareId;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setSoftwareName(String softwareName) {
            this.softwareName = softwareName;
            return this;
        }
        public String getSoftwareName() {
            return this.softwareName;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setSourceRemoved(Boolean sourceRemoved) {
            this.sourceRemoved = sourceRemoved;
            return this;
        }
        public Boolean getSourceRemoved() {
            return this.sourceRemoved;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setVersions(java.util.List<ListSoftwarelibSoftwareResponseBodyDataListVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<ListSoftwarelibSoftwareResponseBodyDataListVersions> getVersions() {
            return this.versions;
        }

        public ListSoftwarelibSoftwareResponseBodyDataList setWindowsVersion(String windowsVersion) {
            this.windowsVersion = windowsVersion;
            return this;
        }
        public String getWindowsVersion() {
            return this.windowsVersion;
        }

    }

}
