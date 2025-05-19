// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class CreateHybridDoubleWriteRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-target</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-source</p>
     */
    @NameInMap("SourceNamespace")
    public String sourceNamespace;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12706766********</p>
     */
    @NameInMap("SourceUserId")
    public Long sourceUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12706766********</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static CreateHybridDoubleWriteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridDoubleWriteRequest self = new CreateHybridDoubleWriteRequest();
        return TeaModel.build(map, self);
    }

    public CreateHybridDoubleWriteRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateHybridDoubleWriteRequest setSourceNamespace(String sourceNamespace) {
        this.sourceNamespace = sourceNamespace;
        return this;
    }
    public String getSourceNamespace() {
        return this.sourceNamespace;
    }

    public CreateHybridDoubleWriteRequest setSourceUserId(Long sourceUserId) {
        this.sourceUserId = sourceUserId;
        return this;
    }
    public Long getSourceUserId() {
        return this.sourceUserId;
    }

    public CreateHybridDoubleWriteRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
