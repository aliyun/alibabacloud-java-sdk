// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodeInputOrOutputRequest extends TeaModel {
    @NameInMap("IoType")
    public String ioType;

    @NameInMap("NodeId")
    public Long nodeId;

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
