// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeployApplicationRequest extends TeaModel {
    /**
     * <p>The environment variables of the application. Specify each environment variable by using two key-value pairs. Example: <code>{&quot;name&quot;:&quot;x&quot;,&quot;value&quot;:&quot;y&quot;},{&quot;name&quot;:&quot;x2&quot;,&quot;value&quot;:&quot;y2&quot;}</code>. The <code>keys</code> of the two key-value pairs are <code>name</code> and <code>value</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;env_name_1\&quot;, \&quot;value\&quot;:\&quot;env_value_1\&quot;}, {\&quot;name\&quot;:\&quot;env_name_2\&quot;,\&quot;value\&quot;:\&quot;env_value_2\&quot;}]</p>
     */
    @NameInMap("AppEnv")
    public String appEnv;

    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/423162.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3616cdca-********************</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The number of batches per instance group.</p>
     * <ul>
     * <li>If you specify an ID when you set the GroupId parameter, the application is deployed to the specified instance group. The minimum number of batches that can be specified is 1. The maximum number of batches is the maximum number of ECS instances in the Normal state in the instance group. The actual value falls in the range of [1, specified number]. The specified number of batches equals the number of ECS instances in the specified instance group.</li>
     * <li>If you set the GroupId parameter to all, the application is deployed to all instance groups. The minimum number of batches that can be specified is 1. The maximum number of batches is the number of ECS instances in the instance group that has the largest number of ECS instances in the Normal state.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Batch")
    public Integer batch;

    /**
     * <p>The wait time between deployment batches for the application. Unit: minutes.</p>
     * <ul>
     * <li>Default value: 0. If no wait time between deployment batches is needed, set this parameter to 0.</li>
     * <li>Maximum value: 5.</li>
     * </ul>
     * <p>If many deployment batches are needed, we recommend that you specify a small value for this parameter. Otherwise, the application deployment is time-consuming.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    /**
     * <p>The build package number of EDAS Container.</p>
     * <ul>
     * <li>You do not need to set the parameter if you do not need to change the EDAS Container version during the deployment.</li>
     * <li>Set the parameter if you need to update the EDAS Container version of the application during the deployment.</li>
     * </ul>
     * <p>You can query the build package number by using one of the following methods:</p>
     * <ul>
     * <li>Call the ListBuildPack operation. For more information, see <a href="https://help.aliyun.com/document_detail/149391.html">ListBuildPack</a>.</li>
     * <li>Obtain the value in the <strong>Build package number</strong> column of the <a href="https://help.aliyun.com/document_detail/92614.html">Release notes for EDAS Container</a> topic. For example, <code>59</code> indicates <code>EDAS Container 3.5.8</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>59</p>
     */
    @NameInMap("BuildPackId")
    public Long buildPackId;

    /**
     * <p>The IDs of the components used by the application. The parameter is not applicable to High-Speed Framework (HSF) applications. You can call the ListComponents operation to query the component IDs. For more information, see <a href="https://help.aliyun.com/document_detail/423223.html">ListComponents</a>.</p>
     * <ul>
     * <li>If you have specified the component IDs when you create the application, you do not need to set the parameter when you deploy the application.</li>
     * <li>Set the parameter if you need to update the component versions for the application during the deployment.</li>
     * </ul>
     * <p>Valid values for common application components:</p>
     * <ul>
     * <li>4: Apache Tomcat 7.0.91</li>
     * <li>7: Apache Tomcat 8.5.42</li>
     * <li>5: OpenJDK 1.8.x</li>
     * <li>6: OpenJDK 1.7.x</li>
     * </ul>
     * <p>For more information, see the Common application parameters section of the <a href="https://help.aliyun.com/document_detail/423185.html">InsertApplication</a> topic.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ComponentIds")
    public String componentIds;

    /**
     * <p>The deployment mode of the application. Valid values: <code>url</code> and <code>image</code>. The image value is deprecated. You can deploy an application to a Swarm cluster only by using an image.``</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>URL</p>
     */
    @NameInMap("DeployType")
    public String deployType;

    /**
     * <p>The description of the application deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>Deploy by edas pop api</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>Specifies whether canary release is selected as the deployment method. Valid values:</p>
     * <ul>
     * <li><p>true: Canary release is selected.</p>
     * <ul>
     * <li>To implement a canary release, specify the GroupId parameter, which specifies the ID of the instance group for the canary release.</li>
     * <li>Canary release can be selected as the deployment method for only one batch.</li>
     * <li>After the canary release is complete, the application is released in regular mode. The Batch parameter specifies the number of batches.</li>
     * </ul>
     * </li>
     * <li><p>false: Single-batch release or phased release is selected.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Gray")
    public Boolean gray;

    /**
     * <p>The ID of the instance group to which the application is deployed. You can call the ListDeployGroup operation to query the ID of the instance group. For more information, see <a href="https://help.aliyun.com/document_detail/423184.html">ListDeployGroup</a>.</p>
     * <p>Set the parameter to <code>all</code> if you want to deploy the application to all instance groups.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The URL of the application image that is used to deploy the application in a Swarm cluster. We recommend that you use an image that is stored in Alibaba Cloud Container Registry. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/mw/testapp:latest</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The version of the application deployment package. The value can be up to 64 characters in length. We recommend that you use a timestamp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("PackageVersion")
    public String packageVersion;

    /**
     * <p>The mode in which the deployment batches are triggered. Valid values:</p>
     * <ul>
     * <li>0: automatic.</li>
     * <li>1: You must manually trigger the next batch. You can manually click <strong>Proceed to Next Batch</strong> in the console or call the ContinuePipeline operation to proceed to the next batch. We recommend that you choose the automatic mode when you call an API operation to deploy the application. For more information, see <a href="https://help.aliyun.com/document_detail/126990.html">ContinuePipeline</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReleaseType")
    public Long releaseType;

    /**
     * <p>The canary release policy. For more information about canary release policies, see <a href="https://help.aliyun.com/document_detail/423212.html">DeployK8sApplication</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;http&quot;:{&quot;rules&quot;:[{&quot;conditionType&quot;:&quot;percent&quot;,&quot;percent&quot;:10}]}}</p>
     */
    @NameInMap("TrafficControlStrategy")
    public String trafficControlStrategy;

    /**
     * <p>The URL of the application deployment package. The package can be a WAR or JAR package. This parameter is required if you set the <strong>DeployType</strong> parameter to <code>url</code>. We recommend that you specify the URL of an application deployment package that is stored in an Object Storage Service (OSS) bucket.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://edas.oss-cn-hangzhou.aliyuncs.com/demo/hello-edas.war">https://edas.oss-cn-hangzhou.aliyuncs.com/demo/hello-edas.war</a></p>
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
