// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeRecordParamsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListEnvChangeRecordParamsResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    public static ListEnvChangeRecordParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeRecordParamsResponseBody self = new ListEnvChangeRecordParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeRecordParamsResponseBody setData(ListEnvChangeRecordParamsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvChangeRecordParamsResponseBodyData getData() {
        return this.data;
    }

    public ListEnvChangeRecordParamsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListEnvChangeRecordParamsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public static class ListEnvChangeRecordParamsResponseBodyDataList extends TeaModel {
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

        public static ListEnvChangeRecordParamsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListEnvChangeRecordParamsResponseBodyDataList self = new ListEnvChangeRecordParamsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListEnvChangeRecordParamsResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEnvChangeRecordParamsResponseBodyDataList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListEnvChangeRecordParamsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEnvChangeRecordParamsResponseBodyDataList setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ListEnvChangeRecordParamsResponseBodyDataList setComponentReleaseName(String componentReleaseName) {
            this.componentReleaseName = componentReleaseName;
            return this;
        }
        public String getComponentReleaseName() {
            return this.componentReleaseName;
        }

        public ListEnvChangeRecordParamsResponseBodyDataList setParentComponentName(String parentComponentName) {
            this.parentComponentName = parentComponentName;
            return this;
        }
        public String getParentComponentName() {
            return this.parentComponentName;
        }

        public ListEnvChangeRecordParamsResponseBodyDataList setParentComponentReleaseName(String parentComponentReleaseName) {
            this.parentComponentReleaseName = parentComponentReleaseName;
            return this;
        }
        public String getParentComponentReleaseName() {
            return this.parentComponentReleaseName;
        }

    }

    public static class ListEnvChangeRecordParamsResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListEnvChangeRecordParamsResponseBodyDataList> list;

        public static ListEnvChangeRecordParamsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvChangeRecordParamsResponseBodyData self = new ListEnvChangeRecordParamsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvChangeRecordParamsResponseBodyData setList(java.util.List<ListEnvChangeRecordParamsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListEnvChangeRecordParamsResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
