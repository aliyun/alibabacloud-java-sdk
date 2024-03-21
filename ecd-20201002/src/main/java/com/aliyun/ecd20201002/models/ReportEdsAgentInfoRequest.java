// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class ReportEdsAgentInfoRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("EcsInstanceId")
    public String ecsInstanceId;

    @NameInMap("EdsAgentInfo")
    public String edsAgentInfo;

    public static ReportEdsAgentInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportEdsAgentInfoRequest self = new ReportEdsAgentInfoRequest();
        return TeaModel.build(map, self);
    }

    public ReportEdsAgentInfoRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public ReportEdsAgentInfoRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public ReportEdsAgentInfoRequest setEcsInstanceId(String ecsInstanceId) {
        this.ecsInstanceId = ecsInstanceId;
        return this;
    }
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    public ReportEdsAgentInfoRequest setEdsAgentInfo(String edsAgentInfo) {
        this.edsAgentInfo = edsAgentInfo;
        return this;
    }
    public String getEdsAgentInfo() {
        return this.edsAgentInfo;
    }

}
