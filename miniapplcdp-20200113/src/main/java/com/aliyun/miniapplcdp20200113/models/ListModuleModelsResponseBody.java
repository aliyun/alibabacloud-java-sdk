// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListModuleModelsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListModuleModelsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListModuleModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModuleModelsResponseBody self = new ListModuleModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModuleModelsResponseBody setData(ListModuleModelsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListModuleModelsResponseBodyData getData() {
        return this.data;
    }

    public ListModuleModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListModuleModelsResponseBodyDataItems extends TeaModel {
        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("ModelData")
        public java.util.Map<String, java.util.List<DataItemsModelDataValue>> modelData;

        @NameInMap("ModelDataPath")
        public java.util.Map<String, String> modelDataPath;

        @NameInMap("ModelDigest")
        public java.util.Map<String, String> modelDigest;

        @NameInMap("ModuleId")
        public String moduleId;

        @NameInMap("ResourceData")
        public java.util.Map<String, String> resourceData;

        @NameInMap("ResourceDataPath")
        public java.util.Map<String, String> resourceDataPath;

        public static ListModuleModelsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListModuleModelsResponseBodyDataItems self = new ListModuleModelsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListModuleModelsResponseBodyDataItems setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public ListModuleModelsResponseBodyDataItems setModelData(java.util.Map<String, java.util.List<DataItemsModelDataValue>> modelData) {
            this.modelData = modelData;
            return this;
        }
        public java.util.Map<String, java.util.List<DataItemsModelDataValue>> getModelData() {
            return this.modelData;
        }

        public ListModuleModelsResponseBodyDataItems setModelDataPath(java.util.Map<String, String> modelDataPath) {
            this.modelDataPath = modelDataPath;
            return this;
        }
        public java.util.Map<String, String> getModelDataPath() {
            return this.modelDataPath;
        }

        public ListModuleModelsResponseBodyDataItems setModelDigest(java.util.Map<String, String> modelDigest) {
            this.modelDigest = modelDigest;
            return this;
        }
        public java.util.Map<String, String> getModelDigest() {
            return this.modelDigest;
        }

        public ListModuleModelsResponseBodyDataItems setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public ListModuleModelsResponseBodyDataItems setResourceData(java.util.Map<String, String> resourceData) {
            this.resourceData = resourceData;
            return this;
        }
        public java.util.Map<String, String> getResourceData() {
            return this.resourceData;
        }

        public ListModuleModelsResponseBodyDataItems setResourceDataPath(java.util.Map<String, String> resourceDataPath) {
            this.resourceDataPath = resourceDataPath;
            return this;
        }
        public java.util.Map<String, String> getResourceDataPath() {
            return this.resourceDataPath;
        }

    }

    public static class ListModuleModelsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListModuleModelsResponseBodyDataItems> items;

        public static ListModuleModelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModuleModelsResponseBodyData self = new ListModuleModelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModuleModelsResponseBodyData setItems(java.util.List<ListModuleModelsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListModuleModelsResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
