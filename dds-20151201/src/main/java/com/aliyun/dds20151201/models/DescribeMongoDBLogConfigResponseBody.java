// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeMongoDBLogConfigResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the audit log feature is enabled for the ApsaraDB for MongoDB instance.</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAudit")
    public Boolean enableAudit;

    /**
     * <p>The retention period of hot storage for the V2_Standard (DAS Enterprise Edition (NoSQL-compatible)) version of audit logs. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("HotTtlForV2Standard")
    public Long hotTtlForV2Standard;

    /**
     * <p>Indicates whether a rule is created to ship audit logs to Logtail. For more information about Logtail, see <a href="https://help.aliyun.com/document_detail/28979.html">What is Logtail?</a>. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: A rule is created.</p>
     * </li>
     * <li><p><strong>0</strong> or <strong>null</strong>: No rule is created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsEtlMetaExist")
    public Integer isEtlMetaExist;

    /**
     * <p>Indicates whether a Simple Log Service project for audit logs exists in the current region. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: The project exists.</p>
     * </li>
     * <li><p><strong>0</strong> or <strong>null</strong>: The project does not exist.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsUserProjectLogstoreExist")
    public Integer isUserProjectLogstoreExist;

    /**
     * <p>The maximum storage capacity for the official version of audit logs. A value of -1 indicates that no upper limit is set.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("PreserveStorageForStandard")
    public Long preserveStorageForStandard;

    /**
     * <p>The maximum storage capacity for the free trial version of audit logs. Unit: bytes. The maximum value is 107374182400 bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>107374182400</p>
     */
    @NameInMap("PreserveStorageForTrail")
    public Long preserveStorageForTrail;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>664ECE26-658A-47C5-88F6-870B0132E8D2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The version of the audit log feature.</p>
     * <ul>
     * <li><p><strong>Trial</strong>: Free trial version.</p>
     * </li>
     * <li><p><strong>Standard</strong>: Official version.</p>
     * </li>
     * <li><p><strong>V2_Standard</strong>: DAS Enterprise Edition (NoSQL-compatible) version.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The retention period of audit logs for the official version. The value ranges from 1 to 365. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TtlForStandard")
    public Long ttlForStandard;

    /**
     * <p>The retention period of audit logs for the free trial version. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TtlForTrail")
    public Long ttlForTrail;

    /**
     * <p>The retention period of cold storage for the V2_Standard (DAS Enterprise Edition (NoSQL-compatible)) version of audit logs. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TtlForV2Standard")
    public Long ttlForV2Standard;

    /**
     * <p>The storage capacity that is used by audit logs for the official version. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>20163</p>
     */
    @NameInMap("UsedStorageForStandard")
    public Long usedStorageForStandard;

    /**
     * <p>The storage capacity that is used by audit logs for the free trial version. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>12548178759</p>
     */
    @NameInMap("UsedStorageForTrail")
    public Long usedStorageForTrail;

    /**
     * <p>The name of the Simple Log Service project for the audit logs.</p>
     * 
     * <strong>example:</strong>
     * <p>nosql-176498472570****-cn-hangzhou</p>
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

    public DescribeMongoDBLogConfigResponseBody setHotTtlForV2Standard(Long hotTtlForV2Standard) {
        this.hotTtlForV2Standard = hotTtlForV2Standard;
        return this;
    }
    public Long getHotTtlForV2Standard() {
        return this.hotTtlForV2Standard;
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

    public DescribeMongoDBLogConfigResponseBody setTtlForV2Standard(Long ttlForV2Standard) {
        this.ttlForV2Standard = ttlForV2Standard;
        return this;
    }
    public Long getTtlForV2Standard() {
        return this.ttlForV2Standard;
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
