// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveContactTemplateCredentialResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SaveContactTemplateCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveContactTemplateCredentialResponseBody self = new SaveContactTemplateCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveContactTemplateCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
