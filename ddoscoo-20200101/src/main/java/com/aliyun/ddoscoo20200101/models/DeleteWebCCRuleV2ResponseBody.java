// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteWebCCRuleV2ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteWebCCRuleV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteWebCCRuleV2ResponseBody self = new DeleteWebCCRuleV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteWebCCRuleV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
