// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class CategoryMatchResponseBody extends TeaModel {
    /**
     * <p>The status code. The value &quot;success&quot; is returned for a successful call.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The product category matching result.</p>
     */
    @NameInMap("Data")
    public CategoryMatchResponseBodyData data;

    /**
     * <p>The error message. The value &quot;Success&quot; is returned for a successful call.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which uniquely identifies the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2157065A-D6C8-1F3E-A4D0-B1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CategoryMatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CategoryMatchResponseBody self = new CategoryMatchResponseBody();
        return TeaModel.build(map, self);
    }

    public CategoryMatchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CategoryMatchResponseBody setData(CategoryMatchResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CategoryMatchResponseBodyData getData() {
        return this.data;
    }

    public CategoryMatchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CategoryMatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CategoryMatchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CategoryMatchResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the matched category.</p>
         * 
         * <strong>example:</strong>
         * <p>1522</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <p>The name of the matched category.</p>
         * 
         * <strong>example:</strong>
         * <p>位置和活动跟踪器</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The full path of the category, separated by forward slashes (/).</p>
         * 
         * <strong>example:</strong>
         * <p>宠物用品/猫用品/猫挂饰、项圈、牵引带/位置和活动跟踪器</p>
         */
        @NameInMap("CategoryPath")
        public String categoryPath;

        /**
         * <p>The matching confidence score, ranging from 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("Confidence")
        public Integer confidence;

        /**
         * <p>Indicates whether the match is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MatchSuccessful")
        public Boolean matchSuccessful;

        /**
         * <p>The reason for the match.</p>
         * 
         * <strong>example:</strong>
         * <p>商品核心为带 AirTag 定位功能的猫项圈，属\&quot;位置和活动跟踪器\&quot;类目，叶子节点语义精准匹配其追踪功能与猫用属性。</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The usage information.</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Integer> usageMap;

        public static CategoryMatchResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CategoryMatchResponseBodyData self = new CategoryMatchResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CategoryMatchResponseBodyData setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public CategoryMatchResponseBodyData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public CategoryMatchResponseBodyData setCategoryPath(String categoryPath) {
            this.categoryPath = categoryPath;
            return this;
        }
        public String getCategoryPath() {
            return this.categoryPath;
        }

        public CategoryMatchResponseBodyData setConfidence(Integer confidence) {
            this.confidence = confidence;
            return this;
        }
        public Integer getConfidence() {
            return this.confidence;
        }

        public CategoryMatchResponseBodyData setMatchSuccessful(Boolean matchSuccessful) {
            this.matchSuccessful = matchSuccessful;
            return this;
        }
        public Boolean getMatchSuccessful() {
            return this.matchSuccessful;
        }

        public CategoryMatchResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public CategoryMatchResponseBodyData setUsageMap(java.util.Map<String, Integer> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Integer> getUsageMap() {
            return this.usageMap;
        }

    }

}
