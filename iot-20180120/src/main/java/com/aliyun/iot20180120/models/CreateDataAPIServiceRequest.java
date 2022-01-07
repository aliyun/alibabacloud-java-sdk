// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDataAPIServiceRequest extends TeaModel {
    @NameInMap("ApiPath")
    public String apiPath;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("OriginSql")
    public String originSql;

    @NameInMap("RequestParam")
    public java.util.List<CreateDataAPIServiceRequestRequestParam> requestParam;

    @NameInMap("ResponseParam")
    public java.util.List<CreateDataAPIServiceRequestResponseParam> responseParam;

    @NameInMap("TemplateSql")
    public String templateSql;

    public static CreateDataAPIServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAPIServiceRequest self = new CreateDataAPIServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataAPIServiceRequest setApiPath(String apiPath) {
        this.apiPath = apiPath;
        return this;
    }
    public String getApiPath() {
        return this.apiPath;
    }

    public CreateDataAPIServiceRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateDataAPIServiceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateDataAPIServiceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateDataAPIServiceRequest setOriginSql(String originSql) {
        this.originSql = originSql;
        return this;
    }
    public String getOriginSql() {
        return this.originSql;
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

    public CreateDataAPIServiceRequest setTemplateSql(String templateSql) {
        this.templateSql = templateSql;
        return this;
    }
    public String getTemplateSql() {
        return this.templateSql;
    }

    public static class CreateDataAPIServiceRequestRequestParam extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Example")
        public String example;

        @NameInMap("Name")
        public String name;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("Type")
        public String type;

        public static CreateDataAPIServiceRequestRequestParam build(java.util.Map<String, ?> map) throws Exception {
            CreateDataAPIServiceRequestRequestParam self = new CreateDataAPIServiceRequestRequestParam();
            return TeaModel.build(map, self);
        }

        public CreateDataAPIServiceRequestRequestParam setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
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

        public CreateDataAPIServiceRequestRequestParam setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public CreateDataAPIServiceRequestRequestParam setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateDataAPIServiceRequestResponseParam extends TeaModel {
        @NameInMap("Desc")
        public String desc;

        @NameInMap("Example")
        public String example;

        @NameInMap("Name")
        public String name;

        @NameInMap("Required")
        public Boolean required;

        @NameInMap("Type")
        public String type;

        public static CreateDataAPIServiceRequestResponseParam build(java.util.Map<String, ?> map) throws Exception {
            CreateDataAPIServiceRequestResponseParam self = new CreateDataAPIServiceRequestResponseParam();
            return TeaModel.build(map, self);
        }

        public CreateDataAPIServiceRequestResponseParam setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
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

        public CreateDataAPIServiceRequestResponseParam setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public CreateDataAPIServiceRequestResponseParam setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
