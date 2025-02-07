// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateChatMediaUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9cfad875-6260-4a53-ab6e-b13e3fb31f7d</p>
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
     * <p>9F766284-F103-4298-8EC5-19F9F9BE5522</p>
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
