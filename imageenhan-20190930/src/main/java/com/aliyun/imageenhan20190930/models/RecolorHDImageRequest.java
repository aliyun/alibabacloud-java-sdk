// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RecolorHDImageRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("RefUrl")
    public String refUrl;

    @NameInMap("ColorCount")
    public Integer colorCount;

    @NameInMap("Degree")
    public String degree;

    @NameInMap("Async")
    public Boolean async;

    @NameInMap("ColorTemplate")
    public java.util.List<RecolorHDImageRequestColorTemplate> colorTemplate;

    public static RecolorHDImageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecolorHDImageRequest self = new RecolorHDImageRequest();
        return TeaModel.build(map, self);
    }

    public RecolorHDImageRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecolorHDImageRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public RecolorHDImageRequest setRefUrl(String refUrl) {
        this.refUrl = refUrl;
        return this;
    }
    public String getRefUrl() {
        return this.refUrl;
    }

    public RecolorHDImageRequest setColorCount(Integer colorCount) {
        this.colorCount = colorCount;
        return this;
    }
    public Integer getColorCount() {
        return this.colorCount;
    }

    public RecolorHDImageRequest setDegree(String degree) {
        this.degree = degree;
        return this;
    }
    public String getDegree() {
        return this.degree;
    }

    public RecolorHDImageRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public RecolorHDImageRequest setColorTemplate(java.util.List<RecolorHDImageRequestColorTemplate> colorTemplate) {
        this.colorTemplate = colorTemplate;
        return this;
    }
    public java.util.List<RecolorHDImageRequestColorTemplate> getColorTemplate() {
        return this.colorTemplate;
    }

    public static class RecolorHDImageRequestColorTemplate extends TeaModel {
        @NameInMap("Color")
        public String color;

        public static RecolorHDImageRequestColorTemplate build(java.util.Map<String, ?> map) throws Exception {
            RecolorHDImageRequestColorTemplate self = new RecolorHDImageRequestColorTemplate();
            return TeaModel.build(map, self);
        }

        public RecolorHDImageRequestColorTemplate setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

    }

}
