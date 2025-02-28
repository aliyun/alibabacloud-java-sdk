// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateThreadResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1642448000000</p>
     */
    @NameInMap("createAt")
    public Long createAt;

    /**
     * <strong>example:</strong>
     * <p>threadId123</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <strong>example:</strong>
     * <p>thread</p>
     */
    @NameInMap("object")
    public String object;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateThreadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateThreadResponseBody self = new CreateThreadResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateThreadResponseBody setCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }
    public Long getCreateAt() {
        return this.createAt;
    }

    public CreateThreadResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateThreadResponseBody setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public CreateThreadResponseBody setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public CreateThreadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
