// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RecolorHDImageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ColorCount")
    public Integer colorCount;

    /**
     * <p>1</p>
     */
    @NameInMap("ColorTemplate")
    public java.util.List<RecolorHDImageRequestColorTemplate> colorTemplate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.4</p>
     */
    @NameInMap("Degree")
    public String degree;

    /**
     * <strong>example:</strong>
     * <p>REF_PIC</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/RecolorHDImage/RecolorHDImage-REF_PIC6.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/RecolorHDImage/RecolorHDImage-REF_PIC6.jpg</a></p>
     */
    @NameInMap("RefUrl")
    public String refUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/RecolorHDImage/RecolorHDImage-auto1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/RecolorHDImage/RecolorHDImage-auto1.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static RecolorHDImageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecolorHDImageRequest self = new RecolorHDImageRequest();
        return TeaModel.build(map, self);
    }

    public RecolorHDImageRequest setColorCount(Integer colorCount) {
        this.colorCount = colorCount;
        return this;
    }
    public Integer getColorCount() {
        return this.colorCount;
    }

    public RecolorHDImageRequest setColorTemplate(java.util.List<RecolorHDImageRequestColorTemplate> colorTemplate) {
        this.colorTemplate = colorTemplate;
        return this;
    }
    public java.util.List<RecolorHDImageRequestColorTemplate> getColorTemplate() {
        return this.colorTemplate;
    }

    public RecolorHDImageRequest setDegree(String degree) {
        this.degree = degree;
        return this;
    }
    public String getDegree() {
        return this.degree;
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

    public RecolorHDImageRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class RecolorHDImageRequestColorTemplate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[3F6A6B,0A0A6F]</p>
         */
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
