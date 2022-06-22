// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelHttpApiMatchQueryForAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelHttpApiMatchQueryForAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelHttpApiMatchQueryForAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelHttpApiMatchQueryForAppResponseBody self = new SentinelHttpApiMatchQueryForAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelHttpApiMatchQueryForAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelHttpApiMatchQueryForAppResponseBody setData(SentinelHttpApiMatchQueryForAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelHttpApiMatchQueryForAppResponseBodyData getData() {
        return this.data;
    }

    public SentinelHttpApiMatchQueryForAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelHttpApiMatchQueryForAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelHttpApiMatchQueryForAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelHttpApiMatchQueryForAppResponseBodyDataApiListHostMatch extends TeaModel {
        @NameInMap("pattern")
        public String pattern;

        @NameInMap("type")
        public String type;

        public static SentinelHttpApiMatchQueryForAppResponseBodyDataApiListHostMatch build(java.util.Map<String, ?> map) throws Exception {
            SentinelHttpApiMatchQueryForAppResponseBodyDataApiListHostMatch self = new SentinelHttpApiMatchQueryForAppResponseBodyDataApiListHostMatch();
            return TeaModel.build(map, self);
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiListHostMatch setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiListHostMatch setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SentinelHttpApiMatchQueryForAppResponseBodyDataApiListPathMatch extends TeaModel {
        @NameInMap("pattern")
        public String pattern;

        @NameInMap("type")
        public String type;

        @NameInMap("useClientRequestPath")
        public Boolean useClientRequestPath;

        public static SentinelHttpApiMatchQueryForAppResponseBodyDataApiListPathMatch build(java.util.Map<String, ?> map) throws Exception {
            SentinelHttpApiMatchQueryForAppResponseBodyDataApiListPathMatch self = new SentinelHttpApiMatchQueryForAppResponseBodyDataApiListPathMatch();
            return TeaModel.build(map, self);
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiListPathMatch setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiListPathMatch setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiListPathMatch setUseClientRequestPath(Boolean useClientRequestPath) {
            this.useClientRequestPath = useClientRequestPath;
            return this;
        }
        public Boolean getUseClientRequestPath() {
            return this.useClientRequestPath;
        }

    }

    public static class SentinelHttpApiMatchQueryForAppResponseBodyDataApiListResourceNameGenerator extends TeaModel {
        @NameInMap("pattern")
        public String pattern;

        @NameInMap("strategy")
        public String strategy;

        public static SentinelHttpApiMatchQueryForAppResponseBodyDataApiListResourceNameGenerator build(java.util.Map<String, ?> map) throws Exception {
            SentinelHttpApiMatchQueryForAppResponseBodyDataApiListResourceNameGenerator self = new SentinelHttpApiMatchQueryForAppResponseBodyDataApiListResourceNameGenerator();
            return TeaModel.build(map, self);
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiListResourceNameGenerator setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiListResourceNameGenerator setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class SentinelHttpApiMatchQueryForAppResponseBodyDataApiList extends TeaModel {
        @NameInMap("apiName")
        public String apiName;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("hostMatch")
        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiListHostMatch hostMatch;

        @NameInMap("id")
        public Long id;

        @NameInMap("pathMatch")
        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiListPathMatch pathMatch;

        @NameInMap("resourceNameGenerator")
        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiListResourceNameGenerator resourceNameGenerator;

        public static SentinelHttpApiMatchQueryForAppResponseBodyDataApiList build(java.util.Map<String, ?> map) throws Exception {
            SentinelHttpApiMatchQueryForAppResponseBodyDataApiList self = new SentinelHttpApiMatchQueryForAppResponseBodyDataApiList();
            return TeaModel.build(map, self);
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiList setHostMatch(SentinelHttpApiMatchQueryForAppResponseBodyDataApiListHostMatch hostMatch) {
            this.hostMatch = hostMatch;
            return this;
        }
        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiListHostMatch getHostMatch() {
            return this.hostMatch;
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiList setPathMatch(SentinelHttpApiMatchQueryForAppResponseBodyDataApiListPathMatch pathMatch) {
            this.pathMatch = pathMatch;
            return this;
        }
        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiListPathMatch getPathMatch() {
            return this.pathMatch;
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiList setResourceNameGenerator(SentinelHttpApiMatchQueryForAppResponseBodyDataApiListResourceNameGenerator resourceNameGenerator) {
            this.resourceNameGenerator = resourceNameGenerator;
            return this;
        }
        public SentinelHttpApiMatchQueryForAppResponseBodyDataApiListResourceNameGenerator getResourceNameGenerator() {
            return this.resourceNameGenerator;
        }

    }

    public static class SentinelHttpApiMatchQueryForAppResponseBodyData extends TeaModel {
        @NameInMap("apiList")
        public java.util.List<SentinelHttpApiMatchQueryForAppResponseBodyDataApiList> apiList;

        @NameInMap("defaultResourceNameStrategy")
        public String defaultResourceNameStrategy;

        public static SentinelHttpApiMatchQueryForAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelHttpApiMatchQueryForAppResponseBodyData self = new SentinelHttpApiMatchQueryForAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyData setApiList(java.util.List<SentinelHttpApiMatchQueryForAppResponseBodyDataApiList> apiList) {
            this.apiList = apiList;
            return this;
        }
        public java.util.List<SentinelHttpApiMatchQueryForAppResponseBodyDataApiList> getApiList() {
            return this.apiList;
        }

        public SentinelHttpApiMatchQueryForAppResponseBodyData setDefaultResourceNameStrategy(String defaultResourceNameStrategy) {
            this.defaultResourceNameStrategy = defaultResourceNameStrategy;
            return this;
        }
        public String getDefaultResourceNameStrategy() {
            return this.defaultResourceNameStrategy;
        }

    }

}
