// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeMongoDBLogConfigResponseBody extends TeaModel {
    // Indicates whether to enable the audit log feature is enabled.
    // 
    // *   **true**
    // *   **false**
    @NameInMap("EnableAudit")
    public Boolean enableAudit;

    // Indicates whether a rule to distribute logs to Logtail is created. For more information, see [Logtail overview](~~28979~~). Valid values:
    // 
    // *   **1**: A rule to distribute logs to Logtail is created.
    // *   **0** or **null**: A rule to distribute logs to Logtail is not created.
    @NameInMap("IsEtlMetaExist")
    public Integer isEtlMetaExist;

    // Indicates whether a Log Service project exists in the current region. Valid values:
    // 
    // *   **1**: A Log Service project exists in the current region.
    // *   **0** or **null**: A Log Service project does not exist in the current region.
    @NameInMap("IsUserProjectLogstoreExist")
    public Integer isUserProjectLogstoreExist;

    // The maximum storage space for the formal edition of the audit log feature. If the value is **-1**, no maximum is set.
    @NameInMap("PreserveStorageForStandard")
    public Long preserveStorageForStandard;

    // The maximum storage space for the free trial edition of the audit log feature. Unit: bytes. You can set the maximum up to 107,374,182,400 bytes.
    @NameInMap("PreserveStorageForTrail")
    public Long preserveStorageForTrail;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The type of the audit log feature. Valid values:
    // 
    // *   **Trail**: the free trial edition
    // *   **Standard**: the official edition
    @NameInMap("ServiceType")
    public String serviceType;

    // The retention period for the official edition of the audit log feature. Valid values: 1 to 365 days.
    @NameInMap("TtlForStandard")
    public Long ttlForStandard;

    // The retention period for the free trial edition of the audit log feature.
    @NameInMap("TtlForTrail")
    public Long ttlForTrail;

    // The used storage space for the formal edition of the audit log feature. Unit: bytes.
    @NameInMap("UsedStorageForStandard")
    public Long usedStorageForStandard;

    // The used storage space for the free trial edition of the audit log feature. Unit: bytes.
    @NameInMap("UsedStorageForTrail")
    public Long usedStorageForTrail;

    // The name of the Log Service project.
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
