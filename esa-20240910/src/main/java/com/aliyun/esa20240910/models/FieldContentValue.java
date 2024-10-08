// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class FieldContentValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SortOrder")
    public Long sortOrder;

    @NameInMap("FieldList")
    public java.util.List<FieldContentValueFieldList> fieldList;

    public static FieldContentValue build(java.util.Map<String, ?> map) throws Exception {
        FieldContentValue self = new FieldContentValue();
        return TeaModel.build(map, self);
    }

    public FieldContentValue setSortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public Long getSortOrder() {
        return this.sortOrder;
    }

    public FieldContentValue setFieldList(java.util.List<FieldContentValueFieldList> fieldList) {
        this.fieldList = fieldList;
        return this;
    }
    public java.util.List<FieldContentValueFieldList> getFieldList() {
        return this.fieldList;
    }

    public static class FieldContentValueFieldList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ClientIp</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <strong>example:</strong>
         * <p>IP address of the client.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("DescriptionCn")
        public String descriptionCn;

        /**
         * <strong>example:</strong>
         * <p>Client</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>String</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SortOrder")
        public Long sortOrder;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        public static FieldContentValueFieldList build(java.util.Map<String, ?> map) throws Exception {
            FieldContentValueFieldList self = new FieldContentValueFieldList();
            return TeaModel.build(map, self);
        }

        public FieldContentValueFieldList setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public FieldContentValueFieldList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public FieldContentValueFieldList setDescriptionCn(String descriptionCn) {
            this.descriptionCn = descriptionCn;
            return this;
        }
        public String getDescriptionCn() {
            return this.descriptionCn;
        }

        public FieldContentValueFieldList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public FieldContentValueFieldList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public FieldContentValueFieldList setSortOrder(Long sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Long getSortOrder() {
            return this.sortOrder;
        }

        public FieldContentValueFieldList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

    }

}
