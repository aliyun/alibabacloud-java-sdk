// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDagTestRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-05-26 00:00:00</p>
     */
    @NameInMap("Bizdate")
    public String bizdate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xm_create_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <strong>example:</strong>
     * <p>bizdate=$bizdate tbods=$tbods</p>
     */
    @NameInMap("NodeParams")
    public String nodeParams;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static CreateDagTestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDagTestRequest self = new CreateDagTestRequest();
        return TeaModel.build(map, self);
    }

    public CreateDagTestRequest setBizdate(String bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public String getBizdate() {
        return this.bizdate;
    }

    public CreateDagTestRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDagTestRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public CreateDagTestRequest setNodeParams(String nodeParams) {
        this.nodeParams = nodeParams;
        return this;
    }
    public String getNodeParams() {
        return this.nodeParams;
    }

    public CreateDagTestRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
