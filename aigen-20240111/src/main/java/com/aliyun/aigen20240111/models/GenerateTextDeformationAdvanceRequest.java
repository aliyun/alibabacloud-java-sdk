// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class GenerateTextDeformationAdvanceRequest extends TeaModel {
    /**
     * <p>1</p>
     */
    @NameInMap("Async")
    public Boolean async;

    @NameInMap("FontName")
    public String fontName;

    @NameInMap("N")
    public Long n;

    @NameInMap("OutputImageRatio")
    public String outputImageRatio;

    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("TextContent")
    public String textContent;

    @NameInMap("TtfUrl")
    public java.io.InputStream ttfUrlObject;

    public static GenerateTextDeformationAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTextDeformationAdvanceRequest self = new GenerateTextDeformationAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTextDeformationAdvanceRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public GenerateTextDeformationAdvanceRequest setFontName(String fontName) {
        this.fontName = fontName;
        return this;
    }
    public String getFontName() {
        return this.fontName;
    }

    public GenerateTextDeformationAdvanceRequest setN(Long n) {
        this.n = n;
        return this;
    }
    public Long getN() {
        return this.n;
    }

    public GenerateTextDeformationAdvanceRequest setOutputImageRatio(String outputImageRatio) {
        this.outputImageRatio = outputImageRatio;
        return this;
    }
    public String getOutputImageRatio() {
        return this.outputImageRatio;
    }

    public GenerateTextDeformationAdvanceRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public GenerateTextDeformationAdvanceRequest setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }
    public String getTextContent() {
        return this.textContent;
    }

    public GenerateTextDeformationAdvanceRequest setTtfUrlObject(java.io.InputStream ttfUrlObject) {
        this.ttfUrlObject = ttfUrlObject;
        return this;
    }
    public java.io.InputStream getTtfUrlObject() {
        return this.ttfUrlObject;
    }

}
