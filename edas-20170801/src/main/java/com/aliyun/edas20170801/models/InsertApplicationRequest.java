// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertApplicationRequest extends TeaModel {
    /**
     * <p>The name of the application. The name can contain only digits, letters, hyphens (-), and underscores (_) and must start with a letter. The name can be up to 36 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hello-edas-test-1</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The build package number of EDAS Container. This parameter is required if you create a High-Speed Service Framework (HSF) application. You can query the build package number by using one of the following methods:</p>
     * <ul>
     * <li>Call the ListBuildPack operation. For more information, see <a href="https://help.aliyun.com/document_detail/149391.html">ListBuildPack</a>.</li>
     * <li>Obtain the value in the <strong>Build package number</strong> column of the <a href="https://help.aliyun.com/document_detail/92614.html">Release notes for EDAS Container</a> topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>59</p>
     */
    @NameInMap("BuildPackId")
    public Integer buildPackId;

    /**
     * <p>The ID of the ECS cluster in which you want to create the application. If you specify an ID, the application is created in the specified ECS cluster. If you leave this parameter empty, the application is created in the default cluster. We recommend that you specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>13136119-f384-4f50-b76e-xxxxxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the application component. You can call the ListComponents operation to query the component IDs. For more information, see <a href="https://help.aliyun.com/document_detail/97502.html">ListComponents</a>.</p>
     * <p>This parameter is required if the application runs in Apache Tomcat or in a standard Java application runtime environment. The Apache Tomcat application runtime environment is applicable to Dubbo applications that are deployed by using WAR packages. A standard Java application runtime environment is applicable to Spring Boot or Spring Cloud applications that are deployed by using JAR packages.</p>
     * <p>Valid values for common application components:</p>
     * <ul>
     * <li>4: Apache Tomcat 7.0.91</li>
     * <li>7: Apache Tomcat 8.5.42</li>
     * <li>5: OpenJDK 1.8.x</li>
     * <li>6: OpenJDK 1.7.x</li>
     * </ul>
     * <p>This parameter is available only for Java SDK 2.57.3 or later, or Python SDK 2.57.3 or later. Assume that you use an SDK that is not provided by EDAS, for example, aliyun-python-sdk-core, aliyun-java-sdk-core, and Alibaba Cloud CLI. In this case, you can directly specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ComponentIds")
    public String componentIds;

    /**
     * <p>The number of CPU cores that can be used by the application container in a Swarm cluster. \<em>\<em>This parameter is deprecated.\</em>\</em></p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The description of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>create by edas pop api</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The value of <code>ecu_id</code> of the ECS instance to be added during scale-out. The ECU ID is the unique identity for an ECS instance that is imported to EDAS. Separate multiple values of <code>ecu_id</code> with commas (,). You can call the ListScaleOutEcu operation to query the value of <code>ecu_id</code>. For more information, see <a href="https://help.aliyun.com/document_detail/149371.html">ListScaleOutEcu</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>07bd417a-b863-477d-<strong><strong>-</strong></strong>********</p>
     */
    @NameInMap("EcuInfo")
    public String ecuInfo;

    /**
     * <p>Specifies whether to enable the port health check. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enable the port health check.</li>
     * <li><strong>false</strong>: does not enable the port health check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnablePortCheck")
    public Boolean enablePortCheck;

    /**
     * <p>Specifies whether to enable the URL health check. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the URL health check.</li>
     * <li><strong>false</strong>: does not enable the URL health check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableUrlCheck")
    public Boolean enableUrlCheck;

    /**
     * <p>The health check URL of the application. This parameter is equivalent to the HealthCheckURL parameter.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://127.0.0.1:8080/_ehc.html">http://127.0.0.1:8080/_ehc.html</a></p>
     */
    @NameInMap("HealthCheckUrl")
    public String healthCheckUrl;

    /**
     * <p>The script to mount. Set the value in the JSON format. Example: <code>[{&quot;ignoreFail&quot;:false,&quot;name&quot;:&quot;postprepareInstanceEnvironmentOnScaleOut&quot;,&quot;script&quot;:&quot;ls&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;postdeleteInstanceDataOnScaleIn&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;prestartInstance&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;poststartInstance&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;prestopInstance&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;poststopInstance&quot;,&quot;script&quot;:&quot;&quot;}]</code></p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ignoreFail&quot;:false,&quot;name&quot;:&quot;postprepareInstanceEnvironmentOnScaleOut&quot;,&quot;script&quot;:&quot;ls&quot;}]</p>
     */
    @NameInMap("Hooks")
    public String hooks;

    /**
     * <p>The version of the Java Development Kit (JDK) used to deploy the application. **This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Jdk")
    public String jdk;

    /**
     * <p>The custom parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>-Dproperty=value</p>
     */
    @NameInMap("JvmOptions")
    public String jvmOptions;

    /**
     * <p>The ID of the microservices namespace. To query the ID of a microservices namespace, you can choose <strong>Resource Management</strong> &gt; <strong>Microservice Namespaces</strong> in the left-side navigation pane of the EDAS console or call the ListUserDefineRegion operation. For more information, see <a href="https://help.aliyun.com/document_detail/149377.html">ListUserDefineRegion</a>.</p>
     * <ul>
     * <li>This parameter is required if the cluster you specify is not deployed in the default microservices namespace. Otherwise, the message <code>application regionId is different with cluster regionId!</code> appears.</li>
     * <li>If the cluster you specify is deployed in the default microservices namespace, you do not need to specify this parameter. Set this parameter to the ID of the microservices namespace in which the cluster you specify is deployed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:prod</p>
     */
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    /**
     * <p>The maximum size of the heap memory. Unit: MB.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxHeapSize")
    public Integer maxHeapSize;

    /**
     * <p>The size of the permanent generation heap memory. Unit: MB.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MaxPermSize")
    public Integer maxPermSize;

    /**
     * <p>The memory size that can be used by the application container in a Swarm cluster. \<em>\<em>This parameter is deprecated.\</em>\</em></p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("Mem")
    public Integer mem;

    /**
     * <p>The initial size of the heap memory. Unit: MB.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MinHeapSize")
    public Integer minHeapSize;

    /**
     * <p>The type of the application deployment package. Valid values: war and jar.</p>
     * 
     * <strong>example:</strong>
     * <p>war</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The reserved port for the application. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>8090</p>
     */
    @NameInMap("ReservedPortStr")
    public String reservedPortStr;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek24j4s4b*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The version of Apache Tomcat. **This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
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
