// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetWildcardDomainPatternsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetWildcardDomainPatternsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetWildcardDomainPatternsResponseBody self = new SetWildcardDomainPatternsResponseBody();
        return TeaModel.build(map, self);
    }

    public SetWildcardDomainPatternsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
