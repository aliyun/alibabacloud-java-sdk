// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodeInputOrOutputRequest extends TeaModel {
    @NameInMap("NodeId")
    @Validation(required = true)
    public Long nodeId;

    @NameInMap("ProjectEnv")
    @Validation(required = true)
    public String projectEnv;

    @NameInMap("IoType")
    @Validation(required = true)
    public String ioType;

    public static ListNodeInputOrOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeInputOrOutputRequest self = new ListNodeInputOrOutputRequest();
        return TeaModel.build(map, self);
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

    public ListNodeInputOrOutputRequest setIoType(String ioType) {
        this.ioType = ioType;
        return this;
    }
    public String getIoType() {
        return this.ioType;
    }

}
