// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelHttpApiMatchNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelHttpApiMatchNewResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelHttpApiMatchNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelHttpApiMatchNewResponseBody self = new SentinelHttpApiMatchNewResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelHttpApiMatchNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelHttpApiMatchNewResponseBody setData(SentinelHttpApiMatchNewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelHttpApiMatchNewResponseBodyData getData() {
        return this.data;
    }

    public SentinelHttpApiMatchNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelHttpApiMatchNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelHttpApiMatchNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelHttpApiMatchNewResponseBodyDataHostMatch extends TeaModel {
        @NameInMap("pattern")
        public String pattern;

        @NameInMap("type")
        public String type;

        public static SentinelHttpApiMatchNewResponseBodyDataHostMatch build(java.util.Map<String, ?> map) throws Exception {
            SentinelHttpApiMatchNewResponseBodyDataHostMatch self = new SentinelHttpApiMatchNewResponseBodyDataHostMatch();
            return TeaModel.build(map, self);
        }

        public SentinelHttpApiMatchNewResponseBodyDataHostMatch setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public SentinelHttpApiMatchNewResponseBodyDataHostMatch setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SentinelHttpApiMatchNewResponseBodyDataPathMatch extends TeaModel {
        @NameInMap("pattern")
        public String pattern;

        @NameInMap("type")
        public String type;

        @NameInMap("useClientRequestPath")
        public Boolean useClientRequestPath;

        public static SentinelHttpApiMatchNewResponseBodyDataPathMatch build(java.util.Map<String, ?> map) throws Exception {
            SentinelHttpApiMatchNewResponseBodyDataPathMatch self = new SentinelHttpApiMatchNewResponseBodyDataPathMatch();
            return TeaModel.build(map, self);
        }

        public SentinelHttpApiMatchNewResponseBodyDataPathMatch setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public SentinelHttpApiMatchNewResponseBodyDataPathMatch setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SentinelHttpApiMatchNewResponseBodyDataPathMatch setUseClientRequestPath(Boolean useClientRequestPath) {
            this.useClientRequestPath = useClientRequestPath;
            return this;
        }
        public Boolean getUseClientRequestPath() {
            return this.useClientRequestPath;
        }

    }

    public static class SentinelHttpApiMatchNewResponseBodyDataResourceNameGenerator extends TeaModel {
        @NameInMap("pattern")
        public String pattern;

        @NameInMap("strategy")
        public String strategy;

        public static SentinelHttpApiMatchNewResponseBodyDataResourceNameGenerator build(java.util.Map<String, ?> map) throws Exception {
            SentinelHttpApiMatchNewResponseBodyDataResourceNameGenerator self = new SentinelHttpApiMatchNewResponseBodyDataResourceNameGenerator();
            return TeaModel.build(map, self);
        }

        public SentinelHttpApiMatchNewResponseBodyDataResourceNameGenerator setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public SentinelHttpApiMatchNewResponseBodyDataResourceNameGenerator setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class SentinelHttpApiMatchNewResponseBodyData extends TeaModel {
        @NameInMap("apiName")
        public String apiName;

        @NameInMap("appName")
        public String appName;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("hostMatch")
        public SentinelHttpApiMatchNewResponseBodyDataHostMatch hostMatch;

        @NameInMap("id")
        public Long id;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("pathMatch")
        public SentinelHttpApiMatchNewResponseBodyDataPathMatch pathMatch;

        @NameInMap("resourceNameGenerator")
        public SentinelHttpApiMatchNewResponseBodyDataResourceNameGenerator resourceNameGenerator;

        @NameInMap("userId")
        public String userId;

        public static SentinelHttpApiMatchNewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelHttpApiMatchNewResponseBodyData self = new SentinelHttpApiMatchNewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelHttpApiMatchNewResponseBodyData setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public SentinelHttpApiMatchNewResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelHttpApiMatchNewResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelHttpApiMatchNewResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SentinelHttpApiMatchNewResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public SentinelHttpApiMatchNewResponseBodyData setHostMatch(SentinelHttpApiMatchNewResponseBodyDataHostMatch hostMatch) {
            this.hostMatch = hostMatch;
            return this;
        }
        public SentinelHttpApiMatchNewResponseBodyDataHostMatch getHostMatch() {
            return this.hostMatch;
        }

        public SentinelHttpApiMatchNewResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelHttpApiMatchNewResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelHttpApiMatchNewResponseBodyData setPathMatch(SentinelHttpApiMatchNewResponseBodyDataPathMatch pathMatch) {
            this.pathMatch = pathMatch;
            return this;
        }
        public SentinelHttpApiMatchNewResponseBodyDataPathMatch getPathMatch() {
            return this.pathMatch;
        }

        public SentinelHttpApiMatchNewResponseBodyData setResourceNameGenerator(SentinelHttpApiMatchNewResponseBodyDataResourceNameGenerator resourceNameGenerator) {
            this.resourceNameGenerator = resourceNameGenerator;
            return this;
        }
        public SentinelHttpApiMatchNewResponseBodyDataResourceNameGenerator getResourceNameGenerator() {
            return this.resourceNameGenerator;
        }

        public SentinelHttpApiMatchNewResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
