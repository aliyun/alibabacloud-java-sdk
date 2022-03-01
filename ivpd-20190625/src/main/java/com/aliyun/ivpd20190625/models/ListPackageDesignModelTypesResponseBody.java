// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class ListPackageDesignModelTypesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListPackageDesignModelTypesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPackageDesignModelTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPackageDesignModelTypesResponseBody self = new ListPackageDesignModelTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPackageDesignModelTypesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPackageDesignModelTypesResponseBody setData(ListPackageDesignModelTypesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPackageDesignModelTypesResponseBodyData getData() {
        return this.data;
    }

    public ListPackageDesignModelTypesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPackageDesignModelTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPackageDesignModelTypesResponseBodyDataModelTypeListElements extends TeaModel {
        @NameInMap("SideName")
        public String sideName;

        public static ListPackageDesignModelTypesResponseBodyDataModelTypeListElements build(java.util.Map<String, ?> map) throws Exception {
            ListPackageDesignModelTypesResponseBodyDataModelTypeListElements self = new ListPackageDesignModelTypesResponseBodyDataModelTypeListElements();
            return TeaModel.build(map, self);
        }

        public ListPackageDesignModelTypesResponseBodyDataModelTypeListElements setSideName(String sideName) {
            this.sideName = sideName;
            return this;
        }
        public String getSideName() {
            return this.sideName;
        }

    }

    public static class ListPackageDesignModelTypesResponseBodyDataModelTypeList extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<ListPackageDesignModelTypesResponseBodyDataModelTypeListElements> elements;

        @NameInMap("ModelType")
        public String modelType;

        public static ListPackageDesignModelTypesResponseBodyDataModelTypeList build(java.util.Map<String, ?> map) throws Exception {
            ListPackageDesignModelTypesResponseBodyDataModelTypeList self = new ListPackageDesignModelTypesResponseBodyDataModelTypeList();
            return TeaModel.build(map, self);
        }

        public ListPackageDesignModelTypesResponseBodyDataModelTypeList setElements(java.util.List<ListPackageDesignModelTypesResponseBodyDataModelTypeListElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<ListPackageDesignModelTypesResponseBodyDataModelTypeListElements> getElements() {
            return this.elements;
        }

        public ListPackageDesignModelTypesResponseBodyDataModelTypeList setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }
        public String getModelType() {
            return this.modelType;
        }

    }

    public static class ListPackageDesignModelTypesResponseBodyData extends TeaModel {
        @NameInMap("ModelTypeList")
        public java.util.List<ListPackageDesignModelTypesResponseBodyDataModelTypeList> modelTypeList;

        public static ListPackageDesignModelTypesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPackageDesignModelTypesResponseBodyData self = new ListPackageDesignModelTypesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPackageDesignModelTypesResponseBodyData setModelTypeList(java.util.List<ListPackageDesignModelTypesResponseBodyDataModelTypeList> modelTypeList) {
            this.modelTypeList = modelTypeList;
            return this;
        }
        public java.util.List<ListPackageDesignModelTypesResponseBodyDataModelTypeList> getModelTypeList() {
            return this.modelTypeList;
        }

    }

}
