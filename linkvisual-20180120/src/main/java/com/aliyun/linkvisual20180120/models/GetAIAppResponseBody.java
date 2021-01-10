// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAIAppResponseBodyData data;

    public static GetAIAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIAppResponseBody self = new GetAIAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAIAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAIAppResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAIAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAIAppResponseBody setData(GetAIAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAIAppResponseBodyData getData() {
        return this.data;
    }

    public static class GetAIAppResponseBodyData extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppTemplateId")
        public String appTemplateId;

        @NameInMap("Version")
        public String version;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        public static GetAIAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAIAppResponseBodyData self = new GetAIAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAIAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAIAppResponseBodyData setAppTemplateId(String appTemplateId) {
            this.appTemplateId = appTemplateId;
            return this;
        }
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        public GetAIAppResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetAIAppResponseBodyData setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public GetAIAppResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAIAppResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
