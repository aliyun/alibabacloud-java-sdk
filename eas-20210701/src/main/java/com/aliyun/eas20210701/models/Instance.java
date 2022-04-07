// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class Instance extends TeaModel {
    // 实例所在的宿主机IP
    @NameInMap("HostIP")
    public String hostIP;

    // 实例所在的宿主机名字
    @NameInMap("HostName")
    public String hostName;

    // 实例的内网IP
    @NameInMap("InnerIP")
    public String innerIP;

    // 实例的名字
    @NameInMap("InstanceName")
    public String instanceName;

    // 实例的网络端口
    @NameInMap("InstancePort")
    public Integer instancePort;

    // 实例上一次退出的状态
    @NameInMap("LastState")
    public java.util.List<java.util.Map<String, ?>> lastState;

    // 实例的命名空间
    @NameInMap("Namespace")
    public String namespace;

    // 实例已经启动完成的进程数
    @NameInMap("ReadyProcesses")
    public Integer readyProcesses;

    // 实例当前状态的标识
    @NameInMap("Reason")
    public String reason;

    // 实例重启次数
    @NameInMap("RestartCount")
    public Integer restartCount;

    // 实例的启动时间
    @NameInMap("StartAt")
    public String startAt;

    // 实例状态
    @NameInMap("Status")
    public String status;

    // 实例总的进程数
    @NameInMap("TotalProcesses")
    public Integer totalProcesses;

    public static Instance build(java.util.Map<String, ?> map) throws Exception {
        Instance self = new Instance();
        return TeaModel.build(map, self);
    }

    public Instance setHostIP(String hostIP) {
        this.hostIP = hostIP;
        return this;
    }
    public String getHostIP() {
        return this.hostIP;
    }

    public Instance setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public Instance setInnerIP(String innerIP) {
        this.innerIP = innerIP;
        return this;
    }
    public String getInnerIP() {
        return this.innerIP;
    }

    public Instance setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public Instance setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }
    public Integer getInstancePort() {
        return this.instancePort;
    }

    public Instance setLastState(java.util.List<java.util.Map<String, ?>> lastState) {
        this.lastState = lastState;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getLastState() {
        return this.lastState;
    }

    public Instance setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public Instance setReadyProcesses(Integer readyProcesses) {
        this.readyProcesses = readyProcesses;
        return this;
    }
    public Integer getReadyProcesses() {
        return this.readyProcesses;
    }

    public Instance setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public Instance setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
        return this;
    }
    public Integer getRestartCount() {
        return this.restartCount;
    }

    public Instance setStartAt(String startAt) {
        this.startAt = startAt;
        return this;
    }
    public String getStartAt() {
        return this.startAt;
    }

    public Instance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Instance setTotalProcesses(Integer totalProcesses) {
        this.totalProcesses = totalProcesses;
        return this;
    }
    public Integer getTotalProcesses() {
        return this.totalProcesses;
    }

}
