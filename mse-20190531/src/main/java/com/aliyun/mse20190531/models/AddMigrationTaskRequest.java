// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddMigrationTaskRequest extends TeaModel {
    /**
     * <p>Language type of the returned information:</p>
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
     * <p>Cluster type.</p>
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
     * <p>Source instance node address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.1:8848</p>
     */
    @NameInMap("OriginInstanceAddress")
    public String originInstanceAddress;

    /**
     * <p>Source instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>Source instance</p>
     */
    @NameInMap("OriginInstanceName")
    public String originInstanceName;

    /**
     * <p>Namespace list, required when the source cluster is Nacos.</p>
     * 
     * <strong>example:</strong>
     * <p>namesapceId1,namesapceId2</p>
     */
    @NameInMap("OriginInstanceNamespace")
    public String originInstanceNamespace;

    /**
     * <p>Description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a description.</p>
     */
    @NameInMap("ProjectDesc")
    public String projectDesc;

    /**
     * <p>Extended request parameters, in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("RequestPars")
    public String requestPars;

    /**
     * <p>SyncType</p>
     * 
     * <strong>example:</strong>
     * <p>Service</p>
     */
    @NameInMap("SyncType")
    public String syncType;

    /**
     * <p>Target instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>Destination instance</p>
     */
    @NameInMap("TargetClusterName")
    public String targetClusterName;

    /**
     * <p>Target instance URL.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-66*****-nacos-ans.mse.aliyuncs.com:8848</p>
     */
    @NameInMap("TargetClusterUrl")
    public String targetClusterUrl;

    /**
     * <p>Target instance ID.</p>
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
