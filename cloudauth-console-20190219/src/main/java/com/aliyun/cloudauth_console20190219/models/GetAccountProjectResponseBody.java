// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class GetAccountProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("List")
    public java.util.List<GetAccountProjectResponseBodyList> list;

    @NameInMap("Success")
    public Boolean success;

    public static GetAccountProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountProjectResponseBody self = new GetAccountProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountProjectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAccountProjectResponseBody setList(java.util.List<GetAccountProjectResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<GetAccountProjectResponseBodyList> getList() {
        return this.list;
    }

    public GetAccountProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAccountProjectResponseBodyList extends TeaModel {
        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        public static GetAccountProjectResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            GetAccountProjectResponseBodyList self = new GetAccountProjectResponseBodyList();
            return TeaModel.build(map, self);
        }

        public GetAccountProjectResponseBodyList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetAccountProjectResponseBodyList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

}
