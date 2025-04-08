// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. This parameter is required only if the paymentType parameter is set to Pre.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("autoRenew")
    public String autoRenew;

    /**
     * <p>The auto-renewal duration. This parameter is required only if the paymentType parameter is set to Pre.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("autoRenewPeriod")
    public String autoRenewPeriod;

    /**
     * <p>The unit of the auto-renewal duration. This parameter is required only if the paymentType parameter is set to Pre.</p>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("autoRenewPeriodUnit")
    public String autoRenewPeriodUnit;

    /**
     * <p>Specifies whether to automatically start a session.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("autoStartSessionCluster")
    public Boolean autoStartSessionCluster;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8e6aae2810c8f67229ca70bb31cd****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The information of the Data Lake Formation (DLF) catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>123xxxxx</p>
     */
    @NameInMap("dlfCatalogId")
    public String dlfCatalogId;

    /**
     * <p>The version of DLF.</p>
     * 
     * <strong>example:</strong>
     * <p>dlf1.0</p>
     */
    @NameInMap("dlfType")
    public String dlfType;

    /**
     * <p>The subscription period. This parameter is required only if the paymentType parameter is set to Pre.</p>
     * 
     * <strong>example:</strong>
     * <p>12452</p>
     */
    @NameInMap("duration")
    public String duration;

    /**
     * <p>The name of the Object Storage Service (OSS) bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/</p>
     */
    @NameInMap("ossBucket")
    public String ossBucket;

    /**
     * <p>The unit of the subscription duration.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("paymentDurationUnit")
    public String paymentDurationUnit;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>PayAsYouGo</li>
     * <li>Pre</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>The name of the role used to run Spark jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunEMRSparkJobRunDefaultRole</p>
     */
    @NameInMap("ramRoleName")
    public String ramRoleName;

    /**
     * <p>The type of the version.</p>
     * 
     * <strong>example:</strong>
     * <p>pro</p>
     */
    @NameInMap("releaseType")
    public String releaseType;

    /**
     * <p>The resource specifications.</p>
     */
    @NameInMap("resourceSpec")
    public CreateWorkspaceRequestResourceSpec resourceSpec;

    /**
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("tag")
    public java.util.List<CreateWorkspaceRequestTag> tag;

    /**
     * <p>The name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("workspaceName")
    public String workspaceName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static CreateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRequest self = new CreateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateWorkspaceRequest setAutoRenewPeriod(String autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public String getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateWorkspaceRequest setAutoRenewPeriodUnit(String autoRenewPeriodUnit) {
        this.autoRenewPeriodUnit = autoRenewPeriodUnit;
        return this;
    }
    public String getAutoRenewPeriodUnit() {
        return this.autoRenewPeriodUnit;
    }

    public CreateWorkspaceRequest setAutoStartSessionCluster(Boolean autoStartSessionCluster) {
        this.autoStartSessionCluster = autoStartSessionCluster;
        return this;
    }
    public Boolean getAutoStartSessionCluster() {
        return this.autoStartSessionCluster;
    }

    public CreateWorkspaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateWorkspaceRequest setDlfCatalogId(String dlfCatalogId) {
        this.dlfCatalogId = dlfCatalogId;
        return this;
    }
    public String getDlfCatalogId() {
        return this.dlfCatalogId;
    }

    public CreateWorkspaceRequest setDlfType(String dlfType) {
        this.dlfType = dlfType;
        return this;
    }
    public String getDlfType() {
        return this.dlfType;
    }

    public CreateWorkspaceRequest setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public CreateWorkspaceRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public CreateWorkspaceRequest setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public CreateWorkspaceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateWorkspaceRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public CreateWorkspaceRequest setReleaseType(String releaseType) {
        this.releaseType = releaseType;
        return this;
    }
    public String getReleaseType() {
        return this.releaseType;
    }

    public CreateWorkspaceRequest setResourceSpec(CreateWorkspaceRequestResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public CreateWorkspaceRequestResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public CreateWorkspaceRequest setTag(java.util.List<CreateWorkspaceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateWorkspaceRequestTag> getTag() {
        return this.tag;
    }

    public CreateWorkspaceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public CreateWorkspaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateWorkspaceRequestResourceSpec extends TeaModel {
        /**
         * <p>The maximum resource quota for a workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("cu")
        public String cu;

        public static CreateWorkspaceRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceRequestResourceSpec self = new CreateWorkspaceRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceRequestResourceSpec setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

    }

    public static class CreateWorkspaceRequestTag extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static CreateWorkspaceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceRequestTag self = new CreateWorkspaceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateWorkspaceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
