// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListThingModelVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public ListThingModelVersionResponseBodyData data;

    public static ListThingModelVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListThingModelVersionResponseBody self = new ListThingModelVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListThingModelVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListThingModelVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListThingModelVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListThingModelVersionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListThingModelVersionResponseBody setData(ListThingModelVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListThingModelVersionResponseBodyData getData() {
        return this.data;
    }

    public static class ListThingModelVersionResponseBodyDataModelVersions extends TeaModel {
        @NameInMap("ModelVersion")
        public String modelVersion;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        public static ListThingModelVersionResponseBodyDataModelVersions build(java.util.Map<String, ?> map) throws Exception {
            ListThingModelVersionResponseBodyDataModelVersions self = new ListThingModelVersionResponseBodyDataModelVersions();
            return TeaModel.build(map, self);
        }

        public ListThingModelVersionResponseBodyDataModelVersions setModelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            return this;
        }
        public String getModelVersion() {
            return this.modelVersion;
        }

        public ListThingModelVersionResponseBodyDataModelVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListThingModelVersionResponseBodyDataModelVersions setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

    }

    public static class ListThingModelVersionResponseBodyData extends TeaModel {
        @NameInMap("ModelVersions")
        public java.util.List<ListThingModelVersionResponseBodyDataModelVersions> modelVersions;

        public static ListThingModelVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListThingModelVersionResponseBodyData self = new ListThingModelVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListThingModelVersionResponseBodyData setModelVersions(java.util.List<ListThingModelVersionResponseBodyDataModelVersions> modelVersions) {
            this.modelVersions = modelVersions;
            return this;
        }
        public java.util.List<ListThingModelVersionResponseBodyDataModelVersions> getModelVersions() {
            return this.modelVersions;
        }

    }

}
