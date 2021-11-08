// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QueryPerspectivesResponseBody extends TeaModel {
    @NameInMap("Perspectives")
    public java.util.List<QueryPerspectivesResponseBodyPerspectives> perspectives;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryPerspectivesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPerspectivesResponseBody self = new QueryPerspectivesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPerspectivesResponseBody setPerspectives(java.util.List<QueryPerspectivesResponseBodyPerspectives> perspectives) {
        this.perspectives = perspectives;
        return this;
    }
    public java.util.List<QueryPerspectivesResponseBodyPerspectives> getPerspectives() {
        return this.perspectives;
    }

    public QueryPerspectivesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryPerspectivesResponseBodyPerspectives extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUserName")
        public String createUserName;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ModifyUserName")
        public String modifyUserName;

        @NameInMap("Name")
        public String name;

        @NameInMap("PerspectiveCode")
        public String perspectiveCode;

        @NameInMap("PerspectiveId")
        public String perspectiveId;

        @NameInMap("SelfDefine")
        public Boolean selfDefine;

        @NameInMap("Status")
        public Integer status;

        public static QueryPerspectivesResponseBodyPerspectives build(java.util.Map<String, ?> map) throws Exception {
            QueryPerspectivesResponseBodyPerspectives self = new QueryPerspectivesResponseBodyPerspectives();
            return TeaModel.build(map, self);
        }

        public QueryPerspectivesResponseBodyPerspectives setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryPerspectivesResponseBodyPerspectives setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public QueryPerspectivesResponseBodyPerspectives setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public QueryPerspectivesResponseBodyPerspectives setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public QueryPerspectivesResponseBodyPerspectives setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryPerspectivesResponseBodyPerspectives setPerspectiveCode(String perspectiveCode) {
            this.perspectiveCode = perspectiveCode;
            return this;
        }
        public String getPerspectiveCode() {
            return this.perspectiveCode;
        }

        public QueryPerspectivesResponseBodyPerspectives setPerspectiveId(String perspectiveId) {
            this.perspectiveId = perspectiveId;
            return this;
        }
        public String getPerspectiveId() {
            return this.perspectiveId;
        }

        public QueryPerspectivesResponseBodyPerspectives setSelfDefine(Boolean selfDefine) {
            this.selfDefine = selfDefine;
            return this;
        }
        public Boolean getSelfDefine() {
            return this.selfDefine;
        }

        public QueryPerspectivesResponseBodyPerspectives setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
