// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class CategoryAttributeMatchResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public CategoryAttributeMatchResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9927B72F-3C8F-54C0-AAE3-2B1AC94BB6EF</p>
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

    public static CategoryAttributeMatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CategoryAttributeMatchResponseBody self = new CategoryAttributeMatchResponseBody();
        return TeaModel.build(map, self);
    }

    public CategoryAttributeMatchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CategoryAttributeMatchResponseBody setData(CategoryAttributeMatchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CategoryAttributeMatchResponseBodyData getData() {
        return this.data;
    }

    public CategoryAttributeMatchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CategoryAttributeMatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CategoryAttributeMatchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CategoryAttributeMatchResponseBodyDataAttributes extends TeaModel {
        /**
         * <p>The attribute ID.</p>
         * 
         * <strong>example:</strong>
         * <p>682439</p>
         */
        @NameInMap("AttrId")
        public Integer attrId;

        /**
         * <p>The matching confidence score. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Confidence")
        public Integer confidence;

        /**
         * <p>The input type of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>单选下拉</p>
         */
        @NameInMap("InputType")
        public String inputType;

        /**
         * <p>Indicates whether the attribute is successfully matched. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Matched")
        public Boolean matched;

        /**
         * <p>The Chinese name of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>netpila-backup-vpc-j5ekvvg5i5iquaeqbyf6b-cn-shenzhen-finance-1d</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The English name of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>ABC Private POP</p>
         */
        @NameInMap("NameEn")
        public String nameEn;

        /**
         * <p>The reason for the matching result.</p>
         * 
         * <strong>example:</strong>
         * <p>a_reason</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The list of selected attribute value texts, such as [&quot;iOS&quot;,&quot;Android&quot;\].</p>
         */
        @NameInMap("SelectedValues")
        public java.util.List<String> selectedValues;

        /**
         * <p>The list of selected attribute value IDs, such as [30127,30128\].</p>
         */
        @NameInMap("SelectedVids")
        public java.util.List<Integer> selectedVids;

        public static CategoryAttributeMatchResponseBodyDataAttributes build(java.util.Map<String, ?> map) throws Exception {
            CategoryAttributeMatchResponseBodyDataAttributes self = new CategoryAttributeMatchResponseBodyDataAttributes();
            return TeaModel.build(map, self);
        }

        public CategoryAttributeMatchResponseBodyDataAttributes setAttrId(Integer attrId) {
            this.attrId = attrId;
            return this;
        }
        public Integer getAttrId() {
            return this.attrId;
        }

        public CategoryAttributeMatchResponseBodyDataAttributes setConfidence(Integer confidence) {
            this.confidence = confidence;
            return this;
        }
        public Integer getConfidence() {
            return this.confidence;
        }

        public CategoryAttributeMatchResponseBodyDataAttributes setInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }
        public String getInputType() {
            return this.inputType;
        }

        public CategoryAttributeMatchResponseBodyDataAttributes setMatched(Boolean matched) {
            this.matched = matched;
            return this;
        }
        public Boolean getMatched() {
            return this.matched;
        }

        public CategoryAttributeMatchResponseBodyDataAttributes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CategoryAttributeMatchResponseBodyDataAttributes setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public CategoryAttributeMatchResponseBodyDataAttributes setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public CategoryAttributeMatchResponseBodyDataAttributes setSelectedValues(java.util.List<String> selectedValues) {
            this.selectedValues = selectedValues;
            return this;
        }
        public java.util.List<String> getSelectedValues() {
            return this.selectedValues;
        }

        public CategoryAttributeMatchResponseBodyDataAttributes setSelectedVids(java.util.List<Integer> selectedVids) {
            this.selectedVids = selectedVids;
            return this;
        }
        public java.util.List<Integer> getSelectedVids() {
            return this.selectedVids;
        }

    }

    public static class CategoryAttributeMatchResponseBodyDataUsageMap extends TeaModel {
        /**
         * <p>The number of processing times.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProcessingCount")
        public Integer processingCount;

        public static CategoryAttributeMatchResponseBodyDataUsageMap build(java.util.Map<String, ?> map) throws Exception {
            CategoryAttributeMatchResponseBodyDataUsageMap self = new CategoryAttributeMatchResponseBodyDataUsageMap();
            return TeaModel.build(map, self);
        }

        public CategoryAttributeMatchResponseBodyDataUsageMap setProcessingCount(Integer processingCount) {
            this.processingCount = processingCount;
            return this;
        }
        public Integer getProcessingCount() {
            return this.processingCount;
        }

    }

    public static class CategoryAttributeMatchResponseBodyData extends TeaModel {
        /**
         * <p>The list of attribute filling results.</p>
         */
        @NameInMap("Attributes")
        public java.util.List<CategoryAttributeMatchResponseBodyDataAttributes> attributes;

        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FC-F3A8A2802D10606D</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <p>The category name.</p>
         * 
         * <strong>example:</strong>
         * <p>猫项圈</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The full path of the category, separated by &quot;/&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>宠物用品/猫用品/猫挂饰、项圈、牵引带/猫项圈</p>
         */
        @NameInMap("CategoryPath")
        public String categoryPath;

        /**
         * <p>The number of attributes that are successfully filled.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("FilledCount")
        public Integer filledCount;

        /**
         * <p>Indicates whether the attribute is successfully matched. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Matched")
        public Boolean matched;

        /**
         * <p>The total number of attributes under the category.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalAttributes")
        public Integer totalAttributes;

        /**
         * <p>The usage fields.</p>
         */
        @NameInMap("UsageMap")
        public CategoryAttributeMatchResponseBodyDataUsageMap usageMap;

        public static CategoryAttributeMatchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CategoryAttributeMatchResponseBodyData self = new CategoryAttributeMatchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CategoryAttributeMatchResponseBodyData setAttributes(java.util.List<CategoryAttributeMatchResponseBodyDataAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<CategoryAttributeMatchResponseBodyDataAttributes> getAttributes() {
            return this.attributes;
        }

        public CategoryAttributeMatchResponseBodyData setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public CategoryAttributeMatchResponseBodyData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public CategoryAttributeMatchResponseBodyData setCategoryPath(String categoryPath) {
            this.categoryPath = categoryPath;
            return this;
        }
        public String getCategoryPath() {
            return this.categoryPath;
        }

        public CategoryAttributeMatchResponseBodyData setFilledCount(Integer filledCount) {
            this.filledCount = filledCount;
            return this;
        }
        public Integer getFilledCount() {
            return this.filledCount;
        }

        public CategoryAttributeMatchResponseBodyData setMatched(Boolean matched) {
            this.matched = matched;
            return this;
        }
        public Boolean getMatched() {
            return this.matched;
        }

        public CategoryAttributeMatchResponseBodyData setTotalAttributes(Integer totalAttributes) {
            this.totalAttributes = totalAttributes;
            return this;
        }
        public Integer getTotalAttributes() {
            return this.totalAttributes;
        }

        public CategoryAttributeMatchResponseBodyData setUsageMap(CategoryAttributeMatchResponseBodyDataUsageMap usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public CategoryAttributeMatchResponseBodyDataUsageMap getUsageMap() {
            return this.usageMap;
        }

    }

}
