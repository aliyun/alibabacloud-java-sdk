// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodeIORequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IoType")
    public String ioType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>This parameter is required.</p>
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
