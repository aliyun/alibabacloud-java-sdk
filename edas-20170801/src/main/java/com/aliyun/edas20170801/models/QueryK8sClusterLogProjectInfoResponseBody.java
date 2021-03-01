// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryK8sClusterLogProjectInfoResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProjectInfo")
    public QueryK8sClusterLogProjectInfoResponseBodyProjectInfo projectInfo;

    @NameInMap("Code")
    public Integer code;

    public static QueryK8sClusterLogProjectInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryK8sClusterLogProjectInfoResponseBody self = new QueryK8sClusterLogProjectInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryK8sClusterLogProjectInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryK8sClusterLogProjectInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryK8sClusterLogProjectInfoResponseBody setProjectInfo(QueryK8sClusterLogProjectInfoResponseBodyProjectInfo projectInfo) {
        this.projectInfo = projectInfo;
        return this;
    }
    public QueryK8sClusterLogProjectInfoResponseBodyProjectInfo getProjectInfo() {
        return this.projectInfo;
    }

    public QueryK8sClusterLogProjectInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class QueryK8sClusterLogProjectInfoResponseBodyProjectInfo extends TeaModel {
        @NameInMap("ProjectName")
        public String projectName;

        public static QueryK8sClusterLogProjectInfoResponseBodyProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryK8sClusterLogProjectInfoResponseBodyProjectInfo self = new QueryK8sClusterLogProjectInfoResponseBodyProjectInfo();
            return TeaModel.build(map, self);
        }

        public QueryK8sClusterLogProjectInfoResponseBodyProjectInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

}
