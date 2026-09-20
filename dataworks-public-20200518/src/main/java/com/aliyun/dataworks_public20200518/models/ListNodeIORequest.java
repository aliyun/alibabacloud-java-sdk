// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodeIORequest extends TeaModel {
    /**
     * <p>Specifies whether to query upstream or downstream nodes. Valid values: input and output.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>output</p>
     */
    @NameInMap("IoType")
    public String ioType;

    /**
     * <p>The ID of the node. You can call <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> to query the NodeId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The environment in which the node runs. Valid values: DEV (development environment) and PROD (production environment).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static ListNodeIORequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeIORequest self = new ListNodeIORequest();
        return TeaModel.build(map, self);
    }

    public ListNodeIORequest setIoType(String ioType) {
        this.ioType = ioType;
        return this;
    }
    public String getIoType() {
        return this.ioType;
    }

    public ListNodeIORequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public ListNodeIORequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
