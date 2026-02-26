// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class OCRContents extends TeaModel {
    /**
     * <p>The boundary information.</p>
     */
    @NameInMap("Boundary")
    public Boundary boundary;

    /**
     * <p>The confidence level of the content. Valid values: 0 to 1. The value 0 indicates the lowest confidence level. The value 1 indicates the highest confidence level.</p>
     * 
     * <strong>example:</strong>
     * <p>0.8254936695098877</p>
     */
    @NameInMap("Confidence")
    public Float confidence;

    /**
     * <p>The content.</p>
     */
    @NameInMap("Contents")
    public String contents;

    /**
     * <p>The BCP 47 language code. This parameter is not supported in the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-hans</p>
     */
    @NameInMap("Language")
    public String language;

    public static OCRContents build(java.util.Map<String, ?> map) throws Exception {
        OCRContents self = new OCRContents();
        return TeaModel.build(map, self);
    }

    public OCRContents setBoundary(Boundary boundary) {
        this.boundary = boundary;
        return this;
    }
    public Boundary getBoundary() {
        return this.boundary;
    }

    public OCRContents setConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }
    public Float getConfidence() {
        return this.confidence;
    }

    public OCRContents setContents(String contents) {
        this.contents = contents;
        return this;
    }
    public String getContents() {
        return this.contents;
    }

    public OCRContents setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
