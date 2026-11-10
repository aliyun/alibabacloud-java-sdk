// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ValidateModuleRequest extends TeaModel {
    /**
     * <p>The idempotence token. Format: [0-9a-zA-Z-]{1,64}. A UUID is recommended.</p>
     * 
     * <strong>example:</strong>
     * <p>2daf4227f747cbf11a5501f18cc5e004</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The template text. This parameter is required when source is set to Upload.</p>
     * 
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The configuration file map. You can pass multiple configuration files.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;main.tf&quot;:&quot;xxx&quot;}</p>
     */
    @NameInMap("codeMap")
    public java.util.Map<String, ?> codeMap;

    /**
     * <p>The template source. Valid values:</p>
     * <ul>
     * <li>Upload: text upload.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Upload</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>The source path.</p>
     * 
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
