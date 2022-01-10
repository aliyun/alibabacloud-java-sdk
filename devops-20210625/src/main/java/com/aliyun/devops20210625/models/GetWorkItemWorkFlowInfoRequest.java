// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkItemWorkFlowInfoRequest extends TeaModel {
    // 项目id
    @NameInMap("configurationId")
    public String configurationId;

    public static GetWorkItemWorkFlowInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkItemWorkFlowInfoRequest self = new GetWorkItemWorkFlowInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkItemWorkFlowInfoRequest setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }
    public String getConfigurationId() {
        return this.configurationId;
    }

}
