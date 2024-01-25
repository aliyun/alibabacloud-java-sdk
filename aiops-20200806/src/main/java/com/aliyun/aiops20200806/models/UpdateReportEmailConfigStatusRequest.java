// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateReportEmailConfigStatusRequest extends TeaModel {
    @NameInMap("ConfigStatus")
    public Integer configStatus;

    @NameInMap("MailConfigId")
    public Long mailConfigId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static UpdateReportEmailConfigStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateReportEmailConfigStatusRequest self = new UpdateReportEmailConfigStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateReportEmailConfigStatusRequest setConfigStatus(Integer configStatus) {
        this.configStatus = configStatus;
        return this;
    }
    public Integer getConfigStatus() {
        return this.configStatus;
    }

    public UpdateReportEmailConfigStatusRequest setMailConfigId(Long mailConfigId) {
        this.mailConfigId = mailConfigId;
        return this;
    }
    public Long getMailConfigId() {
        return this.mailConfigId;
    }

    public UpdateReportEmailConfigStatusRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
