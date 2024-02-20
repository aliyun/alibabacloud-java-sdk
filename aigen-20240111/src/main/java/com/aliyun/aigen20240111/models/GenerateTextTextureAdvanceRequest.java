// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class GenerateTextTextureAdvanceRequest extends TeaModel {
    @NameInMap("AlphaChannel")
    public Boolean alphaChannel;

    @NameInMap("FontName")
    public String fontName;

    @NameInMap("ImageShortSize")
    public Long imageShortSize;

    @NameInMap("ImageUrl")
    public java.io.InputStream imageUrlObject;

    @NameInMap("N")
    public Long n;

    @NameInMap("OutputImageRatio")
    public String outputImageRatio;

    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("TextContent")
    public String textContent;

    @NameInMap("TextureStyle")
    public String textureStyle;

    @NameInMap("TtfUrl")
    public java.io.InputStream ttfUrlObject;

    public static GenerateTextTextureAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTextTextureAdvanceRequest self = new GenerateTextTextureAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTextTextureAdvanceRequest setAlphaChannel(Boolean alphaChannel) {
        this.alphaChannel = alphaChannel;
        return this;
    }
    public Boolean getAlphaChannel() {
        return this.alphaChannel;
    }

    public GenerateTextTextureAdvanceRequest setFontName(String fontName) {
        this.fontName = fontName;
        return this;
    }
    public String getFontName() {
        return this.fontName;
    }

    public GenerateTextTextureAdvanceRequest setImageShortSize(Long imageShortSize) {
        this.imageShortSize = imageShortSize;
        return this;
    }
    public Long getImageShortSize() {
        return this.imageShortSize;
    }

    public GenerateTextTextureAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

    public GenerateTextTextureAdvanceRequest setN(Long n) {
        this.n = n;
        return this;
    }
    public Long getN() {
        return this.n;
    }

    public GenerateTextTextureAdvanceRequest setOutputImageRatio(String outputImageRatio) {
        this.outputImageRatio = outputImageRatio;
        return this;
    }
    public String getOutputImageRatio() {
        return this.outputImageRatio;
    }

    public GenerateTextTextureAdvanceRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public GenerateTextTextureAdvanceRequest setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }
    public String getTextContent() {
        return this.textContent;
    }

    public GenerateTextTextureAdvanceRequest setTextureStyle(String textureStyle) {
        this.textureStyle = textureStyle;
        return this;
    }
    public String getTextureStyle() {
        return this.textureStyle;
    }

    public GenerateTextTextureAdvanceRequest setTtfUrlObject(java.io.InputStream ttfUrlObject) {
        this.ttfUrlObject = ttfUrlObject;
        return this;
    }
    public java.io.InputStream getTtfUrlObject() {
        return this.ttfUrlObject;
    }

}
