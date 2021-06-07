// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVulListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("VulRecords")
    @Validation(required = true)
    public java.util.List<DescribeVulListResponseVulRecords> vulRecords;

    public static DescribeVulListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulListResponse self = new DescribeVulListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVulListResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVulListResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVulListResponse setVulRecords(java.util.List<DescribeVulListResponseVulRecords> vulRecords) {
        this.vulRecords = vulRecords;
        return this;
    }
    public java.util.List<DescribeVulListResponseVulRecords> getVulRecords() {
        return this.vulRecords;
    }

    public static class DescribeVulListResponseVulRecordsExtendContentJsonRpmEntityList extends TeaModel {
        @NameInMap("FullVersion")
        @Validation(required = true)
        public String fullVersion;

        @NameInMap("MatchDetail")
        @Validation(required = true)
        public String matchDetail;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("UpdateCmd")
        @Validation(required = true)
        public String updateCmd;

        public static DescribeVulListResponseVulRecordsExtendContentJsonRpmEntityList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseVulRecordsExtendContentJsonRpmEntityList self = new DescribeVulListResponseVulRecordsExtendContentJsonRpmEntityList();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseVulRecordsExtendContentJsonRpmEntityList setFullVersion(String fullVersion) {
            this.fullVersion = fullVersion;
            return this;
        }
        public String getFullVersion() {
            return this.fullVersion;
        }

        public DescribeVulListResponseVulRecordsExtendContentJsonRpmEntityList setMatchDetail(String matchDetail) {
            this.matchDetail = matchDetail;
            return this;
        }
        public String getMatchDetail() {
            return this.matchDetail;
        }

        public DescribeVulListResponseVulRecordsExtendContentJsonRpmEntityList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVulListResponseVulRecordsExtendContentJsonRpmEntityList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeVulListResponseVulRecordsExtendContentJsonRpmEntityList setUpdateCmd(String updateCmd) {
            this.updateCmd = updateCmd;
            return this;
        }
        public String getUpdateCmd() {
            return this.updateCmd;
        }

    }

    public static class DescribeVulListResponseVulRecordsExtendContentJson extends TeaModel {
        @NameInMap("RpmEntityList")
        @Validation(required = true)
        public java.util.List<DescribeVulListResponseVulRecordsExtendContentJsonRpmEntityList> rpmEntityList;

        public static DescribeVulListResponseVulRecordsExtendContentJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseVulRecordsExtendContentJson self = new DescribeVulListResponseVulRecordsExtendContentJson();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseVulRecordsExtendContentJson setRpmEntityList(java.util.List<DescribeVulListResponseVulRecordsExtendContentJsonRpmEntityList> rpmEntityList) {
            this.rpmEntityList = rpmEntityList;
            return this;
        }
        public java.util.List<DescribeVulListResponseVulRecordsExtendContentJsonRpmEntityList> getRpmEntityList() {
            return this.rpmEntityList;
        }

    }

    public static class DescribeVulListResponseVulRecords extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("AliasName")
        @Validation(required = true)
        public String aliasName;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("FirstTs")
        @Validation(required = true)
        public Long firstTs;

        @NameInMap("LastTs")
        @Validation(required = true)
        public Long lastTs;

        @NameInMap("ModifyTs")
        @Validation(required = true)
        public Long modifyTs;

        @NameInMap("RepairTs")
        @Validation(required = true)
        public Long repairTs;

        @NameInMap("DesktopId")
        @Validation(required = true)
        public String desktopId;

        @NameInMap("DesktopName")
        @Validation(required = true)
        public String desktopName;

        @NameInMap("Necessity")
        @Validation(required = true)
        public String necessity;

        @NameInMap("OsVersion")
        @Validation(required = true)
        public String osVersion;

        @NameInMap("Related")
        @Validation(required = true)
        public String related;

        @NameInMap("ResultCode")
        @Validation(required = true)
        public String resultCode;

        @NameInMap("ResultMessage")
        @Validation(required = true)
        public String resultMessage;

        @NameInMap("Tag")
        @Validation(required = true)
        public String tag;

        @NameInMap("Online")
        @Validation(required = true)
        public Boolean online;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("ExtendContentJson")
        @Validation(required = true)
        public DescribeVulListResponseVulRecordsExtendContentJson extendContentJson;

        public static DescribeVulListResponseVulRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseVulRecords self = new DescribeVulListResponseVulRecords();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseVulRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVulListResponseVulRecords setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeVulListResponseVulRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVulListResponseVulRecords setFirstTs(Long firstTs) {
            this.firstTs = firstTs;
            return this;
        }
        public Long getFirstTs() {
            return this.firstTs;
        }

        public DescribeVulListResponseVulRecords setLastTs(Long lastTs) {
            this.lastTs = lastTs;
            return this;
        }
        public Long getLastTs() {
            return this.lastTs;
        }

        public DescribeVulListResponseVulRecords setModifyTs(Long modifyTs) {
            this.modifyTs = modifyTs;
            return this;
        }
        public Long getModifyTs() {
            return this.modifyTs;
        }

        public DescribeVulListResponseVulRecords setRepairTs(Long repairTs) {
            this.repairTs = repairTs;
            return this;
        }
        public Long getRepairTs() {
            return this.repairTs;
        }

        public DescribeVulListResponseVulRecords setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeVulListResponseVulRecords setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeVulListResponseVulRecords setNecessity(String necessity) {
            this.necessity = necessity;
            return this;
        }
        public String getNecessity() {
            return this.necessity;
        }

        public DescribeVulListResponseVulRecords setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public DescribeVulListResponseVulRecords setRelated(String related) {
            this.related = related;
            return this;
        }
        public String getRelated() {
            return this.related;
        }

        public DescribeVulListResponseVulRecords setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public DescribeVulListResponseVulRecords setResultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }
        public String getResultMessage() {
            return this.resultMessage;
        }

        public DescribeVulListResponseVulRecords setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeVulListResponseVulRecords setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public DescribeVulListResponseVulRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeVulListResponseVulRecords setExtendContentJson(DescribeVulListResponseVulRecordsExtendContentJson extendContentJson) {
            this.extendContentJson = extendContentJson;
            return this;
        }
        public DescribeVulListResponseVulRecordsExtendContentJson getExtendContentJson() {
            return this.extendContentJson;
        }

    }

}
