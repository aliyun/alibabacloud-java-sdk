// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateComputeResourceResponseBody extends TeaModel {
    /**
     * <p>Returns the ID of the created computing resource.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The request ID. You can use the request ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateComputeResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeResourceResponseBody self = new CreateComputeResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateComputeResourceResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateComputeResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
