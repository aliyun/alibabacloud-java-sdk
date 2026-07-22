// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDestinationCategoryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C1ED80BC-FFC8-57DB-8151-705DC31****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of outbound connections categorizations.</p>
     */
    @NameInMap("TypeList")
    public java.util.List<DescribeOutgoingDestinationCategoryResponseBodyTypeList> typeList;

    public static DescribeOutgoingDestinationCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDestinationCategoryResponseBody self = new DescribeOutgoingDestinationCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDestinationCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOutgoingDestinationCategoryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeOutgoingDestinationCategoryResponseBody setTypeList(java.util.List<DescribeOutgoingDestinationCategoryResponseBodyTypeList> typeList) {
        this.typeList = typeList;
        return this;
    }
    public java.util.List<DescribeOutgoingDestinationCategoryResponseBodyTypeList> getTypeList() {
        return this.typeList;
    }

    public static class DescribeOutgoingDestinationCategoryResponseBodyTypeListCategoryList extends TeaModel {
        /**
         * <p>The outbound connections categorization description.</p>
         * 
         * <strong>example:</strong>
         * <p>AliYun</p>
         */
        @NameInMap("CategoryDescribe")
        public String categoryDescribe;

        /**
         * <p>The outbound connections categorization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        /**
         * <p>The outbound connections categorization name.</p>
         * 
         * <strong>example:</strong>
         * <p>AliYun</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The outbound connections categorization level ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Trusted</p>
         */
        @NameInMap("ClassId")
        public String classId;

        public static DescribeOutgoingDestinationCategoryResponseBodyTypeListCategoryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDestinationCategoryResponseBodyTypeListCategoryList self = new DescribeOutgoingDestinationCategoryResponseBodyTypeListCategoryList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDestinationCategoryResponseBodyTypeListCategoryList setCategoryDescribe(String categoryDescribe) {
            this.categoryDescribe = categoryDescribe;
            return this;
        }
        public String getCategoryDescribe() {
            return this.categoryDescribe;
        }

        public DescribeOutgoingDestinationCategoryResponseBodyTypeListCategoryList setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public DescribeOutgoingDestinationCategoryResponseBodyTypeListCategoryList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public DescribeOutgoingDestinationCategoryResponseBodyTypeListCategoryList setClassId(String classId) {
            this.classId = classId;
            return this;
        }
        public String getClassId() {
            return this.classId;
        }

    }

    public static class DescribeOutgoingDestinationCategoryResponseBodyTypeList extends TeaModel {
        /**
         * <p>The list of outbound connections categorizations.</p>
         */
        @NameInMap("CategoryList")
        public java.util.List<DescribeOutgoingDestinationCategoryResponseBodyTypeListCategoryList> categoryList;

        /**
         * <p>The fixed category description.</p>
         * 
         * <strong>example:</strong>
         * <p>AliYun</p>
         */
        @NameInMap("TypeDescribe")
        public String typeDescribe;

        /**
         * <p>The fixed category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("TypeId")
        public String typeId;

        /**
         * <p>The fixed category name.</p>
         * 
         * <strong>example:</strong>
         * <p>AliYun</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        public static DescribeOutgoingDestinationCategoryResponseBodyTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOutgoingDestinationCategoryResponseBodyTypeList self = new DescribeOutgoingDestinationCategoryResponseBodyTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeOutgoingDestinationCategoryResponseBodyTypeList setCategoryList(java.util.List<DescribeOutgoingDestinationCategoryResponseBodyTypeListCategoryList> categoryList) {
            this.categoryList = categoryList;
            return this;
        }
        public java.util.List<DescribeOutgoingDestinationCategoryResponseBodyTypeListCategoryList> getCategoryList() {
            return this.categoryList;
        }

        public DescribeOutgoingDestinationCategoryResponseBodyTypeList setTypeDescribe(String typeDescribe) {
            this.typeDescribe = typeDescribe;
            return this;
        }
        public String getTypeDescribe() {
            return this.typeDescribe;
        }

        public DescribeOutgoingDestinationCategoryResponseBodyTypeList setTypeId(String typeId) {
            this.typeId = typeId;
            return this;
        }
        public String getTypeId() {
            return this.typeId;
        }

        public DescribeOutgoingDestinationCategoryResponseBodyTypeList setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
