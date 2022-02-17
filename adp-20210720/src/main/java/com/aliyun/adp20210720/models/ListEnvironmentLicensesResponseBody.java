// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListEnvironmentLicensesResponseBody extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    // 业务数据
    @NameInMap("data")
    public ListEnvironmentLicensesResponseBodyData data;

    // 错误信息
    @NameInMap("msg")
    public String msg;

    public static ListEnvironmentLicensesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentLicensesResponseBody self = new ListEnvironmentLicensesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentLicensesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEnvironmentLicensesResponseBody setData(ListEnvironmentLicensesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentLicensesResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentLicensesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListEnvironmentLicensesResponseBodyDataListLicenseQuotaClusterQuota extends TeaModel {
        // cpu核数限制
        @NameInMap("cpuCoreLimit")
        public Integer cpuCoreLimit;

        public static ListEnvironmentLicensesResponseBodyDataListLicenseQuotaClusterQuota build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentLicensesResponseBodyDataListLicenseQuotaClusterQuota self = new ListEnvironmentLicensesResponseBodyDataListLicenseQuotaClusterQuota();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentLicensesResponseBodyDataListLicenseQuotaClusterQuota setCpuCoreLimit(Integer cpuCoreLimit) {
            this.cpuCoreLimit = cpuCoreLimit;
            return this;
        }
        public Integer getCpuCoreLimit() {
            return this.cpuCoreLimit;
        }

    }

    public static class ListEnvironmentLicensesResponseBodyDataListLicenseQuotaComponentQuotas extends TeaModel {
        // 组件名
        @NameInMap("componentName")
        public String componentName;

        // 组件来源
        @NameInMap("componentSource")
        public String componentSource;

        // 实例数限制
        @NameInMap("instanceLimit")
        public Integer instanceLimit;

        public static ListEnvironmentLicensesResponseBodyDataListLicenseQuotaComponentQuotas build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentLicensesResponseBodyDataListLicenseQuotaComponentQuotas self = new ListEnvironmentLicensesResponseBodyDataListLicenseQuotaComponentQuotas();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentLicensesResponseBodyDataListLicenseQuotaComponentQuotas setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ListEnvironmentLicensesResponseBodyDataListLicenseQuotaComponentQuotas setComponentSource(String componentSource) {
            this.componentSource = componentSource;
            return this;
        }
        public String getComponentSource() {
            return this.componentSource;
        }

        public ListEnvironmentLicensesResponseBodyDataListLicenseQuotaComponentQuotas setInstanceLimit(Integer instanceLimit) {
            this.instanceLimit = instanceLimit;
            return this;
        }
        public Integer getInstanceLimit() {
            return this.instanceLimit;
        }

    }

    public static class ListEnvironmentLicensesResponseBodyDataListLicenseQuota extends TeaModel {
        // 集群配额
        @NameInMap("clusterQuota")
        public ListEnvironmentLicensesResponseBodyDataListLicenseQuotaClusterQuota clusterQuota;

        // 组件配额
        @NameInMap("componentQuotas")
        public java.util.List<ListEnvironmentLicensesResponseBodyDataListLicenseQuotaComponentQuotas> componentQuotas;

        public static ListEnvironmentLicensesResponseBodyDataListLicenseQuota build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentLicensesResponseBodyDataListLicenseQuota self = new ListEnvironmentLicensesResponseBodyDataListLicenseQuota();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentLicensesResponseBodyDataListLicenseQuota setClusterQuota(ListEnvironmentLicensesResponseBodyDataListLicenseQuotaClusterQuota clusterQuota) {
            this.clusterQuota = clusterQuota;
            return this;
        }
        public ListEnvironmentLicensesResponseBodyDataListLicenseQuotaClusterQuota getClusterQuota() {
            return this.clusterQuota;
        }

        public ListEnvironmentLicensesResponseBodyDataListLicenseQuota setComponentQuotas(java.util.List<ListEnvironmentLicensesResponseBodyDataListLicenseQuotaComponentQuotas> componentQuotas) {
            this.componentQuotas = componentQuotas;
            return this;
        }
        public java.util.List<ListEnvironmentLicensesResponseBodyDataListLicenseQuotaComponentQuotas> getComponentQuotas() {
            return this.componentQuotas;
        }

    }

    public static class ListEnvironmentLicensesResponseBodyDataList extends TeaModel {
        // 过期时间
        @NameInMap("expireTime")
        public String expireTime;

        // license内容
        @NameInMap("licenseKey")
        public String licenseKey;

        // license配额
        @NameInMap("licenseQuota")
        public ListEnvironmentLicensesResponseBodyDataListLicenseQuota licenseQuota;

        // 拒绝原因
        @NameInMap("rejectReason")
        public String rejectReason;

        // 状态
        @NameInMap("status")
        public String status;

        // 类型
        @NameInMap("type")
        public String type;

        // license uid
        @NameInMap("uid")
        public String uid;

        public static ListEnvironmentLicensesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentLicensesResponseBodyDataList self = new ListEnvironmentLicensesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentLicensesResponseBodyDataList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListEnvironmentLicensesResponseBodyDataList setLicenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public String getLicenseKey() {
            return this.licenseKey;
        }

        public ListEnvironmentLicensesResponseBodyDataList setLicenseQuota(ListEnvironmentLicensesResponseBodyDataListLicenseQuota licenseQuota) {
            this.licenseQuota = licenseQuota;
            return this;
        }
        public ListEnvironmentLicensesResponseBodyDataListLicenseQuota getLicenseQuota() {
            return this.licenseQuota;
        }

        public ListEnvironmentLicensesResponseBodyDataList setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
            return this;
        }
        public String getRejectReason() {
            return this.rejectReason;
        }

        public ListEnvironmentLicensesResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListEnvironmentLicensesResponseBodyDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListEnvironmentLicensesResponseBodyDataList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

    public static class ListEnvironmentLicensesResponseBodyData extends TeaModel {
        // license列表
        @NameInMap("list")
        public java.util.List<ListEnvironmentLicensesResponseBodyDataList> list;

        // 页码
        @NameInMap("pageNum")
        public Integer pageNum;

        // 页大小
        @NameInMap("pageSize")
        public Integer pageSize;

        // 总数
        @NameInMap("total")
        public Integer total;

        public static ListEnvironmentLicensesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentLicensesResponseBodyData self = new ListEnvironmentLicensesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentLicensesResponseBodyData setList(java.util.List<ListEnvironmentLicensesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListEnvironmentLicensesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListEnvironmentLicensesResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListEnvironmentLicensesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListEnvironmentLicensesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
