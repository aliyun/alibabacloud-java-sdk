// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class QueryPerspectivesResponseBody extends TeaModel {
    // 视角列表
    @NameInMap("Perspectives")
    public java.util.List<QueryPerspectivesResponseBodyPerspectives> perspectives;

    // 请求Id
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
        // 创建时间 UTC时间
        @NameInMap("CreateTime")
        public String createTime;

        // 修改时间 UTC时间
        @NameInMap("ModifyTime")
        public String modifyTime;

        // 视角名称
        @NameInMap("Name")
        public String name;

        // 视角编码（用于问答api）
        @NameInMap("PerspectiveCode")
        public String perspectiveCode;

        // 视角主键（code_id）
        @NameInMap("PerspectiveId")
        public String perspectiveId;

        // 是否自定义
        @NameInMap("SelfDefine")
        public Boolean selfDefine;

        // 数据状态：3：选中；1：未选中
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

        public QueryPerspectivesResponseBodyPerspectives setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
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
