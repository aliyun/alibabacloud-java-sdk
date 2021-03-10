// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListThingModelVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public ListThingModelVersionResponseData data;

    public static ListThingModelVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListThingModelVersionResponse self = new ListThingModelVersionResponse();
        return TeaModel.build(map, self);
    }

    public ListThingModelVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListThingModelVersionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListThingModelVersionResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListThingModelVersionResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListThingModelVersionResponse setData(ListThingModelVersionResponseData data) {
        this.data = data;
        return this;
    }
    public ListThingModelVersionResponseData getData() {
        return this.data;
    }

    public static class ListThingModelVersionResponseDataModelVersions extends TeaModel {
        @NameInMap("ModelVersion")
        @Validation(required = true)
        public String modelVersion;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        public static ListThingModelVersionResponseDataModelVersions build(java.util.Map<String, ?> map) throws Exception {
            ListThingModelVersionResponseDataModelVersions self = new ListThingModelVersionResponseDataModelVersions();
            return TeaModel.build(map, self);
        }

        public ListThingModelVersionResponseDataModelVersions setModelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            return this;
        }
        public String getModelVersion() {
            return this.modelVersion;
        }

        public ListThingModelVersionResponseDataModelVersions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListThingModelVersionResponseDataModelVersions setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

    }

    public static class ListThingModelVersionResponseData extends TeaModel {
        @NameInMap("ModelVersions")
        @Validation(required = true)
        public java.util.List<ListThingModelVersionResponseDataModelVersions> modelVersions;

        public static ListThingModelVersionResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListThingModelVersionResponseData self = new ListThingModelVersionResponseData();
            return TeaModel.build(map, self);
        }

        public ListThingModelVersionResponseData setModelVersions(java.util.List<ListThingModelVersionResponseDataModelVersions> modelVersions) {
            this.modelVersions = modelVersions;
            return this;
        }
        public java.util.List<ListThingModelVersionResponseDataModelVersions> getModelVersions() {
            return this.modelVersions;
        }

    }

}
