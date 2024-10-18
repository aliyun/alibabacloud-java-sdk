// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DescribeAddonTemplateResponseBody extends TeaModel {
    /**
     * <p>The details of the addon template.</p>
     */
    @NameInMap("Addon")
    public DescribeAddonTemplateResponseBodyAddon addon;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAddonTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonTemplateResponseBody self = new DescribeAddonTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAddonTemplateResponseBody setAddon(DescribeAddonTemplateResponseBodyAddon addon) {
        this.addon = addon;
        return this;
    }
    public DescribeAddonTemplateResponseBodyAddon getAddon() {
        return this.addon;
    }

    public DescribeAddonTemplateResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAddonTemplateResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAddonTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAddonTemplateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAddonTemplateResponseBodyAddonResourcesSpecEipResource extends TeaModel {
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
         * <p>The EIP ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-bp1jwtsuoiif2qf90****</p>
         */
        @NameInMap("EipInstanceId")
        public String eipInstanceId;

        /**
         * <p>The billing method of the EIP. Valid values:</p>
         * <ul>
         * <li>PostPaid: pay-as-you-go.</li>
         * <li>PrePaid: subscription.</li>
         * </ul>
         * <p>Default value: PostPaid</p>
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

        public static DescribeAddonTemplateResponseBodyAddonResourcesSpecEipResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonTemplateResponseBodyAddonResourcesSpecEipResource self = new DescribeAddonTemplateResponseBodyAddonResourcesSpecEipResource();
            return TeaModel.build(map, self);
        }

        public DescribeAddonTemplateResponseBodyAddonResourcesSpecEipResource setAutoCreate(Boolean autoCreate) {
            this.autoCreate = autoCreate;
            return this;
        }
        public Boolean getAutoCreate() {
            return this.autoCreate;
        }

        public DescribeAddonTemplateResponseBodyAddonResourcesSpecEipResource setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeAddonTemplateResponseBodyAddonResourcesSpecEipResource setEipInstanceId(String eipInstanceId) {
            this.eipInstanceId = eipInstanceId;
            return this;
        }
        public String getEipInstanceId() {
            return this.eipInstanceId;
        }

        public DescribeAddonTemplateResponseBodyAddonResourcesSpecEipResource setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeAddonTemplateResponseBodyAddonResourcesSpecEipResource setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

    }

    public static class DescribeAddonTemplateResponseBodyAddonResourcesSpec extends TeaModel {
        /**
         * <p>The Elastic Compute Service (ECS) resource configurations of the addon.</p>
         */
        @NameInMap("EcsResources")
        public java.util.List<AddonNodeTemplate> ecsResources;

        /**
         * <p>The Elastic IP Address (EIP) configurations of the service.</p>
         */
        @NameInMap("EipResource")
        public DescribeAddonTemplateResponseBodyAddonResourcesSpecEipResource eipResource;

        public static DescribeAddonTemplateResponseBodyAddonResourcesSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonTemplateResponseBodyAddonResourcesSpec self = new DescribeAddonTemplateResponseBodyAddonResourcesSpec();
            return TeaModel.build(map, self);
        }

        public DescribeAddonTemplateResponseBodyAddonResourcesSpec setEcsResources(java.util.List<AddonNodeTemplate> ecsResources) {
            this.ecsResources = ecsResources;
            return this;
        }
        public java.util.List<AddonNodeTemplate> getEcsResources() {
            return this.ecsResources;
        }

        public DescribeAddonTemplateResponseBodyAddonResourcesSpec setEipResource(DescribeAddonTemplateResponseBodyAddonResourcesSpecEipResource eipResource) {
            this.eipResource = eipResource;
            return this;
        }
        public DescribeAddonTemplateResponseBodyAddonResourcesSpecEipResource getEipResource() {
            return this.eipResource;
        }

    }

    public static class DescribeAddonTemplateResponseBodyAddonServicesSpecInputParams extends TeaModel {
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

        public static DescribeAddonTemplateResponseBodyAddonServicesSpecInputParams build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonTemplateResponseBodyAddonServicesSpecInputParams self = new DescribeAddonTemplateResponseBodyAddonServicesSpecInputParams();
            return TeaModel.build(map, self);
        }

        public DescribeAddonTemplateResponseBodyAddonServicesSpecInputParams setHelpText(String helpText) {
            this.helpText = helpText;
            return this;
        }
        public String getHelpText() {
            return this.helpText;
        }

        public DescribeAddonTemplateResponseBodyAddonServicesSpecInputParams setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeAddonTemplateResponseBodyAddonServicesSpecInputParams setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAddonTemplateResponseBodyAddonServicesSpecInputParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAddonTemplateResponseBodyAddonServicesSpecInputParams setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAddonTemplateResponseBodyAddonServicesSpecNetworkACL extends TeaModel {
        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><strong>TCP</strong>: forwards TCP packets.</li>
         * <li><strong>UDP</strong>: forwards UDP packets.</li>
         * <li><strong>Any</strong>: forwards all packets.</li>
         * </ul>
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

        public static DescribeAddonTemplateResponseBodyAddonServicesSpecNetworkACL build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonTemplateResponseBodyAddonServicesSpecNetworkACL self = new DescribeAddonTemplateResponseBodyAddonServicesSpecNetworkACL();
            return TeaModel.build(map, self);
        }

        public DescribeAddonTemplateResponseBodyAddonServicesSpecNetworkACL setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeAddonTemplateResponseBodyAddonServicesSpecNetworkACL setPort(Float port) {
            this.port = port;
            return this;
        }
        public Float getPort() {
            return this.port;
        }

        public DescribeAddonTemplateResponseBodyAddonServicesSpecNetworkACL setSourceCidrIp(String sourceCidrIp) {
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

    }

    public static class DescribeAddonTemplateResponseBodyAddonServicesSpec extends TeaModel {
        /**
         * <p>The parameter configurations of the service.</p>
         */
        @NameInMap("InputParams")
        public java.util.List<DescribeAddonTemplateResponseBodyAddonServicesSpecInputParams> inputParams;

        /**
         * <p>The security group configurations of the service.</p>
         */
        @NameInMap("NetworkACL")
        public java.util.List<DescribeAddonTemplateResponseBodyAddonServicesSpecNetworkACL> networkACL;

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

        public static DescribeAddonTemplateResponseBodyAddonServicesSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonTemplateResponseBodyAddonServicesSpec self = new DescribeAddonTemplateResponseBodyAddonServicesSpec();
            return TeaModel.build(map, self);
        }

        public DescribeAddonTemplateResponseBodyAddonServicesSpec setInputParams(java.util.List<DescribeAddonTemplateResponseBodyAddonServicesSpecInputParams> inputParams) {
            this.inputParams = inputParams;
            return this;
        }
        public java.util.List<DescribeAddonTemplateResponseBodyAddonServicesSpecInputParams> getInputParams() {
            return this.inputParams;
        }

        public DescribeAddonTemplateResponseBodyAddonServicesSpec setNetworkACL(java.util.List<DescribeAddonTemplateResponseBodyAddonServicesSpecNetworkACL> networkACL) {
            this.networkACL = networkACL;
            return this;
        }
        public java.util.List<DescribeAddonTemplateResponseBodyAddonServicesSpecNetworkACL> getNetworkACL() {
            return this.networkACL;
        }

        public DescribeAddonTemplateResponseBodyAddonServicesSpec setServiceAccessType(String serviceAccessType) {
            this.serviceAccessType = serviceAccessType;
            return this;
        }
        public String getServiceAccessType() {
            return this.serviceAccessType;
        }

        public DescribeAddonTemplateResponseBodyAddonServicesSpec setServiceAccessUrl(String serviceAccessUrl) {
            this.serviceAccessUrl = serviceAccessUrl;
            return this;
        }
        public String getServiceAccessUrl() {
            return this.serviceAccessUrl;
        }

        public DescribeAddonTemplateResponseBodyAddonServicesSpec setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class DescribeAddonTemplateResponseBodyAddon extends TeaModel {
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
         * <p>The addon label.</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The date when the addon template was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-22 18:11:17</p>
         */
        @NameInMap("LastUpdate")
        public String lastUpdate;

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
        public DescribeAddonTemplateResponseBodyAddonResourcesSpec resourcesSpec;

        /**
         * <p>The addon configurations.</p>
         */
        @NameInMap("ServicesSpec")
        public java.util.List<DescribeAddonTemplateResponseBodyAddonServicesSpec> servicesSpec;

        /**
         * <p>The addon version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeAddonTemplateResponseBodyAddon build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonTemplateResponseBodyAddon self = new DescribeAddonTemplateResponseBodyAddon();
            return TeaModel.build(map, self);
        }

        public DescribeAddonTemplateResponseBodyAddon setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAddonTemplateResponseBodyAddon setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public DescribeAddonTemplateResponseBodyAddon setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DescribeAddonTemplateResponseBodyAddon setLastUpdate(String lastUpdate) {
            this.lastUpdate = lastUpdate;
            return this;
        }
        public String getLastUpdate() {
            return this.lastUpdate;
        }

        public DescribeAddonTemplateResponseBodyAddon setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAddonTemplateResponseBodyAddon setResourcesSpec(DescribeAddonTemplateResponseBodyAddonResourcesSpec resourcesSpec) {
            this.resourcesSpec = resourcesSpec;
            return this;
        }
        public DescribeAddonTemplateResponseBodyAddonResourcesSpec getResourcesSpec() {
            return this.resourcesSpec;
        }

        public DescribeAddonTemplateResponseBodyAddon setServicesSpec(java.util.List<DescribeAddonTemplateResponseBodyAddonServicesSpec> servicesSpec) {
            this.servicesSpec = servicesSpec;
            return this;
        }
        public java.util.List<DescribeAddonTemplateResponseBodyAddonServicesSpec> getServicesSpec() {
            return this.servicesSpec;
        }

        public DescribeAddonTemplateResponseBodyAddon setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
