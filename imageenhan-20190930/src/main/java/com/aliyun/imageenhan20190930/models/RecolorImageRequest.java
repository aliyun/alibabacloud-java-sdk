// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RecolorImageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ColorCount")
    public Integer colorCount;

    /**
     * <p>1</p>
     */
    @NameInMap("ColorTemplate")
    public java.util.List<RecolorImageRequestColorTemplate> colorTemplate;

    /**
     * <strong>example:</strong>
     * <p>TEMPLATE</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/RecolorImage/RecolorImage-REF_PIC7.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/RecolorImage/RecolorImage-REF_PIC7.jpg</a></p>
     */
    @NameInMap("RefUrl")
    public String refUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/RecolorImage/RecolorImage-REF_PIC1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/RecolorImage/RecolorImage-REF_PIC1.jpg</a></p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>056A6B</p>
         */
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
