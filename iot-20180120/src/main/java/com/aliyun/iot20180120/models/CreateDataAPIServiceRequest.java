// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDataAPIServiceRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("OriginSql")
    public String originSql;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("TemplateSql")
    public String templateSql;

    @NameInMap("ApiPath")
    public String apiPath;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("RequestParam")
    public java.util.List<CreateDataAPIServiceRequestRequestParam> requestParam;

    @NameInMap("ResponseParam")
    public java.util.List<CreateDataAPIServiceRequestResponseParam> responseParam;

    public static CreateDataAPIServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAPIServiceRequest self = new CreateDataAPIServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataAPIServiceRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CreateDataAPIServiceRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public CreateDataAPIServiceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateDataAPIServiceRequest setOriginSql(String originSql) {
        this.originSql = originSql;
        return this;
    }
    public String getOriginSql() {
        return this.originSql;
    }

    public CreateDataAPIServiceRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateDataAPIServiceRequest setTemplateSql(String templateSql) {
        this.templateSql = templateSql;
        return this;
    }
    public String getTemplateSql() {
        return this.templateSql;
    }

    public CreateDataAPIServiceRequest setApiPath(String apiPath) {
        this.apiPath = apiPath;
        return this;
    }
    public String getApiPath() {
        return this.apiPath;
    }

    public CreateDataAPIServiceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateDataAPIServiceRequest setRequestParam(java.util.List<CreateDataAPIServiceRequestRequestParam> requestParam) {
        this.requestParam = requestParam;
        return this;
    }
    public java.util.List<CreateDataAPIServiceRequestRequestParam> getRequestParam() {
        return this.requestParam;
    }

    public CreateDataAPIServiceRequest setResponseParam(java.util.List<CreateDataAPIServiceRequestResponseParam> responseParam) {
        this.responseParam = responseParam;
        return this;
    }
    public java.util.List<CreateDataAPIServiceRequestResponseParam> getResponseParam() {
        return this.responseParam;
    }

    public static class CreateDataAPIServiceRequestRequestParam extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("Example")
        public String example;

        @NameInMap("Name")
        public String name;

        @NameInMap("Desc")
        public String desc;

        public static CreateDataAPIServiceRequestRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateDataAPIServiceRequestRequestParam self = new CreateDataAPIServiceRequestRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateDataAPIServiceRequestRequestParam setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDataAPIServiceRequestRequestParam setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public CreateDataAPIServiceRequestRequestParam setExample(String example) {
            this.example = example;
            return this;
        }
        public String getExample() {
            return this.example;
        }

        public CreateDataAPIServiceRequestRequestParam setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataAPIServiceRequestRequestParam setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

    public static class CreateDataAPIServiceRequestResponseParam extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("Example")
        public String example;

        @NameInMap("Name")
        public String name;

        @NameInMap("Desc")
        public String desc;

        public static CreateDataAPIServiceRequestResponseParam build(java.util.Map<String, ?> map) throws Exception {
            CreateDataAPIServiceRequestResponseParam self = new CreateDataAPIServiceRequestResponseParam();
            return TeaModel.build(map, self);
        }

        public CreateDataAPIServiceRequestResponseParam setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateDataAPIServiceRequestResponseParam setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public CreateDataAPIServiceRequestResponseParam setExample(String example) {
            this.example = example;
            return this;
        }
        public String getExample() {
            return this.example;
        }

        public CreateDataAPIServiceRequestResponseParam setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateDataAPIServiceRequestResponseParam setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

}
