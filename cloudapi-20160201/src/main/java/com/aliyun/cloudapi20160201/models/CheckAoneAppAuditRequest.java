// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class CheckAoneAppAuditRequest extends TeaModel {
    @NameInMap("AoneAppName")
    public String aoneAppName;

    public static CheckAoneAppAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAoneAppAuditRequest self = new CheckAoneAppAuditRequest();
        return TeaModel.build(map, self);
    }

    public CheckAoneAppAuditRequest setAoneAppName(String aoneAppName) {
        this.aoneAppName = aoneAppName;
        return this;
    }
    public String getAoneAppName() {
        return this.aoneAppName;
    }

}
