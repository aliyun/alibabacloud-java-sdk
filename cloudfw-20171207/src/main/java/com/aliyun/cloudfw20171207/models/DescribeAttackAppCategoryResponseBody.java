// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAttackAppCategoryResponseBody extends TeaModel {
    @NameInMap("AppCategories")
    public java.util.List<DescribeAttackAppCategoryResponseBodyAppCategories> appCategories;

    /**
     * <strong>example:</strong>
     * <p>B14757D0-4640-4B44-AC67-7F558FE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAttackAppCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackAppCategoryResponseBody self = new DescribeAttackAppCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAttackAppCategoryResponseBody setAppCategories(java.util.List<DescribeAttackAppCategoryResponseBodyAppCategories> appCategories) {
        this.appCategories = appCategories;
        return this;
    }
    public java.util.List<DescribeAttackAppCategoryResponseBodyAppCategories> getAppCategories() {
        return this.appCategories;
    }

    public DescribeAttackAppCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAttackAppCategoryResponseBodyAppCategories extends TeaModel {
        @NameInMap("AttackApps")
        public java.util.List<String> attackApps;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        public static DescribeAttackAppCategoryResponseBodyAppCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeAttackAppCategoryResponseBodyAppCategories self = new DescribeAttackAppCategoryResponseBodyAppCategories();
            return TeaModel.build(map, self);
        }

        public DescribeAttackAppCategoryResponseBodyAppCategories setAttackApps(java.util.List<String> attackApps) {
            this.attackApps = attackApps;
            return this;
        }
        public java.util.List<String> getAttackApps() {
            return this.attackApps;
        }

        public DescribeAttackAppCategoryResponseBodyAppCategories setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

    }

}
