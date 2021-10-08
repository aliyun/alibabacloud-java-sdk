// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAllAlertContactRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeAllAlertContactRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllAlertContactRequest self = new DescribeAllAlertContactRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAllAlertContactRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
