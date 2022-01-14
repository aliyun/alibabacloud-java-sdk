// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class StartUserAppAsyncEnhanceInMsaRequest extends TeaModel {
    @NameInMap("ApkProtector")
    public Boolean apkProtector;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("Classes")
    public String classes;

    @NameInMap("DalvikDebugger")
    public Integer dalvikDebugger;

    @NameInMap("EmulatorEnvironment")
    public Integer emulatorEnvironment;

    @NameInMap("Id")
    public Long id;

    @NameInMap("JavaHook")
    public Integer javaHook;

    @NameInMap("MemoryDump")
    public Integer memoryDump;

    @NameInMap("NativeDebugger")
    public Integer nativeDebugger;

    @NameInMap("NativeHook")
    public Integer nativeHook;

    @NameInMap("PackageTampered")
    public Integer packageTampered;

    @NameInMap("Root")
    public Integer root;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("TotalSwitch")
    public Boolean totalSwitch;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static StartUserAppAsyncEnhanceInMsaRequest build(java.util.Map<String, ?> map) throws Exception {
        StartUserAppAsyncEnhanceInMsaRequest self = new StartUserAppAsyncEnhanceInMsaRequest();
        return TeaModel.build(map, self);
    }

    public StartUserAppAsyncEnhanceInMsaRequest setApkProtector(Boolean apkProtector) {
        this.apkProtector = apkProtector;
        return this;
    }
    public Boolean getApkProtector() {
        return this.apkProtector;
    }

    public StartUserAppAsyncEnhanceInMsaRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartUserAppAsyncEnhanceInMsaRequest setClasses(String classes) {
        this.classes = classes;
        return this;
    }
    public String getClasses() {
        return this.classes;
    }

    public StartUserAppAsyncEnhanceInMsaRequest setDalvikDebugger(Integer dalvikDebugger) {
        this.dalvikDebugger = dalvikDebugger;
        return this;
    }
    public Integer getDalvikDebugger() {
        return this.dalvikDebugger;
    }

    public StartUserAppAsyncEnhanceInMsaRequest setEmulatorEnvironment(Integer emulatorEnvironment) {
        this.emulatorEnvironment = emulatorEnvironment;
        return this;
    }
    public Integer getEmulatorEnvironment() {
        return this.emulatorEnvironment;
    }

    public StartUserAppAsyncEnhanceInMsaRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public StartUserAppAsyncEnhanceInMsaRequest setJavaHook(Integer javaHook) {
        this.javaHook = javaHook;
        return this;
    }
    public Integer getJavaHook() {
        return this.javaHook;
    }

    public StartUserAppAsyncEnhanceInMsaRequest setMemoryDump(Integer memoryDump) {
        this.memoryDump = memoryDump;
        return this;
    }
    public Integer getMemoryDump() {
        return this.memoryDump;
    }

    public StartUserAppAsyncEnhanceInMsaRequest setNativeDebugger(Integer nativeDebugger) {
        this.nativeDebugger = nativeDebugger;
        return this;
    }
    public Integer getNativeDebugger() {
        return this.nativeDebugger;
    }

    public StartUserAppAsyncEnhanceInMsaRequest setNativeHook(Integer nativeHook) {
        this.nativeHook = nativeHook;
        return this;
    }
    public Integer getNativeHook() {
        return this.nativeHook;
    }

    public StartUserAppAsyncEnhanceInMsaRequest setPackageTampered(Integer packageTampered) {
        this.packageTampered = packageTampered;
        return this;
    }
    public Integer getPackageTampered() {
        return this.packageTampered;
    }

    public StartUserAppAsyncEnhanceInMsaRequest setRoot(Integer root) {
        this.root = root;
        return this;
    }
    public Integer getRoot() {
        return this.root;
    }

    public StartUserAppAsyncEnhanceInMsaRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public StartUserAppAsyncEnhanceInMsaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public StartUserAppAsyncEnhanceInMsaRequest setTotalSwitch(Boolean totalSwitch) {
        this.totalSwitch = totalSwitch;
        return this;
    }
    public Boolean getTotalSwitch() {
        return this.totalSwitch;
    }

    public StartUserAppAsyncEnhanceInMsaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
