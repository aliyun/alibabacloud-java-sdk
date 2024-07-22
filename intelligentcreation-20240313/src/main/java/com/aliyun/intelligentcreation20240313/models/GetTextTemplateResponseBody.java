// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetTextTemplateResponseBody extends TeaModel {
    @NameInMap("availableIndustry")
    public GetTextTemplateResponseBodyAvailableIndustry availableIndustry;

    /**
     * <strong>example:</strong>
     * <p>3239281273464326823</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetTextTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTextTemplateResponseBody self = new GetTextTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTextTemplateResponseBody setAvailableIndustry(GetTextTemplateResponseBodyAvailableIndustry availableIndustry) {
        this.availableIndustry = availableIndustry;
        return this;
    }
    public GetTextTemplateResponseBodyAvailableIndustry getAvailableIndustry() {
        return this.availableIndustry;
    }

    public GetTextTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTextTemplateResponseBodyAvailableIndustryTextModeTypesTextStyles extends TeaModel {
        @NameInMap("desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("disabled")
        public Boolean disabled;

        /**
         * <strong>example:</strong>
         * <p>RED_BOOK</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("templateKey")
        public String templateKey;

        public static GetTextTemplateResponseBodyAvailableIndustryTextModeTypesTextStyles build(java.util.Map<String, ?> map) throws Exception {
            GetTextTemplateResponseBodyAvailableIndustryTextModeTypesTextStyles self = new GetTextTemplateResponseBodyAvailableIndustryTextModeTypesTextStyles();
            return TeaModel.build(map, self);
        }

        public GetTextTemplateResponseBodyAvailableIndustryTextModeTypesTextStyles setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetTextTemplateResponseBodyAvailableIndustryTextModeTypesTextStyles setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public GetTextTemplateResponseBodyAvailableIndustryTextModeTypesTextStyles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTextTemplateResponseBodyAvailableIndustryTextModeTypesTextStyles setTemplateKey(String templateKey) {
            this.templateKey = templateKey;
            return this;
        }
        public String getTemplateKey() {
            return this.templateKey;
        }

    }

    public static class GetTextTemplateResponseBodyAvailableIndustryTextModeTypes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Rewrite</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("textStyles")
        public java.util.List<GetTextTemplateResponseBodyAvailableIndustryTextModeTypesTextStyles> textStyles;

        public static GetTextTemplateResponseBodyAvailableIndustryTextModeTypes build(java.util.Map<String, ?> map) throws Exception {
            GetTextTemplateResponseBodyAvailableIndustryTextModeTypes self = new GetTextTemplateResponseBodyAvailableIndustryTextModeTypes();
            return TeaModel.build(map, self);
        }

        public GetTextTemplateResponseBodyAvailableIndustryTextModeTypes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTextTemplateResponseBodyAvailableIndustryTextModeTypes setTextStyles(java.util.List<GetTextTemplateResponseBodyAvailableIndustryTextModeTypesTextStyles> textStyles) {
            this.textStyles = textStyles;
            return this;
        }
        public java.util.List<GetTextTemplateResponseBodyAvailableIndustryTextModeTypesTextStyles> getTextStyles() {
            return this.textStyles;
        }

    }

    public static class GetTextTemplateResponseBodyAvailableIndustry extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Car</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("textModeTypes")
        public java.util.List<GetTextTemplateResponseBodyAvailableIndustryTextModeTypes> textModeTypes;

        public static GetTextTemplateResponseBodyAvailableIndustry build(java.util.Map<String, ?> map) throws Exception {
            GetTextTemplateResponseBodyAvailableIndustry self = new GetTextTemplateResponseBodyAvailableIndustry();
            return TeaModel.build(map, self);
        }

        public GetTextTemplateResponseBodyAvailableIndustry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTextTemplateResponseBodyAvailableIndustry setTextModeTypes(java.util.List<GetTextTemplateResponseBodyAvailableIndustryTextModeTypes> textModeTypes) {
            this.textModeTypes = textModeTypes;
            return this;
        }
        public java.util.List<GetTextTemplateResponseBodyAvailableIndustryTextModeTypes> getTextModeTypes() {
            return this.textModeTypes;
        }

    }

}
