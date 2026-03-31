// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetComputeEffectivePlanResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public GetComputeEffectivePlanResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>688003E1-D1B4-5468-957E-2FFB3AC8D79B</p>
     */
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
        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>AT-120N</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>The time when the resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1718155201628</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the resource.</p>
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
         * <p>os_MyQuota</p>
         */
        @NameInMap("nickName")
        public String nickName;

        /**
         * <p>The description of the level-2 quota.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;enablePriority&quot;: false,
         *   &quot;minCU&quot;: 25,
         *   &quot;adhocCU&quot;: 0,
         *   &quot;elasticReservedCU&quot;: 0,
         *   &quot;forceReservedMin&quot;: false,
         *   &quot;maxCU&quot;: 50,
         *   &quot;schedulerType&quot;: &quot;Fifo&quot;
         * }</p>
         */
        @NameInMap("parameter")
        public java.util.Map<String, ?> parameter;

        /**
         * <p>The region ID.</p>
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
         * <p>The ID of the tenant.</p>
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
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1386</p>
         */
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
        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>AT-120N</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>The time when the level-1 quota was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1719886322347</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the resource.</p>
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
         * <p>dp_cn_shanghai_1699533470_p</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The nickname of the level-1 quota.</p>
         * 
         * <strong>example:</strong>
         * <p>os_MyQuota_p</p>
         */
        @NameInMap("nickName")
        public String nickName;

        /**
         * <p>The description of the level-2 quota.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;enablePriority&quot;: false,
         *   &quot;minCU&quot;: 25,
         *   &quot;adhocCU&quot;: 0,
         *   &quot;elasticReservedCU&quot;: 0,
         *   &quot;forceReservedMin&quot;: false,
         *   &quot;maxCU&quot;: 50,
         *   &quot;schedulerType&quot;: &quot;Fifo&quot;
         * }</p>
         */
        @NameInMap("parameter")
        public java.util.Map<String, ?> parameter;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The status of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The list of subquotas.</p>
         */
        @NameInMap("subQuotaInfoList")
        public java.util.List<GetComputeEffectivePlanResponseBodyDataQuotaSubQuotaInfoList> subQuotaInfoList;

        /**
         * <p>The ID of the tenant.</p>
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
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1964</p>
         */
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
        /**
         * <p>The time when the quota plan was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1714356241163</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>Whether it is currently effective.</p>
         * <blockquote>
         * <p>A Quota plan that has taken effect cannot be deleted, i.e., isEffective=true</p>
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
