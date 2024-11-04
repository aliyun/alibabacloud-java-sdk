// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteVirtualResourceResponseBody extends TeaModel {
    /**
     * <p>The information about the operation result.</p>
     * 
     * <strong>example:</strong>
     * <p>Successfully deleted virtual resource eas-vr-npovr28onap1xxxxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVirtualResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualResourceResponseBody self = new DeleteVirtualResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteVirtualResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
