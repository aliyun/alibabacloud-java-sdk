// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ValidateModuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2daf4227f747cbf11a5501f18cc5e004</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;main.tf&quot;:&quot;xxx&quot;}</p>
     */
    @NameInMap("codeMap")
    public java.util.Map<String, ?> codeMap;

    /**
     * <strong>example:</strong>
     * <p>Upload</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("sourcePath")
    public String sourcePath;

    public static ValidateModuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateModuleRequest self = new ValidateModuleRequest();
        return TeaModel.build(map, self);
    }

    public ValidateModuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ValidateModuleRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ValidateModuleRequest setCodeMap(java.util.Map<String, ?> codeMap) {
        this.codeMap = codeMap;
        return this;
    }
    public java.util.Map<String, ?> getCodeMap() {
        return this.codeMap;
    }

    public ValidateModuleRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ValidateModuleRequest setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }
    public String getSourcePath() {
        return this.sourcePath;
    }

}
