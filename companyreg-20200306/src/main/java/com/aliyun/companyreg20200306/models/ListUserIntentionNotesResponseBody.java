// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserIntentionNotesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListUserIntentionNotesResponseBodyData> data;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static ListUserIntentionNotesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserIntentionNotesResponseBody self = new ListUserIntentionNotesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserIntentionNotesResponseBody setData(java.util.List<ListUserIntentionNotesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUserIntentionNotesResponseBodyData> getData() {
        return this.data;
    }

    public ListUserIntentionNotesResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListUserIntentionNotesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserIntentionNotesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserIntentionNotesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserIntentionNotesResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public ListUserIntentionNotesResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class ListUserIntentionNotesResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Note")
        public String note;

        public static ListUserIntentionNotesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUserIntentionNotesResponseBodyData self = new ListUserIntentionNotesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUserIntentionNotesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUserIntentionNotesResponseBodyData setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

    }

}
