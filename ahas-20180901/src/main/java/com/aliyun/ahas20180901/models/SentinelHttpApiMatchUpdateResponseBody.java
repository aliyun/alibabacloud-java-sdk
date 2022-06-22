// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelHttpApiMatchUpdateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelHttpApiMatchUpdateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelHttpApiMatchUpdateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelHttpApiMatchUpdateResponseBody self = new SentinelHttpApiMatchUpdateResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelHttpApiMatchUpdateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelHttpApiMatchUpdateResponseBody setData(SentinelHttpApiMatchUpdateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelHttpApiMatchUpdateResponseBodyData getData() {
        return this.data;
    }

    public SentinelHttpApiMatchUpdateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelHttpApiMatchUpdateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelHttpApiMatchUpdateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelHttpApiMatchUpdateResponseBodyDataHostMatch extends TeaModel {
        @NameInMap("pattern")
        public String pattern;

        @NameInMap("type")
        public String type;

        public static SentinelHttpApiMatchUpdateResponseBodyDataHostMatch build(java.util.Map<String, ?> map) throws Exception {
            SentinelHttpApiMatchUpdateResponseBodyDataHostMatch self = new SentinelHttpApiMatchUpdateResponseBodyDataHostMatch();
            return TeaModel.build(map, self);
        }

        public SentinelHttpApiMatchUpdateResponseBodyDataHostMatch setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public SentinelHttpApiMatchUpdateResponseBodyDataHostMatch setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SentinelHttpApiMatchUpdateResponseBodyDataPathMatch extends TeaModel {
        @NameInMap("pattern")
        public String pattern;

        @NameInMap("type")
        public String type;

        @NameInMap("useClientRequestPath")
        public Boolean useClientRequestPath;

        public static SentinelHttpApiMatchUpdateResponseBodyDataPathMatch build(java.util.Map<String, ?> map) throws Exception {
            SentinelHttpApiMatchUpdateResponseBodyDataPathMatch self = new SentinelHttpApiMatchUpdateResponseBodyDataPathMatch();
            return TeaModel.build(map, self);
        }

        public SentinelHttpApiMatchUpdateResponseBodyDataPathMatch setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public SentinelHttpApiMatchUpdateResponseBodyDataPathMatch setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SentinelHttpApiMatchUpdateResponseBodyDataPathMatch setUseClientRequestPath(Boolean useClientRequestPath) {
            this.useClientRequestPath = useClientRequestPath;
            return this;
        }
        public Boolean getUseClientRequestPath() {
            return this.useClientRequestPath;
        }

    }

    public static class SentinelHttpApiMatchUpdateResponseBodyDataResourceNameGenerator extends TeaModel {
        @NameInMap("pattern")
        public String pattern;

        @NameInMap("strategy")
        public String strategy;

        public static SentinelHttpApiMatchUpdateResponseBodyDataResourceNameGenerator build(java.util.Map<String, ?> map) throws Exception {
            SentinelHttpApiMatchUpdateResponseBodyDataResourceNameGenerator self = new SentinelHttpApiMatchUpdateResponseBodyDataResourceNameGenerator();
            return TeaModel.build(map, self);
        }

        public SentinelHttpApiMatchUpdateResponseBodyDataResourceNameGenerator setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public SentinelHttpApiMatchUpdateResponseBodyDataResourceNameGenerator setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

    public static class SentinelHttpApiMatchUpdateResponseBodyData extends TeaModel {
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
        public SentinelHttpApiMatchUpdateResponseBodyDataHostMatch hostMatch;

        @NameInMap("id")
        public Long id;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("pathMatch")
        public SentinelHttpApiMatchUpdateResponseBodyDataPathMatch pathMatch;

        @NameInMap("resourceNameGenerator")
        public SentinelHttpApiMatchUpdateResponseBodyDataResourceNameGenerator resourceNameGenerator;

        @NameInMap("userId")
        public String userId;

        public static SentinelHttpApiMatchUpdateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelHttpApiMatchUpdateResponseBodyData self = new SentinelHttpApiMatchUpdateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelHttpApiMatchUpdateResponseBodyData setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public SentinelHttpApiMatchUpdateResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public SentinelHttpApiMatchUpdateResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public SentinelHttpApiMatchUpdateResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SentinelHttpApiMatchUpdateResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public SentinelHttpApiMatchUpdateResponseBodyData setHostMatch(SentinelHttpApiMatchUpdateResponseBodyDataHostMatch hostMatch) {
            this.hostMatch = hostMatch;
            return this;
        }
        public SentinelHttpApiMatchUpdateResponseBodyDataHostMatch getHostMatch() {
            return this.hostMatch;
        }

        public SentinelHttpApiMatchUpdateResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelHttpApiMatchUpdateResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public SentinelHttpApiMatchUpdateResponseBodyData setPathMatch(SentinelHttpApiMatchUpdateResponseBodyDataPathMatch pathMatch) {
            this.pathMatch = pathMatch;
            return this;
        }
        public SentinelHttpApiMatchUpdateResponseBodyDataPathMatch getPathMatch() {
            return this.pathMatch;
        }

        public SentinelHttpApiMatchUpdateResponseBodyData setResourceNameGenerator(SentinelHttpApiMatchUpdateResponseBodyDataResourceNameGenerator resourceNameGenerator) {
            this.resourceNameGenerator = resourceNameGenerator;
            return this;
        }
        public SentinelHttpApiMatchUpdateResponseBodyDataResourceNameGenerator getResourceNameGenerator() {
            return this.resourceNameGenerator;
        }

        public SentinelHttpApiMatchUpdateResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
