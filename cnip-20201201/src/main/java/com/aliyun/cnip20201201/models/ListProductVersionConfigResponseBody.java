// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListProductVersionConfigResponseBody extends TeaModel {
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("data")
    public ListProductVersionConfigResponseBodyData data;

    public static ListProductVersionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionConfigResponseBody self = new ListProductVersionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductVersionConfigResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListProductVersionConfigResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public ListProductVersionConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProductVersionConfigResponseBody setData(ListProductVersionConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProductVersionConfigResponseBodyData getData() {
        return this.data;
    }

    public static class ListProductVersionConfigResponseBodyDataList extends TeaModel {
        @NameInMap("productVersionUID")
        public String productVersionUID;

        @NameInMap("componentVersionUID")
        public String componentVersionUID;

        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        @NameInMap("description")
        public String description;

        @NameInMap("parentComponentVersionUID")
        public String parentComponentVersionUID;

        @NameInMap("componentName")
        public String componentName;

        @NameInMap("parentComponentName")
        public String parentComponentName;

        @NameInMap("componentReleaseName")
        public String componentReleaseName;

        @NameInMap("parentComponentReleaseName")
        public String parentComponentReleaseName;

        public static ListProductVersionConfigResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListProductVersionConfigResponseBodyDataList self = new ListProductVersionConfigResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListProductVersionConfigResponseBodyDataList setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

        public ListProductVersionConfigResponseBodyDataList setComponentVersionUID(String componentVersionUID) {
            this.componentVersionUID = componentVersionUID;
            return this;
        }
        public String getComponentVersionUID() {
            return this.componentVersionUID;
        }

        public ListProductVersionConfigResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductVersionConfigResponseBodyDataList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListProductVersionConfigResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProductVersionConfigResponseBodyDataList setParentComponentVersionUID(String parentComponentVersionUID) {
            this.parentComponentVersionUID = parentComponentVersionUID;
            return this;
        }
        public String getParentComponentVersionUID() {
            return this.parentComponentVersionUID;
        }

        public ListProductVersionConfigResponseBodyDataList setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public ListProductVersionConfigResponseBodyDataList setParentComponentName(String parentComponentName) {
            this.parentComponentName = parentComponentName;
            return this;
        }
        public String getParentComponentName() {
            return this.parentComponentName;
        }

        public ListProductVersionConfigResponseBodyDataList setComponentReleaseName(String componentReleaseName) {
            this.componentReleaseName = componentReleaseName;
            return this;
        }
        public String getComponentReleaseName() {
            return this.componentReleaseName;
        }

        public ListProductVersionConfigResponseBodyDataList setParentComponentReleaseName(String parentComponentReleaseName) {
            this.parentComponentReleaseName = parentComponentReleaseName;
            return this;
        }
        public String getParentComponentReleaseName() {
            return this.parentComponentReleaseName;
        }

    }

    public static class ListProductVersionConfigResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<ListProductVersionConfigResponseBodyDataList> list;

        public static ListProductVersionConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductVersionConfigResponseBodyData self = new ListProductVersionConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductVersionConfigResponseBodyData setList(java.util.List<ListProductVersionConfigResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListProductVersionConfigResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
