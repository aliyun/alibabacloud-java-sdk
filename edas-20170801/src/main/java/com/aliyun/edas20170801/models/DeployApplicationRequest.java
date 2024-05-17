// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeployApplicationRequest extends TeaModel {
    /**
     * <p>The environment variables of the application. Specify each environment variable by using two key-value pairs. Example: `{"name":"x","value":"y"},{"name":"x2","value":"y2"}`. The `keys` of the two key-value pairs are `name` and `value`.</p>
     */
    @NameInMap("AppEnv")
    public String appEnv;

    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](https://help.aliyun.com/document_detail/423162.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The number of batches per instance group.</p>
     * <br>
     * <p>*   If you specify an ID when you set the GroupId parameter, the application is deployed to the specified instance group. The minimum number of batches that can be specified is 1. The maximum number of batches is the maximum number of ECS instances in the Normal state in the instance group. The actual value falls in the range of [1, specified number]. The specified number of batches equals the number of ECS instances in the specified instance group.</p>
     * <p>*   If you set the GroupId parameter to all, the application is deployed to all instance groups. The minimum number of batches that can be specified is 1. The maximum number of batches is the number of ECS instances in the instance group that has the largest number of ECS instances in the Normal state.</p>
     */
    @NameInMap("Batch")
    public Integer batch;

    /**
     * <p>The wait time between deployment batches for the application. Unit: minutes.</p>
     * <br>
     * <p>*   Default value: 0. If no wait time between deployment batches is needed, set this parameter to 0.</p>
     * <p>*   Maximum value: 5.</p>
     * <br>
     * <p>If many deployment batches are needed, we recommend that you specify a small value for this parameter. Otherwise, the application deployment is time-consuming.</p>
     */
    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    /**
     * <p>The build package number of EDAS Container.</p>
     * <br>
     * <p>*   You do not need to set the parameter if you do not need to change the EDAS Container version during the deployment.</p>
     * <p>*   Set the parameter if you need to update the EDAS Container version of the application during the deployment.</p>
     * <br>
     * <p>You can query the build package number by using one of the following methods:</p>
     * <br>
     * <p>*   Call the ListBuildPack operation. For more information, see [ListBuildPack](https://help.aliyun.com/document_detail/149391.html).</p>
     * <p>*   Obtain the value in the **Build package number** column of the [Release notes for EDAS Container](https://help.aliyun.com/document_detail/92614.html) topic. For example, `59` indicates `EDAS Container 3.5.8`.</p>
     */
    @NameInMap("BuildPackId")
    public Long buildPackId;

    /**
     * <p>The IDs of the components used by the application. The parameter is not applicable to High-Speed Framework (HSF) applications. You can call the ListComponents operation to query the component IDs. For more information, see [ListComponents](https://help.aliyun.com/document_detail/423223.html).</p>
     * <br>
     * <p>*   If you have specified the component IDs when you create the application, you do not need to set the parameter when you deploy the application.</p>
     * <p>*   Set the parameter if you need to update the component versions for the application during the deployment.</p>
     * <br>
     * <p>Valid values for common application components:</p>
     * <br>
     * <p>*   4: Apache Tomcat 7.0.91</p>
     * <p>*   7: Apache Tomcat 8.5.42</p>
     * <p>*   5: OpenJDK 1.8.x</p>
     * <p>*   6: OpenJDK 1.7.x</p>
     * <br>
     * <p>For more information, see the Common application parameters section of the [InsertApplication](https://help.aliyun.com/document_detail/423185.html) topic.</p>
     */
    @NameInMap("ComponentIds")
    public String componentIds;

    /**
     * <p>The deployment mode of the application. Valid values: `url` and `image`. The image value is deprecated. You can deploy an application to a Swarm cluster only by using an image.``</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeployType")
    public String deployType;

    /**
     * <p>The description of the application deployment.</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>Specifies whether canary release is selected as the deployment method. Valid values:</p>
     * <br>
     * <p>*   true: Canary release is selected.</p>
     * <br>
     * <p>    *   To implement a canary release, specify the GroupId parameter, which specifies the ID of the instance group for the canary release.</p>
     * <p>    *   Canary release can be selected as the deployment method for only one batch.</p>
     * <p>    *   After the canary release is complete, the application is released in regular mode. The Batch parameter specifies the number of batches.</p>
     * <br>
     * <p>*   false: Single-batch release or phased release is selected.</p>
     */
    @NameInMap("Gray")
    public Boolean gray;

    /**
     * <p>The ID of the instance group to which the application is deployed. You can call the ListDeployGroup operation to query the ID of the instance group. For more information, see [ListDeployGroup](https://help.aliyun.com/document_detail/423184.html).</p>
     * <br>
     * <p>Set the parameter to `all` if you want to deploy the application to all instance groups.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The URL of the application image that is used to deploy the application in a Swarm cluster. We recommend that you use an image that is stored in Alibaba Cloud Container Registry. This parameter is deprecated.</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The version of the application deployment package. The value can be up to 64 characters in length. We recommend that you use a timestamp.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PackageVersion")
    public String packageVersion;

    /**
     * <p>The mode in which the deployment batches are triggered. Valid values:</p>
     * <br>
     * <p>*   0: automatic.</p>
     * <p>*   1: You must manually trigger the next batch. You can manually click **Proceed to Next Batch** in the console or call the ContinuePipeline operation to proceed to the next batch. We recommend that you choose the automatic mode when you call an API operation to deploy the application. For more information, see [ContinuePipeline](https://help.aliyun.com/document_detail/126990.html).</p>
     */
    @NameInMap("ReleaseType")
    public Long releaseType;

    /**
     * <p>The canary release policy. For more information about canary release policies, see [DeployK8sApplication](https://help.aliyun.com/document_detail/423212.html).</p>
     */
    @NameInMap("TrafficControlStrategy")
    public String trafficControlStrategy;

    /**
     * <p>The URL of the application deployment package. The package can be a WAR or JAR package. This parameter is required if you set the **DeployType** parameter to `url`. We recommend that you specify the URL of an application deployment package that is stored in an Object Storage Service (OSS) bucket.</p>
     */
    @NameInMap("WarUrl")
    public String warUrl;

    public static DeployApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationRequest self = new DeployApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeployApplicationRequest setAppEnv(String appEnv) {
        this.appEnv = appEnv;
        return this;
    }
    public String getAppEnv() {
        return this.appEnv;
    }

    public DeployApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeployApplicationRequest setBatch(Integer batch) {
        this.batch = batch;
        return this;
    }
    public Integer getBatch() {
        return this.batch;
    }

    public DeployApplicationRequest setBatchWaitTime(Integer batchWaitTime) {
        this.batchWaitTime = batchWaitTime;
        return this;
    }
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    public DeployApplicationRequest setBuildPackId(Long buildPackId) {
        this.buildPackId = buildPackId;
        return this;
    }
    public Long getBuildPackId() {
        return this.buildPackId;
    }

    public DeployApplicationRequest setComponentIds(String componentIds) {
        this.componentIds = componentIds;
        return this;
    }
    public String getComponentIds() {
        return this.componentIds;
    }

    public DeployApplicationRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public DeployApplicationRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public DeployApplicationRequest setGray(Boolean gray) {
        this.gray = gray;
        return this;
    }
    public Boolean getGray() {
        return this.gray;
    }

    public DeployApplicationRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeployApplicationRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DeployApplicationRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public DeployApplicationRequest setReleaseType(Long releaseType) {
        this.releaseType = releaseType;
        return this;
    }
    public Long getReleaseType() {
        return this.releaseType;
    }

    public DeployApplicationRequest setTrafficControlStrategy(String trafficControlStrategy) {
        this.trafficControlStrategy = trafficControlStrategy;
        return this;
    }
    public String getTrafficControlStrategy() {
        return this.trafficControlStrategy;
    }

    public DeployApplicationRequest setWarUrl(String warUrl) {
        this.warUrl = warUrl;
        return this;
    }
    public String getWarUrl() {
        return this.warUrl;
    }

}
