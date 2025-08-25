// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RecolorImageAdvanceRequest extends TeaModel {
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
    public java.util.List<RecolorImageAdvanceRequestColorTemplate> colorTemplate;

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
    public java.io.InputStream refUrlObject;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/RecolorImage/RecolorImage-REF_PIC1.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/imageenhan/RecolorImage/RecolorImage-REF_PIC1.jpg</a></p>
     */
    @NameInMap("Url")
    public java.io.InputStream urlObject;

    public static RecolorImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecolorImageAdvanceRequest self = new RecolorImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecolorImageAdvanceRequest setColorCount(Integer colorCount) {
        this.colorCount = colorCount;
        return this;
    }
    public Integer getColorCount() {
        return this.colorCount;
    }

    public RecolorImageAdvanceRequest setColorTemplate(java.util.List<RecolorImageAdvanceRequestColorTemplate> colorTemplate) {
        this.colorTemplate = colorTemplate;
        return this;
    }
    public java.util.List<RecolorImageAdvanceRequestColorTemplate> getColorTemplate() {
        return this.colorTemplate;
    }

    public RecolorImageAdvanceRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public RecolorImageAdvanceRequest setRefUrlObject(java.io.InputStream refUrlObject) {
        this.refUrlObject = refUrlObject;
        return this;
    }
    public java.io.InputStream getRefUrlObject() {
        return this.refUrlObject;
    }

    public RecolorImageAdvanceRequest setUrlObject(java.io.InputStream urlObject) {
        this.urlObject = urlObject;
        return this;
    }
    public java.io.InputStream getUrlObject() {
        return this.urlObject;
    }

    public static class RecolorImageAdvanceRequestColorTemplate extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>056A6B</p>
         */
        @NameInMap("Color")
        public String color;

        public static RecolorImageAdvanceRequestColorTemplate build(java.util.Map<String, ?> map) throws Exception {
            RecolorImageAdvanceRequestColorTemplate self = new RecolorImageAdvanceRequestColorTemplate();
            return TeaModel.build(map, self);
        }

        public RecolorImageAdvanceRequestColorTemplate setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

    }

}
