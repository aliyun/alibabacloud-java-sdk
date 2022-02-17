// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetEnvironmentLicenseResponseBody extends TeaModel {
    // 错误码
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetEnvironmentLicenseResponseBodyData data;

    // 错误信息
    @NameInMap("msg")
    public String msg;

    public static GetEnvironmentLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentLicenseResponseBody self = new GetEnvironmentLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentLicenseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEnvironmentLicenseResponseBody setData(GetEnvironmentLicenseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnvironmentLicenseResponseBodyData getData() {
        return this.data;
    }

    public GetEnvironmentLicenseResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota extends TeaModel {
        // cpu核数限制
        @NameInMap("cpuCoreLimit")
        public Long cpuCoreLimit;

        public static GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota self = new GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota setCpuCoreLimit(Long cpuCoreLimit) {
            this.cpuCoreLimit = cpuCoreLimit;
            return this;
        }
        public Long getCpuCoreLimit() {
            return this.cpuCoreLimit;
        }

    }

    public static class GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas extends TeaModel {
        // 组件名
        @NameInMap("componentName")
        public String componentName;

        // 组件来源
        @NameInMap("componentSource")
        public String componentSource;

        // 实例数限制
        @NameInMap("instanceLimit")
        public Long instanceLimit;

        public static GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas self = new GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas setComponentSource(String componentSource) {
            this.componentSource = componentSource;
            return this;
        }
        public String getComponentSource() {
            return this.componentSource;
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas setInstanceLimit(Long instanceLimit) {
            this.instanceLimit = instanceLimit;
            return this;
        }
        public Long getInstanceLimit() {
            return this.instanceLimit;
        }

    }

    public static class GetEnvironmentLicenseResponseBodyDataLicenseQuota extends TeaModel {
        // 集群配额
        @NameInMap("clusterQuota")
        public GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota clusterQuota;

        // 组件配额
        @NameInMap("componentQuotas")
        public java.util.List<GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas> componentQuotas;

        public static GetEnvironmentLicenseResponseBodyDataLicenseQuota build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentLicenseResponseBodyDataLicenseQuota self = new GetEnvironmentLicenseResponseBodyDataLicenseQuota();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuota setClusterQuota(GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota clusterQuota) {
            this.clusterQuota = clusterQuota;
            return this;
        }
        public GetEnvironmentLicenseResponseBodyDataLicenseQuotaClusterQuota getClusterQuota() {
            return this.clusterQuota;
        }

        public GetEnvironmentLicenseResponseBodyDataLicenseQuota setComponentQuotas(java.util.List<GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas> componentQuotas) {
            this.componentQuotas = componentQuotas;
            return this;
        }
        public java.util.List<GetEnvironmentLicenseResponseBodyDataLicenseQuotaComponentQuotas> getComponentQuotas() {
            return this.componentQuotas;
        }

    }

    public static class GetEnvironmentLicenseResponseBodyData extends TeaModel {
        // 过期时间
        @NameInMap("expireTime")
        public String expireTime;

        // license内容
        @NameInMap("licenseKey")
        public String licenseKey;

        // license配额
        @NameInMap("licenseQuota")
        public GetEnvironmentLicenseResponseBodyDataLicenseQuota licenseQuota;

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

        public static GetEnvironmentLicenseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentLicenseResponseBodyData self = new GetEnvironmentLicenseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentLicenseResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetEnvironmentLicenseResponseBodyData setLicenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }
        public String getLicenseKey() {
            return this.licenseKey;
        }

        public GetEnvironmentLicenseResponseBodyData setLicenseQuota(GetEnvironmentLicenseResponseBodyDataLicenseQuota licenseQuota) {
            this.licenseQuota = licenseQuota;
            return this;
        }
        public GetEnvironmentLicenseResponseBodyDataLicenseQuota getLicenseQuota() {
            return this.licenseQuota;
        }

        public GetEnvironmentLicenseResponseBodyData setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
            return this;
        }
        public String getRejectReason() {
            return this.rejectReason;
        }

        public GetEnvironmentLicenseResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEnvironmentLicenseResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetEnvironmentLicenseResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
