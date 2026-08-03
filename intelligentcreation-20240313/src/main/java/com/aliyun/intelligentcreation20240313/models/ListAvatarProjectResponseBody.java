// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAvatarProjectResponseBody extends TeaModel {
    @NameInMap("queryAvatarProjectResultList")
    public java.util.List<ListAvatarProjectResponseBodyQueryAvatarProjectResultList> queryAvatarProjectResultList;

    @NameInMap("requestId")
    public String requestId;

    public static ListAvatarProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvatarProjectResponseBody self = new ListAvatarProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvatarProjectResponseBody setQueryAvatarProjectResultList(java.util.List<ListAvatarProjectResponseBodyQueryAvatarProjectResultList> queryAvatarProjectResultList) {
        this.queryAvatarProjectResultList = queryAvatarProjectResultList;
        return this;
    }
    public java.util.List<ListAvatarProjectResponseBodyQueryAvatarProjectResultList> getQueryAvatarProjectResultList() {
        return this.queryAvatarProjectResultList;
    }

    public ListAvatarProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAvatarProjectResponseBodyQueryAvatarProjectResultList extends TeaModel {
        @NameInMap("agentId")
        public String agentId;

        @NameInMap("errorMsg")
        public String errorMsg;

        @NameInMap("projectId")
        public String projectId;

        @NameInMap("projectName")
        public String projectName;

        @NameInMap("status")
        public String status;

        public static ListAvatarProjectResponseBodyQueryAvatarProjectResultList build(java.util.Map<String, ?> map) throws Exception {
            ListAvatarProjectResponseBodyQueryAvatarProjectResultList self = new ListAvatarProjectResponseBodyQueryAvatarProjectResultList();
            return TeaModel.build(map, self);
        }

        public ListAvatarProjectResponseBodyQueryAvatarProjectResultList setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListAvatarProjectResponseBodyQueryAvatarProjectResultList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListAvatarProjectResponseBodyQueryAvatarProjectResultList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListAvatarProjectResponseBodyQueryAvatarProjectResultList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListAvatarProjectResponseBodyQueryAvatarProjectResultList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
