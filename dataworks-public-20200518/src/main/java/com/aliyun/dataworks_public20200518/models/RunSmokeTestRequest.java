// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunSmokeTestRequest extends TeaModel {
    /**
     * <p>The business date.</p>
     * <p>The format is <code>yyyy-MM-dd HH:mm:ss</code>. Example: <code>2020-05-26 00:00:00</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-05-26 00:00:00</p>
     */
    @NameInMap("Bizdate")
    public String bizdate;

    /**
     * <p>The name of the workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xm_create_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the node. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to obtain the node ID.</p>
     * <p>Full retrieval path: first call ListProjects to obtain the ProjectId, then call ListNodes, and obtain the node ID from Data.Nodes[].NodeId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The parameters of the node. This parameter is configured as a JSON string. The key is the node ID, and the value is the actual parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>bizdate=$bizdate tbods=$tbods</p>
     */
    @NameInMap("NodeParams")
    public String nodeParams;

    /**
     * <p>The environment of the workspace. Valid values:</p>
     * <ul>
     * <li>PROD: production environment.</li>
     * <li>DEV: development environment.</li>
     * </ul>
     * <p>Workspaces in basic mode do not have a development environment. For more information, see <a href="https://help.aliyun.com/document_detail/85772.html">Basic mode and standard mode</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static RunSmokeTestRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSmokeTestRequest self = new RunSmokeTestRequest();
        return TeaModel.build(map, self);
    }

    public RunSmokeTestRequest setBizdate(String bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public String getBizdate() {
        return this.bizdate;
    }

    public RunSmokeTestRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RunSmokeTestRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public RunSmokeTestRequest setNodeParams(String nodeParams) {
        this.nodeParams = nodeParams;
        return this;
    }
    public String getNodeParams() {
        return this.nodeParams;
    }

    public RunSmokeTestRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
