// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVulListResponseBody extends TeaModel {
    // The page number of the returned page.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The maximum number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    // Details about vulnerabilities.
    @NameInMap("VulRecords")
    public java.util.List<DescribeVulListResponseBodyVulRecords> vulRecords;

    public static DescribeVulListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulListResponseBody self = new DescribeVulListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVulListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVulListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVulListResponseBody setVulRecords(java.util.List<DescribeVulListResponseBodyVulRecords> vulRecords) {
        this.vulRecords = vulRecords;
        return this;
    }
    public java.util.List<DescribeVulListResponseBodyVulRecords> getVulRecords() {
        return this.vulRecords;
    }

    public static class DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList extends TeaModel {
        // The complete version number of the RPM package.
        @NameInMap("FullVersion")
        public String fullVersion;

        // The detailed matching information of the vulnerability.
        @NameInMap("MatchDetail")
        public String matchDetail;

        // The name of the RPM package.
        @NameInMap("Name")
        public String name;

        // The path of the software that has the vulnerability.
        @NameInMap("Path")
        public String path;

        // The command used to fix the vulnerability.
        @NameInMap("UpdateCmd")
        public String updateCmd;

        public static DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList self = new DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setFullVersion(String fullVersion) {
            this.fullVersion = fullVersion;
            return this;
        }
        public String getFullVersion() {
            return this.fullVersion;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setMatchDetail(String matchDetail) {
            this.matchDetail = matchDetail;
            return this;
        }
        public String getMatchDetail() {
            return this.matchDetail;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setUpdateCmd(String updateCmd) {
            this.updateCmd = updateCmd;
            return this;
        }
        public String getUpdateCmd() {
            return this.updateCmd;
        }

    }

    public static class DescribeVulListResponseBodyVulRecordsExtendContentJson extends TeaModel {
        // Details about RPM packages.
        @NameInMap("RpmEntityList")
        public java.util.List<DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> rpmEntityList;

        public static DescribeVulListResponseBodyVulRecordsExtendContentJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseBodyVulRecordsExtendContentJson self = new DescribeVulListResponseBodyVulRecordsExtendContentJson();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setRpmEntityList(java.util.List<DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> rpmEntityList) {
            this.rpmEntityList = rpmEntityList;
            return this;
        }
        public java.util.List<DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> getRpmEntityList() {
            return this.rpmEntityList;
        }

    }

    public static class DescribeVulListResponseBodyVulRecords extends TeaModel {
        // The name of the vulnerability.
        @NameInMap("AliasName")
        public String aliasName;

        // The ID of the affected cloud desktop.
        @NameInMap("DesktopId")
        public String desktopId;

        // The name of the affected cloud desktop.
        @NameInMap("DesktopName")
        public String desktopName;

        // The extended information of the vulnerability.
        @NameInMap("ExtendContentJson")
        public DescribeVulListResponseBodyVulRecordsExtendContentJson extendContentJson;

        @NameInMap("FirstTs")
        public Long firstTs;

        // The timestamp when the vulnerability was last detected. The timestamp follows the UNIX time format. It is the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970.
        @NameInMap("LastTs")
        public Long lastTs;

        // The timestamp when the vulnerability status was modified. The timestamp follows the UNIX time format. It is the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970.
        @NameInMap("ModifyTs")
        public Long modifyTs;

        // The name of the vulnerability.
        @NameInMap("Name")
        public String name;

        // The priority to fix the vulnerability or the risk level of the vulnerability. Valid values:
        // 
        // *   asap: high
        // *   later: medium
        // *   nntf: low
        @NameInMap("Necessity")
        public String necessity;

        // Indicates whether the Security Center agent on the cloud desktops is online. Valid values:
        // 
        // *   true: online
        // *   false: offline
        @NameInMap("Online")
        public Boolean online;

        // The name of the operating system of the cloud desktop.
        @NameInMap("OsVersion")
        public String osVersion;

        // The IDs of Common Vulnerabilities and Exposures (CVEs) related to the vulnerability.
        @NameInMap("Related")
        public String related;

        // The timestamp when the vulnerability was fixed. The timestamp follows the UNIX time format. It is the number of milliseconds that have elapsed since 00:00:00 Thursday, January 1, 1970.
        @NameInMap("RepairTs")
        public Long repairTs;

        // The code returned after the vulnerability is fixed.
        @NameInMap("ResultCode")
        public String resultCode;

        // The message returned after the vulnerability is fixed.
        @NameInMap("ResultMessage")
        public String resultMessage;

        // The status of the vulnerability. Valid values:
        // 
        // *   1: unfixed
        // *   2: fix failed
        // *   3: rollback failed
        // *   4: fixing
        // *   5: rolling back
        // *   6: verifying
        // *   7: fixed
        // *   8: fixed and pending restart
        // *   9: rolled back
        // *   10: ignored
        // *   11: rolled back and pending restart
        // *   12: not found
        // *   20: expired
        @NameInMap("Status")
        public Integer status;

        // The tag of the vulnerability.
        @NameInMap("Tag")
        public String tag;

        // The type of the vulnerability. Valid values:
        // 
        // *   cve: Linux software vulnerability
        // *   sys: Windows system vulnerability
        @NameInMap("Type")
        public String type;

        public static DescribeVulListResponseBodyVulRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseBodyVulRecords self = new DescribeVulListResponseBodyVulRecords();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseBodyVulRecords setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeVulListResponseBodyVulRecords setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeVulListResponseBodyVulRecords setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeVulListResponseBodyVulRecords setExtendContentJson(DescribeVulListResponseBodyVulRecordsExtendContentJson extendContentJson) {
            this.extendContentJson = extendContentJson;
            return this;
        }
        public DescribeVulListResponseBodyVulRecordsExtendContentJson getExtendContentJson() {
            return this.extendContentJson;
        }

        public DescribeVulListResponseBodyVulRecords setFirstTs(Long firstTs) {
            this.firstTs = firstTs;
            return this;
        }
        public Long getFirstTs() {
            return this.firstTs;
        }

        public DescribeVulListResponseBodyVulRecords setLastTs(Long lastTs) {
            this.lastTs = lastTs;
            return this;
        }
        public Long getLastTs() {
            return this.lastTs;
        }

        public DescribeVulListResponseBodyVulRecords setModifyTs(Long modifyTs) {
            this.modifyTs = modifyTs;
            return this;
        }
        public Long getModifyTs() {
            return this.modifyTs;
        }

        public DescribeVulListResponseBodyVulRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVulListResponseBodyVulRecords setNecessity(String necessity) {
            this.necessity = necessity;
            return this;
        }
        public String getNecessity() {
            return this.necessity;
        }

        public DescribeVulListResponseBodyVulRecords setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public DescribeVulListResponseBodyVulRecords setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public DescribeVulListResponseBodyVulRecords setRelated(String related) {
            this.related = related;
            return this;
        }
        public String getRelated() {
            return this.related;
        }

        public DescribeVulListResponseBodyVulRecords setRepairTs(Long repairTs) {
            this.repairTs = repairTs;
            return this;
        }
        public Long getRepairTs() {
            return this.repairTs;
        }

        public DescribeVulListResponseBodyVulRecords setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public DescribeVulListResponseBodyVulRecords setResultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }
        public String getResultMessage() {
            return this.resultMessage;
        }

        public DescribeVulListResponseBodyVulRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeVulListResponseBodyVulRecords setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeVulListResponseBodyVulRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
