// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryHistoryAvgMetricListResponseBody extends TeaModel {
    /**
     * <p>The list of average metric data.</p>
     */
    @NameInMap("AvgMetricList")
    public java.util.List<QueryHistoryAvgMetricListResponseBodyAvgMetricList> avgMetricList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>269BDB16-2CD8-4865-84BD-11C40BC2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryHistoryAvgMetricListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHistoryAvgMetricListResponseBody self = new QueryHistoryAvgMetricListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHistoryAvgMetricListResponseBody setAvgMetricList(java.util.List<QueryHistoryAvgMetricListResponseBodyAvgMetricList> avgMetricList) {
        this.avgMetricList = avgMetricList;
        return this;
    }
    public java.util.List<QueryHistoryAvgMetricListResponseBodyAvgMetricList> getAvgMetricList() {
        return this.avgMetricList;
    }

    public QueryHistoryAvgMetricListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHistoryAvgMetricListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryHistoryAvgMetricListResponseBodyAvgMetricListSessions extends TeaModel {
        /**
         * <p>The ID of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>testUser</p>
         */
        @NameInMap("EndUserId")
        public String endUserId;

        /**
         * <p>The time when the session was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-17T14:51:53Z</p>
         */
        @NameInMap("EstablishmentTime")
        public String establishmentTime;

        /**
         * <p>The external username of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>testUserName</p>
         */
        @NameInMap("ExternalUserName")
        public String externalUserName;

        /**
         * <p>The nickname of the end user.</p>
         * 
         * <strong>example:</strong>
         * <p>sz-sygc-07-03</p>
         */
        @NameInMap("NickName")
        public String nickName;

        public static QueryHistoryAvgMetricListResponseBodyAvgMetricListSessions build(java.util.Map<String, ?> map) throws Exception {
            QueryHistoryAvgMetricListResponseBodyAvgMetricListSessions self = new QueryHistoryAvgMetricListResponseBodyAvgMetricListSessions();
            return TeaModel.build(map, self);
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricListSessions setEndUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }
        public String getEndUserId() {
            return this.endUserId;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricListSessions setEstablishmentTime(String establishmentTime) {
            this.establishmentTime = establishmentTime;
            return this;
        }
        public String getEstablishmentTime() {
            return this.establishmentTime;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricListSessions setExternalUserName(String externalUserName) {
            this.externalUserName = externalUserName;
            return this;
        }
        public String getExternalUserName() {
            return this.externalUserName;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricListSessions setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

    public static class QueryHistoryAvgMetricListResponseBodyAvgMetricList extends TeaModel {
        /**
         * <p>The aggregated metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AvgValue")
        public Float avgValue;

        /**
         * <p>The billing method of the desktop. Valid values:</p>
         * <ul>
         * <li><p><code>PostPaid</code>: pay-as-you-go</p>
         * </li>
         * <li><p><code>PrePaid</code>: subscription</p>
         * </li>
         * </ul>
         * <p>Default value: <code>PostPaid</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The desktop group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-bogo95eob5avnis9k</p>
         */
        @NameInMap("DesktopGroupId")
        public String desktopGroupId;

        /**
         * <p><strong>The desktop ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>ecd-bx9i0nsjd3zmibnzq</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p><strong>The desktop name.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>C-051</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The status of the desktop. Valid values:</p>
         * <ul>
         * <li><p><code>Stopped</code>: The desktop is stopped.</p>
         * </li>
         * <li><p><code>Starting</code>: The desktop is being started.</p>
         * </li>
         * <li><p><code>Rebuilding</code>: The desktop is being rebuilt.</p>
         * </li>
         * <li><p><code>Running</code>: The desktop is running.</p>
         * </li>
         * <li><p><code>Stopping</code>: The desktop is being stopped.</p>
         * </li>
         * <li><p><code>Expired</code>: The desktop has expired.</p>
         * </li>
         * <li><p><code>Deleted</code>: The desktop has been deleted.</p>
         * </li>
         * <li><p><code>Pending</code>: The desktop is in a pending state.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DesktopStatus")
        public String desktopStatus;

        /**
         * <p>The desktop type.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.enterprise_office.8c16g</p>
         */
        @NameInMap("DesktopType")
        public String desktopType;

        /**
         * <p>The IDs of the authorized end users.</p>
         */
        @NameInMap("EndUserIds")
        public java.util.List<String> endUserIds;

        /**
         * <p>The GPU memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <p>The management flag.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ManagementFlag")
        public String managementFlag;

        /**
         * <p>The memory size, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>Whether the desktop is a multi-user shared desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MultiResource")
        public Boolean multiResource;

        /**
         * <p>The type of the system image.</p>
         * 
         * <strong>example:</strong>
         * <p>Winserver2025</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>A list of session details.</p>
         */
        @NameInMap("Sessions")
        public java.util.List<QueryHistoryAvgMetricListResponseBodyAvgMetricListSessions> sessions;

        /**
         * <p>The payment type.</p>
         * 
         * <strong>example:</strong>
         * <p>monthPackage</p>
         */
        @NameInMap("SubPayType")
        public String subPayType;

        public static QueryHistoryAvgMetricListResponseBodyAvgMetricList build(java.util.Map<String, ?> map) throws Exception {
            QueryHistoryAvgMetricListResponseBodyAvgMetricList self = new QueryHistoryAvgMetricListResponseBodyAvgMetricList();
            return TeaModel.build(map, self);
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setAvgValue(Float avgValue) {
            this.avgValue = avgValue;
            return this;
        }
        public Float getAvgValue() {
            return this.avgValue;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setDesktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }
        public String getDesktopGroupId() {
            return this.desktopGroupId;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setDesktopStatus(String desktopStatus) {
            this.desktopStatus = desktopStatus;
            return this;
        }
        public String getDesktopStatus() {
            return this.desktopStatus;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setDesktopType(String desktopType) {
            this.desktopType = desktopType;
            return this;
        }
        public String getDesktopType() {
            return this.desktopType;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setEndUserIds(java.util.List<String> endUserIds) {
            this.endUserIds = endUserIds;
            return this;
        }
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setManagementFlag(String managementFlag) {
            this.managementFlag = managementFlag;
            return this;
        }
        public String getManagementFlag() {
            return this.managementFlag;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setMultiResource(Boolean multiResource) {
            this.multiResource = multiResource;
            return this;
        }
        public Boolean getMultiResource() {
            return this.multiResource;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setSessions(java.util.List<QueryHistoryAvgMetricListResponseBodyAvgMetricListSessions> sessions) {
            this.sessions = sessions;
            return this;
        }
        public java.util.List<QueryHistoryAvgMetricListResponseBodyAvgMetricListSessions> getSessions() {
            return this.sessions;
        }

        public QueryHistoryAvgMetricListResponseBodyAvgMetricList setSubPayType(String subPayType) {
            this.subPayType = subPayType;
            return this;
        }
        public String getSubPayType() {
            return this.subPayType;
        }

    }

}
