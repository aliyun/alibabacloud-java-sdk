// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsDataSourceConfigItemsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListMmsDataSourceConfigItemsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>688003E1-D1B4-5468-957E-2FFB3AC8D79B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMmsDataSourceConfigItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMmsDataSourceConfigItemsResponseBody self = new ListMmsDataSourceConfigItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMmsDataSourceConfigItemsResponseBody setData(java.util.List<ListMmsDataSourceConfigItemsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMmsDataSourceConfigItemsResponseBodyData> getData() {
        return this.data;
    }

    public ListMmsDataSourceConfigItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMmsDataSourceConfigItemsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MaxCompute Default Project</p>
         */
        @NameInMap("desc")
        public String desc;

        @NameInMap("enums")
        public java.util.List<String> enums;

        /**
         * <strong>example:</strong>
         * <p>group.basic</p>
         */
        @NameInMap("group")
        public String group;

        /**
         * <strong>example:</strong>
         * <p>mc.default.project</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>MaxCompute Default Project</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("placeHolder")
        public String placeHolder;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("required")
        public Boolean required;

        @NameInMap("subItems")
        public java.util.Map<String, ?> subItems;

        /**
         * <strong>example:</strong>
         * <p>.keytab</p>
         */
        @NameInMap("subType")
        public String subType;

        /**
         * <strong>example:</strong>
         * <p>STRING</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>p1=1/p2=abc</p>
         */
        @NameInMap("value")
        public Object value;

        public static ListMmsDataSourceConfigItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMmsDataSourceConfigItemsResponseBodyData self = new ListMmsDataSourceConfigItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMmsDataSourceConfigItemsResponseBodyData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListMmsDataSourceConfigItemsResponseBodyData setEnums(java.util.List<String> enums) {
            this.enums = enums;
            return this;
        }
        public java.util.List<String> getEnums() {
            return this.enums;
        }

        public ListMmsDataSourceConfigItemsResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListMmsDataSourceConfigItemsResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListMmsDataSourceConfigItemsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMmsDataSourceConfigItemsResponseBodyData setPlaceHolder(String placeHolder) {
            this.placeHolder = placeHolder;
            return this;
        }
        public String getPlaceHolder() {
            return this.placeHolder;
        }

        public ListMmsDataSourceConfigItemsResponseBodyData setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public ListMmsDataSourceConfigItemsResponseBodyData setSubItems(java.util.Map<String, ?> subItems) {
            this.subItems = subItems;
            return this;
        }
        public java.util.Map<String, ?> getSubItems() {
            return this.subItems;
        }

        public ListMmsDataSourceConfigItemsResponseBodyData setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public ListMmsDataSourceConfigItemsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMmsDataSourceConfigItemsResponseBodyData setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

}
