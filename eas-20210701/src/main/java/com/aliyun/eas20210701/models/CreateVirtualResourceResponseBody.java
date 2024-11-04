// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateVirtualResourceResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successfully created virtual resource eas-vr-npovr28onap1xxxxxx</p>
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

    /**
     * <p>The ID of the virtual resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-vr-npovr28onap1xxxxxx</p>
     */
    @NameInMap("VirtualResourceId")
    public String virtualResourceId;

    public static CreateVirtualResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualResourceResponseBody self = new CreateVirtualResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirtualResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVirtualResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVirtualResourceResponseBody setVirtualResourceId(String virtualResourceId) {
        this.virtualResourceId = virtualResourceId;
        return this;
    }
    public String getVirtualResourceId() {
        return this.virtualResourceId;
    }

}
