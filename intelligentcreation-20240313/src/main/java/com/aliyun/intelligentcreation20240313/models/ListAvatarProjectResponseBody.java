// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAvatarProjectResponseBody extends TeaModel {
    @NameInMap("queryAvatarProjectResultList")
    public java.util.List<ListAvatarProjectResponseBodyQueryAvatarProjectResultList> queryAvatarProjectResultList;

    /**
     * <strong>example:</strong>
     * <p>D7F2B74F-63F2-5DD6-95E4-F408EAD6617E</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1000206</p>
         */
        @NameInMap("agentId")
        public String agentId;

        @NameInMap("errorMsg")
        public String errorMsg;

        /**
         * <strong>example:</strong>
         * <p>12826084562688</p>
         */
        @NameInMap("projectId")
        public String projectId;

        @NameInMap("projectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>DEPLOYING</p>
         */
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
