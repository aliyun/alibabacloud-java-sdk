// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetSmsConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmsConfigs")
    public GetSmsConfigResponseBodySmsConfigs smsConfigs;

    @NameInMap("Success")
    public Boolean success;

    public static GetSmsConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSmsConfigResponseBody self = new GetSmsConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSmsConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSmsConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSmsConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSmsConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSmsConfigResponseBody setSmsConfigs(GetSmsConfigResponseBodySmsConfigs smsConfigs) {
        this.smsConfigs = smsConfigs;
        return this;
    }
    public GetSmsConfigResponseBodySmsConfigs getSmsConfigs() {
        return this.smsConfigs;
    }

    public GetSmsConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSmsConfigResponseBodySmsConfigsSmsConfig extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Instance")
        public String instance;

        @NameInMap("Name")
        public String name;

        @NameInMap("Scenario")
        public Integer scenario;

        @NameInMap("SignName")
        public String signName;

        @NameInMap("TemplateCode")
        public String templateCode;

        public static GetSmsConfigResponseBodySmsConfigsSmsConfig build(java.util.Map<String, ?> map) throws Exception {
            GetSmsConfigResponseBodySmsConfigsSmsConfig self = new GetSmsConfigResponseBodySmsConfigsSmsConfig();
            return TeaModel.build(map, self);
        }

        public GetSmsConfigResponseBodySmsConfigsSmsConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSmsConfigResponseBodySmsConfigsSmsConfig setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetSmsConfigResponseBodySmsConfigsSmsConfig setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetSmsConfigResponseBodySmsConfigsSmsConfig setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetSmsConfigResponseBodySmsConfigsSmsConfig setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSmsConfigResponseBodySmsConfigsSmsConfig setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public GetSmsConfigResponseBodySmsConfigsSmsConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSmsConfigResponseBodySmsConfigsSmsConfig setScenario(Integer scenario) {
            this.scenario = scenario;
            return this;
        }
        public Integer getScenario() {
            return this.scenario;
        }

        public GetSmsConfigResponseBodySmsConfigsSmsConfig setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public GetSmsConfigResponseBodySmsConfigsSmsConfig setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

    public static class GetSmsConfigResponseBodySmsConfigs extends TeaModel {
        @NameInMap("SmsConfig")
        public java.util.List<GetSmsConfigResponseBodySmsConfigsSmsConfig> smsConfig;

        public static GetSmsConfigResponseBodySmsConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetSmsConfigResponseBodySmsConfigs self = new GetSmsConfigResponseBodySmsConfigs();
            return TeaModel.build(map, self);
        }

        public GetSmsConfigResponseBodySmsConfigs setSmsConfig(java.util.List<GetSmsConfigResponseBodySmsConfigsSmsConfig> smsConfig) {
            this.smsConfig = smsConfig;
            return this;
        }
        public java.util.List<GetSmsConfigResponseBodySmsConfigsSmsConfig> getSmsConfig() {
            return this.smsConfig;
        }

    }

}
