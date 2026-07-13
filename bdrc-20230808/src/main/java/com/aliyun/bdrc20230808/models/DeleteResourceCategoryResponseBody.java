// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DeleteResourceCategoryResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8724BC18-904D-5A0D-BFF4-F0554F0037E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteResourceCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceCategoryResponseBody self = new DeleteResourceCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteResourceCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
