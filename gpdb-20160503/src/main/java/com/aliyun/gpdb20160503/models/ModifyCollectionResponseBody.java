// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyCollectionResponseBody extends TeaModel {
    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The metadata schema of the collection, returned as a JSON string. This string represents a map where keys are field names and values are their data types.</p>
     * <blockquote>
     * <ul>
     * <li><p>See <a href="https://help.aliyun.com/document_detail/424383.html">Data types</a> for the list of supported data types.</p>
     * </li>
     * <li><p>The \&quot;money\&quot; data type is not supported.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;title&quot;:&quot;text&quot;,&quot;content&quot;:&quot;text&quot;,&quot;response&quot;:&quot;int&quot;}</p>
     */
    @NameInMap("Metadata")
    public String metadata;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the API request. Valid values:</p>
     * <ul>
     * <li><p><strong>Other values</strong>: The request failed.</p>
     * </li>
     * <li><p><strong>success</strong>: The request was successful.</p>
     * </li>
     * </ul>
     * 
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
