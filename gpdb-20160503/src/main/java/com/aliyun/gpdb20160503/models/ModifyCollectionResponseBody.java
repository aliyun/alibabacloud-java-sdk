// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyCollectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>{&quot;title&quot;:&quot;text&quot;,&quot;content&quot;:&quot;text&quot;,&quot;response&quot;:&quot;int&quot;}</p>
     */
    @NameInMap("Metadata")
    public String metadata;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static ModifyCollectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCollectionResponseBody self = new ModifyCollectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCollectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyCollectionResponseBody setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
    }

    public ModifyCollectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCollectionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
