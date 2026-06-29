// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecuteManualNodeRequest extends TeaModel {
    /**
     * <p>The environment identifier. Valid values:</p>
     * <ul>
     * <li>DEV: development environment </li>
     * <li>PROD (default): production environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The request for running a manual task.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExecuteCommand")
    public ExecuteManualNodeRequestExecuteCommand executeCommand;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ExecuteManualNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteManualNodeRequest self = new ExecuteManualNodeRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteManualNodeRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ExecuteManualNodeRequest setExecuteCommand(ExecuteManualNodeRequestExecuteCommand executeCommand) {
        this.executeCommand = executeCommand;
        return this;
    }
    public ExecuteManualNodeRequestExecuteCommand getExecuteCommand() {
        return this.executeCommand;
    }

    public ExecuteManualNodeRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ExecuteManualNodeRequestExecuteCommandParamList extends TeaModel {
        /**
         * <p>The parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>param1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ExecuteManualNodeRequestExecuteCommandParamList build(java.util.Map<String, ?> map) throws Exception {
            ExecuteManualNodeRequestExecuteCommandParamList self = new ExecuteManualNodeRequestExecuteCommandParamList();
            return TeaModel.build(map, self);
        }

        public ExecuteManualNodeRequestExecuteCommandParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ExecuteManualNodeRequestExecuteCommandParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ExecuteManualNodeRequestExecuteCommand extends TeaModel {
        /**
         * <p>The end business date.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-07</p>
         */
        @NameInMap("EndBizDate")
        public String endBizDate;

        /**
         * <p>The workflow name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("FlowName")
        public String flowName;

        /**
         * <p>The node ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n_12132</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The runtime parameters.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<ExecuteManualNodeRequestExecuteCommandParamList> paramList;

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123324</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The start business date.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-01</p>
         */
        @NameInMap("StartBizDate")
        public String startBizDate;

        public static ExecuteManualNodeRequestExecuteCommand build(java.util.Map<String, ?> map) throws Exception {
            ExecuteManualNodeRequestExecuteCommand self = new ExecuteManualNodeRequestExecuteCommand();
            return TeaModel.build(map, self);
        }

        public ExecuteManualNodeRequestExecuteCommand setEndBizDate(String endBizDate) {
            this.endBizDate = endBizDate;
            return this;
        }
        public String getEndBizDate() {
            return this.endBizDate;
        }

        public ExecuteManualNodeRequestExecuteCommand setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

        public ExecuteManualNodeRequestExecuteCommand setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ExecuteManualNodeRequestExecuteCommand setParamList(java.util.List<ExecuteManualNodeRequestExecuteCommandParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<ExecuteManualNodeRequestExecuteCommandParamList> getParamList() {
            return this.paramList;
        }

        public ExecuteManualNodeRequestExecuteCommand setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ExecuteManualNodeRequestExecuteCommand setStartBizDate(String startBizDate) {
            this.startBizDate = startBizDate;
            return this;
        }
        public String getStartBizDate() {
            return this.startBizDate;
        }

    }

}
