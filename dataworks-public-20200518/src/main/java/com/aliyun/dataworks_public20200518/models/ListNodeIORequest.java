// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodeIORequest extends TeaModel {
    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("ProjectEnv")
    public String projectEnv;

    @NameInMap("IoType")
    public String ioType;

    public static ListNodeIORequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodeIORequest self = new ListNodeIORequest();
        return TeaModel.build(map, self);
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

    public ListNodeIORequest setIoType(String ioType) {
        this.ioType = ioType;
        return this;
    }
    public String getIoType() {
        return this.ioType;
    }

}
