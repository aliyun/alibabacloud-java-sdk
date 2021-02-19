// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaiAllRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("EaiInstanceType")
    public String eaiInstanceType;

    @NameInMap("ClientVSwitchId")
    public String clientVSwitchId;

    @NameInMap("ClientSecurityGroupId")
    public String clientSecurityGroupId;

    @NameInMap("ClientImageId")
    public String clientImageId;

    @NameInMap("ClientInstanceType")
    public String clientInstanceType;

    @NameInMap("ClientZoneId")
    public String clientZoneId;

    @NameInMap("ClientInstanceName")
    public String clientInstanceName;

    @NameInMap("ClientPassword")
    public String clientPassword;

    @NameInMap("ClientInternetMaxBandwidthIn")
    public Integer clientInternetMaxBandwidthIn;

    @NameInMap("ClientInternetMaxBandwidthOut")
    public Integer clientInternetMaxBandwidthOut;

    @NameInMap("ClientSystemDiskCategory")
    public String clientSystemDiskCategory;

    @NameInMap("ClientSystemDiskSize")
    public Integer clientSystemDiskSize;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceName")
    public String instanceName;

    public static CreateEaiAllRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEaiAllRequest self = new CreateEaiAllRequest();
        return TeaModel.build(map, self);
    }

    public CreateEaiAllRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEaiAllRequest setEaiInstanceType(String eaiInstanceType) {
        this.eaiInstanceType = eaiInstanceType;
        return this;
    }
    public String getEaiInstanceType() {
        return this.eaiInstanceType;
    }

    public CreateEaiAllRequest setClientVSwitchId(String clientVSwitchId) {
        this.clientVSwitchId = clientVSwitchId;
        return this;
    }
    public String getClientVSwitchId() {
        return this.clientVSwitchId;
    }

    public CreateEaiAllRequest setClientSecurityGroupId(String clientSecurityGroupId) {
        this.clientSecurityGroupId = clientSecurityGroupId;
        return this;
    }
    public String getClientSecurityGroupId() {
        return this.clientSecurityGroupId;
    }

    public CreateEaiAllRequest setClientImageId(String clientImageId) {
        this.clientImageId = clientImageId;
        return this;
    }
    public String getClientImageId() {
        return this.clientImageId;
    }

    public CreateEaiAllRequest setClientInstanceType(String clientInstanceType) {
        this.clientInstanceType = clientInstanceType;
        return this;
    }
    public String getClientInstanceType() {
        return this.clientInstanceType;
    }

    public CreateEaiAllRequest setClientZoneId(String clientZoneId) {
        this.clientZoneId = clientZoneId;
        return this;
    }
    public String getClientZoneId() {
        return this.clientZoneId;
    }

    public CreateEaiAllRequest setClientInstanceName(String clientInstanceName) {
        this.clientInstanceName = clientInstanceName;
        return this;
    }
    public String getClientInstanceName() {
        return this.clientInstanceName;
    }

    public CreateEaiAllRequest setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
        return this;
    }
    public String getClientPassword() {
        return this.clientPassword;
    }

    public CreateEaiAllRequest setClientInternetMaxBandwidthIn(Integer clientInternetMaxBandwidthIn) {
        this.clientInternetMaxBandwidthIn = clientInternetMaxBandwidthIn;
        return this;
    }
    public Integer getClientInternetMaxBandwidthIn() {
        return this.clientInternetMaxBandwidthIn;
    }

    public CreateEaiAllRequest setClientInternetMaxBandwidthOut(Integer clientInternetMaxBandwidthOut) {
        this.clientInternetMaxBandwidthOut = clientInternetMaxBandwidthOut;
        return this;
    }
    public Integer getClientInternetMaxBandwidthOut() {
        return this.clientInternetMaxBandwidthOut;
    }

    public CreateEaiAllRequest setClientSystemDiskCategory(String clientSystemDiskCategory) {
        this.clientSystemDiskCategory = clientSystemDiskCategory;
        return this;
    }
    public String getClientSystemDiskCategory() {
        return this.clientSystemDiskCategory;
    }

    public CreateEaiAllRequest setClientSystemDiskSize(Integer clientSystemDiskSize) {
        this.clientSystemDiskSize = clientSystemDiskSize;
        return this;
    }
    public Integer getClientSystemDiskSize() {
        return this.clientSystemDiskSize;
    }

    public CreateEaiAllRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEaiAllRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
