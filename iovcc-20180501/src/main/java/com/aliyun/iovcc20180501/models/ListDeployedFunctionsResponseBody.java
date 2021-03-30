// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeployedFunctionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Functions")
    public java.util.List<ListDeployedFunctionsResponseBodyFunctions> functions;

    public static ListDeployedFunctionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeployedFunctionsResponseBody self = new ListDeployedFunctionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeployedFunctionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeployedFunctionsResponseBody setFunctions(java.util.List<ListDeployedFunctionsResponseBodyFunctions> functions) {
        this.functions = functions;
        return this;
    }
    public java.util.List<ListDeployedFunctionsResponseBodyFunctions> getFunctions() {
        return this.functions;
    }

    public static class ListDeployedFunctionsResponseBodyFunctions extends TeaModel {
        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("FileId")
        public Long fileId;

        public static ListDeployedFunctionsResponseBodyFunctions build(java.util.Map<String, ?> map) throws Exception {
            ListDeployedFunctionsResponseBodyFunctions self = new ListDeployedFunctionsResponseBodyFunctions();
            return TeaModel.build(map, self);
        }

        public ListDeployedFunctionsResponseBodyFunctions setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListDeployedFunctionsResponseBodyFunctions setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDeployedFunctionsResponseBodyFunctions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDeployedFunctionsResponseBodyFunctions setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListDeployedFunctionsResponseBodyFunctions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDeployedFunctionsResponseBodyFunctions setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

    }

}
