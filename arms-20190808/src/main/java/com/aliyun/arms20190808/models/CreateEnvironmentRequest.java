// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateEnvironmentRequest extends TeaModel {
    /**
     * <p>The language. Default value: zh.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>en</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>English</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>zh</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>Chinese</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>The ID of the resource bound to the environment, such as the container ID or VPC ID. For a Cloud environment, specify the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c6e9dec475dca4a50a188411d8cbxxx</p>
     */
    @NameInMap("BindResourceId")
    public String bindResourceId;

    /**
     * <p>The name of the environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>env1</p>
     */
    @NameInMap("EnvironmentName")
    public String environmentName;

    /**
     * <p>The subtype of the environment. Valid values:</p>
     * <ul>
     * <li>CS: ACK</li>
     * <li>ECS: ECS</li>
     * <li>Cloud: cloud service</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS, ACK, etc.</p>
     */
    @NameInMap("EnvironmentSubType")
    public String environmentSubType;

    /**
     * <p>The type of the environment. Valid values:</p>
     * <ul>
     * <li>CS: ACK</li>
     * <li>ECS: ECS</li>
     * <li>Cloud: cloud service</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CS</p>
     */
    @NameInMap("EnvironmentType")
    public String environmentType;

    /**
     * <p>The payable resource plan. Valid values:</p>
     * <ul>
     * <li>If the EnvironmentType parameter is set to CS, set the value to CS_Basic or CS_Pro. Default value: CS_Basic.</li>
     * <li>Otherwise, leave the parameter empty.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CS_Basic</p>
     */
    @NameInMap("FeePackage")
    public String feePackage;

    /**
     * <p>环境绑定的grafana工作区id。传空时，表示使用默认的共享grafana。</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("GrafanaWorkspaceId")
    public String grafanaWorkspaceId;

    @NameInMap("InitEnvironment")
    public Boolean initEnvironment;

    /**
     * <p>Specifies whether agents or exporters are managed. Valid values:</p>
     * <ul>
     * <li>none: No. By default, no managed agents or exporters are provided for ACK clusters.</li>
     * <li>agent: Agents are managed. By default, managed agents are provided for ASK clusters, ACS clusters, and ACK One clusters.</li>
     * <li>agent-exporter: Agents and exporters are managed. By default, managed agents and exporters are provided for cloud services.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("ManagedType")
    public String managedType;

    /**
     * <p>The ID of the Prometheus instance. If no Prometheus instance is created, call the InitEnvironment operation.</p>
     * 
     * <strong>example:</strong>
     * <p>c6e9dec475dca4a50a188411d8cbxxx</p>
     */
    @NameInMap("PrometheusInstanceId")
    public String prometheusInstanceId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the instance. You can specify this parameter to manage tags for the instance.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateEnvironmentRequestTags> tags;

    public static CreateEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentRequest self = new CreateEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public CreateEnvironmentRequest setBindResourceId(String bindResourceId) {
        this.bindResourceId = bindResourceId;
        return this;
    }
    public String getBindResourceId() {
        return this.bindResourceId;
    }

    public CreateEnvironmentRequest setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }
    public String getEnvironmentName() {
        return this.environmentName;
    }

    public CreateEnvironmentRequest setEnvironmentSubType(String environmentSubType) {
        this.environmentSubType = environmentSubType;
        return this;
    }
    public String getEnvironmentSubType() {
        return this.environmentSubType;
    }

    public CreateEnvironmentRequest setEnvironmentType(String environmentType) {
        this.environmentType = environmentType;
        return this;
    }
    public String getEnvironmentType() {
        return this.environmentType;
    }

    public CreateEnvironmentRequest setFeePackage(String feePackage) {
        this.feePackage = feePackage;
        return this;
    }
    public String getFeePackage() {
        return this.feePackage;
    }

    public CreateEnvironmentRequest setGrafanaWorkspaceId(String grafanaWorkspaceId) {
        this.grafanaWorkspaceId = grafanaWorkspaceId;
        return this;
    }
    public String getGrafanaWorkspaceId() {
        return this.grafanaWorkspaceId;
    }

    public CreateEnvironmentRequest setInitEnvironment(Boolean initEnvironment) {
        this.initEnvironment = initEnvironment;
        return this;
    }
    public Boolean getInitEnvironment() {
        return this.initEnvironment;
    }

    public CreateEnvironmentRequest setManagedType(String managedType) {
        this.managedType = managedType;
        return this;
    }
    public String getManagedType() {
        return this.managedType;
    }

    public CreateEnvironmentRequest setPrometheusInstanceId(String prometheusInstanceId) {
        this.prometheusInstanceId = prometheusInstanceId;
        return this;
    }
    public String getPrometheusInstanceId() {
        return this.prometheusInstanceId;
    }

    public CreateEnvironmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateEnvironmentRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateEnvironmentRequest setTags(java.util.List<CreateEnvironmentRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateEnvironmentRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateEnvironmentRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateEnvironmentRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateEnvironmentRequestTags self = new CreateEnvironmentRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateEnvironmentRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateEnvironmentRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
