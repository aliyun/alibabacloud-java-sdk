// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModuleResourcesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListModuleResourcesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListModuleResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModuleResourcesResponseBody self = new ListModuleResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModuleResourcesResponseBody setData(ListModuleResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListModuleResourcesResponseBodyData getData() {
        return this.data;
    }

    public ListModuleResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListModuleResourcesResponseBodyDataItems extends TeaModel {
        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("ModelData")
        public java.util.Map<String, String> modelData;

        @NameInMap("ModelDataPath")
        public java.util.Map<String, String> modelDataPath;

        @NameInMap("ModuleId")
        public String moduleId;

        @NameInMap("ResourceData")
        public java.util.Map<String, java.util.List<DataItemsResourceDataValue>> resourceData;

        @NameInMap("ResourceDataPath")
        public java.util.Map<String, String> resourceDataPath;

        public static ListModuleResourcesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListModuleResourcesResponseBodyDataItems self = new ListModuleResourcesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListModuleResourcesResponseBodyDataItems setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListModuleResourcesResponseBodyDataItems setModelData(java.util.Map<String, String> modelData) {
            this.modelData = modelData;
            return this;
        }
        public java.util.Map<String, String> getModelData() {
            return this.modelData;
        }

        public ListModuleResourcesResponseBodyDataItems setModelDataPath(java.util.Map<String, String> modelDataPath) {
            this.modelDataPath = modelDataPath;
            return this;
        }
        public java.util.Map<String, String> getModelDataPath() {
            return this.modelDataPath;
        }

        public ListModuleResourcesResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListModuleResourcesResponseBodyDataItems setResourceData(java.util.Map<String, java.util.List<DataItemsResourceDataValue>> resourceData) {
            this.resourceData = resourceData;
            return this;
        }
        public java.util.Map<String, java.util.List<DataItemsResourceDataValue>> getResourceData() {
            return this.resourceData;
        }

        public ListModuleResourcesResponseBodyDataItems setResourceDataPath(java.util.Map<String, String> resourceDataPath) {
            this.resourceDataPath = resourceDataPath;
            return this;
        }
        public java.util.Map<String, String> getResourceDataPath() {
            return this.resourceDataPath;
        }

    }

    public static class ListModuleResourcesResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListModuleResourcesResponseBodyDataItems> items;

        public static ListModuleResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModuleResourcesResponseBodyData self = new ListModuleResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModuleResourcesResponseBodyData setItems(java.util.List<ListModuleResourcesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListModuleResourcesResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
