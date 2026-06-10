// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class QueryPerspectivesResponseBody extends TeaModel {
    /**
     * <p>A list of perspectives.</p>
     */
    @NameInMap("Perspectives")
    public java.util.List<QueryPerspectivesResponseBodyPerspectives> perspectives;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F285D735-D580-18A8-B97F-B2E72B00F101</p>
     */
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
        /**
         * <p>The creation time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-12T06:30:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The modification time in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-29T03:38:54Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The perspective name.</p>
         * 
         * <strong>example:</strong>
         * <p>移动端视角</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The perspective code (used for the Q\&amp;A API).</p>
         * 
         * <strong>example:</strong>
         * <p>FZJBY3raWr</p>
         */
        @NameInMap("PerspectiveCode")
        public String perspectiveCode;

        /**
         * <p>The perspective ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        @NameInMap("PerspectiveId")
        public String perspectiveId;

        /**
         * <p>Indicates whether the perspective is custom-defined.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SelfDefine")
        public Boolean selfDefine;

        /**
         * <p>The status of the perspective. Valid values are 3 (enabled) and 1 (disabled).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
