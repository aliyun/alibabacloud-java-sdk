// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class TemplateResult extends TeaModel {
    /**
     * <p>SUCCESS indicates success. In case of failure, the corresponding Error Type is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Detailed information about the template</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("data")
    public Template data;

    /**
     * <p>Unique request ID used for troubleshooting</p>
     * 
     * <strong>example:</strong>
     * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static TemplateResult build(java.util.Map<String, ?> map) throws Exception {
        TemplateResult self = new TemplateResult();
        return TeaModel.build(map, self);
    }

    public TemplateResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TemplateResult setData(Template data) {
        this.data = data;
        return this;
    }
    public Template getData() {
        return this.data;
    }

    public TemplateResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
