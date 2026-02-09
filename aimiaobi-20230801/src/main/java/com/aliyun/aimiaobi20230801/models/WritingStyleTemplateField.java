// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class WritingStyleTemplateField extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("BuildIn")
    public Boolean buildIn;

    @NameInMap("CascadingFields")
    public java.util.List<WritingStyleTemplateField> cascadingFields;

    @NameInMap("Enums")
    public java.util.List<WritingStyleTemplateFieldEnums> enums;

    @NameInMap("InitialValue")
    public String initialValue;

    /**
     * <strong>example:</strong>
     * <p>topic</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("Max")
    public Double max;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxItem")
    public Integer maxItem;

    /**
     * <strong>example:</strong>
     * <p>4000</p>
     */
    @NameInMap("MaxItemLength")
    public Integer maxItemLength;

    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("MaxLength")
    public Integer maxLength;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Min")
    public Double min;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MinItemLength")
    public Integer minItemLength;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MinLength")
    public Integer minLength;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Required")
    public Boolean required;

    @NameInMap("Style")
    public WritingStyleTemplateFieldStyle style;

    public static WritingStyleTemplateField build(java.util.Map<String, ?> map) throws Exception {
        WritingStyleTemplateField self = new WritingStyleTemplateField();
        return TeaModel.build(map, self);
    }

    public WritingStyleTemplateField setBuildIn(Boolean buildIn) {
        this.buildIn = buildIn;
        return this;
    }
    public Boolean getBuildIn() {
        return this.buildIn;
    }

    public WritingStyleTemplateField setCascadingFields(java.util.List<WritingStyleTemplateField> cascadingFields) {
        this.cascadingFields = cascadingFields;
        return this;
    }
    public java.util.List<WritingStyleTemplateField> getCascadingFields() {
        return this.cascadingFields;
    }

    public WritingStyleTemplateField setEnums(java.util.List<WritingStyleTemplateFieldEnums> enums) {
        this.enums = enums;
        return this;
    }
    public java.util.List<WritingStyleTemplateFieldEnums> getEnums() {
        return this.enums;
    }

    public WritingStyleTemplateField setInitialValue(String initialValue) {
        this.initialValue = initialValue;
        return this;
    }
    public String getInitialValue() {
        return this.initialValue;
    }

    public WritingStyleTemplateField setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public WritingStyleTemplateField setMax(Double max) {
        this.max = max;
        return this;
    }
    public Double getMax() {
        return this.max;
    }

    public WritingStyleTemplateField setMaxItem(Integer maxItem) {
        this.maxItem = maxItem;
        return this;
    }
    public Integer getMaxItem() {
        return this.maxItem;
    }

    public WritingStyleTemplateField setMaxItemLength(Integer maxItemLength) {
        this.maxItemLength = maxItemLength;
        return this;
    }
    public Integer getMaxItemLength() {
        return this.maxItemLength;
    }

    public WritingStyleTemplateField setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public Integer getMaxLength() {
        return this.maxLength;
    }

    public WritingStyleTemplateField setMin(Double min) {
        this.min = min;
        return this;
    }
    public Double getMin() {
        return this.min;
    }

    public WritingStyleTemplateField setMinItemLength(Integer minItemLength) {
        this.minItemLength = minItemLength;
        return this;
    }
    public Integer getMinItemLength() {
        return this.minItemLength;
    }

    public WritingStyleTemplateField setMinLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }
    public Integer getMinLength() {
        return this.minLength;
    }

    public WritingStyleTemplateField setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WritingStyleTemplateField setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public WritingStyleTemplateField setStyle(WritingStyleTemplateFieldStyle style) {
        this.style = style;
        return this;
    }
    public WritingStyleTemplateFieldStyle getStyle() {
        return this.style;
    }

    public static class WritingStyleTemplateFieldEnums extends TeaModel {
        @NameInMap("CascadingFields")
        public java.util.List<String> cascadingFields;

        @NameInMap("Key")
        public String key;

        @NameInMap("Name")
        public String name;

        public static WritingStyleTemplateFieldEnums build(java.util.Map<String, ?> map) throws Exception {
            WritingStyleTemplateFieldEnums self = new WritingStyleTemplateFieldEnums();
            return TeaModel.build(map, self);
        }

        public WritingStyleTemplateFieldEnums setCascadingFields(java.util.List<String> cascadingFields) {
            this.cascadingFields = cascadingFields;
            return this;
        }
        public java.util.List<String> getCascadingFields() {
            return this.cascadingFields;
        }

        public WritingStyleTemplateFieldEnums setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public WritingStyleTemplateFieldEnums setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class WritingStyleTemplateFieldStyle extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>yyyy-mm-dd</p>
         */
        @NameInMap("Format")
        public String format;

        @NameInMap("Placeholder")
        public String placeholder;

        @NameInMap("ShowTime")
        public Boolean showTime;

        @NameInMap("Suffix")
        public String suffix;

        /**
         * <strong>example:</strong>
         * <p>media</p>
         */
        @NameInMap("Type")
        public String type;

        public static WritingStyleTemplateFieldStyle build(java.util.Map<String, ?> map) throws Exception {
            WritingStyleTemplateFieldStyle self = new WritingStyleTemplateFieldStyle();
            return TeaModel.build(map, self);
        }

        public WritingStyleTemplateFieldStyle setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public WritingStyleTemplateFieldStyle setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public WritingStyleTemplateFieldStyle setPlaceholder(String placeholder) {
            this.placeholder = placeholder;
            return this;
        }
        public String getPlaceholder() {
            return this.placeholder;
        }

        public WritingStyleTemplateFieldStyle setShowTime(Boolean showTime) {
            this.showTime = showTime;
            return this;
        }
        public Boolean getShowTime() {
            return this.showTime;
        }

        public WritingStyleTemplateFieldStyle setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public WritingStyleTemplateFieldStyle setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
