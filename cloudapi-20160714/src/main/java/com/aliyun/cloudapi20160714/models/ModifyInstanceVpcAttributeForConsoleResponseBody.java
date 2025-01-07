// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAttributeForConsoleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D08741CF-BE59-5DA6-B06F-BB65173110C0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceVpcAttributeForConsoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAttributeForConsoleResponseBody self = new ModifyInstanceVpcAttributeForConsoleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVpcAttributeForConsoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
