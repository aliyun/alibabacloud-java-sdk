// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetAddonResponseBody extends TeaModel {
    /**
     * <p>The information about the addon.</p>
     */
    @NameInMap("Addon")
    public GetAddonResponseBodyAddon addon;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BBC2F93D-003A-49C4-850C-B826EECF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAddonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAddonResponseBody self = new GetAddonResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAddonResponseBody setAddon(GetAddonResponseBodyAddon addon) {
        this.addon = addon;
        return this;
    }
    public GetAddonResponseBodyAddon getAddon() {
        return this.addon;
    }

    public GetAddonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAddonResponseBodyAddonResourcesSpecEipResource extends TeaModel {
        /**
         * <p>Indicates whether the EIP is automatically created.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("AutoCreate")
        public Boolean autoCreate;

        /**
         * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>39.108.xx.xx</p>
         */
        @NameInMap("EipAddress")
        public String eipAddress;

        /**
         * <p>The EIP ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp1vi9124tbx1g3kr****</p>
         */
        @NameInMap("EipInstanceId")
        public String eipInstanceId;

        /**
         * <p>The billing method of the EIP.</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go.</li>
         * <li>PrePaid: subscription.</li>
         * </ul>
         * <p>Default value: PostPaid.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The metering method of the EIP. Valid values:</p>
         * <ul>
         * <li>PayByBandwidth: pay by bandwidth.</li>
         * <li>PayByTraffic: pay by data transfer.</li>
         * </ul>
         * <p>Valid values of N: 1 to 10.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        public static GetAddonResponseBodyAddonResourcesSpecEipResource build(java.util.Map<String, ?> map) throws Exception {
            GetAddonResponseBodyAddonResourcesSpecEipResource self = new GetAddonResponseBodyAddonResourcesSpecEipResource();
            return TeaModel.build(map, self);
        }

        public GetAddonResponseBodyAddonResourcesSpecEipResource setAutoCreate(Boolean autoCreate) {
            this.autoCreate = autoCreate;
            return this;
        }
        public Boolean getAutoCreate() {
            return this.autoCreate;
        }

        public GetAddonResponseBodyAddonResourcesSpecEipResource setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public GetAddonResponseBodyAddonResourcesSpecEipResource setEipAddress(String eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public String getEipAddress() {
            return this.eipAddress;
        }

        public GetAddonResponseBodyAddonResourcesSpecEipResource setEipInstanceId(String eipInstanceId) {
            this.eipInstanceId = eipInstanceId;
            return this;
        }
        public String getEipInstanceId() {
            return this.eipInstanceId;
        }

        public GetAddonResponseBodyAddonResourcesSpecEipResource setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public GetAddonResponseBodyAddonResourcesSpecEipResource setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

    }

    public static class GetAddonResponseBodyAddonResourcesSpec extends TeaModel {
        /**
         * <p>The Elastic Compute Service (ECS) resource configurations of the addon.</p>
         */
        @NameInMap("EcsResources")
        public java.util.List<AddonNodeTemplate> ecsResources;

        /**
         * <p>The Elastic IP Address (EIP) configurations.</p>
         */
        @NameInMap("EipResource")
        public GetAddonResponseBodyAddonResourcesSpecEipResource eipResource;

        public static GetAddonResponseBodyAddonResourcesSpec build(java.util.Map<String, ?> map) throws Exception {
            GetAddonResponseBodyAddonResourcesSpec self = new GetAddonResponseBodyAddonResourcesSpec();
            return TeaModel.build(map, self);
        }

        public GetAddonResponseBodyAddonResourcesSpec setEcsResources(java.util.List<AddonNodeTemplate> ecsResources) {
            this.ecsResources = ecsResources;
            return this;
        }
        public java.util.List<AddonNodeTemplate> getEcsResources() {
            return this.ecsResources;
        }

        public GetAddonResponseBodyAddonResourcesSpec setEipResource(GetAddonResponseBodyAddonResourcesSpecEipResource eipResource) {
            this.eipResource = eipResource;
            return this;
        }
        public GetAddonResponseBodyAddonResourcesSpecEipResource getEipResource() {
            return this.eipResource;
        }

    }

    public static class GetAddonResponseBodyAddonServicesSpecInputParams extends TeaModel {
        /**
         * <p>The help information of the parameter.</p>
         */
        @NameInMap("HelpText")
        public String helpText;

        /**
         * <p>The parameter label.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The parameter name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MYSQL_HOME</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The parameter value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>usr/local/mysql</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetAddonResponseBodyAddonServicesSpecInputParams build(java.util.Map<String, ?> map) throws Exception {
            GetAddonResponseBodyAddonServicesSpecInputParams self = new GetAddonResponseBodyAddonServicesSpecInputParams();
            return TeaModel.build(map, self);
        }

        public GetAddonResponseBodyAddonServicesSpecInputParams setHelpText(String helpText) {
            this.helpText = helpText;
            return this;
        }
        public String getHelpText() {
            return this.helpText;
        }

        public GetAddonResponseBodyAddonServicesSpecInputParams setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAddonResponseBodyAddonServicesSpecInputParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAddonResponseBodyAddonServicesSpecInputParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAddonResponseBodyAddonServicesSpecInputParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAddonResponseBodyAddonServicesSpecNetworkACL extends TeaModel {
        /**
         * <p>The protocol type. Valid values:</p>
         * <p>TCP: forwards TCP packets.</p>
         * <p>UDP: forwards UDP packets.</p>
         * <p>Any: forwards all packets.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The port number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Float port;

        /**
         * <p>The source CIDR block.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/12</p>
         */
        @NameInMap("SourceCidrIp")
        public String sourceCidrIp;

        public static GetAddonResponseBodyAddonServicesSpecNetworkACL build(java.util.Map<String, ?> map) throws Exception {
            GetAddonResponseBodyAddonServicesSpecNetworkACL self = new GetAddonResponseBodyAddonServicesSpecNetworkACL();
            return TeaModel.build(map, self);
        }

        public GetAddonResponseBodyAddonServicesSpecNetworkACL setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public GetAddonResponseBodyAddonServicesSpecNetworkACL setPort(Float port) {
            this.port = port;
            return this;
        }
        public Float getPort() {
            return this.port;
        }

        public GetAddonResponseBodyAddonServicesSpecNetworkACL setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

    }

    public static class GetAddonResponseBodyAddonServicesSpec extends TeaModel {
        /**
         * <p>The parameter configurations of the service.</p>
         */
        @NameInMap("InputParams")
        public java.util.List<GetAddonResponseBodyAddonServicesSpecInputParams> inputParams;

        /**
         * <p>The security group configurations of the service.</p>
         */
        @NameInMap("NetworkACL")
        public java.util.List<GetAddonResponseBodyAddonServicesSpecNetworkACL> networkACL;

        /**
         * <p>The service access type.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("ServiceAccessType")
        public String serviceAccessType;

        /**
         * <p>The service access URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://47.96.xx.xx:12008">https://47.96.xx.xx:12008</a></p>
         */
        @NameInMap("ServiceAccessUrl")
        public String serviceAccessUrl;

        /**
         * <p>The service name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Web Portal</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static GetAddonResponseBodyAddonServicesSpec build(java.util.Map<String, ?> map) throws Exception {
            GetAddonResponseBodyAddonServicesSpec self = new GetAddonResponseBodyAddonServicesSpec();
            return TeaModel.build(map, self);
        }

        public GetAddonResponseBodyAddonServicesSpec setInputParams(java.util.List<GetAddonResponseBodyAddonServicesSpecInputParams> inputParams) {
            this.inputParams = inputParams;
            return this;
        }
        public java.util.List<GetAddonResponseBodyAddonServicesSpecInputParams> getInputParams() {
            return this.inputParams;
        }

        public GetAddonResponseBodyAddonServicesSpec setNetworkACL(java.util.List<GetAddonResponseBodyAddonServicesSpecNetworkACL> networkACL) {
            this.networkACL = networkACL;
            return this;
        }
        public java.util.List<GetAddonResponseBodyAddonServicesSpecNetworkACL> getNetworkACL() {
            return this.networkACL;
        }

        public GetAddonResponseBodyAddonServicesSpec setServiceAccessType(String serviceAccessType) {
            this.serviceAccessType = serviceAccessType;
            return this;
        }
        public String getServiceAccessType() {
            return this.serviceAccessType;
        }

        public GetAddonResponseBodyAddonServicesSpec setServiceAccessUrl(String serviceAccessUrl) {
            this.serviceAccessUrl = serviceAccessUrl;
            return this;
        }
        public String getServiceAccessUrl() {
            return this.serviceAccessUrl;
        }

        public GetAddonResponseBodyAddonServicesSpec setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class GetAddonResponseBodyAddon extends TeaModel {
        /**
         * <p>The addon ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Login-1.0-W2g****</p>
         */
        @NameInMap("AddonId")
        public String addonId;

        /**
         * <p>The addon description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The addon icon.</p>
         * 
         * <strong>example:</strong>
         * <p>/assets/icons/your_icon.svg</p>
         */
        @NameInMap("Icon")
        public String icon;

        /**
         * <p>The time when the addon was installed.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-22 18:11:17</p>
         */
        @NameInMap("InstallTime")
        public String installTime;

        /**
         * <p>The addon label.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The addon name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Login</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The resource configurations of the addon.</p>
         */
        @NameInMap("ResourcesSpec")
        public GetAddonResponseBodyAddonResourcesSpec resourcesSpec;

        /**
         * <p>The service configurations of the addon.</p>
         */
        @NameInMap("ServicesSpec")
        public java.util.List<GetAddonResponseBodyAddonServicesSpec> servicesSpec;

        /**
         * <p>The addon status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The addon version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetAddonResponseBodyAddon build(java.util.Map<String, ?> map) throws Exception {
            GetAddonResponseBodyAddon self = new GetAddonResponseBodyAddon();
            return TeaModel.build(map, self);
        }

        public GetAddonResponseBodyAddon setAddonId(String addonId) {
            this.addonId = addonId;
            return this;
        }
        public String getAddonId() {
            return this.addonId;
        }

        public GetAddonResponseBodyAddon setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAddonResponseBodyAddon setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public GetAddonResponseBodyAddon setInstallTime(String installTime) {
            this.installTime = installTime;
            return this;
        }
        public String getInstallTime() {
            return this.installTime;
        }

        public GetAddonResponseBodyAddon setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetAddonResponseBodyAddon setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAddonResponseBodyAddon setResourcesSpec(GetAddonResponseBodyAddonResourcesSpec resourcesSpec) {
            this.resourcesSpec = resourcesSpec;
            return this;
        }
        public GetAddonResponseBodyAddonResourcesSpec getResourcesSpec() {
            return this.resourcesSpec;
        }

        public GetAddonResponseBodyAddon setServicesSpec(java.util.List<GetAddonResponseBodyAddonServicesSpec> servicesSpec) {
            this.servicesSpec = servicesSpec;
            return this;
        }
        public java.util.List<GetAddonResponseBodyAddonServicesSpec> getServicesSpec() {
            return this.servicesSpec;
        }

        public GetAddonResponseBodyAddon setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAddonResponseBodyAddon setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
