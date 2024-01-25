// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutGroupTopologyTagLogRequest extends TeaModel {
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("TopologyTag")
    public String topologyTag;

    @NameInMap("TopologyTagShow")
    public String topologyTagShow;

    public static PutGroupTopologyTagLogRequest build(java.util.Map<String, ?> map) throws Exception {
        PutGroupTopologyTagLogRequest self = new PutGroupTopologyTagLogRequest();
        return TeaModel.build(map, self);
    }

    public PutGroupTopologyTagLogRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public PutGroupTopologyTagLogRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public PutGroupTopologyTagLogRequest setTopologyTag(String topologyTag) {
        this.topologyTag = topologyTag;
        return this;
    }
    public String getTopologyTag() {
        return this.topologyTag;
    }

    public PutGroupTopologyTagLogRequest setTopologyTagShow(String topologyTagShow) {
        this.topologyTagShow = topologyTagShow;
        return this;
    }
    public String getTopologyTagShow() {
        return this.topologyTagShow;
    }

}
