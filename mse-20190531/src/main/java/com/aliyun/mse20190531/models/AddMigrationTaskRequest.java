// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddMigrationTaskRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("Id")
    public String id;

    @NameInMap("OriginInstanceAddress")
    public String originInstanceAddress;

    @NameInMap("OriginInstanceName")
    public String originInstanceName;

    @NameInMap("OriginInstanceNamespace")
    public String originInstanceNamespace;

    @NameInMap("ProjectDesc")
    public String projectDesc;

    @NameInMap("RequestPars")
    public String requestPars;

    @NameInMap("TargetClusterName")
    public String targetClusterName;

    @NameInMap("TargetClusterUrl")
    public String targetClusterUrl;

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

    public AddMigrationTaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
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
