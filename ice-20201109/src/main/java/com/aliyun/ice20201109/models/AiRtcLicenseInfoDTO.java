// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AiRtcLicenseInfoDTO extends TeaModel {
    /**
     * <p>The remaining usage capacity of the batch.</p>
     * 
     * <strong>example:</strong>
     * <p>10000000</p>
     */
    @NameInMap("AvailableCapacity")
    public Long availableCapacity;

    /**
     * <p>The time when the batch became active.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-23T13:33:49Z</p>
     */
    @NameInMap("BeginOn")
    public String beginOn;

    /**
     * <p>The contract number.</p>
     * 
     * <strong>example:</strong>
     * <p>258396267390***</p>
     */
    @NameInMap("ContractNo")
    public String contractNo;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-23T13:33:49Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>The expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-12-23T13:33:49Z</p>
     */
    @NameInMap("ExpiredOn")
    public String expiredOn;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ice_CoverAILicense_public_cn***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The total number of licenses contained within this batch.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("LicenseCount")
    public Long licenseCount;

    /**
     * <p>The ID of the batch.</p>
     * 
     * <strong>example:</strong>
     * <p>17712***</p>
     */
    @NameInMap("LicenseItemId")
    public String licenseItemId;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-12-23T13:33:49Z</p>
     */
    @NameInMap("ModificationTime")
    public String modificationTime;

    /**
     * <p>The status of the batch. Valid values:</p>
     * <ul>
     * <li>1: Active</li>
     * <li>2\. Expired</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The license type. Valid values:</p>
     * <ul>
     * <li>1: Audio call</li>
     * <li>2: Vision call</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    /**
     * <p>The validity period of the licenses in this batch, in days.</p>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
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
