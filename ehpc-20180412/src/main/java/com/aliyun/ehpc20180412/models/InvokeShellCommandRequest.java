// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InvokeShellCommandRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Command")
    public String command;

    @NameInMap("Instance")
    public java.util.List<InvokeShellCommandRequestInstance> instance;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("WorkingDir")
    public String workingDir;

    public static InvokeShellCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeShellCommandRequest self = new InvokeShellCommandRequest();
        return TeaModel.build(map, self);
    }

    public InvokeShellCommandRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public InvokeShellCommandRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public InvokeShellCommandRequest setInstance(java.util.List<InvokeShellCommandRequestInstance> instance) {
        this.instance = instance;
        return this;
    }
    public java.util.List<InvokeShellCommandRequestInstance> getInstance() {
        return this.instance;
    }

    public InvokeShellCommandRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public InvokeShellCommandRequest setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }
    public String getWorkingDir() {
        return this.workingDir;
    }

    public static class InvokeShellCommandRequestInstance extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static InvokeShellCommandRequestInstance build(java.util.Map<String, ?> map) throws Exception {
            InvokeShellCommandRequestInstance self = new InvokeShellCommandRequestInstance();
            return TeaModel.build(map, self);
        }

        public InvokeShellCommandRequestInstance setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
