// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ResumeComponentUpgradeRequest extends TeaModel {
    // 集群ID。
    @NameInMap("clusterid")
    public String clusterid;

    // 组件ID。
    @NameInMap("componentid")
    public String componentid;

    public static ResumeComponentUpgradeRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeComponentUpgradeRequest self = new ResumeComponentUpgradeRequest();
        return TeaModel.build(map, self);
    }

    public ResumeComponentUpgradeRequest setClusterid(String clusterid) {
        this.clusterid = clusterid;
        return this;
    }
    public String getClusterid() {
        return this.clusterid;
    }

    public ResumeComponentUpgradeRequest setComponentid(String componentid) {
        this.componentid = componentid;
        return this;
    }
    public String getComponentid() {
        return this.componentid;
    }

}
