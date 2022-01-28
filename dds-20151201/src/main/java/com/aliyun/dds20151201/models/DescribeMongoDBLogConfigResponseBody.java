// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeMongoDBLogConfigResponseBody extends TeaModel {
    @NameInMap("EnableAudit")
    public Boolean enableAudit;

    @NameInMap("IsEtlMetaExist")
    public Integer isEtlMetaExist;

    @NameInMap("IsUserProjectLogstoreExist")
    public Integer isUserProjectLogstoreExist;

    @NameInMap("PreserveStorageForStandard")
    public Long preserveStorageForStandard;

    @NameInMap("PreserveStorageForTrail")
    public Long preserveStorageForTrail;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("TtlForStandard")
    public Long ttlForStandard;

    @NameInMap("TtlForTrail")
    public Long ttlForTrail;

    @NameInMap("UsedStorageForStandard")
    public Long usedStorageForStandard;

    @NameInMap("UsedStorageForTrail")
    public Long usedStorageForTrail;

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
