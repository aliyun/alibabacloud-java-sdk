// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ExecuteNodeToolRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Command")
    public String command;

    @NameInMap("Arguments")
    public String arguments;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    @NameInMap("ExecuteNodes")
    public String executeNodes;

    public static ExecuteNodeToolRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteNodeToolRequest self = new ExecuteNodeToolRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteNodeToolRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ExecuteNodeToolRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public ExecuteNodeToolRequest setArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }
    public String getArguments() {
        return this.arguments;
    }

    public ExecuteNodeToolRequest setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    public ExecuteNodeToolRequest setExecuteNodes(String executeNodes) {
        this.executeNodes = executeNodes;
        return this;
    }
    public String getExecuteNodes() {
        return this.executeNodes;
    }

}
