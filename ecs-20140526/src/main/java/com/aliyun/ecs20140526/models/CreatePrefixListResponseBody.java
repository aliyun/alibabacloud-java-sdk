// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePrefixListResponseBody extends TeaModel {
    /**
     * <p>The ID of the prefix list.</p>
     * 
     * <strong>example:</strong>
     * <p>pl-x1j1k5ykzqlixdcy****</p>
     */
    @NameInMap("PrefixListId")
    public String prefixListId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>38793DB8-A4B2-4AEC-BFD3-111234E9188D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePrefixListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrefixListResponseBody self = new CreatePrefixListResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrefixListResponseBody setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
        return this;
    }
    public String getPrefixListId() {
        return this.prefixListId;
    }

    public CreatePrefixListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
