// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InvokeShellCommandRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The content of the command. The content must be 2 to 2,048 characters in length.</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The information of nodes on which the command is run.</p>
     */
    @NameInMap("Instance")
    public java.util.List<InvokeShellCommandRequestInstance> instance;

    /**
     * <p>The timeout period. If a command times out, the command process will be terminated. Unit: seconds.</p>
     * <br>
     * <p>Default value: 60.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    /**
     * <p>The working directory of the command. Default value: `/root`.</p>
     */
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
        /**
         * <p>The ID of the Nth node instance on which the command is run.</p>
         * <br>
         * <p>> This parameter specifies the node on which the command is run. If it is not specified, the command will be run on all nodes of the cluster.</p>
         */
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
