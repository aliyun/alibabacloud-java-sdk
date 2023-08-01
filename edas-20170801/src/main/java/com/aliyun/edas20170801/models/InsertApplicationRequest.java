// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertApplicationRequest extends TeaModel {
    /**
     * <p>The name of the application. The name can contain only digits, letters, hyphens (-), and underscores (\_) and must start with a letter. The name can be up to 36 characters in length.</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The build package number of EDAS Container. This parameter is required if you create a High-Speed Service Framework (HSF) application. You can query the build package number by using one of the following methods:</p>
     * <br>
     * <p>*   Call the ListBuildPack operation. For more information, see [ListBuildPack](~~149391~~).</p>
     * <p>*   Obtain the value in the **Build package number** column of the [Release notes for EDAS Container](~~92614~~) topic.</p>
     */
    @NameInMap("BuildPackId")
    public Integer buildPackId;

    /**
     * <p>The ID of the ECS cluster in which you want to create the application. If you specify an ID, the application is created in the specified ECS cluster. If you leave this parameter empty, the application is created in the default cluster. We recommend that you specify this parameter.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the application component. You can call the ListComponents operation to query the component IDs. For more information, see [ListComponents](~~97502~~).</p>
     * <br>
     * <p>This parameter is required if the application runs in Apache Tomcat or in a standard Java application runtime environment. The Apache Tomcat application runtime environment is applicable to Dubbo applications that are deployed by using WAR packages. A standard Java application runtime environment is applicable to Spring Boot or Spring Cloud applications that are deployed by using JAR packages.</p>
     * <br>
     * <p>Valid values for common application components:</p>
     * <br>
     * <p>*   4: Apache Tomcat 7.0.91</p>
     * <p>*   7: Apache Tomcat 8.5.42</p>
     * <p>*   5: OpenJDK 1.8.x</p>
     * <p>*   6: OpenJDK 1.7.x</p>
     * <br>
     * <p>This parameter is available only for Java SDK 2.57.3 or later, or Python SDK 2.57.3 or later. Assume that you use an SDK that is not provided by EDAS, for example, aliyun-python-sdk-core, aliyun-java-sdk-core, and Alibaba Cloud CLI. In this case, you can directly specify this parameter.</p>
     */
    @NameInMap("ComponentIds")
    public String componentIds;

    /**
     * <p>The number of CPU cores that can be used by the application container in a Swarm cluster. \*\*This parameter is deprecated.\*\*</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The description of the application.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The value of `ecu_id` of the ECS instance to be added during scale-out. The ECU ID is the unique identity for an ECS instance that is imported to EDAS. Separate multiple values of `ecu_id` with commas (,). You can call the ListScaleOutEcu operation to query the value of `ecu_id`. For more information, see [ListScaleOutEcu](~~149371~~).</p>
     */
    @NameInMap("EcuInfo")
    public String ecuInfo;

    /**
     * <p>Specifies whether to enable the port health check. Valid values:</p>
     * <br>
     * <p>*   **true**: enable the port health check.</p>
     * <p>*   **false**: does not enable the port health check.</p>
     */
    @NameInMap("EnablePortCheck")
    public Boolean enablePortCheck;

    /**
     * <p>Specifies whether to enable the URL health check. Valid values:</p>
     * <br>
     * <p>*   **true**: enables the URL health check.</p>
     * <p>*   **false**: does not enable the URL health check.</p>
     */
    @NameInMap("EnableUrlCheck")
    public Boolean enableUrlCheck;

    /**
     * <p>The health check URL of the application.</p>
     */
    @NameInMap("HealthCheckURL")
    public String healthCheckURL;

    /**
     * <p>The health check URL of the application. This parameter is equivalent to the HealthCheckURL parameter.</p>
     */
    @NameInMap("HealthCheckUrl")
    public String healthCheckUrl;

    /**
     * <p>The script to mount. Set the value in the JSON format. Example: `[{"ignoreFail":false,"name":"postprepareInstanceEnvironmentOnScaleOut","script":"ls"},{"ignoreFail":true,"name":"postdeleteInstanceDataOnScaleIn","script":""},{"ignoreFail":true,"name":"prestartInstance","script":""},{"ignoreFail":true,"name":"poststartInstance","script":""},{"ignoreFail":true,"name":"prestopInstance","script":""},{"ignoreFail":true,"name":"poststopInstance","script":""}]`</p>
     */
    @NameInMap("Hooks")
    public String hooks;

    /**
     * <p>The version of the Java Development Kit (JDK) used to deploy the application. **This parameter is deprecated.</p>
     */
    @NameInMap("Jdk")
    public String jdk;

    /**
     * <p>The custom parameters.</p>
     */
    @NameInMap("JvmOptions")
    public String jvmOptions;

    /**
     * <p>The ID of the microservices namespace. To query the ID of a microservices namespace, you can choose **Resource Management** > **Microservice Namespaces** in the left-side navigation pane of the EDAS console or call the ListUserDefineRegion operation. For more information, see [ListUserDefineRegion](~~149377~~).</p>
     * <br>
     * <p>*   This parameter is required if the cluster you specify is not deployed in the default microservices namespace. Otherwise, the message `application regionId is different with cluster regionId!` appears.</p>
     * <p>*   If the cluster you specify is deployed in the default microservices namespace, you do not need to specify this parameter. Set this parameter to the ID of the microservices namespace in which the cluster you specify is deployed.</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>The maximum size of the heap memory. Unit: MB.</p>
     */
    @NameInMap("MaxHeapSize")
    public Integer maxHeapSize;

    /**
     * <p>The size of the permanent generation heap memory. Unit: MB.</p>
     */
    @NameInMap("MaxPermSize")
    public Integer maxPermSize;

    /**
     * <p>The memory size that can be used by the application container in a Swarm cluster. \*\*This parameter is deprecated.\*\*</p>
     */
    @NameInMap("Mem")
    public Integer mem;

    /**
     * <p>The initial size of the heap memory. Unit: MB.</p>
     */
    @NameInMap("MinHeapSize")
    public Integer minHeapSize;

    /**
     * <p>The type of the application deployment package. Valid values: war and jar.</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The reserved port for the application. \*\*This parameter is deprecated.\*\*</p>
     */
    @NameInMap("ReservedPortStr")
    public String reservedPortStr;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The version of Apache Tomcat. **This parameter is deprecated.</p>
     */
    @NameInMap("WebContainer")
    public String webContainer;

    public static InsertApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertApplicationRequest self = new InsertApplicationRequest();
        return TeaModel.build(map, self);
    }

    public InsertApplicationRequest setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public InsertApplicationRequest setBuildPackId(Integer buildPackId) {
        this.buildPackId = buildPackId;
        return this;
    }
    public Integer getBuildPackId() {
        return this.buildPackId;
    }

    public InsertApplicationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InsertApplicationRequest setComponentIds(String componentIds) {
        this.componentIds = componentIds;
        return this;
    }
    public String getComponentIds() {
        return this.componentIds;
    }

    public InsertApplicationRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public InsertApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public InsertApplicationRequest setEcuInfo(String ecuInfo) {
        this.ecuInfo = ecuInfo;
        return this;
    }
    public String getEcuInfo() {
        return this.ecuInfo;
    }

    public InsertApplicationRequest setEnablePortCheck(Boolean enablePortCheck) {
        this.enablePortCheck = enablePortCheck;
        return this;
    }
    public Boolean getEnablePortCheck() {
        return this.enablePortCheck;
    }

    public InsertApplicationRequest setEnableUrlCheck(Boolean enableUrlCheck) {
        this.enableUrlCheck = enableUrlCheck;
        return this;
    }
    public Boolean getEnableUrlCheck() {
        return this.enableUrlCheck;
    }

    public InsertApplicationRequest setHealthCheckURL(String healthCheckURL) {
        this.healthCheckURL = healthCheckURL;
        return this;
    }
    public String getHealthCheckURL() {
        return this.healthCheckURL;
    }

    public InsertApplicationRequest setHealthCheckUrl(String healthCheckUrl) {
        this.healthCheckUrl = healthCheckUrl;
        return this;
    }
    public String getHealthCheckUrl() {
        return this.healthCheckUrl;
    }

    public InsertApplicationRequest setHooks(String hooks) {
        this.hooks = hooks;
        return this;
    }
    public String getHooks() {
        return this.hooks;
    }

    public InsertApplicationRequest setJdk(String jdk) {
        this.jdk = jdk;
        return this;
    }
    public String getJdk() {
        return this.jdk;
    }

    public InsertApplicationRequest setJvmOptions(String jvmOptions) {
        this.jvmOptions = jvmOptions;
        return this;
    }
    public String getJvmOptions() {
        return this.jvmOptions;
    }

    public InsertApplicationRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public InsertApplicationRequest setMaxHeapSize(Integer maxHeapSize) {
        this.maxHeapSize = maxHeapSize;
        return this;
    }
    public Integer getMaxHeapSize() {
        return this.maxHeapSize;
    }

    public InsertApplicationRequest setMaxPermSize(Integer maxPermSize) {
        this.maxPermSize = maxPermSize;
        return this;
    }
    public Integer getMaxPermSize() {
        return this.maxPermSize;
    }

    public InsertApplicationRequest setMem(Integer mem) {
        this.mem = mem;
        return this;
    }
    public Integer getMem() {
        return this.mem;
    }

    public InsertApplicationRequest setMinHeapSize(Integer minHeapSize) {
        this.minHeapSize = minHeapSize;
        return this;
    }
    public Integer getMinHeapSize() {
        return this.minHeapSize;
    }

    public InsertApplicationRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public InsertApplicationRequest setReservedPortStr(String reservedPortStr) {
        this.reservedPortStr = reservedPortStr;
        return this;
    }
    public String getReservedPortStr() {
        return this.reservedPortStr;
    }

    public InsertApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public InsertApplicationRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

}
