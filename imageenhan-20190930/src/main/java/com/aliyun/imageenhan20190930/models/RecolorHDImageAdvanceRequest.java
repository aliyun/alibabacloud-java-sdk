// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RecolorHDImageAdvanceRequest extends TeaModel {
    @NameInMap("ColorCount")
    public Integer colorCount;

    // 1
    @NameInMap("ColorTemplate")
    public java.util.List<RecolorHDImageAdvanceRequestColorTemplate> colorTemplate;

    @NameInMap("Degree")
    public String degree;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("RefUrl")
    public java.io.InputStream refUrlObject;

    @NameInMap("Url")
    public java.io.InputStream urlObject;

    public static RecolorHDImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecolorHDImageAdvanceRequest self = new RecolorHDImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecolorHDImageAdvanceRequest setColorCount(Integer colorCount) {
        this.colorCount = colorCount;
        return this;
    }
    public Integer getColorCount() {
        return this.colorCount;
    }

    public RecolorHDImageAdvanceRequest setColorTemplate(java.util.List<RecolorHDImageAdvanceRequestColorTemplate> colorTemplate) {
        this.colorTemplate = colorTemplate;
        return this;
    }
    public java.util.List<RecolorHDImageAdvanceRequestColorTemplate> getColorTemplate() {
        return this.colorTemplate;
    }

    public RecolorHDImageAdvanceRequest setDegree(String degree) {
        this.degree = degree;
        return this;
    }
    public String getDegree() {
        return this.degree;
    }

    public RecolorHDImageAdvanceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public RecolorHDImageAdvanceRequest setRefUrlObject(java.io.InputStream refUrlObject) {
        this.refUrlObject = refUrlObject;
        return this;
    }
    public java.io.InputStream getRefUrlObject() {
        return this.refUrlObject;
    }

    public RecolorHDImageAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

    public static class RecolorHDImageAdvanceRequestColorTemplate extends TeaModel {
        @NameInMap("Color")
        public String color;

        public static RecolorHDImageAdvanceRequestColorTemplate build(java.util.Map<String, ?> map) throws Exception {
            RecolorHDImageAdvanceRequestColorTemplate self = new RecolorHDImageAdvanceRequestColorTemplate();
            return TeaModel.build(map, self);
        }

        public RecolorHDImageAdvanceRequestColorTemplate setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

    }

}
