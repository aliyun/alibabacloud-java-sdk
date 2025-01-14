// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateDIJobResponseBody extends TeaModel {
    /**
     * <p>This parameter is deprecated and is replaced by the Id parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>11792</p>
     */
    @NameInMap("DIJobId")
    @Deprecated
    public Long DIJobId;

    /**
     * <p>The ID of the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>11792</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4F6AB6B3-41FB-5EBB-AFB2-0C98D49DA2BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDIJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDIJobResponseBody self = new CreateDIJobResponseBody();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public CreateDIJobResponseBody setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public CreateDIJobResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateDIJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
