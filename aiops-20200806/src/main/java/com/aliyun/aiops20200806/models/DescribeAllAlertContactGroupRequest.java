// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAllAlertContactGroupRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeAllAlertContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllAlertContactGroupRequest self = new DescribeAllAlertContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAllAlertContactGroupRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
