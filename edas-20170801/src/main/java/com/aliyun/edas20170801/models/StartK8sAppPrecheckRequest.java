// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class StartK8sAppPrecheckRequest extends TeaModel {
    /**
     * <p>The annotation of an application pod.</p>
     */
    @NameInMap("Annotations")
    public String annotations;

    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the application. The name must start with a letter, and can contain digits, letters, and hyphens (-). It can be up to 36 characters in length.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the application component. You can call the ListComponents operation to query application components. This parameter must be specified when the application runs in Apache Tomcat or in a standard Java application runtime environment. The Apache Tomcat application runtime environment is applicable to Dubbo applications that are deployed by using WAR packages. A standard Java application runtime environment is applicable to Spring Boot or Spring Cloud applications that are deployed by using JAR packages.</p>
     * <br>
     * <p>Valid values for regular application component IDs:</p>
     * <br>
     * <p>*   4: Apache Tomcat 7.0.91</p>
     * <p>*   5: OpenJDK 1.8.x</p>
     * <p>*   6: OpenJDK 1.7.x</p>
     * <p>*   7: Apache Tomcat 8.5.42</p>
     * <br>
     * <p>This parameter is available only for Java SDK 2.57.3 or later, or Python SDK 2.57.3 or later. Assume that you use an SDK that is not provided by Enterprise Distributed Application Service (EDAS), such as aliyun-python-sdk-core, aliyun-java-sdk-core, and Alibaba Cloud CLI. In this case, you can directly specify this parameter.</p>
     */
    @NameInMap("ComponentIds")
    public String componentIds;

    /**
     * <p>The configuration for mounting a Kubernetes ConfigMap or Secret to a directory in an elastic container instance. The following parameters are included in the configuration:</p>
     * <br>
     * <p>*   name: the name of the Kubernetes ConfigMap or Secret.</p>
     * <p>*   type: the type of the API object that you want to mount. You can mount a Kubernetes ConfigMap or Secret.</p>
     * <p>*   mountPath: the mount path. The mount path must be an absolute path that starts with a forward slash (/).</p>
     */
    @NameInMap("ConfigMountDescs")
    public String configMountDescs;

    /**
     * <p>The configuration for mounting a Kubernetes emptyDir volume to a directory in an elastic container instance. The following parameters are included in the configuration:</p>
     * <br>
     * <p>*   mountPath: The mount path in the container. This parameter is required.</p>
     * <p>*   readOnly: (Optional) The mount mode. The value true indicates the read-only mode. The value false indicates the read and write mode. Default value: false.</p>
     * <p>*   subPathExpr: (Optional) The regular expression that is used to match the subdirectory.</p>
     */
    @NameInMap("EmptyDirs")
    public String emptyDirs;

    /**
     * <p>The Kubernetes environment variables that are configured in EnvFrom mode. A ConfigMap or Secret is mounted to a directory. Each key corresponds to a file in the directory, and the content of the file is the value of the key.</p>
     * <br>
     * <p>The following parameters are included in the configuration of the EnvFroms parameter:</p>
     * <br>
     * <p>*   configMapRef: the ConfigMap that is referenced. The following parameter is included:</p>
     * <br>
     * <p>    name: the name of the ConfigMap.</p>
     * <br>
     * <p>*   secretRef: the Secret that is referenced. The following parameter is included:</p>
     * <br>
     * <p>    name: the name of the Secret.</p>
     */
    @NameInMap("EnvFroms")
    public String envFroms;

    /**
     * <p>The environment variables that are used to deploy the application. The value must be a JSON array. Valid values: regular environment variables, Kubernetes ConfigMap environment variables, and Kubernetes Secret environment variables. Specify regular environment variables in the following format:</p>
     * <br>
     * <p>`{"name":"x", "value": "y"}`</p>
     * <br>
     * <p>Specify Kubernetes ConfigMap environment variables in the following format to reference values from ConfigMaps:</p>
     * <br>
     * <p>`{ "name": "x2", "valueFrom": { "configMapKeyRef": { "name": "my-config", "key": "y2" } } }`</p>
     * <br>
     * <p>Specify Kubernetes Secret environment variables in the following format to reference values from Secrets:</p>
     * <br>
     * <p>`{ "name": "x3", "valueFrom": { "secretKeyRef": { "name": "my-secret", "key": "y3" } } }`</p>
     * <br>
     * <p>> If you want to cancel this configuration, set this parameter to an empty JSON array, which is in the format of "[]".</p>
     */
    @NameInMap("Envs")
    public String envs;

    /**
     * <p>The URL of the image.</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The configuration of Java startup parameters for a Java application. These startup parameters involve the memory, application, garbage collection (GC) policy, tools, service registration and discovery, and custom configurations. Proper parameter settings help reduce the GC overheads, shorten the server response time, and improve the throughput. Set this parameter to a JSON string. In the example, original indicates the configuration value, and startup indicates a startup parameter. The system automatically concatenates all startup values as the settings of Java startup parameters for the application. To delete this configuration, leave the parameter value empty by entering `""` or `"{}"`. The following parameters are included in the configuration:</p>
     * <br>
     * <p>*   InitialHeapSize: the initial size of the heap memory.</p>
     * <p>*   MaxHeapSize: the maximum size of the heap memory.</p>
     * <p>*   CustomParams: the custom parameters, such as JVM -D parameters.</p>
     * <p>*   Other parameters: You can view the JSON structure submitted by the frontend.</p>
     */
    @NameInMap("JavaStartUpConfig")
    public String javaStartUpConfig;

    /**
     * <p>The label of an application pod.</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The maximum size of space required by ephemeral storage. Unit: GB. The value 0 indicates that no limit is set on the ephemeral storage space.</p>
     */
    @NameInMap("LimitEphemeralStorage")
    public Integer limitEphemeralStorage;

    /**
     * <p>The maximum size of memory allowed for each application instance when the application is running. Unit: MB. The value of LimitMem must be greater than or equal to that of RequestsMem.</p>
     */
    @NameInMap("LimitMem")
    public Integer limitMem;

    /**
     * <p>The maximum number of CPU cores allowed for each application instance when the application is running. Unit: millicores. The value 0 indicates that no limit is set on CPU cores.</p>
     */
    @NameInMap("LimitmCpu")
    public Integer limitmCpu;

    /**
     * <p>The configurations that are used when the host files are mounted to the container on which the application is running. Example: `[{"type":"","nodePath":"/localfiles","mountPath":"/app/files"},{"type":"Directory","nodePath":"/mnt","mountPath":"/app/storage"}\\]`. Description:</p>
     * <br>
     * <p>*   `nodePath`: the host path.</p>
     * <p>*   `mountPath`: the path in the container.</p>
     * <p>*   `type`: the mounting type.</p>
     */
    @NameInMap("LocalVolume")
    public String localVolume;

    /**
     * <p>The namespace of the Kubernetes cluster. This parameter specifies the Kubernetes namespace in which your application is deployed. By default, the default namespace is used.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The URL of the deployment package.</p>
     */
    @NameInMap("PackageUrl")
    public String packageUrl;

    /**
     * <p>The configuration for mounting a Kubernetes PersistentVolumeClaim (PVC) to a directory in an elastic container instance. The following parameters are included in the configuration:</p>
     * <br>
     * <p>*   pvcName: the name of the PVC. Make sure that the volume exists and is in the Bound state.</p>
     * <br>
     * <p>*   mountPaths: the directory to which you want to mount the PVC. You can configure multiple directories. You can set the following two parameters for each mount directory:</p>
     * <br>
     * <p>    *   mountPath: the mount path. The mount path must be an absolute path that starts with a forward slash (/).</p>
     * <p>    *   readOnly: the mount mode. The value true indicates the read-only mode. The value false indicates the read and write mode. Default value: false.</p>
     */
    @NameInMap("PvcMountDescs")
    public String pvcMountDescs;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of application instances.</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The minimum size of space required by ephemeral storage. Unit: GB. The value 0 indicates that no limit is set on the ephemeral storage space.</p>
     */
    @NameInMap("RequestsEphemeralStorage")
    public Integer requestsEphemeralStorage;

    /**
     * <p>The maximum size of memory allowed for each application instance when the application is created. Unit: MB. The value 0 indicates that no limit is set on the memory size. The value of RequestsMem cannot be greater than that of LimitMem.</p>
     */
    @NameInMap("RequestsMem")
    public Integer requestsMem;

    /**
     * <p>The maximum number of CPU cores allowed for each application instance when the application is created. Unit: millicores.</p>
     */
    @NameInMap("RequestsmCpu")
    public Integer requestsmCpu;

    public static StartK8sAppPrecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        StartK8sAppPrecheckRequest self = new StartK8sAppPrecheckRequest();
        return TeaModel.build(map, self);
    }

    public StartK8sAppPrecheckRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public StartK8sAppPrecheckRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartK8sAppPrecheckRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public StartK8sAppPrecheckRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public StartK8sAppPrecheckRequest setComponentIds(String componentIds) {
        this.componentIds = componentIds;
        return this;
    }
    public String getComponentIds() {
        return this.componentIds;
    }

    public StartK8sAppPrecheckRequest setConfigMountDescs(String configMountDescs) {
        this.configMountDescs = configMountDescs;
        return this;
    }
    public String getConfigMountDescs() {
        return this.configMountDescs;
    }

    public StartK8sAppPrecheckRequest setEmptyDirs(String emptyDirs) {
        this.emptyDirs = emptyDirs;
        return this;
    }
    public String getEmptyDirs() {
        return this.emptyDirs;
    }

    public StartK8sAppPrecheckRequest setEnvFroms(String envFroms) {
        this.envFroms = envFroms;
        return this;
    }
    public String getEnvFroms() {
        return this.envFroms;
    }

    public StartK8sAppPrecheckRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public StartK8sAppPrecheckRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public StartK8sAppPrecheckRequest setJavaStartUpConfig(String javaStartUpConfig) {
        this.javaStartUpConfig = javaStartUpConfig;
        return this;
    }
    public String getJavaStartUpConfig() {
        return this.javaStartUpConfig;
    }

    public StartK8sAppPrecheckRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public StartK8sAppPrecheckRequest setLimitEphemeralStorage(Integer limitEphemeralStorage) {
        this.limitEphemeralStorage = limitEphemeralStorage;
        return this;
    }
    public Integer getLimitEphemeralStorage() {
        return this.limitEphemeralStorage;
    }

    public StartK8sAppPrecheckRequest setLimitMem(Integer limitMem) {
        this.limitMem = limitMem;
        return this;
    }
    public Integer getLimitMem() {
        return this.limitMem;
    }

    public StartK8sAppPrecheckRequest setLimitmCpu(Integer limitmCpu) {
        this.limitmCpu = limitmCpu;
        return this;
    }
    public Integer getLimitmCpu() {
        return this.limitmCpu;
    }

    public StartK8sAppPrecheckRequest setLocalVolume(String localVolume) {
        this.localVolume = localVolume;
        return this;
    }
    public String getLocalVolume() {
        return this.localVolume;
    }

    public StartK8sAppPrecheckRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public StartK8sAppPrecheckRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public StartK8sAppPrecheckRequest setPvcMountDescs(String pvcMountDescs) {
        this.pvcMountDescs = pvcMountDescs;
        return this;
    }
    public String getPvcMountDescs() {
        return this.pvcMountDescs;
    }

    public StartK8sAppPrecheckRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartK8sAppPrecheckRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public StartK8sAppPrecheckRequest setRequestsEphemeralStorage(Integer requestsEphemeralStorage) {
        this.requestsEphemeralStorage = requestsEphemeralStorage;
        return this;
    }
    public Integer getRequestsEphemeralStorage() {
        return this.requestsEphemeralStorage;
    }

    public StartK8sAppPrecheckRequest setRequestsMem(Integer requestsMem) {
        this.requestsMem = requestsMem;
        return this;
    }
    public Integer getRequestsMem() {
        return this.requestsMem;
    }

    public StartK8sAppPrecheckRequest setRequestsmCpu(Integer requestsmCpu) {
        this.requestsmCpu = requestsmCpu;
        return this;
    }
    public Integer getRequestsmCpu() {
        return this.requestsmCpu;
    }

}
