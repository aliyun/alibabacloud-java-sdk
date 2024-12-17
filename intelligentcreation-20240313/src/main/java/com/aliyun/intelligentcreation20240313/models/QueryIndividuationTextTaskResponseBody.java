// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryIndividuationTextTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>56AC346B-AF40-5E4F-AFFE-FD8BA5E6FB3A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("status")
    public Integer status;

    @NameInMap("textList")
    public java.util.List<QueryIndividuationTextTaskResponseBodyTextList> textList;

    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd HH:mm:ss</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    public static QueryIndividuationTextTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIndividuationTextTaskResponseBody self = new QueryIndividuationTextTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIndividuationTextTaskResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public QueryIndividuationTextTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIndividuationTextTaskResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryIndividuationTextTaskResponseBody setTextList(java.util.List<QueryIndividuationTextTaskResponseBodyTextList> textList) {
        this.textList = textList;
        return this;
    }
    public java.util.List<QueryIndividuationTextTaskResponseBodyTextList> getTextList() {
        return this.textList;
    }

    public QueryIndividuationTextTaskResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class QueryIndividuationTextTaskResponseBodyTextList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>2761</p>
         */
        @NameInMap("textId")
        public String textId;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("userId")
        public String userId;

        public static QueryIndividuationTextTaskResponseBodyTextList build(java.util.Map<String, ?> map) throws Exception {
            QueryIndividuationTextTaskResponseBodyTextList self = new QueryIndividuationTextTaskResponseBodyTextList();
            return TeaModel.build(map, self);
        }

        public QueryIndividuationTextTaskResponseBodyTextList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryIndividuationTextTaskResponseBodyTextList setTextId(String textId) {
            this.textId = textId;
            return this;
        }
        public String getTextId() {
            return this.textId;
        }

        public QueryIndividuationTextTaskResponseBodyTextList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
