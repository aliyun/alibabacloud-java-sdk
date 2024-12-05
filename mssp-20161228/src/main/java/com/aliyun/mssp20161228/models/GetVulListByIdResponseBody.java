// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetVulListByIdResponseBody extends TeaModel {
    /**
     * <p>API response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data returned by the interface.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetVulListByIdResponseBodyData> data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Prompt message for the returned result.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Pagination information.</p>
     */
    @NameInMap("PageInfo")
    public GetVulListByIdResponseBodyPageInfo pageInfo;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>D38B3D2F-67FD-57FF-87D1-C431D2C70F76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Values: - <strong>true</strong>: Yes. - <strong>false</strong>: No.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetVulListByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVulListByIdResponseBody self = new GetVulListByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVulListByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVulListByIdResponseBody setData(java.util.List<GetVulListByIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetVulListByIdResponseBodyData> getData() {
        return this.data;
    }

    public GetVulListByIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetVulListByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVulListByIdResponseBody setPageInfo(GetVulListByIdResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetVulListByIdResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetVulListByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVulListByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVulListByIdResponseBodyDataEffectMsgDTOS extends TeaModel {
        /**
         * <p>Hit</p>
         * 
         * <strong>example:</strong>
         * <p>fastjson(jar) extendField.safemode equals false</p>
         */
        @NameInMap("MatchList")
        public String matchList;

        /**
         * <p>Path</p>
         * 
         * <strong>example:</strong>
         * <p>/uat6/qry/enquiry/policy/yrtPolicyList</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>Software name</p>
         * 
         * <strong>example:</strong>
         * <p>python-perf 3.10.0</p>
         */
        @NameInMap("SoftName")
        public String softName;

        public static GetVulListByIdResponseBodyDataEffectMsgDTOS build(java.util.Map<String, ?> map) throws Exception {
            GetVulListByIdResponseBodyDataEffectMsgDTOS self = new GetVulListByIdResponseBodyDataEffectMsgDTOS();
            return TeaModel.build(map, self);
        }

        public GetVulListByIdResponseBodyDataEffectMsgDTOS setMatchList(String matchList) {
            this.matchList = matchList;
            return this;
        }
        public String getMatchList() {
            return this.matchList;
        }

        public GetVulListByIdResponseBodyDataEffectMsgDTOS setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetVulListByIdResponseBodyDataEffectMsgDTOS setSoftName(String softName) {
            this.softName = softName;
            return this;
        }
        public String getSoftName() {
            return this.softName;
        }

    }

    public static class GetVulListByIdResponseBodyData extends TeaModel {
        /**
         * <p>Vulnerability Alias</p>
         * 
         * <strong>example:</strong>
         * <p>Tomcat websocket 拒绝服务漏洞利用代码披露（CVE-2020-13935）</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>Impact description</p>
         */
        @NameInMap("EffectMsgDTOS")
        public java.util.List<GetVulListByIdResponseBodyDataEffectMsgDTOS> effectMsgDTOS;

        /**
         * <p>Timestamp of the first time the vulnerability was detected</p>
         * 
         * <strong>example:</strong>
         * <p>1620404763000</p>
         */
        @NameInMap("FirstTs")
        public String firstTs;

        /**
         * <p>Instance name of the asset</p>
         * 
         * <strong>example:</strong>
         * <p>凌星-CentOS</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Public IP of the asset</p>
         * 
         * <strong>example:</strong>
         * <p>39.101.73.28</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>Private IP of the asset</p>
         * 
         * <strong>example:</strong>
         * <p>172.22.216.17</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>Timestamp of the last time the vulnerability was detected</p>
         * 
         * <strong>example:</strong>
         * <p>1620404763000</p>
         */
        @NameInMap("LastTs")
        public String lastTs;

        /**
         * <p>Vulnerability name</p>
         * 
         * <strong>example:</strong>
         * <p>SCA:ACSV-2020-111301</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Necessity level of vulnerability repair</p>
         * 
         * <strong>example:</strong>
         * <p>later,asap,nntf</p>
         */
        @NameInMap("Necessity")
        public String necessity;

        /**
         * <p>List of associated CVEs for the vulnerability, separated by commas (,) if there are multiple values.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2020-13935</p>
         */
        @NameInMap("Related")
        public String related;

        /**
         * <p>Repair command</p>
         * 
         * <strong>example:</strong>
         * <p>*** update python-perf</p>
         */
        @NameInMap("RepairCmd")
        public String repairCmd;

        /**
         * <p>Timestamp of vulnerability repair</p>
         * 
         * <strong>example:</strong>
         * <p>1541207563000</p>
         */
        @NameInMap("RepairTs")
        public String repairTs;

        /**
         * <p>Vulnerability status:
         * 1: Not fixed
         * 2: Fix failed
         * 3: Rollback failed
         * 4: Fixing
         * 5: Rolling back
         * 6: Verifying
         * 7: Fixed successfully
         * 8: Fixed successfully, pending reboot
         * 9: Rolled back successfully
         * 10: Ignored
         * 11: Rolled back successfully, pending reboot
         * 12: Vulnerability does not exist
         * 20: Expired</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Vulnerability tag</p>
         * 
         * <strong>example:</strong>
         * <p>Restart Required</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>UUID of the asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>hdm_5cf2eaf263c021b354877943f181956d</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static GetVulListByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVulListByIdResponseBodyData self = new GetVulListByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVulListByIdResponseBodyData setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public GetVulListByIdResponseBodyData setEffectMsgDTOS(java.util.List<GetVulListByIdResponseBodyDataEffectMsgDTOS> effectMsgDTOS) {
            this.effectMsgDTOS = effectMsgDTOS;
            return this;
        }
        public java.util.List<GetVulListByIdResponseBodyDataEffectMsgDTOS> getEffectMsgDTOS() {
            return this.effectMsgDTOS;
        }

        public GetVulListByIdResponseBodyData setFirstTs(String firstTs) {
            this.firstTs = firstTs;
            return this;
        }
        public String getFirstTs() {
            return this.firstTs;
        }

        public GetVulListByIdResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetVulListByIdResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public GetVulListByIdResponseBodyData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public GetVulListByIdResponseBodyData setLastTs(String lastTs) {
            this.lastTs = lastTs;
            return this;
        }
        public String getLastTs() {
            return this.lastTs;
        }

        public GetVulListByIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetVulListByIdResponseBodyData setNecessity(String necessity) {
            this.necessity = necessity;
            return this;
        }
        public String getNecessity() {
            return this.necessity;
        }

        public GetVulListByIdResponseBodyData setRelated(String related) {
            this.related = related;
            return this;
        }
        public String getRelated() {
            return this.related;
        }

        public GetVulListByIdResponseBodyData setRepairCmd(String repairCmd) {
            this.repairCmd = repairCmd;
            return this;
        }
        public String getRepairCmd() {
            return this.repairCmd;
        }

        public GetVulListByIdResponseBodyData setRepairTs(String repairTs) {
            this.repairTs = repairTs;
            return this;
        }
        public String getRepairTs() {
            return this.repairTs;
        }

        public GetVulListByIdResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVulListByIdResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetVulListByIdResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class GetVulListByIdResponseBodyPageInfo extends TeaModel {
        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>Number of items per page in the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total number of records in the query result.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetVulListByIdResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVulListByIdResponseBodyPageInfo self = new GetVulListByIdResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetVulListByIdResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetVulListByIdResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetVulListByIdResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
