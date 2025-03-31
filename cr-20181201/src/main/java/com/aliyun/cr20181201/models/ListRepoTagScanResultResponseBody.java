// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTagScanResultResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>56B5C92F-F5D9-46E0-823F-EC71D1892DAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of vulnerabilities detected on images.</p>
     * 
     * <strong>example:</strong>
     * <p>196</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The details about the detected vulnerabilities.</p>
     */
    @NameInMap("Vulnerabilities")
    public java.util.List<ListRepoTagScanResultResponseBodyVulnerabilities> vulnerabilities;

    public static ListRepoTagScanResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRepoTagScanResultResponseBody self = new ListRepoTagScanResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRepoTagScanResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRepoTagScanResultResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public ListRepoTagScanResultResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListRepoTagScanResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRepoTagScanResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRepoTagScanResultResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListRepoTagScanResultResponseBody setVulnerabilities(java.util.List<ListRepoTagScanResultResponseBodyVulnerabilities> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
        return this;
    }
    public java.util.List<ListRepoTagScanResultResponseBodyVulnerabilities> getVulnerabilities() {
        return this.vulnerabilities;
    }

    public static class ListRepoTagScanResultResponseBodyVulnerabilities extends TeaModel {
        /**
         * <p>The ID of the image layer where the vulnerability was detected.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:123456717b8e40b6480979b739010d8d549989602bcdd07922119aec6f9dbe57</p>
         */
        @NameInMap("AddedBy")
        public String addedBy;

        /**
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>Vulnerability</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The URL of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://security-tracker.debian.org/tracker/CVE-2009-5155">https://security-tracker.debian.org/tracker/CVE-2009-5155</a></p>
         */
        @NameInMap("CveLink")
        public String cveLink;

        /**
         * <p>The directory of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>/test.txt</p>
         */
        @NameInMap("CveLocation")
        public String cveLocation;

        /**
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2009-5155</p>
         */
        @NameInMap("CveName")
        public String cveName;

        /**
         * <p>The description of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The cause of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>eglibc</p>
         */
        @NameInMap("Feature")
        public String feature;

        /**
         * <p>The command used to fix the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>yum install -y xxx</p>
         */
        @NameInMap("FixCmd")
        public String fixCmd;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><code>cve</code>: image system vulnerability</li>
         * <li><code>sca</code>: image application vulnerability</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        @NameInMap("ScanType")
        public String scanType;

        /**
         * <p>The severity of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>Medium</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <p>The version of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>2.19-6.9</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The version where the vulnerability was fixed.</p>
         * 
         * <strong>example:</strong>
         * <p>2.19-18+deb8u5</p>
         */
        @NameInMap("VersionFixed")
        public String versionFixed;

        /**
         * <p>The format of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>dpkg</p>
         */
        @NameInMap("VersionFormat")
        public String versionFormat;

        public static ListRepoTagScanResultResponseBodyVulnerabilities build(java.util.Map<String, ?> map) throws Exception {
            ListRepoTagScanResultResponseBodyVulnerabilities self = new ListRepoTagScanResultResponseBodyVulnerabilities();
            return TeaModel.build(map, self);
        }

        public ListRepoTagScanResultResponseBodyVulnerabilities setAddedBy(String addedBy) {
            this.addedBy = addedBy;
            return this;
        }
        public String getAddedBy() {
            return this.addedBy;
        }

        public ListRepoTagScanResultResponseBodyVulnerabilities setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListRepoTagScanResultResponseBodyVulnerabilities setCveLink(String cveLink) {
            this.cveLink = cveLink;
            return this;
        }
        public String getCveLink() {
            return this.cveLink;
        }

        public ListRepoTagScanResultResponseBodyVulnerabilities setCveLocation(String cveLocation) {
            this.cveLocation = cveLocation;
            return this;
        }
        public String getCveLocation() {
            return this.cveLocation;
        }

        public ListRepoTagScanResultResponseBodyVulnerabilities setCveName(String cveName) {
            this.cveName = cveName;
            return this;
        }
        public String getCveName() {
            return this.cveName;
        }

        public ListRepoTagScanResultResponseBodyVulnerabilities setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRepoTagScanResultResponseBodyVulnerabilities setFeature(String feature) {
            this.feature = feature;
            return this;
        }
        public String getFeature() {
            return this.feature;
        }

        public ListRepoTagScanResultResponseBodyVulnerabilities setFixCmd(String fixCmd) {
            this.fixCmd = fixCmd;
            return this;
        }
        public String getFixCmd() {
            return this.fixCmd;
        }

        public ListRepoTagScanResultResponseBodyVulnerabilities setScanType(String scanType) {
            this.scanType = scanType;
            return this;
        }
        public String getScanType() {
            return this.scanType;
        }

        public ListRepoTagScanResultResponseBodyVulnerabilities setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public ListRepoTagScanResultResponseBodyVulnerabilities setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListRepoTagScanResultResponseBodyVulnerabilities setVersionFixed(String versionFixed) {
            this.versionFixed = versionFixed;
            return this;
        }
        public String getVersionFixed() {
            return this.versionFixed;
        }

        public ListRepoTagScanResultResponseBodyVulnerabilities setVersionFormat(String versionFormat) {
            this.versionFormat = versionFormat;
            return this;
        }
        public String getVersionFormat() {
            return this.versionFormat;
        }

    }

}
