// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Codes extends TeaModel {
    /**
     * <p>The boundary of the code.</p>
     */
    @NameInMap("Boundary")
    public Boundary boundary;

    /**
     * <p>The confidence level of the code. A greater value indicates a higher confidence level. A value exceeding 0.8 signifies a high degree of confidence in the result.</p>
     * 
     * <strong>example:</strong>
     * <p>0.9</p>
     */
    @NameInMap("Confidence")
    public Float confidence;

    /**
     * <p>The content of the code.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.example.com">https://www.example.com</a></p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The type of the code.</p>
     * <p>Enumerated values:</p>
     * <ul>
     * <li>qrcode</li>
     * <li>barcode</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>qrcode</p>
     */
    @NameInMap("Type")
    public String type;

    public static Codes build(java.util.Map<String, ?> map) throws Exception {
        Codes self = new Codes();
        return TeaModel.build(map, self);
    }

    public Codes setBoundary(Boundary boundary) {
        this.boundary = boundary;
        return this;
    }
    public Boundary getBoundary() {
        return this.boundary;
    }

    public Codes setConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }
    public Float getConfidence() {
        return this.confidence;
    }

    public Codes setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public Codes setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
