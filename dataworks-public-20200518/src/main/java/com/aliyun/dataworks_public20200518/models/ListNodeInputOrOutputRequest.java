// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodeInputOrOutputRequest extends TeaModel {
    /**
     * <p>The type of node that you want to query. Valid values:</p>
     * <br>
     * <p>*   input: ancestor nodes</p>
     * <p>*   output: descendant nodes</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IoType")
    public String ioType;

    /**
     * <p>The ID of the node. You can call the [ListNodes](https://help.aliyun.com/document_detail/173979.html) operation to query the node ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The environment of the workspace. Valid values: DEV and PROD. A value of DEV indicates the development environment. A value of PROD indicates the production environment.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static ListNodeInputOrOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeInputOrOutputRequest self = new ListNodeInputOrOutputRequest();
        return TeaModel.build(map, self);
    }

    public ListNodeInputOrOutputRequest setIoType(String ioType) {
        this.ioType = ioType;
        return this;
    }
    public String getIoType() {
        return this.ioType;
    }

    public ListNodeInputOrOutputRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public ListNodeInputOrOutputRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
