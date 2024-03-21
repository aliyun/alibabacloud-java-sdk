// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class QueryEdsAgentReportConfigRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    public static QueryEdsAgentReportConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEdsAgentReportConfigRequest self = new QueryEdsAgentReportConfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryEdsAgentReportConfigRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public QueryEdsAgentReportConfigRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public QueryEdsAgentReportConfigRequest setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
        return this;
    }
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

}
