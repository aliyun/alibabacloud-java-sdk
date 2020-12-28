// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class QueryExperimentSimpleInfoForMkResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Check")
    public java.util.List<QueryExperimentSimpleInfoForMkResponseBodyCheck> check;

    @NameInMap("Prepare")
    public java.util.List<QueryExperimentSimpleInfoForMkResponseBodyPrepare> prepare;

    @NameInMap("BasicInfo")
    public QueryExperimentSimpleInfoForMkResponseBodyBasicInfo basicInfo;

    @NameInMap("Attack")
    public java.util.List<QueryExperimentSimpleInfoForMkResponseBodyAttack> attack;

    @NameInMap("Recover")
    public java.util.List<QueryExperimentSimpleInfoForMkResponseBodyRecover> recover;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryExperimentSimpleInfoForMkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentSimpleInfoForMkResponseBody self = new QueryExperimentSimpleInfoForMkResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryExperimentSimpleInfoForMkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryExperimentSimpleInfoForMkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryExperimentSimpleInfoForMkResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryExperimentSimpleInfoForMkResponseBody setCheck(java.util.List<QueryExperimentSimpleInfoForMkResponseBodyCheck> check) {
        this.check = check;
        return this;
    }
    public java.util.List<QueryExperimentSimpleInfoForMkResponseBodyCheck> getCheck() {
        return this.check;
    }

    public QueryExperimentSimpleInfoForMkResponseBody setPrepare(java.util.List<QueryExperimentSimpleInfoForMkResponseBodyPrepare> prepare) {
        this.prepare = prepare;
        return this;
    }
    public java.util.List<QueryExperimentSimpleInfoForMkResponseBodyPrepare> getPrepare() {
        return this.prepare;
    }

    public QueryExperimentSimpleInfoForMkResponseBody setBasicInfo(QueryExperimentSimpleInfoForMkResponseBodyBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }
    public QueryExperimentSimpleInfoForMkResponseBodyBasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    public QueryExperimentSimpleInfoForMkResponseBody setAttack(java.util.List<QueryExperimentSimpleInfoForMkResponseBodyAttack> attack) {
        this.attack = attack;
        return this;
    }
    public java.util.List<QueryExperimentSimpleInfoForMkResponseBodyAttack> getAttack() {
        return this.attack;
    }

    public QueryExperimentSimpleInfoForMkResponseBody setRecover(java.util.List<QueryExperimentSimpleInfoForMkResponseBodyRecover> recover) {
        this.recover = recover;
        return this;
    }
    public java.util.List<QueryExperimentSimpleInfoForMkResponseBodyRecover> getRecover() {
        return this.recover;
    }

    public QueryExperimentSimpleInfoForMkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryExperimentSimpleInfoForMkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryExperimentSimpleInfoForMkResponseBodyCheck extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("Name")
        public String name;

        public static QueryExperimentSimpleInfoForMkResponseBodyCheck build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentSimpleInfoForMkResponseBodyCheck self = new QueryExperimentSimpleInfoForMkResponseBodyCheck();
            return TeaModel.build(map, self);
        }

        public QueryExperimentSimpleInfoForMkResponseBodyCheck setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryExperimentSimpleInfoForMkResponseBodyCheck setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryExperimentSimpleInfoForMkResponseBodyPrepare extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("Name")
        public String name;

        public static QueryExperimentSimpleInfoForMkResponseBodyPrepare build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentSimpleInfoForMkResponseBodyPrepare self = new QueryExperimentSimpleInfoForMkResponseBodyPrepare();
            return TeaModel.build(map, self);
        }

        public QueryExperimentSimpleInfoForMkResponseBodyPrepare setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryExperimentSimpleInfoForMkResponseBodyPrepare setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryExperimentSimpleInfoForMkResponseBodyBasicInfo extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("State")
        public String state;

        @NameInMap("ExperimentId")
        public String experimentId;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        public static QueryExperimentSimpleInfoForMkResponseBodyBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentSimpleInfoForMkResponseBodyBasicInfo self = new QueryExperimentSimpleInfoForMkResponseBodyBasicInfo();
            return TeaModel.build(map, self);
        }

        public QueryExperimentSimpleInfoForMkResponseBodyBasicInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryExperimentSimpleInfoForMkResponseBodyBasicInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryExperimentSimpleInfoForMkResponseBodyBasicInfo setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public QueryExperimentSimpleInfoForMkResponseBodyBasicInfo setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryExperimentSimpleInfoForMkResponseBodyBasicInfo setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public QueryExperimentSimpleInfoForMkResponseBodyBasicInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryExperimentSimpleInfoForMkResponseBodyBasicInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class QueryExperimentSimpleInfoForMkResponseBodyAttack extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("Name")
        public String name;

        public static QueryExperimentSimpleInfoForMkResponseBodyAttack build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentSimpleInfoForMkResponseBodyAttack self = new QueryExperimentSimpleInfoForMkResponseBodyAttack();
            return TeaModel.build(map, self);
        }

        public QueryExperimentSimpleInfoForMkResponseBodyAttack setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryExperimentSimpleInfoForMkResponseBodyAttack setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryExperimentSimpleInfoForMkResponseBodyRecover extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("Name")
        public String name;

        public static QueryExperimentSimpleInfoForMkResponseBodyRecover build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentSimpleInfoForMkResponseBodyRecover self = new QueryExperimentSimpleInfoForMkResponseBodyRecover();
            return TeaModel.build(map, self);
        }

        public QueryExperimentSimpleInfoForMkResponseBodyRecover setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryExperimentSimpleInfoForMkResponseBodyRecover setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
