// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeThreatIntelligenceSwitchResponseBody extends TeaModel {
    @NameInMap("CategoryList")
    public java.util.List<DescribeThreatIntelligenceSwitchResponseBodyCategoryList> categoryList;

    /**
     * <strong>example:</strong>
     * <p>6B8E0379-2629-59A1-B811-96F3E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeThreatIntelligenceSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeThreatIntelligenceSwitchResponseBody self = new DescribeThreatIntelligenceSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeThreatIntelligenceSwitchResponseBody setCategoryList(java.util.List<DescribeThreatIntelligenceSwitchResponseBodyCategoryList> categoryList) {
        this.categoryList = categoryList;
        return this;
    }
    public java.util.List<DescribeThreatIntelligenceSwitchResponseBodyCategoryList> getCategoryList() {
        return this.categoryList;
    }

    public DescribeThreatIntelligenceSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeThreatIntelligenceSwitchResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeThreatIntelligenceSwitchResponseBodyCategoryList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alert</p>
         */
        @NameInMap("Action")
        public String action;

        @NameInMap("CategoryDescribe")
        public String categoryDescribe;

        /**
         * <strong>example:</strong>
         * <p>3000037</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CategoryParentId")
        public String categoryParentId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnableStatus")
        public Long enableStatus;

        public static DescribeThreatIntelligenceSwitchResponseBodyCategoryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeThreatIntelligenceSwitchResponseBodyCategoryList self = new DescribeThreatIntelligenceSwitchResponseBodyCategoryList();
            return TeaModel.build(map, self);
        }

        public DescribeThreatIntelligenceSwitchResponseBodyCategoryList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeThreatIntelligenceSwitchResponseBodyCategoryList setCategoryDescribe(String categoryDescribe) {
            this.categoryDescribe = categoryDescribe;
            return this;
        }
        public String getCategoryDescribe() {
            return this.categoryDescribe;
        }

        public DescribeThreatIntelligenceSwitchResponseBodyCategoryList setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public DescribeThreatIntelligenceSwitchResponseBodyCategoryList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeThreatIntelligenceSwitchResponseBodyCategoryList setCategoryParentId(String categoryParentId) {
            this.categoryParentId = categoryParentId;
            return this;
        }
        public String getCategoryParentId() {
            return this.categoryParentId;
        }

        public DescribeThreatIntelligenceSwitchResponseBodyCategoryList setEnableStatus(Long enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Long getEnableStatus() {
            return this.enableStatus;
        }

    }

}
