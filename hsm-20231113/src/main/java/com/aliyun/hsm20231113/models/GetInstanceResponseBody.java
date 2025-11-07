// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The information about the HSM.</p>
     */
    @NameInMap("Instance")
    public GetInstanceResponseBodyInstance instance;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setInstance(GetInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public GetInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceResponseBodyInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>GM/T0028_LEVEL_2</p>
         */
        @NameInMap("Certification")
        public String certification;

        @NameInMap("CertificationUrl")
        public String certificationUrl;

        /**
         * <p>The ID of the cluster to which the HSM belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster-w3G9vOJI2****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster_online</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The time when the HSM was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1699515963000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The type of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>jnta.SJJ1528-G</p>
         */
        @NameInMap("DeviceType")
        public String deviceType;

        /**
         * <p>The time when the HSM expired.</p>
         * 
         * <strong>example:</strong>
         * <p>1699496389720</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The ID of the HSM.</p>
         * 
         * <strong>example:</strong>
         * <p>hsm-cn-g4t3jwsc****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The IP address of the HSM in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>10.192.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>Indicates whether the HSM is for trial use. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsTrial")
        public Boolean isTrial;

        /**
         * <p>Indicates whether the HSM is a master HSM. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Master")
        public Boolean master;

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>23576634952****</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PqcEnabled")
        public Integer pqcEnabled;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The description of the HSM.</p>
         * 
         * <strong>example:</strong>
         * <p>hsmOnline</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the HSM. Valid values:</p>
         * <ul>
         * <li>PENDING: The HSM is disabled.</li>
         * <li>ACTIVE: The HSM is enabled.</li>
         * <li>EXPIRED: The HSM expired.</li>
         * <li>INVALID: The HSM is invalid.</li>
         * <li>FAILURE: The HSM failed to be created.</li>
         * <li>RESET: The HSM is being reset.</li>
         * <li>PAUSED: The HSM is paused.</li>
         * <li>MODIFYING: The HSM is being modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXPIRED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of HSMs that is classified based on resource isolation. Valid values: </p>
         * <ul>
         * <li>vsm: Virtual security modules (VSMs)</li>
         * <li>hostedHsm: Dedicated HSMs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsm</p>
         */
        @NameInMap("TenantIsolationType")
        public String tenantIsolationType;

        @NameInMap("TpsEnabled")
        public Integer tpsEnabled;

        /**
         * <p>The ID of the vSwitch that is configured for the HSM.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1mvfs31ltt0wyhf****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The information about the vendor.</p>
         * 
         * <strong>example:</strong>
         * <p>jnta</p>
         */
        @NameInMap("Vendor")
        public String vendor;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the HSM belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf69i66j9kmoko52p****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The IP addresses in the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>18.68.XX.XX</p>
         */
        @NameInMap("Whitelist")
        public String whitelist;

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstance self = new GetInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstance setCertification(String certification) {
            this.certification = certification;
            return this;
        }
        public String getCertification() {
            return this.certification;
        }

        public GetInstanceResponseBodyInstance setCertificationUrl(String certificationUrl) {
            this.certificationUrl = certificationUrl;
            return this;
        }
        public String getCertificationUrl() {
            return this.certificationUrl;
        }

        public GetInstanceResponseBodyInstance setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetInstanceResponseBodyInstance setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public GetInstanceResponseBodyInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetInstanceResponseBodyInstance setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public GetInstanceResponseBodyInstance setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public GetInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyInstance setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetInstanceResponseBodyInstance setIsTrial(Boolean isTrial) {
            this.isTrial = isTrial;
            return this;
        }
        public Boolean getIsTrial() {
            return this.isTrial;
        }

        public GetInstanceResponseBodyInstance setMaster(Boolean master) {
            this.master = master;
            return this;
        }
        public Boolean getMaster() {
            return this.master;
        }

        public GetInstanceResponseBodyInstance setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public GetInstanceResponseBodyInstance setPqcEnabled(Integer pqcEnabled) {
            this.pqcEnabled = pqcEnabled;
            return this;
        }
        public Integer getPqcEnabled() {
            return this.pqcEnabled;
        }

        public GetInstanceResponseBodyInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetInstanceResponseBodyInstance setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetInstanceResponseBodyInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInstanceResponseBodyInstance setTenantIsolationType(String tenantIsolationType) {
            this.tenantIsolationType = tenantIsolationType;
            return this;
        }
        public String getTenantIsolationType() {
            return this.tenantIsolationType;
        }

        public GetInstanceResponseBodyInstance setTpsEnabled(Integer tpsEnabled) {
            this.tpsEnabled = tpsEnabled;
            return this;
        }
        public Integer getTpsEnabled() {
            return this.tpsEnabled;
        }

        public GetInstanceResponseBodyInstance setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetInstanceResponseBodyInstance setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public GetInstanceResponseBodyInstance setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetInstanceResponseBodyInstance setWhitelist(String whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public String getWhitelist() {
            return this.whitelist;
        }

        public GetInstanceResponseBodyInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
