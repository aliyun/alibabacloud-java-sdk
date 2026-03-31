// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListComputeQuotaPlanResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public ListComputeQuotaPlanResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OBJECT_NOT_EXIST</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>This object does not exist.</p>
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
     * <p>0bc3b4ae16685836687916212e7850</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListComputeQuotaPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComputeQuotaPlanResponseBody self = new ListComputeQuotaPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComputeQuotaPlanResponseBody setData(ListComputeQuotaPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListComputeQuotaPlanResponseBodyData getData() {
        return this.data;
    }

    public ListComputeQuotaPlanResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListComputeQuotaPlanResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListComputeQuotaPlanResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListComputeQuotaPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListComputeQuotaPlanResponseBodyDataPlanListQuotaParameter extends TeaModel {
        @NameInMap("elasticReservedCU")
        public Long elasticReservedCU;

        @NameInMap("maxCU")
        public Long maxCU;

        @NameInMap("minCU")
        public Long minCU;

        public static ListComputeQuotaPlanResponseBodyDataPlanListQuotaParameter build(java.util.Map<String, ?> map) throws Exception {
            ListComputeQuotaPlanResponseBodyDataPlanListQuotaParameter self = new ListComputeQuotaPlanResponseBodyDataPlanListQuotaParameter();
            return TeaModel.build(map, self);
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaParameter setElasticReservedCU(Long elasticReservedCU) {
            this.elasticReservedCU = elasticReservedCU;
            return this;
        }
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaParameter setMaxCU(Long maxCU) {
            this.maxCU = maxCU;
            return this;
        }
        public Long getMaxCU() {
            return this.maxCU;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaParameter setMinCU(Long minCU) {
            this.minCU = minCU;
            return this;
        }
        public Long getMinCU() {
            return this.minCU;
        }

    }

    public static class ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoListParameter extends TeaModel {
        @NameInMap("elasticReservedCU")
        public Long elasticReservedCU;

        @NameInMap("maxCU")
        public Long maxCU;

        @NameInMap("minCU")
        public Long minCU;

        public static ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoListParameter build(java.util.Map<String, ?> map) throws Exception {
            ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoListParameter self = new ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoListParameter();
            return TeaModel.build(map, self);
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoListParameter setElasticReservedCU(Long elasticReservedCU) {
            this.elasticReservedCU = elasticReservedCU;
            return this;
        }
        public Long getElasticReservedCU() {
            return this.elasticReservedCU;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoListParameter setMaxCU(Long maxCU) {
            this.maxCU = maxCU;
            return this;
        }
        public Long getMaxCU() {
            return this.maxCU;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoListParameter setMinCU(Long minCU) {
            this.minCU = minCU;
            return this;
        }
        public Long getMinCU() {
            return this.minCU;
        }

    }

    public static class ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList extends TeaModel {
        /**
         * <p>Cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AT-120N</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1730946421757</p>
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
         * <p>6790</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the level-2 quota.</p>
         * 
         * <strong>example:</strong>
         * <p>dp_cn_shanghai_1702627945_p</p>
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
        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoListParameter parameter;

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
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>2056</p>
         */
        @NameInMap("version")
        public String version;

        public static ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList self = new ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList setParameter(ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoListParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoListParameter getParameter() {
            return this.parameter;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListComputeQuotaPlanResponseBodyDataPlanListQuota extends TeaModel {
        /**
         * <p>Cluster ID.</p>
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
         * <p>1730247361356</p>
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
         * <p>186</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the level-1 quota.</p>
         * 
         * <strong>example:</strong>
         * <p>dp_cn_hangzhou_1717465943_p</p>
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
         * <p>The description of the level-1 quota.</p>
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
        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaParameter parameter;

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
         * <p>The list of subquotas.</p>
         */
        @NameInMap("subQuotaInfoList")
        public java.util.List<ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList> subQuotaInfoList;

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
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>2056</p>
         */
        @NameInMap("version")
        public String version;

        public static ListComputeQuotaPlanResponseBodyDataPlanListQuota build(java.util.Map<String, ?> map) throws Exception {
            ListComputeQuotaPlanResponseBodyDataPlanListQuota self = new ListComputeQuotaPlanResponseBodyDataPlanListQuota();
            return TeaModel.build(map, self);
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuota setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuota setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuota setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuota setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuota setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuota setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuota setParameter(ListComputeQuotaPlanResponseBodyDataPlanListQuotaParameter parameter) {
            this.parameter = parameter;
            return this;
        }
        public ListComputeQuotaPlanResponseBodyDataPlanListQuotaParameter getParameter() {
            return this.parameter;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuota setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuota setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuota setSubQuotaInfoList(java.util.List<ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList> subQuotaInfoList) {
            this.subQuotaInfoList = subQuotaInfoList;
            return this;
        }
        public java.util.List<ListComputeQuotaPlanResponseBodyDataPlanListQuotaSubQuotaInfoList> getSubQuotaInfoList() {
            return this.subQuotaInfoList;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuota setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuota setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanListQuota setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListComputeQuotaPlanResponseBodyDataPlanList extends TeaModel {
        /**
         * <p>The time when the quota plan was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1731394621890</p>
         */
        @NameInMap("createTime")
        public String createTime;

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
        public ListComputeQuotaPlanResponseBodyDataPlanListQuota quota;

        public static ListComputeQuotaPlanResponseBodyDataPlanList build(java.util.Map<String, ?> map) throws Exception {
            ListComputeQuotaPlanResponseBodyDataPlanList self = new ListComputeQuotaPlanResponseBodyDataPlanList();
            return TeaModel.build(map, self);
        }

        public ListComputeQuotaPlanResponseBodyDataPlanList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListComputeQuotaPlanResponseBodyDataPlanList setQuota(ListComputeQuotaPlanResponseBodyDataPlanListQuota quota) {
            this.quota = quota;
            return this;
        }
        public ListComputeQuotaPlanResponseBodyDataPlanListQuota getQuota() {
            return this.quota;
        }

    }

    public static class ListComputeQuotaPlanResponseBodyData extends TeaModel {
        /**
         * <p>The list of quota plan.</p>
         */
        @NameInMap("planList")
        public java.util.List<ListComputeQuotaPlanResponseBodyDataPlanList> planList;

        public static ListComputeQuotaPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListComputeQuotaPlanResponseBodyData self = new ListComputeQuotaPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListComputeQuotaPlanResponseBodyData setPlanList(java.util.List<ListComputeQuotaPlanResponseBodyDataPlanList> planList) {
            this.planList = planList;
            return this;
        }
        public java.util.List<ListComputeQuotaPlanResponseBodyDataPlanList> getPlanList() {
            return this.planList;
        }

    }

}
