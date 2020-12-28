// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class QueryExperimentsByEmpIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public java.util.List<QueryExperimentsByEmpIdResponseBodyContent> content;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryExperimentsByEmpIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryExperimentsByEmpIdResponseBody self = new QueryExperimentsByEmpIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryExperimentsByEmpIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryExperimentsByEmpIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryExperimentsByEmpIdResponseBody setContent(java.util.List<QueryExperimentsByEmpIdResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<QueryExperimentsByEmpIdResponseBodyContent> getContent() {
        return this.content;
    }

    public QueryExperimentsByEmpIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryExperimentsByEmpIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryExperimentsByEmpIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryExperimentsByEmpIdResponseBodyContent extends TeaModel {
        @NameInMap("ExperimentId")
        public String experimentId;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        public static QueryExperimentsByEmpIdResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            QueryExperimentsByEmpIdResponseBodyContent self = new QueryExperimentsByEmpIdResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public QueryExperimentsByEmpIdResponseBodyContent setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public QueryExperimentsByEmpIdResponseBodyContent setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryExperimentsByEmpIdResponseBodyContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryExperimentsByEmpIdResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
