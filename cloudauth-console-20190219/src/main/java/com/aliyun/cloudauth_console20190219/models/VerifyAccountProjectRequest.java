// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class VerifyAccountProjectRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    public static VerifyAccountProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyAccountProjectRequest self = new VerifyAccountProjectRequest();
        return TeaModel.build(map, self);
    }

    public VerifyAccountProjectRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
