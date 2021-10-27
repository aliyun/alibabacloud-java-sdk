// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListComponentsResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

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

    public ListComponentsResponseBody setResult(ListComponentsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListComponentsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListComponentsResponseBodyResultComponentCategoryList extends TeaModel {
        // 组件名称
        @NameInMap("ComponentName")
        public String componentName;

        // 组件类型
        @NameInMap("ComponentType")
        public String componentType;

        // 是否使用
        @NameInMap("InUse")
        public String inUse;

        public static ListComponentsResponseBodyResultComponentCategoryList build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyResultComponentCategoryList self = new ListComponentsResponseBodyResultComponentCategoryList();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyResultComponentCategoryList setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ListComponentsResponseBodyResultComponentCategoryList setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
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
        // 类别下的组件列表
        @NameInMap("List")
        public java.util.List<ListComponentsResponseBodyResultComponentCategoryList> list;

        // 组件类别
        @NameInMap("Type")
        public String type;

        public static ListComponentsResponseBodyResultComponentCategory build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyResultComponentCategory self = new ListComponentsResponseBodyResultComponentCategory();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyResultComponentCategory setList(java.util.List<ListComponentsResponseBodyResultComponentCategoryList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListComponentsResponseBodyResultComponentCategoryList> getList() {
            return this.list;
        }

        public ListComponentsResponseBodyResultComponentCategory setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListComponentsResponseBodyResultConfigGroup extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListComponentsResponseBodyResultConfigGroup build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyResultConfigGroup self = new ListComponentsResponseBodyResultConfigGroup();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyResultConfigGroup setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
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

    }

    public static class ListComponentsResponseBodyResultSceneListComponentCategoryList extends TeaModel {
        // 组件名称
        @NameInMap("ComponentName")
        public String componentName;

        // 组件类型
        @NameInMap("ComponentType")
        public String componentType;

        // 是否使用
        @NameInMap("InUse")
        public String inUse;

        public static ListComponentsResponseBodyResultSceneListComponentCategoryList build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyResultSceneListComponentCategoryList self = new ListComponentsResponseBodyResultSceneListComponentCategoryList();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyResultSceneListComponentCategoryList setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ListComponentsResponseBodyResultSceneListComponentCategoryList setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public ListComponentsResponseBodyResultSceneListComponentCategoryList setInUse(String inUse) {
            this.inUse = inUse;
            return this;
        }
        public String getInUse() {
            return this.inUse;
        }

    }

    public static class ListComponentsResponseBodyResultSceneListComponentCategory extends TeaModel {
        // 类别下的组件列表
        @NameInMap("List")
        public java.util.List<ListComponentsResponseBodyResultSceneListComponentCategoryList> list;

        // 组件类别
        @NameInMap("Type")
        public String type;

        public static ListComponentsResponseBodyResultSceneListComponentCategory build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyResultSceneListComponentCategory self = new ListComponentsResponseBodyResultSceneListComponentCategory();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyResultSceneListComponentCategory setList(java.util.List<ListComponentsResponseBodyResultSceneListComponentCategoryList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListComponentsResponseBodyResultSceneListComponentCategoryList> getList() {
            return this.list;
        }

        public ListComponentsResponseBodyResultSceneListComponentCategory setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListComponentsResponseBodyResultSceneList extends TeaModel {
        // 组件信息
        @NameInMap("ComponentCategory")
        public java.util.List<ListComponentsResponseBodyResultSceneListComponentCategory> componentCategory;

        // 场景类别
        @NameInMap("Scene")
        public String scene;

        public static ListComponentsResponseBodyResultSceneList build(java.util.Map<String, ?> map) throws Exception {
            ListComponentsResponseBodyResultSceneList self = new ListComponentsResponseBodyResultSceneList();
            return TeaModel.build(map, self);
        }

        public ListComponentsResponseBodyResultSceneList setComponentCategory(java.util.List<ListComponentsResponseBodyResultSceneListComponentCategory> componentCategory) {
            this.componentCategory = componentCategory;
            return this;
        }
        public java.util.List<ListComponentsResponseBodyResultSceneListComponentCategory> getComponentCategory() {
            return this.componentCategory;
        }

        public ListComponentsResponseBodyResultSceneList setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class ListComponentsResponseBodyResult extends TeaModel {
        // 组件信息
        @NameInMap("ComponentCategory")
        public java.util.List<ListComponentsResponseBodyResultComponentCategory> componentCategory;

        // 配置信息
        @NameInMap("ConfigGroup")
        public java.util.List<ListComponentsResponseBodyResultConfigGroup> configGroup;

        // 场景列表
        @NameInMap("SceneList")
        public java.util.List<ListComponentsResponseBodyResultSceneList> sceneList;

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

        public ListComponentsResponseBodyResult setSceneList(java.util.List<ListComponentsResponseBodyResultSceneList> sceneList) {
            this.sceneList = sceneList;
            return this;
        }
        public java.util.List<ListComponentsResponseBodyResultSceneList> getSceneList() {
            return this.sceneList;
        }

    }

}
