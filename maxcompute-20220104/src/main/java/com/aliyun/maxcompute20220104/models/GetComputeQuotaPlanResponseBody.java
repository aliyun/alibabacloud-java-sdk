// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetComputeQuotaPlanResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public GetComputeQuotaPlanResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>QUOTA_PLAN_NOT_FOUND</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>plan \&quot;***\&quot; does not exist</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>1xx: informational response. The request is received and is being processed.</li>
     * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
     * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
     * <li>4xx: client error. The request contains invalid request parameters or syntaxes, or specific request conditions cannot be met.</li>
     * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EA1320AB-7766-5EC7-B0F6-8B20E2298567</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetComputeQuotaPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComputeQuotaPlanResponseBody self = new GetComputeQuotaPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComputeQuotaPlanResponseBody setData(GetComputeQuotaPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetComputeQuotaPlanResponseBodyData getData() {
        return this.data;
    }

    public GetComputeQuotaPlanResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetComputeQuotaPlanResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetComputeQuotaPlanResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetComputeQuotaPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetComputeQuotaPlanResponseBodyDataQuotaParameter extends TeaModel {
        /**
         * <p>The value of elastic Reserved CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("elasticReservedCU")
        public Long elasticReservedCU;

        /**
         * <p>The value of maxCU in Reserved CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("maxCU")
        public Long maxCU;

        /**
         * <p>The value of minCU in Reserved CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("minCU")
        public Long minCU;

        public static GetComputeQuotaPlanResponseBodyDataQuotaParameter build(java.util.Map<String, ?> map) throws Exception {
            GetComputeQuotaPlanResponseBodyDataQuotaParameter self = new GetComputeQuotaPlanResponseBodyDataQuotaParameter();
            return TeaModel.build(map, self);
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaParameter setElasticReservedCU(Long elasticReservedCU) {
            this.elasticReservedCU = elasticReservedCU;
            return this;
        }
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaParameter setMaxCU(Long maxCU) {
            this.maxCU = maxCU;
            return this;
        }
        public Long getMaxCU() {
            return this.maxCU;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaParameter setMinCU(Long minCU) {
            this.minCU = minCU;
            return this;
        }
        public Long getMinCU() {
            return this.minCU;
        }

    }

    public static class GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoListParameter extends TeaModel {
        /**
         * <p>The value of elastic Reserved CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("elasticReservedCU")
        public Long elasticReservedCU;

        /**
         * <p>whether to enable the priority feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("enablePriority")
        public Boolean enablePriority;

        /**
         * <p>Whether it is exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("forceReservedMin")
        public Boolean forceReservedMin;

        /**
         * <p>The value of maxCU in Reserved CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("maxCU")
        public Long maxCU;

        /**
         * <p>The value of minCU in Reserved CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("minCU")
        public Long minCU;

        /**
         * <p>Scheduling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Fifo/Fair</p>
         */
        @NameInMap("schedulerType")
        public String schedulerType;

        /**
         * <p>The upper limit for CUs that can be concurrently used by a job scheduled to the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("singleJobCULimit")
        public Long singleJobCULimit;

        public static GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoListParameter build(java.util.Map<String, ?> map) throws Exception {
            GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoListParameter self = new GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoListParameter();
            return TeaModel.build(map, self);
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoListParameter setElasticReservedCU(Long elasticReservedCU) {
            this.elasticReservedCU = elasticReservedCU;
            return this;
        }
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoListParameter setEnablePriority(Boolean enablePriority) {
            this.enablePriority = enablePriority;
            return this;
        }
        public Boolean getEnablePriority() {
            return this.enablePriority;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoListParameter setForceReservedMin(Boolean forceReservedMin) {
            this.forceReservedMin = forceReservedMin;
            return this;
        }
        public Boolean getForceReservedMin() {
            return this.forceReservedMin;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoListParameter setMaxCU(Long maxCU) {
            this.maxCU = maxCU;
            return this;
        }
        public Long getMaxCU() {
            return this.maxCU;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoListParameter setMinCU(Long minCU) {
            this.minCU = minCU;
            return this;
        }
        public Long getMinCU() {
            return this.minCU;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoListParameter setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoListParameter setSingleJobCULimit(Long singleJobCULimit) {
            this.singleJobCULimit = singleJobCULimit;
            return this;
        }
        public Long getSingleJobCULimit() {
            return this.singleJobCULimit;
        }

    }

    public static class GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList extends TeaModel {
        /**
         * <p>Cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AT-120N</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1718155201628</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>Creator cloud account UID.</p>
         * 
         * <strong>example:</strong>
         * <p>672863518</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <p>The ID of the level-2 quota.</p>
         * 
         * <strong>example:</strong>
         * <p>10940</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the level-2 quota.</p>
         * 
         * <strong>example:</strong>
         * <p>dp_cn_shanghai_1696659792_p</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The nickname of the level-2 quota.</p>
         * 
         * <strong>example:</strong>
         * <p>subquotaA</p>
         */
        @NameInMap("nickName")
        public String nickName;

        /**
         * <p>The parameters of the level-2 quota.</p>
         */
        @NameInMap("parameter")
        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoListParameter parameter;

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>Resource status.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>Tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>478403690625249</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>The type of quota.</p>
         * 
         * <strong>example:</strong>
         * <p>FUXI_ONLINE</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1386</p>
         */
        @NameInMap("version")
        public String version;

        public static GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList self = new GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setParameter(GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoListParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoListParameter getParameter() {
            return this.parameter;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetComputeQuotaPlanResponseBodyDataQuota extends TeaModel {
        /**
         * <p>Cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AT-120N</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1719886322347</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>Creator\&quot;s cloud account UID.</p>
         * 
         * <strong>example:</strong>
         * <p>672863518</p>
         */
        @NameInMap("creatorId")
        public String creatorId;

        /**
         * <p>The ID of the level-1 quota.</p>
         * 
         * <strong>example:</strong>
         * <p>2413</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the level-1 quota.</p>
         * 
         * <strong>example:</strong>
         * <p>quota_a</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The nickname of the level-1 quota.</p>
         * 
         * <strong>example:</strong>
         * <p>quota_nickname</p>
         */
        @NameInMap("nickName")
        public String nickName;

        /**
         * <p>CU value parameters for the level-1 quota.</p>
         */
        @NameInMap("parameter")
        public GetComputeQuotaPlanResponseBodyDataQuotaParameter parameter;

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>Resource status.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The list of level-2 quotas.</p>
         */
        @NameInMap("subQuotaInfoList")
        public java.util.List<GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList> subQuotaInfoList;

        /**
         * <p>Tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>478403690625249</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <p>Corresponds to the <code>resourceSystemType</code> field of the control cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>FUXI_ONLINE</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1964</p>
         */
        @NameInMap("version")
        public String version;

        public static GetComputeQuotaPlanResponseBodyDataQuota build(java.util.Map<String, ?> map) throws Exception {
            GetComputeQuotaPlanResponseBodyDataQuota self = new GetComputeQuotaPlanResponseBodyDataQuota();
            return TeaModel.build(map, self);
        }

        public GetComputeQuotaPlanResponseBodyDataQuota setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetComputeQuotaPlanResponseBodyDataQuota setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetComputeQuotaPlanResponseBodyDataQuota setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetComputeQuotaPlanResponseBodyDataQuota setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetComputeQuotaPlanResponseBodyDataQuota setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetComputeQuotaPlanResponseBodyDataQuota setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetComputeQuotaPlanResponseBodyDataQuota setParameter(GetComputeQuotaPlanResponseBodyDataQuotaParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public GetComputeQuotaPlanResponseBodyDataQuotaParameter getParameter() {
            return this.parameter;
        }

        public GetComputeQuotaPlanResponseBodyDataQuota setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetComputeQuotaPlanResponseBodyDataQuota setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetComputeQuotaPlanResponseBodyDataQuota setSubQuotaInfoList(java.util.List<GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList> subQuotaInfoList) {
            this.subQuotaInfoList = subQuotaInfoList;
            return this;
        }
        public java.util.List<GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList> getSubQuotaInfoList() {
            return this.subQuotaInfoList;
        }

        public GetComputeQuotaPlanResponseBodyDataQuota setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetComputeQuotaPlanResponseBodyDataQuota setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetComputeQuotaPlanResponseBodyDataQuota setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetComputeQuotaPlanResponseBodyData extends TeaModel {
        /**
         * <p>The time when the quota plan was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1730946421757</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Whether it is currently effective.</p>
         * <blockquote>
         * <ul>
         * <li>A Quota plan that has taken effect cannot be deleted, i.e., isEffective=true</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("isEffective")
        public Boolean isEffective;

        /**
         * <p>The name of the quota plan.</p>
         * 
         * <strong>example:</strong>
         * <p>planA</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The details of the quota.</p>
         */
        @NameInMap("quota")
        public GetComputeQuotaPlanResponseBodyDataQuota quota;

        public static GetComputeQuotaPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetComputeQuotaPlanResponseBodyData self = new GetComputeQuotaPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetComputeQuotaPlanResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetComputeQuotaPlanResponseBodyData setIsEffective(Boolean isEffective) {
            this.isEffective = isEffective;
            return this;
        }
        public Boolean getIsEffective() {
            return this.isEffective;
        }

        public GetComputeQuotaPlanResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetComputeQuotaPlanResponseBodyData setQuota(GetComputeQuotaPlanResponseBodyDataQuota quota) {
            this.quota = quota;
            return this;
        }
        public GetComputeQuotaPlanResponseBodyDataQuota getQuota() {
            return this.quota;
        }

    }

}
