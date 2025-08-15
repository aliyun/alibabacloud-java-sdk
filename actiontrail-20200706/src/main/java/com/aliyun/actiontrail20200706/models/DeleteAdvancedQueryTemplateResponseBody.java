// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DeleteAdvancedQueryTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>95F2CD1D-9BD3-564A-A74A-743FFC5E46E5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAdvancedQueryTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAdvancedQueryTemplateResponseBody self = new DeleteAdvancedQueryTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAdvancedQueryTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
