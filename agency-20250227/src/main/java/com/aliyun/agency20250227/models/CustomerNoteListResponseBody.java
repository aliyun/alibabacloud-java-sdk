// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class CustomerNoteListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CustomerNoteListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CustomerNoteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CustomerNoteListResponseBody self = new CustomerNoteListResponseBody();
        return TeaModel.build(map, self);
    }

    public CustomerNoteListResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CustomerNoteListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CustomerNoteListResponseBody setData(CustomerNoteListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CustomerNoteListResponseBodyData getData() {
        return this.data;
    }

    public CustomerNoteListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CustomerNoteListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CustomerNoteListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CustomerNoteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CustomerNoteListResponseBodyDataData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <strong>example:</strong>
         * <p>1757916424103619</p>
         */
        @NameInMap("Creator")
        public Long creator;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <strong>example:</strong>
         * <p>2026-07-17 12:18:23</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>讨论技术方案</p>
         */
        @NameInMap("NoteContent")
        public String noteContent;

        /**
         * <strong>example:</strong>
         * <p>2932252</p>
         */
        @NameInMap("NoteId")
        public Long noteId;

        /**
         * <strong>example:</strong>
         * <p>CUSTOMER</p>
         */
        @NameInMap("NoteType")
        public String noteType;

        /**
         * <strong>example:</strong>
         * <p>客户</p>
         */
        @NameInMap("NoteTypeLabel")
        public String noteTypeLabel;

        /**
         * <strong>example:</strong>
         * <p>1784266662000</p>
         */
        @NameInMap("TouchDate")
        public String touchDate;

        public static CustomerNoteListResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            CustomerNoteListResponseBodyDataData self = new CustomerNoteListResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public CustomerNoteListResponseBodyDataData setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public CustomerNoteListResponseBodyDataData setCreator(Long creator) {
            this.creator = creator;
            return this;
        }
        public Long getCreator() {
            return this.creator;
        }

        public CustomerNoteListResponseBodyDataData setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public CustomerNoteListResponseBodyDataData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CustomerNoteListResponseBodyDataData setNoteContent(String noteContent) {
            this.noteContent = noteContent;
            return this;
        }
        public String getNoteContent() {
            return this.noteContent;
        }

        public CustomerNoteListResponseBodyDataData setNoteId(Long noteId) {
            this.noteId = noteId;
            return this;
        }
        public Long getNoteId() {
            return this.noteId;
        }

        public CustomerNoteListResponseBodyDataData setNoteType(String noteType) {
            this.noteType = noteType;
            return this;
        }
        public String getNoteType() {
            return this.noteType;
        }

        public CustomerNoteListResponseBodyDataData setNoteTypeLabel(String noteTypeLabel) {
            this.noteTypeLabel = noteTypeLabel;
            return this;
        }
        public String getNoteTypeLabel() {
            return this.noteTypeLabel;
        }

        public CustomerNoteListResponseBodyDataData setTouchDate(String touchDate) {
            this.touchDate = touchDate;
            return this;
        }
        public String getTouchDate() {
            return this.touchDate;
        }

    }

    public static class CustomerNoteListResponseBodyDataPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static CustomerNoteListResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            CustomerNoteListResponseBodyDataPageInfo self = new CustomerNoteListResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public CustomerNoteListResponseBodyDataPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public CustomerNoteListResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public CustomerNoteListResponseBodyDataPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class CustomerNoteListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("AccessDeniedDetail")
        public String accessDeniedDetail;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public java.util.List<CustomerNoteListResponseBodyDataData> data;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("HttpStatusCode")
        public Integer httpStatusCode;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Msg")
        public String msg;

        @NameInMap("PageInfo")
        public CustomerNoteListResponseBodyDataPageInfo pageInfo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static CustomerNoteListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CustomerNoteListResponseBodyData self = new CustomerNoteListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CustomerNoteListResponseBodyData setAccessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }
        public String getAccessDeniedDetail() {
            return this.accessDeniedDetail;
        }

        public CustomerNoteListResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CustomerNoteListResponseBodyData setData(java.util.List<CustomerNoteListResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<CustomerNoteListResponseBodyDataData> getData() {
            return this.data;
        }

        public CustomerNoteListResponseBodyData setHttpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }
        public Integer getHttpStatusCode() {
            return this.httpStatusCode;
        }

        public CustomerNoteListResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CustomerNoteListResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public CustomerNoteListResponseBodyData setPageInfo(CustomerNoteListResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public CustomerNoteListResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public CustomerNoteListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public CustomerNoteListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public CustomerNoteListResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CustomerNoteListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
