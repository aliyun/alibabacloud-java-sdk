// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ModelConnectionResult extends TeaModel {
    /**
     * <p><code>SUCCESS</code> indicates a successful request. On failure, this field returns the error type.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The resulting model connection object.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ModelConnection data;

    /**
     * <p>The unique request ID used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ModelConnectionResult build(java.util.Map<String, ?> map) throws Exception {
        ModelConnectionResult self = new ModelConnectionResult();
        return TeaModel.build(map, self);
    }

    public ModelConnectionResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModelConnectionResult setData(ModelConnection data) {
        this.data = data;
        return this;
    }
    public ModelConnection getData() {
        return this.data;
    }

    public ModelConnectionResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
