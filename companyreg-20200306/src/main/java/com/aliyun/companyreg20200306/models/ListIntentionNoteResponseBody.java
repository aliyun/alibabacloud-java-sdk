// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListIntentionNoteResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public java.util.List<ListIntentionNoteResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>6A603AA0-73BA-52B3-AC7D-0F846ECF7A9D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static ListIntentionNoteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntentionNoteResponseBody self = new ListIntentionNoteResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntentionNoteResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public ListIntentionNoteResponseBody setData(java.util.List<ListIntentionNoteResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIntentionNoteResponseBodyData> getData() {
        return this.data;
    }

    public ListIntentionNoteResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListIntentionNoteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIntentionNoteResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public ListIntentionNoteResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class ListIntentionNoteResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-01-25 10:21:38</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>I20210420142416000001</p>
         */
        @NameInMap("IntentionBizId")
        public String intentionBizId;

        @NameInMap("Note")
        public String note;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Source")
        public Integer source;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListIntentionNoteResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIntentionNoteResponseBodyData self = new ListIntentionNoteResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIntentionNoteResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIntentionNoteResponseBodyData setIntentionBizId(String intentionBizId) {
            this.intentionBizId = intentionBizId;
            return this;
        }
        public String getIntentionBizId() {
            return this.intentionBizId;
        }

        public ListIntentionNoteResponseBodyData setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ListIntentionNoteResponseBodyData setSource(Integer source) {
            this.source = source;
            return this;
        }
        public Integer getSource() {
            return this.source;
        }

        public ListIntentionNoteResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
