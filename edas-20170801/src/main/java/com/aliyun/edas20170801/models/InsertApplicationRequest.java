// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertApplicationRequest extends TeaModel {
    /**
     * <p>The name of the application. The name can contain only digits, letters, hyphens (-), and underscores (_). It must start with a letter and can be up to 36 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hello-edas-test-1</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>The build package number of EDAS-Container. This parameter is required when you create a High-speed Service Framework (HSF) application. You can obtain the build package number in one of the following ways:</p>
     * <ul>
     * <li><p>Call the ListBuildPack operation. For more information, see <a href="https://help.aliyun.com/document_detail/149391.html">ListBuildPack</a>.</p>
     * </li>
     * <li><p>Obtain the build package number from the <strong>Build Package Number</strong> column in the <a href="https://help.aliyun.com/document_detail/92614.html">Container versions</a> table.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>59</p>
     */
    @NameInMap("BuildPackId")
    public Integer buildPackId;

    /**
     * <p>The ID of the ECS cluster. Specify this parameter to create the application in a specific ECS cluster. If you leave this parameter empty, the application is created in the default cluster. We recommend that you specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>13136119-f384-4f50-b76e-xxxxxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the application component. You can call the ListComponents operation to query the component ID. For more information, see <a href="https://help.aliyun.com/document_detail/97502.html">ListComponents</a>.</p>
     * <p>This parameter is required if the application runs in an Apache Tomcat container (for Dubbo applications that are deployed in a WAR package) or a standard Java application runtime environment (for Spring Boot or Spring Cloud applications that are deployed in a JAR package).</p>
     * <p>The following application component IDs are commonly used:</p>
     * <ul>
     * <li><p>4: Apache Tomcat 7.0.91</p>
     * </li>
     * <li><p>7: Apache Tomcat 8.5.42</p>
     * </li>
     * <li><p>5: OpenJDK 1.8.x</p>
     * </li>
     * <li><p>6: OpenJDK 1.7.x</p>
     * </li>
     * </ul>
     * <p>To set this parameter, you must update the Java or Python software development kit (SDK) to version 2.57.3 or later. If you do not use an EDAS SDK, such as aliyun-python-sdk-core, aliyun-java-sdk-core, or Alibaba Cloud CLI, you can set this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ComponentIds")
    public String componentIds;

    /**
     * <p>\<em>\</em>(Deprecated)\<em>\</em> The number of CPU cores for the application container in a Swarm cluster.</p>
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
     * <p>The \<code>ecu_id\\</code> of the ECS instance to which you want to scale out the application. The \<code>ecu_id\\</code> is the unique ID of an ECS instance that is imported to EDAS. To specify multiple \<code>ecu_id\\</code>s, separate them with commas (,). You can call the ListScaleOutEcu operation to query the \<code>ecu_id\\</code>. For more information, see <a href="https://help.aliyun.com/document_detail/149371.html">ListScaleOutEcu</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>07bd417a-b863-477d-<strong><strong>-</strong></strong>********</p>
     */
    @NameInMap("EcuInfo")
    public String ecuInfo;

    /**
     * <p>Specifies whether to enable the port health check. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnablePortCheck")
    public Boolean enablePortCheck;

    /**
     * <p>Specifies whether to enable the health check URL. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled</p>
     * </li>
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
     * <p>The configuration of the mounted script. The value is a JSON string. Example:
     * <code>[{&quot;ignoreFail&quot;:false,&quot;name&quot;:&quot;postprepareInstanceEnvironmentOnScaleOut&quot;,&quot;script&quot;:&quot;ls&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;postdeleteInstanceDataOnScaleIn&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;prestartInstance&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;poststartInstance&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;prestopInstance&quot;,&quot;script&quot;:&quot;&quot;},{&quot;ignoreFail&quot;:true,&quot;name&quot;:&quot;poststopInstance&quot;,&quot;script&quot;:&quot;&quot;}]</code></p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ignoreFail&quot;:false,&quot;name&quot;:&quot;postprepareInstanceEnvironmentOnScaleOut&quot;,&quot;script&quot;:&quot;ls&quot;}]</p>
     */
    @NameInMap("Hooks")
    public String hooks;

    /**
     * <p><strong>(Deprecated)</strong> The version of the Java Development Kit (JDK) that the application uses.</p>
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
     * <p>The ID of the microservices namespace. In the EDAS console, choose <strong>Resource Management</strong> &gt; <strong>Microservices Namespace</strong> in the navigation pane on the left to view the ID of the microservices namespace. You can also call the ListUserDefineRegion operation to query the ID. For more information, see <a href="https://help.aliyun.com/document_detail/149377.html">ListUserDefineRegion</a>.</p>
     * <ul>
     * <li><p>If the specified cluster is not in the default microservices namespace, you must specify this parameter. Otherwise, the \<code>application regionId is different with cluster regionId!\\</code> error is reported.</p>
     * </li>
     * <li><p>If the cluster is in the default microservices namespace, you do not need to specify this parameter. The microservices namespace of the application must be the same as the microservices namespace of the specified cluster.</p>
     * </li>
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
     * <p>The size of the permanent generation memory. Unit: MB.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MaxPermSize")
    public Integer maxPermSize;

    /**
     * <p>\<em>\</em>(Deprecated)\<em>\</em> The memory size for the application container in a Swarm cluster.</p>
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
     * <p>The format of the application deployment package. Valid values: war and jar.</p>
     * 
     * <strong>example:</strong>
     * <p>war</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>\<em>\</em>(Deprecated)\<em>\</em> The reserved port of the application.</p>
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
     * <p><strong>(Deprecated)</strong> The version of Apache Tomcat.</p>
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
