// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListDependentDataModelsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListDependentDataModelsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDependentDataModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDependentDataModelsResponseBody self = new ListDependentDataModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDependentDataModelsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDependentDataModelsResponseBody setData(ListDependentDataModelsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDependentDataModelsResponseBodyData getData() {
        return this.data;
    }

    public ListDependentDataModelsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDependentDataModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDependentDataModelsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDependentDataModelsResponseBodyDataDataModelInfo extends TeaModel {
        @NameInMap("DataModelCode")
        public String dataModelCode;

        @NameInMap("DataModelName")
        public String dataModelName;

        public static ListDependentDataModelsResponseBodyDataDataModelInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDependentDataModelsResponseBodyDataDataModelInfo self = new ListDependentDataModelsResponseBodyDataDataModelInfo();
            return TeaModel.build(map, self);
        }

        public ListDependentDataModelsResponseBodyDataDataModelInfo setDataModelCode(String dataModelCode) {
            this.dataModelCode = dataModelCode;
            return this;
        }
        public String getDataModelCode() {
            return this.dataModelCode;
        }

        public ListDependentDataModelsResponseBodyDataDataModelInfo setDataModelName(String dataModelName) {
            this.dataModelName = dataModelName;
            return this;
        }
        public String getDataModelName() {
            return this.dataModelName;
        }

    }

    public static class ListDependentDataModelsResponseBodyData extends TeaModel {
        @NameInMap("DataModelInfo")
        public java.util.List<ListDependentDataModelsResponseBodyDataDataModelInfo> dataModelInfo;

        public static ListDependentDataModelsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDependentDataModelsResponseBodyData self = new ListDependentDataModelsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDependentDataModelsResponseBodyData setDataModelInfo(java.util.List<ListDependentDataModelsResponseBodyDataDataModelInfo> dataModelInfo) {
            this.dataModelInfo = dataModelInfo;
            return this;
        }
        public java.util.List<ListDependentDataModelsResponseBodyDataDataModelInfo> getDataModelInfo() {
            return this.dataModelInfo;
        }

    }

}
