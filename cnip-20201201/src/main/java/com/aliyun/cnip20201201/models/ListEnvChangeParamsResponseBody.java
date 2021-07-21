// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeParamsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListEnvChangeParamsResponseBodyData data;

    public static ListEnvChangeParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeParamsResponseBody self = new ListEnvChangeParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeParamsResponseBody setData(ListEnvChangeParamsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvChangeParamsResponseBodyData getData() {
        return this.data;
    }

    public static class ListEnvChangeParamsResponseBodyDataList extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        @NameInMap("description")
        public String description;

        @NameInMap("componentName")
        public String componentName;

        @NameInMap("componentReleaseName")
        public String componentReleaseName;

        @NameInMap("parentComponentName")
        public String parentComponentName;

        @NameInMap("parentComponentReleaseName")
        public String parentComponentReleaseName;

        public static ListEnvChangeParamsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListEnvChangeParamsResponseBodyDataList self = new ListEnvChangeParamsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListEnvChangeParamsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnvChangeParamsResponseBodyDataList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListEnvChangeParamsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEnvChangeParamsResponseBodyDataList setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ListEnvChangeParamsResponseBodyDataList setComponentReleaseName(String componentReleaseName) {
            this.componentReleaseName = componentReleaseName;
            return this;
        }
        public String getComponentReleaseName() {
            return this.componentReleaseName;
        }

        public ListEnvChangeParamsResponseBodyDataList setParentComponentName(String parentComponentName) {
            this.parentComponentName = parentComponentName;
            return this;
        }
        public String getParentComponentName() {
            return this.parentComponentName;
        }

        public ListEnvChangeParamsResponseBodyDataList setParentComponentReleaseName(String parentComponentReleaseName) {
            this.parentComponentReleaseName = parentComponentReleaseName;
            return this;
        }
        public String getParentComponentReleaseName() {
            return this.parentComponentReleaseName;
        }

    }

    public static class ListEnvChangeParamsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListEnvChangeParamsResponseBodyDataList> list;

        public static ListEnvChangeParamsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvChangeParamsResponseBodyData self = new ListEnvChangeParamsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvChangeParamsResponseBodyData setList(java.util.List<ListEnvChangeParamsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListEnvChangeParamsResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
