// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateRpcServiceRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("InterfaceName")
    public String interfaceName;

    @NameInMap("InvokeType")
    public String invokeType;

    @NameInMap("Params")
    public String params;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("MethodName")
    public String methodName;

    @NameInMap("VersionCode")
    public String versionCode;

    public static CreateRpcServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRpcServiceRequest self = new CreateRpcServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateRpcServiceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateRpcServiceRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateRpcServiceRequest setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }
    public String getInterfaceName() {
        return this.interfaceName;
    }

    public CreateRpcServiceRequest setInvokeType(String invokeType) {
        this.invokeType = invokeType;
        return this;
    }
    public String getInvokeType() {
        return this.invokeType;
    }

    public CreateRpcServiceRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public CreateRpcServiceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateRpcServiceRequest setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    public String getMethodName() {
        return this.methodName;
    }

    public CreateRpcServiceRequest setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

}
