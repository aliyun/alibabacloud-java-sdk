// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunSmokeTestRequest extends TeaModel {
    /**
     * <p>The data timestamp.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Bizdate")
    public String bizdate;

    /**
     * <p>The name of the workflow.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the node. You can call the [ListNodes](https://help.aliyun.com/document_detail/173979.html) operation to query the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The parameters related to the node. Set this parameter to a JSON string. A key in the string indicates a parameter, and a value in the string indicates the value of the related parameter.</p>
     */
    @NameInMap("NodeParams")
    public String nodeParams;

    /**
     * <p>The environment of the workspace. Valid values: PROD and DEV. The value PROD indicates the production environment, and the value DEV indicates the development environment.</p>
     * <br>
     * <p>A workspace in basic mode does not have a development environment. For more information, see [Basic mode and standard mode](https://help.aliyun.com/document_detail/85772.html).</p>
     * <br>
     * <p>This parameter is required.</p>
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
