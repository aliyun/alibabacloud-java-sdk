// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class TagResourcesResponseBody extends TeaModel {
    /**
     * <p>Return code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Request details.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>67F33190-946B-1105-B6A1-E2DF0426DD51</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeded. Valid values:</p>
     * <ul>
     * <li><p>true: The call succeeded</p>
     * </li>
     * <li><p>false: The call failed</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Tag request ID</p>
     * 
     * <strong>example:</strong>
     * <p>154FT</p>
     */
    @NameInMap("TagResponseId")
    public String tagResponseId;

    public static TagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesResponseBody self = new TagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public TagResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TagResourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TagResourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TagResourcesResponseBody setTagResponseId(String tagResponseId) {
        this.tagResponseId = tagResponseId;
        return this;
    }
    public String getTagResponseId() {
        return this.tagResponseId;
    }

}
