// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetRangeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("backgroundColors")
    public java.util.List<java.util.List<GetRangeResponseBodyBackgroundColors>> backgroundColors;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("displayValues")
    public java.util.List<java.util.List<String>> displayValues;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("formulas")
    public java.util.List<java.util.List<String>> formulas;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("values")
    public java.util.List<java.util.List<?>> values;

    public static GetRangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRangeResponseBody self = new GetRangeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRangeResponseBody setBackgroundColors(java.util.List<java.util.List<GetRangeResponseBodyBackgroundColors>> backgroundColors) {
        this.backgroundColors = backgroundColors;
        return this;
    }
    public java.util.List<java.util.List<GetRangeResponseBodyBackgroundColors>> getBackgroundColors() {
        return this.backgroundColors;
    }

    public GetRangeResponseBody setDisplayValues(java.util.List<java.util.List<String>> displayValues) {
        this.displayValues = displayValues;
        return this;
    }
    public java.util.List<java.util.List<String>> getDisplayValues() {
        return this.displayValues;
    }

    public GetRangeResponseBody setFormulas(java.util.List<java.util.List<String>> formulas) {
        this.formulas = formulas;
        return this;
    }
    public java.util.List<java.util.List<String>> getFormulas() {
        return this.formulas;
    }

    public GetRangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRangeResponseBody setValues(java.util.List<java.util.List<?>> values) {
        this.values = values;
        return this;
    }
    public java.util.List<java.util.List<?>> getValues() {
        return this.values;
    }

    public static class GetRangeResponseBodyBackgroundColors extends TeaModel {
        /**
         * <p>red</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Red")
        public Integer red;

        /**
         * <p>green</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Green")
        public Integer green;

        /**
         * <p>blue</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Blue")
        public Integer blue;

        /**
         * <p>hexString</p>
         * 
         * <strong>example:</strong>
         * <p>#000000</p>
         */
        @NameInMap("HexString")
        public String hexString;

        public static GetRangeResponseBodyBackgroundColors build(java.util.Map<String, ?> map) throws Exception {
            GetRangeResponseBodyBackgroundColors self = new GetRangeResponseBodyBackgroundColors();
            return TeaModel.build(map, self);
        }

        public GetRangeResponseBodyBackgroundColors setRed(Integer red) {
            this.red = red;
            return this;
        }
        public Integer getRed() {
            return this.red;
        }

        public GetRangeResponseBodyBackgroundColors setGreen(Integer green) {
            this.green = green;
            return this;
        }
        public Integer getGreen() {
            return this.green;
        }

        public GetRangeResponseBodyBackgroundColors setBlue(Integer blue) {
            this.blue = blue;
            return this;
        }
        public Integer getBlue() {
            return this.blue;
        }

        public GetRangeResponseBodyBackgroundColors setHexString(String hexString) {
            this.hexString = hexString;
            return this;
        }
        public String getHexString() {
            return this.hexString;
        }

    }

}
