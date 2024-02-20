// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class GenerateTextTextureRequest extends TeaModel {
    @NameInMap("AlphaChannel")
    public Boolean alphaChannel;

    @NameInMap("FontName")
    public String fontName;

    @NameInMap("ImageShortSize")
    public Long imageShortSize;

    @NameInMap("ImageUrl")
    public String imageUrl;

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
    public String ttfUrl;

    public static GenerateTextTextureRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateTextTextureRequest self = new GenerateTextTextureRequest();
        return TeaModel.build(map, self);
    }

    public GenerateTextTextureRequest setAlphaChannel(Boolean alphaChannel) {
        this.alphaChannel = alphaChannel;
        return this;
    }
    public Boolean getAlphaChannel() {
        return this.alphaChannel;
    }

    public GenerateTextTextureRequest setFontName(String fontName) {
        this.fontName = fontName;
        return this;
    }
    public String getFontName() {
        return this.fontName;
    }

    public GenerateTextTextureRequest setImageShortSize(Long imageShortSize) {
        this.imageShortSize = imageShortSize;
        return this;
    }
    public Long getImageShortSize() {
        return this.imageShortSize;
    }

    public GenerateTextTextureRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public GenerateTextTextureRequest setN(Long n) {
        this.n = n;
        return this;
    }
    public Long getN() {
        return this.n;
    }

    public GenerateTextTextureRequest setOutputImageRatio(String outputImageRatio) {
        this.outputImageRatio = outputImageRatio;
        return this;
    }
    public String getOutputImageRatio() {
        return this.outputImageRatio;
    }

    public GenerateTextTextureRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public GenerateTextTextureRequest setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }
    public String getTextContent() {
        return this.textContent;
    }

    public GenerateTextTextureRequest setTextureStyle(String textureStyle) {
        this.textureStyle = textureStyle;
        return this;
    }
    public String getTextureStyle() {
        return this.textureStyle;
    }

    public GenerateTextTextureRequest setTtfUrl(String ttfUrl) {
        this.ttfUrl = ttfUrl;
        return this;
    }
    public String getTtfUrl() {
        return this.ttfUrl;
    }

}
