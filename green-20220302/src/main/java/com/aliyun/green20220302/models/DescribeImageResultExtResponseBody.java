// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeImageResultExtResponseBody extends TeaModel {
    /**
     * <p>The returned HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeImageResultExtResponseBodyData data;

    /**
     * <p>The message that is returned in response to the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6CF2815C-C8C7-4A01-B52E-FF6E24F53492</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeImageResultExtResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageResultExtResponseBody self = new DescribeImageResultExtResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageResultExtResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeImageResultExtResponseBody setData(DescribeImageResultExtResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeImageResultExtResponseBodyData getData() {
        return this.data;
    }

    public DescribeImageResultExtResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeImageResultExtResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeImageResultExtResponseBodyDataCustomImage extends TeaModel {
        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image library ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("LibId")
        public String libId;

        /**
         * <p>The image library name.</p>
         * 
         * <strong>example:</strong>
         * <p>图库123</p>
         */
        @NameInMap("LibName")
        public String libName;

        public static DescribeImageResultExtResponseBodyDataCustomImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageResultExtResponseBodyDataCustomImage self = new DescribeImageResultExtResponseBodyDataCustomImage();
            return TeaModel.build(map, self);
        }

        public DescribeImageResultExtResponseBodyDataCustomImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeImageResultExtResponseBodyDataCustomImage setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public DescribeImageResultExtResponseBodyDataCustomImage setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

    }

    public static class DescribeImageResultExtResponseBodyDataPublicFigure extends TeaModel {
        /**
         * <p>Identified person coding information.</p>
         * 
         * <strong>example:</strong>
         * <p>yzazhzou</p>
         */
        @NameInMap("FigureId")
        public String figureId;

        public static DescribeImageResultExtResponseBodyDataPublicFigure build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageResultExtResponseBodyDataPublicFigure self = new DescribeImageResultExtResponseBodyDataPublicFigure();
            return TeaModel.build(map, self);
        }

        public DescribeImageResultExtResponseBodyDataPublicFigure setFigureId(String figureId) {
            this.figureId = figureId;
            return this;
        }
        public String getFigureId() {
            return this.figureId;
        }

    }

    public static class DescribeImageResultExtResponseBodyDataTextInImageCustomTexts extends TeaModel {
        /**
         * <p>Custom words, multiple words separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa,bbb</p>
         */
        @NameInMap("KeyWords")
        public String keyWords;

        /**
         * <p>Custom library ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("LibId")
        public String libId;

        /**
         * <p>Custom library name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("LibName")
        public String libName;

        public static DescribeImageResultExtResponseBodyDataTextInImageCustomTexts build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageResultExtResponseBodyDataTextInImageCustomTexts self = new DescribeImageResultExtResponseBodyDataTextInImageCustomTexts();
            return TeaModel.build(map, self);
        }

        public DescribeImageResultExtResponseBodyDataTextInImageCustomTexts setKeyWords(String keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public String getKeyWords() {
            return this.keyWords;
        }

        public DescribeImageResultExtResponseBodyDataTextInImageCustomTexts setLibId(String libId) {
            this.libId = libId;
            return this;
        }
        public String getLibId() {
            return this.libId;
        }

        public DescribeImageResultExtResponseBodyDataTextInImageCustomTexts setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

    }

    public static class DescribeImageResultExtResponseBodyDataTextInImage extends TeaModel {
        /**
         * <p>When a custom text library is hit, the custom library ID, custom library name, and custom word are returned.</p>
         */
        @NameInMap("CustomTexts")
        public java.util.List<DescribeImageResultExtResponseBodyDataTextInImageCustomTexts> customTexts;

        /**
         * <p>Returns the text information in the recognized image.</p>
         */
        @NameInMap("OcrDatas")
        public java.util.List<String> ocrDatas;

        /**
         * <p>The risk words that are hit. Multiple words are separated by commas (,).</p>
         */
        @NameInMap("RiskWords")
        public java.util.List<String> riskWords;

        public static DescribeImageResultExtResponseBodyDataTextInImage build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageResultExtResponseBodyDataTextInImage self = new DescribeImageResultExtResponseBodyDataTextInImage();
            return TeaModel.build(map, self);
        }

        public DescribeImageResultExtResponseBodyDataTextInImage setCustomTexts(java.util.List<DescribeImageResultExtResponseBodyDataTextInImageCustomTexts> customTexts) {
            this.customTexts = customTexts;
            return this;
        }
        public java.util.List<DescribeImageResultExtResponseBodyDataTextInImageCustomTexts> getCustomTexts() {
            return this.customTexts;
        }

        public DescribeImageResultExtResponseBodyDataTextInImage setOcrDatas(java.util.List<String> ocrDatas) {
            this.ocrDatas = ocrDatas;
            return this;
        }
        public java.util.List<String> getOcrDatas() {
            return this.ocrDatas;
        }

        public DescribeImageResultExtResponseBodyDataTextInImage setRiskWords(java.util.List<String> riskWords) {
            this.riskWords = riskWords;
            return this;
        }
        public java.util.List<String> getRiskWords() {
            return this.riskWords;
        }

    }

    public static class DescribeImageResultExtResponseBodyData extends TeaModel {
        /**
         * <p>If a custom image library is hit, information about the hit custom image library is returned.</p>
         */
        @NameInMap("CustomImage")
        public java.util.List<DescribeImageResultExtResponseBodyDataCustomImage> customImage;

        /**
         * <p>Person information list.</p>
         */
        @NameInMap("PublicFigure")
        public java.util.List<DescribeImageResultExtResponseBodyDataPublicFigure> publicFigure;

        /**
         * <p>Returns the text information in the hit image.</p>
         */
        @NameInMap("TextInImage")
        public DescribeImageResultExtResponseBodyDataTextInImage textInImage;

        public static DescribeImageResultExtResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageResultExtResponseBodyData self = new DescribeImageResultExtResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeImageResultExtResponseBodyData setCustomImage(java.util.List<DescribeImageResultExtResponseBodyDataCustomImage> customImage) {
            this.customImage = customImage;
            return this;
        }
        public java.util.List<DescribeImageResultExtResponseBodyDataCustomImage> getCustomImage() {
            return this.customImage;
        }

        public DescribeImageResultExtResponseBodyData setPublicFigure(java.util.List<DescribeImageResultExtResponseBodyDataPublicFigure> publicFigure) {
            this.publicFigure = publicFigure;
            return this;
        }
        public java.util.List<DescribeImageResultExtResponseBodyDataPublicFigure> getPublicFigure() {
            return this.publicFigure;
        }

        public DescribeImageResultExtResponseBodyData setTextInImage(DescribeImageResultExtResponseBodyDataTextInImage textInImage) {
            this.textInImage = textInImage;
            return this;
        }
        public DescribeImageResultExtResponseBodyDataTextInImage getTextInImage() {
            return this.textInImage;
        }

    }

}
