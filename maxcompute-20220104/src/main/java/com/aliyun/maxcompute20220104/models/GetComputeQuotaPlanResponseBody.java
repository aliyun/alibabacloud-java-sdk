// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetComputeQuotaPlanResponseBody extends TeaModel {
    @NameInMap("data")
    public GetComputeQuotaPlanResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("httpCode")
    public Integer httpCode;

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
        @NameInMap("elasticReservedCU")
        public Long elasticReservedCU;

        @NameInMap("maxCU")
        public Long maxCU;

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
        @NameInMap("elasticReservedCU")
        public Long elasticReservedCU;

        @NameInMap("enablePriority")
        public Boolean enablePriority;

        @NameInMap("forceReservedMin")
        public Boolean forceReservedMin;

        @NameInMap("maxCU")
        public Long maxCU;

        @NameInMap("minCU")
        public Long minCU;

        @NameInMap("schedulerType")
        public String schedulerType;

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
        @NameInMap("cluster")
        public String cluster;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creatorId")
        public String creatorId;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("nickName")
        public String nickName;

        @NameInMap("parameter")
        public GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoListParameter parameter;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("status")
        public String status;

        @NameInMap("tenantId")
        public String tenantId;

        @NameInMap("type")
        public String type;

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
        @NameInMap("cluster")
        public String cluster;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creatorId")
        public String creatorId;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("nickName")
        public String nickName;

        @NameInMap("parameter")
        public GetComputeQuotaPlanResponseBodyDataQuotaParameter parameter;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("status")
        public String status;

        @NameInMap("subQuotaInfoList")
        public java.util.List<GetComputeQuotaPlanResponseBodyDataQuotaSubQuotaInfoList> subQuotaInfoList;

        @NameInMap("tenantId")
        public String tenantId;

        @NameInMap("type")
        public String type;

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
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("isEffective")
        public Boolean isEffective;

        @NameInMap("name")
        public String name;

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
