// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListComponentsResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 返回结果体
    @NameInMap("Result")
    public ListComponentsResponseBodyResult result;

    public static ListComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComponentsResponseBody self = new ListComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComponentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListComponentsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListComponentsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListComponentsResponseBody setResult(ListComponentsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListComponentsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListComponentsResponseBodyResultComponentCategoryList extends TeaModel {
        // 组件类型
        @NameInMap("ComponentType")
        public String componentType;

        // 组件名称
        @NameInMap("ComponentName")
        public String componentName;

        // 是否使用
        @NameInMap("InUse")
        public String inUse;

        public static ListComponentsResponseBodyResultComponentCategoryList build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyResultComponentCategoryList self = new ListComponentsResponseBodyResultComponentCategoryList();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyResultComponentCategoryList setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public ListComponentsResponseBodyResultComponentCategoryList setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ListComponentsResponseBodyResultComponentCategoryList setInUse(String inUse) {
            this.inUse = inUse;
            return this;
        }
        public String getInUse() {
            return this.inUse;
        }

    }

    public static class ListComponentsResponseBodyResultComponentCategory extends TeaModel {
        // 组件类别
        @NameInMap("Type")
        public String type;

        // 类别下的组件列表
        @NameInMap("List")
        public java.util.List<ListComponentsResponseBodyResultComponentCategoryList> list;

        public static ListComponentsResponseBodyResultComponentCategory build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyResultComponentCategory self = new ListComponentsResponseBodyResultComponentCategory();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyResultComponentCategory setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListComponentsResponseBodyResultComponentCategory setList(java.util.List<ListComponentsResponseBodyResultComponentCategoryList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListComponentsResponseBodyResultComponentCategoryList> getList() {
            return this.list;
        }

    }

    public static class ListComponentsResponseBodyResultConfigGroup extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Category")
        public String category;

        public static ListComponentsResponseBodyResultConfigGroup build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyResultConfigGroup self = new ListComponentsResponseBodyResultConfigGroup();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyResultConfigGroup setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListComponentsResponseBodyResultConfigGroup setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListComponentsResponseBodyResultConfigGroup setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

    public static class ListComponentsResponseBodyResult extends TeaModel {
        // 组件信息
        @NameInMap("ComponentCategory")
        public java.util.List<ListComponentsResponseBodyResultComponentCategory> componentCategory;

        // 配置信息
        @NameInMap("ConfigGroup")
        public java.util.List<ListComponentsResponseBodyResultConfigGroup> configGroup;

        public static ListComponentsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyResult self = new ListComponentsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyResult setComponentCategory(java.util.List<ListComponentsResponseBodyResultComponentCategory> componentCategory) {
            this.componentCategory = componentCategory;
            return this;
        }
        public java.util.List<ListComponentsResponseBodyResultComponentCategory> getComponentCategory() {
            return this.componentCategory;
        }

        public ListComponentsResponseBodyResult setConfigGroup(java.util.List<ListComponentsResponseBodyResultConfigGroup> configGroup) {
            this.configGroup = configGroup;
            return this;
        }
        public java.util.List<ListComponentsResponseBodyResultConfigGroup> getConfigGroup() {
            return this.configGroup;
        }

    }

}
