// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddMigrationTaskRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The type of the instance. Valid values:</p>
     * <ul>
     * <li>Nacos-Ans</li>
     * <li>ZooKeeper</li>
     * <li>Eureka</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Nacos-Ans</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The endpoint of the source instance node.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.1:8848</p>
     */
    @NameInMap("OriginInstanceAddress")
    public String originInstanceAddress;

    /**
     * <p>The name of the source instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Source instance</p>
     */
    @NameInMap("OriginInstanceName")
    public String originInstanceName;

    /**
     * <p>The list of namespaces. This parameter is optional if you want to migrate applications from a Nacos instance.</p>
     * 
     * <strong>example:</strong>
     * <p>namesapceId1,namesapceId2</p>
     */
    @NameInMap("OriginInstanceNamespace")
    public String originInstanceNamespace;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description.</p>
     */
    @NameInMap("ProjectDesc")
    public String projectDesc;

    /**
     * <p>The extended request parameters in the JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    @NameInMap("SyncType")
    public String syncType;

    /**
     * <p>The name of the destination instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Destination instance</p>
     */
    @NameInMap("TargetClusterName")
    public String targetClusterName;

    /**
     * <p>The URL of the destination instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-66*****-nacos-ans.mse.aliyuncs.com:8848</p>
     */
    @NameInMap("TargetClusterUrl")
    public String targetClusterUrl;

    /**
     * <p>The ID of the destination instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-cn-ud82*****</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    public static AddMigrationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMigrationTaskRequest self = new AddMigrationTaskRequest();
        return TeaModel.build(map, self);
    }

    public AddMigrationTaskRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddMigrationTaskRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public AddMigrationTaskRequest setOriginInstanceAddress(String originInstanceAddress) {
        this.originInstanceAddress = originInstanceAddress;
        return this;
    }
    public String getOriginInstanceAddress() {
        return this.originInstanceAddress;
    }

    public AddMigrationTaskRequest setOriginInstanceName(String originInstanceName) {
        this.originInstanceName = originInstanceName;
        return this;
    }
    public String getOriginInstanceName() {
        return this.originInstanceName;
    }

    public AddMigrationTaskRequest setOriginInstanceNamespace(String originInstanceNamespace) {
        this.originInstanceNamespace = originInstanceNamespace;
        return this;
    }
    public String getOriginInstanceNamespace() {
        return this.originInstanceNamespace;
    }

    public AddMigrationTaskRequest setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
        return this;
    }
    public String getProjectDesc() {
        return this.projectDesc;
    }

    public AddMigrationTaskRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

    public AddMigrationTaskRequest setSyncType(String syncType) {
        this.syncType = syncType;
        return this;
    }
    public String getSyncType() {
        return this.syncType;
    }

    public AddMigrationTaskRequest setTargetClusterName(String targetClusterName) {
        this.targetClusterName = targetClusterName;
        return this;
    }
    public String getTargetClusterName() {
        return this.targetClusterName;
    }

    public AddMigrationTaskRequest setTargetClusterUrl(String targetClusterUrl) {
        this.targetClusterUrl = targetClusterUrl;
        return this;
    }
    public String getTargetClusterUrl() {
        return this.targetClusterUrl;
    }

    public AddMigrationTaskRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

}
