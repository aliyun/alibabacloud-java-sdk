// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class GenerateTextDeformationRequest extends TeaModel {
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
    public String ttfUrl;

    public static GenerateTextDeformationRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTextDeformationRequest self = new GenerateTextDeformationRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTextDeformationRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public GenerateTextDeformationRequest setFontName(String fontName) {
        this.fontName = fontName;
        return this;
    }
    public String getFontName() {
        return this.fontName;
    }

    public GenerateTextDeformationRequest setN(Long n) {
        this.n = n;
        return this;
    }
    public Long getN() {
        return this.n;
    }

    public GenerateTextDeformationRequest setOutputImageRatio(String outputImageRatio) {
        this.outputImageRatio = outputImageRatio;
        return this;
    }
    public String getOutputImageRatio() {
        return this.outputImageRatio;
    }

    public GenerateTextDeformationRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public GenerateTextDeformationRequest setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }
    public String getTextContent() {
        return this.textContent;
    }

    public GenerateTextDeformationRequest setTtfUrl(String ttfUrl) {
        this.ttfUrl = ttfUrl;
        return this;
    }
    public String getTtfUrl() {
        return this.ttfUrl;
    }

}
