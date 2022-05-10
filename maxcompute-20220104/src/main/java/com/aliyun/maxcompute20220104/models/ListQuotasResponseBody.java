// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListQuotasResponseBody extends TeaModel {
    @NameInMap("marker")
    public String marker;

    @NameInMap("maxItem")
    public Long maxItem;

    @NameInMap("quotaInfoList")
    public java.util.List<ListQuotasResponseBodyQuotaInfoList> quotaInfoList;

    public static ListQuotasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQuotasResponseBody self = new ListQuotasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQuotasResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListQuotasResponseBody setMaxItem(Long maxItem) {
        this.maxItem = maxItem;
        return this;
    }
    public Long getMaxItem() {
        return this.maxItem;
    }

    public ListQuotasResponseBody setQuotaInfoList(java.util.List<ListQuotasResponseBodyQuotaInfoList> quotaInfoList) {
        this.quotaInfoList = quotaInfoList;
        return this;
    }
    public java.util.List<ListQuotasResponseBodyQuotaInfoList> getQuotaInfoList() {
        return this.quotaInfoList;
    }

    public static class ListQuotasResponseBodyQuotaInfoListBillingPolicy extends TeaModel {
        // "PAYASYOUGO" 表示后付费
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        public static ListQuotasResponseBodyQuotaInfoListBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotaInfoListBillingPolicy self = new ListQuotasResponseBodyQuotaInfoListBillingPolicy();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotaInfoListBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public ListQuotasResponseBodyQuotaInfoListBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

    }

    public static class ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy extends TeaModel {
        // "PAYASYOUGO" 表示后付费
        @NameInMap("billingMethod")
        public String billingMethod;

        @NameInMap("odpsSpecCode")
        public String odpsSpecCode;

        public static ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy self = new ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy setBillingMethod(String billingMethod) {
            this.billingMethod = billingMethod;
            return this;
        }
        public String getBillingMethod() {
            return this.billingMethod;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy setOdpsSpecCode(String odpsSpecCode) {
            this.odpsSpecCode = odpsSpecCode;
            return this;
        }
        public String getOdpsSpecCode() {
            return this.odpsSpecCode;
        }

    }

    public static class ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList extends TeaModel {
        @NameInMap("billingPolicy")
        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy billingPolicy;

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

        public static ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList self = new ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setBillingPolicy(ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoListBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListQuotasResponseBodyQuotaInfoList extends TeaModel {
        @NameInMap("billingPolicy")
        public ListQuotasResponseBodyQuotaInfoListBillingPolicy billingPolicy;

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
        public java.util.List<ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList> subQuotaInfoList;

        @NameInMap("tag")
        public String tag;

        @NameInMap("tenantId")
        public String tenantId;

        // 对应控制集群的resourceSystemType字段
        @NameInMap("type")
        public String type;

        @NameInMap("version")
        public String version;

        public static ListQuotasResponseBodyQuotaInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListQuotasResponseBodyQuotaInfoList self = new ListQuotasResponseBodyQuotaInfoList();
            return TeaModel.build(map, self);
        }

        public ListQuotasResponseBodyQuotaInfoList setBillingPolicy(ListQuotasResponseBodyQuotaInfoListBillingPolicy billingPolicy) {
            this.billingPolicy = billingPolicy;
            return this;
        }
        public ListQuotasResponseBodyQuotaInfoListBillingPolicy getBillingPolicy() {
            return this.billingPolicy;
        }

        public ListQuotasResponseBodyQuotaInfoList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListQuotasResponseBodyQuotaInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListQuotasResponseBodyQuotaInfoList setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListQuotasResponseBodyQuotaInfoList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListQuotasResponseBodyQuotaInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQuotasResponseBodyQuotaInfoList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListQuotasResponseBodyQuotaInfoList setParameter(java.util.Map<String, ?> parameter) {
            this.parameter = parameter;
            return this;
        }
        public java.util.Map<String, ?> getParameter() {
            return this.parameter;
        }

        public ListQuotasResponseBodyQuotaInfoList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListQuotasResponseBodyQuotaInfoList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListQuotasResponseBodyQuotaInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListQuotasResponseBodyQuotaInfoList setSubQuotaInfoList(java.util.List<ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList> subQuotaInfoList) {
            this.subQuotaInfoList = subQuotaInfoList;
            return this;
        }
        public java.util.List<ListQuotasResponseBodyQuotaInfoListSubQuotaInfoList> getSubQuotaInfoList() {
            return this.subQuotaInfoList;
        }

        public ListQuotasResponseBodyQuotaInfoList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListQuotasResponseBodyQuotaInfoList setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListQuotasResponseBodyQuotaInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListQuotasResponseBodyQuotaInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
