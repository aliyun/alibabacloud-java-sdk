// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("autoRenew")
    public String autoRenew;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("autoRenewPeriod")
    public String autoRenewPeriod;

    /**
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("autoRenewPeriodUnit")
    public String autoRenewPeriodUnit;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("autoStartSessionCluster")
    public Boolean autoStartSessionCluster;

    /**
     * <strong>example:</strong>
     * <p>8e6aae2810c8f67229ca70bb31cd****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>123xxxxx</p>
     */
    @NameInMap("dlfCatalogId")
    public String dlfCatalogId;

    /**
     * <strong>example:</strong>
     * <p>dlf1.0</p>
     */
    @NameInMap("dlfType")
    public String dlfType;

    /**
     * <strong>example:</strong>
     * <p>12452</p>
     */
    @NameInMap("duration")
    public String duration;

    /**
     * <p>OSS Bucket。</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/</p>
     */
    @NameInMap("ossBucket")
    public String ossBucket;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("paymentDurationUnit")
    public String paymentDurationUnit;

    /**
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <strong>example:</strong>
     * <p>AliyunEMRSparkJobRunDefaultRole</p>
     */
    @NameInMap("ramRoleName")
    public String ramRoleName;

    /**
     * <strong>example:</strong>
     * <p>pro</p>
     */
    @NameInMap("releaseType")
    public String releaseType;

    @NameInMap("resourceSpec")
    public CreateWorkspaceRequestResourceSpec resourceSpec;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("workspaceName")
    public String workspaceName;

    /**
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

}
