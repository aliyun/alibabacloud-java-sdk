// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ClickhouseConf extends TeaModel {
    @NameInMap("InitialReplica")
    public Integer initialReplica;

    @NameInMap("InitialShard")
    public Integer initialShard;

    @NameInMap("NewNodeCount")
    public Integer newNodeCount;

    @NameInMap("ResizeType")
    public String resizeType;

    public static ClickhouseConf build(java.util.Map<String, ?> map) throws Exception {
        ClickhouseConf self = new ClickhouseConf();
        return TeaModel.build(map, self);
    }

    public ClickhouseConf setInitialReplica(Integer initialReplica) {
        this.initialReplica = initialReplica;
        return this;
    }
    public Integer getInitialReplica() {
        return this.initialReplica;
    }

    public ClickhouseConf setInitialShard(Integer initialShard) {
        this.initialShard = initialShard;
        return this;
    }
    public Integer getInitialShard() {
        return this.initialShard;
    }

    public ClickhouseConf setNewNodeCount(Integer newNodeCount) {
        this.newNodeCount = newNodeCount;
        return this;
    }
    public Integer getNewNodeCount() {
        return this.newNodeCount;
    }

    public ClickhouseConf setResizeType(String resizeType) {
        this.resizeType = resizeType;
        return this;
    }
    public String getResizeType() {
        return this.resizeType;
    }

}
