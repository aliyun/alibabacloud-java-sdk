// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateMigrationTaskRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The type of the instance.</p>
     * <br>
     * <p>*   Nacos-Ans</p>
     * <p>*   ZooKeeper</p>
     * <p>*   Eureka</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The source instance node address.</p>
     */
    @NameInMap("OriginInstanceAddress")
    public String originInstanceAddress;

    /**
     * <p>The name of the source instance.</p>
     */
    @NameInMap("OriginInstanceName")
    public String originInstanceName;

    /**
     * <p>The list of namespaces. This parameter is optional if the source instance is a Nacos instance.</p>
     */
    @NameInMap("OriginInstanceNamespace")
    public String originInstanceNamespace;

    /**
     * <p>The description.</p>
     */
    @NameInMap("ProjectDesc")
    public String projectDesc;

    /**
     * <p>The extended request parameters in the JSON format.</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>The name of the destination instance.</p>
     */
    @NameInMap("TargetClusterName")
    public String targetClusterName;

    /**
     * <p>The URL of the destination instance.</p>
     */
    @NameInMap("TargetClusterUrl")
    public String targetClusterUrl;

    /**
     * <p>The ID of the destination instance.</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    public static UpdateMigrationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMigrationTaskRequest self = new UpdateMigrationTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMigrationTaskRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateMigrationTaskRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public UpdateMigrationTaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateMigrationTaskRequest setOriginInstanceAddress(String originInstanceAddress) {
        this.originInstanceAddress = originInstanceAddress;
        return this;
    }
    public String getOriginInstanceAddress() {
        return this.originInstanceAddress;
    }

    public UpdateMigrationTaskRequest setOriginInstanceName(String originInstanceName) {
        this.originInstanceName = originInstanceName;
        return this;
    }
    public String getOriginInstanceName() {
        return this.originInstanceName;
    }

    public UpdateMigrationTaskRequest setOriginInstanceNamespace(String originInstanceNamespace) {
        this.originInstanceNamespace = originInstanceNamespace;
        return this;
    }
    public String getOriginInstanceNamespace() {
        return this.originInstanceNamespace;
    }

    public UpdateMigrationTaskRequest setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
        return this;
    }
    public String getProjectDesc() {
        return this.projectDesc;
    }

    public UpdateMigrationTaskRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public UpdateMigrationTaskRequest setTargetClusterName(String targetClusterName) {
        this.targetClusterName = targetClusterName;
        return this;
    }
    public String getTargetClusterName() {
        return this.targetClusterName;
    }

    public UpdateMigrationTaskRequest setTargetClusterUrl(String targetClusterUrl) {
        this.targetClusterUrl = targetClusterUrl;
        return this;
    }
    public String getTargetClusterUrl() {
        return this.targetClusterUrl;
    }

    public UpdateMigrationTaskRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

}
