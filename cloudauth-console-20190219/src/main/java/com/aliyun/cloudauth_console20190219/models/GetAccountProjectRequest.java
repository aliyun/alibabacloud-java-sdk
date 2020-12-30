// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class GetAccountProjectRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    public static GetAccountProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountProjectRequest self = new GetAccountProjectRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountProjectRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
