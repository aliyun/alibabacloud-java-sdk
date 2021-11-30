// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListRepoTagScanResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("AddedBy")
        public String addedBy;

        @NameInMap("CveLink")
        public String cveLink;

        @NameInMap("CveName")
        public String cveName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Feature")
        public String feature;

        @NameInMap("FixCmd")
        public String fixCmd;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("Version")
        public String version;

        @NameInMap("VersionFixed")
        public String versionFixed;

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

        public ListRepoTagScanResultResponseBodyVulnerabilities setCveLink(String cveLink) {
            this.cveLink = cveLink;
            return this;
        }
        public String getCveLink() {
            return this.cveLink;
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
