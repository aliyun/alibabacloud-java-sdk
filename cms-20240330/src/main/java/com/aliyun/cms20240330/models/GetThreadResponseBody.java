// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetThreadResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2025-12-19T15:19:55.040403272+08:00</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeName;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>thread-t71rrw-1s7r7z9gu0v2s</p>
     */
    @NameInMap("threadId")
    public String threadId;

    /**
     * <strong>example:</strong>
     * <p>testLive</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>2025-12-19T15:19:55.040403272+08:00</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    @NameInMap("variables")
    public GetThreadResponseBodyVariables variables;

    /**
     * <strong>example:</strong>
     * <p>1231</p>
     */
    @NameInMap("version")
    public Long version;

    public static GetThreadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetThreadResponseBody self = new GetThreadResponseBody();
        return TeaModel.build(map, self);
    }

    public GetThreadResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetThreadResponseBody setDigitalEmployeeName(String digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public GetThreadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThreadResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetThreadResponseBody setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public GetThreadResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetThreadResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetThreadResponseBody setVariables(GetThreadResponseBodyVariables variables) {
        this.variables = variables;
        return this;
    }
    public GetThreadResponseBodyVariables getVariables() {
        return this.variables;
    }

    public GetThreadResponseBody setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public static class GetThreadResponseBodyVariables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>kubenest</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <strong>example:</strong>
         * <p>hd1</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static GetThreadResponseBodyVariables build(java.util.Map<String, ?> map) throws Exception {
            GetThreadResponseBodyVariables self = new GetThreadResponseBodyVariables();
            return TeaModel.build(map, self);
        }

        public GetThreadResponseBodyVariables setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetThreadResponseBodyVariables setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
