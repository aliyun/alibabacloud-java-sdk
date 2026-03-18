// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetComputeEffectivePlanResponseBody extends TeaModel {
    @NameInMap("data")
    public GetComputeEffectivePlanResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("httpCode")
    public Integer httpCode;

    @NameInMap("requestId")
    public String requestId;

    public static GetComputeEffectivePlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComputeEffectivePlanResponseBody self = new GetComputeEffectivePlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComputeEffectivePlanResponseBody setData(GetComputeEffectivePlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetComputeEffectivePlanResponseBodyData getData() {
        return this.data;
    }

    public GetComputeEffectivePlanResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetComputeEffectivePlanResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetComputeEffectivePlanResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetComputeEffectivePlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList extends TeaModel {
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
        public java.util.Map<String, ?> parameter;

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

        public static GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList self = new GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetComputeEffectivePlanResponseBodyDataQuota extends TeaModel {
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
        public java.util.Map<String, ?> parameter;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("status")
        public String status;

        @NameInMap("subQuotaInfoList")
        public java.util.List<GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList> subQuotaInfoList;

        @NameInMap("tenantId")
        public String tenantId;

        @NameInMap("type")
        public String type;

        @NameInMap("version")
        public String version;

        public static GetComputeEffectivePlanResponseBodyDataQuota build(java.util.Map<String, ?> map) throws Exception {
            GetComputeEffectivePlanResponseBodyDataQuota self = new GetComputeEffectivePlanResponseBodyDataQuota();
            return TeaModel.build(map, self);
        }

        public GetComputeEffectivePlanResponseBodyDataQuota setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetComputeEffectivePlanResponseBodyDataQuota setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetComputeEffectivePlanResponseBodyDataQuota setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetComputeEffectivePlanResponseBodyDataQuota setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetComputeEffectivePlanResponseBodyDataQuota setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetComputeEffectivePlanResponseBodyDataQuota setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetComputeEffectivePlanResponseBodyDataQuota setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public GetComputeEffectivePlanResponseBodyDataQuota setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetComputeEffectivePlanResponseBodyDataQuota setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetComputeEffectivePlanResponseBodyDataQuota setSubQuotaInfoList(java.util.List<GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList> subQuotaInfoList) {
            this.subQuotaInfoList = subQuotaInfoList;
            return this;
        }
        public java.util.List<GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList> getSubQuotaInfoList() {
            return this.subQuotaInfoList;
        }

        public GetComputeEffectivePlanResponseBodyDataQuota setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetComputeEffectivePlanResponseBodyDataQuota setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetComputeEffectivePlanResponseBodyDataQuota setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetComputeEffectivePlanResponseBodyData extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("isEffective")
        public Boolean isEffective;

        @NameInMap("name")
        public String name;

        @NameInMap("quota")
        public GetComputeEffectivePlanResponseBodyDataQuota quota;

        public static GetComputeEffectivePlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetComputeEffectivePlanResponseBodyData self = new GetComputeEffectivePlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetComputeEffectivePlanResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetComputeEffectivePlanResponseBodyData setIsEffective(Boolean isEffective) {
            this.isEffective = isEffective;
            return this;
        }
        public Boolean getIsEffective() {
            return this.isEffective;
        }

        public GetComputeEffectivePlanResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetComputeEffectivePlanResponseBodyData setQuota(GetComputeEffectivePlanResponseBodyDataQuota quota) {
            this.quota = quota;
            return this;
        }
        public GetComputeEffectivePlanResponseBodyDataQuota getQuota() {
            return this.quota;
        }

    }

}
