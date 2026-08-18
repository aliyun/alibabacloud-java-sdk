// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateNodeResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the data development node.</p>
     * <blockquote>
     * <p>Notice: This field was of the Long type in SDK versions earlier than 8.0.0 and is of the String type in SDK 8.0.0 and later. <strong>This change does not affect normal SDK usage, and the parameter is still returned in the type defined in the SDK</strong>. Only when you upgrade across SDK version 8.0.0, the type change may cause project compilation failures, and you need to manually correct the data type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>860438872620113XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AFBB799F-8578-51C5-A766-E922EDB8XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeResponseBody self = new CreateNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNodeResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
