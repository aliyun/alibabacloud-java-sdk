// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RecolorImageRequest extends TeaModel {
    @NameInMap("ColorCount")
    public Integer colorCount;

    @NameInMap("ColorTemplate")
    public java.util.List<RecolorImageRequestColorTemplate> colorTemplate;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("RefUrl")
    public String refUrl;

    @NameInMap("Url")
    public String url;

    public static RecolorImageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecolorImageRequest self = new RecolorImageRequest();
        return TeaModel.build(map, self);
    }

    public RecolorImageRequest setColorCount(Integer colorCount) {
        this.colorCount = colorCount;
        return this;
    }
    public Integer getColorCount() {
        return this.colorCount;
    }

    public RecolorImageRequest setColorTemplate(java.util.List<RecolorImageRequestColorTemplate> colorTemplate) {
        this.colorTemplate = colorTemplate;
        return this;
    }
    public java.util.List<RecolorImageRequestColorTemplate> getColorTemplate() {
        return this.colorTemplate;
    }

    public RecolorImageRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public RecolorImageRequest setRefUrl(String refUrl) {
        this.refUrl = refUrl;
        return this;
    }
    public String getRefUrl() {
        return this.refUrl;
    }

    public RecolorImageRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class RecolorImageRequestColorTemplate extends TeaModel {
        @NameInMap("Color")
        public String color;

        public static RecolorImageRequestColorTemplate build(java.util.Map<String, ?> map) throws Exception {
            RecolorImageRequestColorTemplate self = new RecolorImageRequestColorTemplate();
            return TeaModel.build(map, self);
        }

        public RecolorImageRequestColorTemplate setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

    }

}
