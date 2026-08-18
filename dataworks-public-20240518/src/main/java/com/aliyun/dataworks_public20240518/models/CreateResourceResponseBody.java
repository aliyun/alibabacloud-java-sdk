// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateResourceResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the resource file.</p>
     * <blockquote>
     * <p>Notice: This field was of the Long type in SDK versions earlier than 8.0.0 and is of the String type in SDK 8.0.0 and later. <strong>This change does not affect normal SDK usage, and the parameter is still returned in the type defined in the SDK</strong>. The type change may cause project compilation failures only when you upgrade across SDK version 8.0.0. In this case, you must manually correct the data type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>631478864897630XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>A5B97987-66EA-5563-9599-A2752292****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceResponseBody self = new CreateResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
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
