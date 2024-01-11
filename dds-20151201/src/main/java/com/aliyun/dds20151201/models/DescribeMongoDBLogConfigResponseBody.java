// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeMongoDBLogConfigResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the audit log feature is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**: The audit log feature is enabled.</p>
     * <p>*   **false**: The audit log feature is disabled.</p>
     */
    @NameInMap("EnableAudit")
    public Boolean enableAudit;

    /**
     * <p>Indicates whether a rule to distribute logs to Logtail is created. For more information, see [Logtail overview](~~28979~~). Valid values:</p>
     * <br>
     * <p>*   **1**: A rule to distribute logs to Logtail is created.</p>
     * <p>*   **0** or **null**: A rule to distribute logs to Logtail is not created.</p>
     */
    @NameInMap("IsEtlMetaExist")
    public Integer isEtlMetaExist;

    /**
     * <p>Indicates whether a project exists in the current region. Valid values:</p>
     * <br>
     * <p>*   **1**: A logging project exists in the current region.</p>
     * <p>*   **0** or **null**: A logging project does not exist in the current region.</p>
     */
    @NameInMap("IsUserProjectLogstoreExist")
    public Integer isUserProjectLogstoreExist;

    /**
     * <p>The maximum storage capacity for the formal edition of the audit log feature. If the value is -1, no maximum storage capacity is set.</p>
     */
    @NameInMap("PreserveStorageForStandard")
    public Long preserveStorageForStandard;

    /**
     * <p>The maximum storage capacity for the free trial edition of the audit log feature. Unit: bytes. You can set the maximum storage capacity to 107,374,182,400 bytes.</p>
     */
    @NameInMap("PreserveStorageForTrail")
    public Long preserveStorageForTrail;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the audit log feature. Valid values:</p>
     * <br>
     * <p>*   **Trail**: the free trial edition</p>
     * <p>*   **Standard**: the official edition</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The retention period for the official edition of the audit log feature. Valid values: 1 to 365. Unit: day.</p>
     */
    @NameInMap("TtlForStandard")
    public Long ttlForStandard;

    /**
     * <p>The retention period for the free trial edition of the audit log feature.</p>
     */
    @NameInMap("TtlForTrail")
    public Long ttlForTrail;

    /**
     * <p>The used storage capacity for the formal edition of the audit log feature. Unit: bytes.</p>
     */
    @NameInMap("UsedStorageForStandard")
    public Long usedStorageForStandard;

    /**
     * <p>The used storage capacity for the free trial edition of the audit log feature. Unit: bytes.</p>
     */
    @NameInMap("UsedStorageForTrail")
    public Long usedStorageForTrail;

    /**
     * <p>The name of the project.</p>
     */
    @NameInMap("UserProjectName")
    public String userProjectName;

    public static DescribeMongoDBLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMongoDBLogConfigResponseBody self = new DescribeMongoDBLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMongoDBLogConfigResponseBody setEnableAudit(Boolean enableAudit) {
        this.enableAudit = enableAudit;
        return this;
    }
    public Boolean getEnableAudit() {
        return this.enableAudit;
    }

    public DescribeMongoDBLogConfigResponseBody setIsEtlMetaExist(Integer isEtlMetaExist) {
        this.isEtlMetaExist = isEtlMetaExist;
        return this;
    }
    public Integer getIsEtlMetaExist() {
        return this.isEtlMetaExist;
    }

    public DescribeMongoDBLogConfigResponseBody setIsUserProjectLogstoreExist(Integer isUserProjectLogstoreExist) {
        this.isUserProjectLogstoreExist = isUserProjectLogstoreExist;
        return this;
    }
    public Integer getIsUserProjectLogstoreExist() {
        return this.isUserProjectLogstoreExist;
    }

    public DescribeMongoDBLogConfigResponseBody setPreserveStorageForStandard(Long preserveStorageForStandard) {
        this.preserveStorageForStandard = preserveStorageForStandard;
        return this;
    }
    public Long getPreserveStorageForStandard() {
        return this.preserveStorageForStandard;
    }

    public DescribeMongoDBLogConfigResponseBody setPreserveStorageForTrail(Long preserveStorageForTrail) {
        this.preserveStorageForTrail = preserveStorageForTrail;
        return this;
    }
    public Long getPreserveStorageForTrail() {
        return this.preserveStorageForTrail;
    }

    public DescribeMongoDBLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMongoDBLogConfigResponseBody setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public DescribeMongoDBLogConfigResponseBody setTtlForStandard(Long ttlForStandard) {
        this.ttlForStandard = ttlForStandard;
        return this;
    }
    public Long getTtlForStandard() {
        return this.ttlForStandard;
    }

    public DescribeMongoDBLogConfigResponseBody setTtlForTrail(Long ttlForTrail) {
        this.ttlForTrail = ttlForTrail;
        return this;
    }
    public Long getTtlForTrail() {
        return this.ttlForTrail;
    }

    public DescribeMongoDBLogConfigResponseBody setUsedStorageForStandard(Long usedStorageForStandard) {
        this.usedStorageForStandard = usedStorageForStandard;
        return this;
    }
    public Long getUsedStorageForStandard() {
        return this.usedStorageForStandard;
    }

    public DescribeMongoDBLogConfigResponseBody setUsedStorageForTrail(Long usedStorageForTrail) {
        this.usedStorageForTrail = usedStorageForTrail;
        return this;
    }
    public Long getUsedStorageForTrail() {
        return this.usedStorageForTrail;
    }

    public DescribeMongoDBLogConfigResponseBody setUserProjectName(String userProjectName) {
        this.userProjectName = userProjectName;
        return this;
    }
    public String getUserProjectName() {
        return this.userProjectName;
    }

}
