// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UploadAgentSessionFileShrinkRequest extends TeaModel {
    /**
     * <p>The JSON-RPC correlation identifier for the current request. The Id in the response returns this value as is to correlate the request and response.</p>
     * 
     * <strong>example:</strong>
     * <p>attachment-rpc-001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC protocol version. The example uses 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The parameter object for the upload stage. The prepare step issues the upload URL, and the complete step confirms that the file has been written to the target session instance.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Params")
    public String paramsShrink;

    public static UploadAgentSessionFileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAgentSessionFileShrinkRequest self = new UploadAgentSessionFileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UploadAgentSessionFileShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UploadAgentSessionFileShrinkRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public UploadAgentSessionFileShrinkRequest setParamsShrink(String paramsShrink) {
        this.paramsShrink = paramsShrink;
        return this;
    }
    public String getParamsShrink() {
        return this.paramsShrink;
    }

}
