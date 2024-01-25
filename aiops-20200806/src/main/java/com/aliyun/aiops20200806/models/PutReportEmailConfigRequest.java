// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutReportEmailConfigRequest extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("OperaUid")
    public String operaUid;

    public static PutReportEmailConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutReportEmailConfigRequest self = new PutReportEmailConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutReportEmailConfigRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public PutReportEmailConfigRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
