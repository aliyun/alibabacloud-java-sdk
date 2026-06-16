// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageRecognitionResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The intelligent element recognition result.</p>
     */
    @NameInMap("Data")
    public ImageRecognitionResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImageRecognitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageRecognitionResponseBody self = new ImageRecognitionResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageRecognitionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImageRecognitionResponseBody setData(ImageRecognitionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImageRecognitionResponseBodyData getData() {
        return this.data;
    }

    public ImageRecognitionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImageRecognitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImageRecognitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImageRecognitionResponseBodyData extends TeaModel {
        /**
         * <p>The border pixel information, returned as a comma-separated string.</p>
         * 
         * <strong>example:</strong>
         * <p>8,10,0,1,330,330</p>
         */
        @NameInMap("BorderPixel")
        public String borderPixel;

        /**
         * <p>Indicates whether the non-subject area contains text.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NoobjCharacter")
        public Boolean noobjCharacter;

        /**
         * <p>Indicates whether the non-subject area contains a logo.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NoobjLogo")
        public Boolean noobjLogo;

        /**
         * <p>Indicates whether the non-subject area contains irrelevant pixels or noise.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NoobjNpx")
        public Boolean noobjNpx;

        /**
         * <p>Indicates whether the non-subject area contains a watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NoobjWatermark")
        public Boolean noobjWatermark;

        /**
         * <p>Indicates whether the subject area contains text.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ObjCharacter")
        public Boolean objCharacter;

        /**
         * <p>Indicates whether the subject area contains a logo.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ObjLogo")
        public Boolean objLogo;

        /**
         * <p>Indicates whether the subject area contains irrelevant pixels or noise.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ObjNpx")
        public Boolean objNpx;

        /**
         * <p>Indicates whether the subject area contains a watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ObjWatermark")
        public Boolean objWatermark;

        /**
         * <p>The product count.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PdNum")
        public Integer pdNum;

        /**
         * <p>The product proportion.</p>
         * 
         * <strong>example:</strong>
         * <p>74.15%</p>
         */
        @NameInMap("PdProp")
        public String pdProp;

        /**
         * <p>The list of recognized text.</p>
         */
        @NameInMap("RecText")
        public java.util.List<String> recText;

        /**
         * <p>The text proportion.</p>
         * 
         * <strong>example:</strong>
         * <p>7.52%</p>
         */
        @NameInMap("TextProp")
        public String textProp;

        /**
         * <p>The usage information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessedImageCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static ImageRecognitionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImageRecognitionResponseBodyData self = new ImageRecognitionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImageRecognitionResponseBodyData setBorderPixel(String borderPixel) {
            this.borderPixel = borderPixel;
            return this;
        }
        public String getBorderPixel() {
            return this.borderPixel;
        }

        public ImageRecognitionResponseBodyData setNoobjCharacter(Boolean noobjCharacter) {
            this.noobjCharacter = noobjCharacter;
            return this;
        }
        public Boolean getNoobjCharacter() {
            return this.noobjCharacter;
        }

        public ImageRecognitionResponseBodyData setNoobjLogo(Boolean noobjLogo) {
            this.noobjLogo = noobjLogo;
            return this;
        }
        public Boolean getNoobjLogo() {
            return this.noobjLogo;
        }

        public ImageRecognitionResponseBodyData setNoobjNpx(Boolean noobjNpx) {
            this.noobjNpx = noobjNpx;
            return this;
        }
        public Boolean getNoobjNpx() {
            return this.noobjNpx;
        }

        public ImageRecognitionResponseBodyData setNoobjWatermark(Boolean noobjWatermark) {
            this.noobjWatermark = noobjWatermark;
            return this;
        }
        public Boolean getNoobjWatermark() {
            return this.noobjWatermark;
        }

        public ImageRecognitionResponseBodyData setObjCharacter(Boolean objCharacter) {
            this.objCharacter = objCharacter;
            return this;
        }
        public Boolean getObjCharacter() {
            return this.objCharacter;
        }

        public ImageRecognitionResponseBodyData setObjLogo(Boolean objLogo) {
            this.objLogo = objLogo;
            return this;
        }
        public Boolean getObjLogo() {
            return this.objLogo;
        }

        public ImageRecognitionResponseBodyData setObjNpx(Boolean objNpx) {
            this.objNpx = objNpx;
            return this;
        }
        public Boolean getObjNpx() {
            return this.objNpx;
        }

        public ImageRecognitionResponseBodyData setObjWatermark(Boolean objWatermark) {
            this.objWatermark = objWatermark;
            return this;
        }
        public Boolean getObjWatermark() {
            return this.objWatermark;
        }

        public ImageRecognitionResponseBodyData setPdNum(Integer pdNum) {
            this.pdNum = pdNum;
            return this;
        }
        public Integer getPdNum() {
            return this.pdNum;
        }

        public ImageRecognitionResponseBodyData setPdProp(String pdProp) {
            this.pdProp = pdProp;
            return this;
        }
        public String getPdProp() {
            return this.pdProp;
        }

        public ImageRecognitionResponseBodyData setRecText(java.util.List<String> recText) {
            this.recText = recText;
            return this;
        }
        public java.util.List<String> getRecText() {
            return this.recText;
        }

        public ImageRecognitionResponseBodyData setTextProp(String textProp) {
            this.textProp = textProp;
            return this;
        }
        public String getTextProp() {
            return this.textProp;
        }

        public ImageRecognitionResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
