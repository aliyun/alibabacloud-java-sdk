// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateFunctionResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the UDF function.</p>
     * <blockquote>
     * <p>Notice: This field was of the Long type in SDK versions earlier than 8.0.0 and is of the String type in SDK 8.0.0 and later. <strong>This change does not affect normal SDK usage, and the parameter is still returned in the type defined in the SDK</strong>. Only when you upgrade across SDK version 8.0.0, the type change may cause project compilation failures, and you need to manually correct the data type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>580667964888595XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AE49C88D-5BEE-5ADD-8B8C-C4BBC0D7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionResponseBody self = new CreateFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFunctionResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
