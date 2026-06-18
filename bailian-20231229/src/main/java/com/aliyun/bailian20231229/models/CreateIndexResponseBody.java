// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateIndexResponseBody extends TeaModel {
    /**
     * <p>Error status code</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned when the request is successful.</p>
     */
    @NameInMap("Data")
    public CreateIndexResponseBodyData data;

    /**
     * <p>Error message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>17204B98-xxxx-4F9A--2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code returned by the interface.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;200&quot;</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful. Possible values:</p>
     * <ul>
     * <li><p>true: Successful</p>
     * </li>
     * <li><p>false: Failed</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIndexResponseBody self = new CreateIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIndexResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateIndexResponseBody setData(CreateIndexResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateIndexResponseBodyData getData() {
        return this.data;
    }

    public CreateIndexResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIndexResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateIndexResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateIndexResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the knowledge base, also known as \<code>IndexId\\</code>. This is the unique identifier of the created knowledge base.</p>
         * <blockquote>
         * <p>Keep this value safe. It will be used for all subsequent API operations related to this knowledge base.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>jkurxhxxxx</p>
         */
        @NameInMap("Id")
        public String id;

        public static CreateIndexResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateIndexResponseBodyData self = new CreateIndexResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateIndexResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
