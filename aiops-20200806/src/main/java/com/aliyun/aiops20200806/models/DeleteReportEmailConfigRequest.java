// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteReportEmailConfigRequest extends TeaModel {
    @NameInMap("MailConfigId")
    public Long mailConfigId;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DeleteReportEmailConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteReportEmailConfigRequest self = new DeleteReportEmailConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteReportEmailConfigRequest setMailConfigId(Long mailConfigId) {
        this.mailConfigId = mailConfigId;
        return this;
    }
    public Long getMailConfigId() {
        return this.mailConfigId;
    }

    public DeleteReportEmailConfigRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
