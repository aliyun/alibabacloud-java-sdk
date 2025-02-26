// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAndroidInstancesResponseBody extends TeaModel {
    /**
     * <p>The instances.</p>
     */
    @NameInMap("InstanceModel")
    public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModel> instanceModel;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kmma/xxE9WtwL/ADvZ****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F07A1DA1-E1EB-5CCA-8EED-12F85D32****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAndroidInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAndroidInstancesResponseBody self = new DescribeAndroidInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAndroidInstancesResponseBody setInstanceModel(java.util.List<DescribeAndroidInstancesResponseBodyInstanceModel> instanceModel) {
        this.instanceModel = instanceModel;
        return this;
    }
    public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModel> getInstanceModel() {
        return this.instanceModel;
    }

    public DescribeAndroidInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAndroidInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAndroidInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAndroidInstancesResponseBodyInstanceModelDisks extends TeaModel {
        /**
         * <p>The size of the disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The type of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        public static DescribeAndroidInstancesResponseBodyInstanceModelDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeAndroidInstancesResponseBodyInstanceModelDisks self = new DescribeAndroidInstancesResponseBodyInstanceModelDisks();
            return TeaModel.build(map, self);
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelDisks setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelDisks setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class DescribeAndroidInstancesResponseBodyInstanceModelTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAndroidInstancesResponseBodyInstanceModelTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeAndroidInstancesResponseBodyInstanceModelTags self = new DescribeAndroidInstancesResponseBodyInstanceModelTags();
            return TeaModel.build(map, self);
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModelTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAndroidInstancesResponseBodyInstanceModel extends TeaModel {
        /**
         * <p>The ID of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>ag-ayyhomlal7po****</p>
         */
        @NameInMap("AndroidInstanceGroupId")
        public String androidInstanceGroupId;

        /**
         * <p>The name of the instance group.</p>
         * 
         * <strong>example:</strong>
         * <p>AndroidInstanceGroupName</p>
         */
        @NameInMap("AndroidInstanceGroupName")
        public String androidInstanceGroupName;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-8at8h6ejkadjh****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("AndroidInstanceName")
        public String androidInstanceName;

        /**
         * <p>The state of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("AndroidInstanceStatus")
        public String androidInstanceStatus;

        /**
         * <p>The ID of the delivery group.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-i7yv6tkn7kh8dv****</p>
         */
        @NameInMap("AppInstanceGroupId")
        public String appInstanceGroupId;

        /**
         * <p>The ID of the physical instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-9ey6io0q58rcd****</p>
         */
        @NameInMap("AppInstanceId")
        public String appInstanceId;

        /**
         * <p>The ID of the user to whom the instance is assigned.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AuthorizedUserId")
        public String authorizedUserId;

        /**
         * <p>The ID of the bound user.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("BindUserId")
        public String bindUserId;

        /**
         * <p>The billing method of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The disks.</p>
         */
        @NameInMap("Disks")
        public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelDisks> disks;

        /**
         * <p>The cause of the instance data backup failure or restoration failure.</p>
         * 
         * <strong>example:</strong>
         * <p>FilePathNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-06 10:42:10</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the subscription instance group expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-15T02:03:33Z</p>
         */
        @NameInMap("GmtExpired")
        public String gmtExpired;

        /**
         * <p>The time when the instance was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-06 10:42:10</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The version of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5.3.867</p>
         */
        @NameInMap("ImageVersion")
        public String imageVersion;

        /**
         * <p>The type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>acp.basic.small</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>kp-5hh431emkpucs****</p>
         */
        @NameInMap("KeyPairId")
        public String keyPairId;

        /**
         * <p>The memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The IP address of the ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.22.48</p>
         */
        @NameInMap("NetworkInterfaceIp")
        public String networkInterfaceIp;

        @NameInMap("NetworkInterfaceIpv6Address")
        public String networkInterfaceIpv6Address;

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen+dir-211620****</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The ID of the persistent session.</p>
         * 
         * <strong>example:</strong>
         * <p>p-0btrd5zj8epo****</p>
         */
        @NameInMap("PersistentAppInstanceId")
        public String persistentAppInstanceId;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-0bszojpu0seql****</p>
         */
        @NameInMap("PolicyGroupId")
        public String policyGroupId;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.32.1.41</p>
         */
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        @NameInMap("PublicIpv6Address")
        public String publicIpv6Address;

        /**
         * <p>The progress of instance data backup or restoration.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Rate")
        public Integer rate;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The rendering type.</p>
         * 
         * <strong>example:</strong>
         * <p>local</p>
         */
        @NameInMap("RenderingType")
        public String renderingType;

        /**
         * <p>The status of the session connection.</p>
         * <ul>
         * <li>connect</li>
         * <li>disConnect</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>connect</p>
         */
        @NameInMap("SessionStatus")
        public String sessionStatus;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelTags> tags;

        public static DescribeAndroidInstancesResponseBodyInstanceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeAndroidInstancesResponseBodyInstanceModel self = new DescribeAndroidInstancesResponseBodyInstanceModel();
            return TeaModel.build(map, self);
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAndroidInstanceGroupId(String androidInstanceGroupId) {
            this.androidInstanceGroupId = androidInstanceGroupId;
            return this;
        }
        public String getAndroidInstanceGroupId() {
            return this.androidInstanceGroupId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAndroidInstanceGroupName(String androidInstanceGroupName) {
            this.androidInstanceGroupName = androidInstanceGroupName;
            return this;
        }
        public String getAndroidInstanceGroupName() {
            return this.androidInstanceGroupName;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAndroidInstanceName(String androidInstanceName) {
            this.androidInstanceName = androidInstanceName;
            return this;
        }
        public String getAndroidInstanceName() {
            return this.androidInstanceName;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAndroidInstanceStatus(String androidInstanceStatus) {
            this.androidInstanceStatus = androidInstanceStatus;
            return this;
        }
        public String getAndroidInstanceStatus() {
            return this.androidInstanceStatus;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAppInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAppInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }
        public String getAppInstanceId() {
            return this.appInstanceId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setAuthorizedUserId(String authorizedUserId) {
            this.authorizedUserId = authorizedUserId;
            return this;
        }
        public String getAuthorizedUserId() {
            return this.authorizedUserId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setBindUserId(String bindUserId) {
            this.bindUserId = bindUserId;
            return this;
        }
        public String getBindUserId() {
            return this.bindUserId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setDisks(java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelDisks> getDisks() {
            return this.disks;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setGmtExpired(String gmtExpired) {
            this.gmtExpired = gmtExpired;
            return this;
        }
        public String getGmtExpired() {
            return this.gmtExpired;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setKeyPairId(String keyPairId) {
            this.keyPairId = keyPairId;
            return this;
        }
        public String getKeyPairId() {
            return this.keyPairId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setNetworkInterfaceIp(String networkInterfaceIp) {
            this.networkInterfaceIp = networkInterfaceIp;
            return this;
        }
        public String getNetworkInterfaceIp() {
            return this.networkInterfaceIp;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setNetworkInterfaceIpv6Address(String networkInterfaceIpv6Address) {
            this.networkInterfaceIpv6Address = networkInterfaceIpv6Address;
            return this;
        }
        public String getNetworkInterfaceIpv6Address() {
            return this.networkInterfaceIpv6Address;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setPersistentAppInstanceId(String persistentAppInstanceId) {
            this.persistentAppInstanceId = persistentAppInstanceId;
            return this;
        }
        public String getPersistentAppInstanceId() {
            return this.persistentAppInstanceId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setPolicyGroupId(String policyGroupId) {
            this.policyGroupId = policyGroupId;
            return this;
        }
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setPublicIpv6Address(String publicIpv6Address) {
            this.publicIpv6Address = publicIpv6Address;
            return this;
        }
        public String getPublicIpv6Address() {
            return this.publicIpv6Address;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setRenderingType(String renderingType) {
            this.renderingType = renderingType;
            return this;
        }
        public String getRenderingType() {
            return this.renderingType;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setSessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }
        public String getSessionStatus() {
            return this.sessionStatus;
        }

        public DescribeAndroidInstancesResponseBodyInstanceModel setTags(java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeAndroidInstancesResponseBodyInstanceModelTags> getTags() {
            return this.tags;
        }

    }

}
