// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class CreateChatMediaUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>media id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("MimeType")
    public String mimeType;

    /**
     * <strong>example:</strong>
     * <p>943D8EF3-3321-471F-A104-51C96FCA94D6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateChatMediaUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatMediaUrlRequest self = new CreateChatMediaUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatMediaUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateChatMediaUrlRequest setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }
    public String getMimeType() {
        return this.mimeType;
    }

    public CreateChatMediaUrlRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
