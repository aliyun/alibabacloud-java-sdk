// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaResponseBody extends TeaModel {
    @NameInMap("billingPolicy")
    public GetQuotaResponseBodyBillingPolicy billingPolicy;

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

    @NameInMap("parentId")
    public String parentId;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("status")
    public String status;

    @NameInMap("subQuotaInfoList")
    public java.util.List<GetQuotaResponseBodySubQuotaInfoList> subQuotaInfoList;

    @NameInMap("tag")
    public String tag;

    @NameInMap("tenantId")
    public String tenantId;

    // 对应控制集群的resourceSystemType字段
    @NameInMap("type")
    public String type;

    @NameInMap("version")
    public String version;

    public static GetQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaResponseBody self = new GetQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaResponseBody setBillingPolicy(GetQuotaResponseBodyBillingPolicy billingPolicy) {
        this.billingPolicy = billingPolicy;
        return this;
    }
    public GetQuotaResponseBodyBillingPolicy getBillingPolicy() {
        return this.billingPolicy;
    }

    public GetQuotaResponseBody setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public GetQuotaResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetQuotaResponseBody setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public GetQuotaResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetQuotaResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetQuotaResponseBody setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public GetQuotaResponseBody setParameter(java.util.Map<String, ?> parameter) {
        this.parameter = parameter;
        return this;
    }
    public java.util.Map<String, ?> getParameter() {
        return this.parameter;
    }

    public GetQuotaResponseBody setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public GetQuotaResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetQuotaResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetQuotaResponseBody setSubQuotaInfoList(java.util.List<GetQuotaResponseBodySubQuotaInfoList> subQuotaInfoList) {
        this.subQuotaInfoList = subQuotaInfoList;
        return this;
    }
    public java.util.List<GetQuotaResponseBodySubQuotaInfoList> getSubQuotaInfoList() {
        return this.subQuotaInfoList;
    }

    public GetQuotaResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public GetQuotaResponseBody setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetQuotaResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetQuotaResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class GetQuotaResponseBodyBillingPolicy extends TeaModel {
        // "PAYASYOUGO" 表示后付费
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        public static GetQuotaResponseBodyBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodyBillingPolicy self = new GetQuotaResponseBodyBillingPolicy();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodyBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public GetQuotaResponseBodyBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

    }

    public static class GetQuotaResponseBodySubQuotaInfoListBillingPolicy extends TeaModel {
        // "PAYASYOUGO" 表示后付费
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        public static GetQuotaResponseBodySubQuotaInfoListBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodySubQuotaInfoListBillingPolicy self = new GetQuotaResponseBodySubQuotaInfoListBillingPolicy();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodySubQuotaInfoListBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public GetQuotaResponseBodySubQuotaInfoListBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

    }

    public static class GetQuotaResponseBodySubQuotaInfoList extends TeaModel {
        @NameInMap("billingPolicy")
        public GetQuotaResponseBodySubQuotaInfoListBillingPolicy billingPolicy;

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

        @NameInMap("parentId")
        public String parentId;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("status")
        public String status;

        @NameInMap("tag")
        public String tag;

        @NameInMap("tenantId")
        public String tenantId;

        // 对应控制集群的resourceSystemType字段
        @NameInMap("type")
        public String type;

        @NameInMap("version")
        public String version;

        public static GetQuotaResponseBodySubQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetQuotaResponseBodySubQuotaInfoList self = new GetQuotaResponseBodySubQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public GetQuotaResponseBodySubQuotaInfoList setBillingPolicy(GetQuotaResponseBodySubQuotaInfoListBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public GetQuotaResponseBodySubQuotaInfoListBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public GetQuotaResponseBodySubQuotaInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public GetQuotaResponseBodySubQuotaInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetQuotaResponseBodySubQuotaInfoList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetQuotaResponseBodySubQuotaInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetQuotaResponseBodySubQuotaInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQuotaResponseBodySubQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetQuotaResponseBodySubQuotaInfoList setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public GetQuotaResponseBodySubQuotaInfoList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetQuotaResponseBodySubQuotaInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetQuotaResponseBodySubQuotaInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetQuotaResponseBodySubQuotaInfoList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetQuotaResponseBodySubQuotaInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetQuotaResponseBodySubQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetQuotaResponseBodySubQuotaInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
