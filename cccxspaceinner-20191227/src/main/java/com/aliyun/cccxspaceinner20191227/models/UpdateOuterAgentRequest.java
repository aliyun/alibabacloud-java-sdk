// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class UpdateOuterAgentRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("ShowName")
    public String showName;

    @NameInMap("MaxServiceNum")
    public Integer maxServiceNum;

    public static UpdateOuterAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOuterAgentRequest self = new UpdateOuterAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOuterAgentRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public UpdateOuterAgentRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public UpdateOuterAgentRequest setShowName(String showName) {
        this.showName = showName;
        return this;
    }
    public String getShowName() {
        return this.showName;
    }

    public UpdateOuterAgentRequest setMaxServiceNum(Integer maxServiceNum) {
        this.maxServiceNum = maxServiceNum;
        return this;
    }
    public Integer getMaxServiceNum() {
        return this.maxServiceNum;
    }

}
