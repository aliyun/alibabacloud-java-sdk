// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AiRtcLicenseInfoDTO extends TeaModel {
    @NameInMap("AvailableCapacity")
    public Long availableCapacity;

    @NameInMap("BeginOn")
    public String beginOn;

    @NameInMap("ContractNo")
    public String contractNo;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("ExpiredOn")
    public String expiredOn;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LicenseCount")
    public Long licenseCount;

    @NameInMap("LicenseItemId")
    public String licenseItemId;

    @NameInMap("ModificationTime")
    public String modificationTime;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("ValidDays")
    public Long validDays;

    public static AiRtcLicenseInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        AiRtcLicenseInfoDTO self = new AiRtcLicenseInfoDTO();
        return TeaModel.build(map, self);
    }

    public AiRtcLicenseInfoDTO setAvailableCapacity(Long availableCapacity) {
        this.availableCapacity = availableCapacity;
        return this;
    }
    public Long getAvailableCapacity() {
        return this.availableCapacity;
    }

    public AiRtcLicenseInfoDTO setBeginOn(String beginOn) {
        this.beginOn = beginOn;
        return this;
    }
    public String getBeginOn() {
        return this.beginOn;
    }

    public AiRtcLicenseInfoDTO setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public AiRtcLicenseInfoDTO setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public AiRtcLicenseInfoDTO setExpiredOn(String expiredOn) {
        this.expiredOn = expiredOn;
        return this;
    }
    public String getExpiredOn() {
        return this.expiredOn;
    }

    public AiRtcLicenseInfoDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AiRtcLicenseInfoDTO setLicenseCount(Long licenseCount) {
        this.licenseCount = licenseCount;
        return this;
    }
    public Long getLicenseCount() {
        return this.licenseCount;
    }

    public AiRtcLicenseInfoDTO setLicenseItemId(String licenseItemId) {
        this.licenseItemId = licenseItemId;
        return this;
    }
    public String getLicenseItemId() {
        return this.licenseItemId;
    }

    public AiRtcLicenseInfoDTO setModificationTime(String modificationTime) {
        this.modificationTime = modificationTime;
        return this;
    }
    public String getModificationTime() {
        return this.modificationTime;
    }

    public AiRtcLicenseInfoDTO setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public AiRtcLicenseInfoDTO setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public AiRtcLicenseInfoDTO setValidDays(Long validDays) {
        this.validDays = validDays;
        return this;
    }
    public Long getValidDays() {
        return this.validDays;
    }

}
