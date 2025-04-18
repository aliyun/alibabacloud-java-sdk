// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the file resource.</p>
     * 
     * <strong>example:</strong>
     * <p>631478864897630XXXX</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>A5B97987-66EA-5563-9599-A2752292XXXX</p>
     * 
     * <strong>example:</strong>
     * <p>The ID of the file resource.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceResponseBody self = new CreateResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
