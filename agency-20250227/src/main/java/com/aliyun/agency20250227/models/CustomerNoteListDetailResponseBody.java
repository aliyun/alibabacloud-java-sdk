// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class CustomerNoteListDetailResponseBody extends TeaModel {
    /**
     * <p>The access denied details returned by the POP API when RAM permissions are missing.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CustomerNoteListDetailResponseBodyData data;

    /**
     * <p>The HTTP status code returned by the POP API.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The prompt message. This is the same as Message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CustomerNoteListDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CustomerNoteListDetailResponseBody self = new CustomerNoteListDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public CustomerNoteListDetailResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CustomerNoteListDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CustomerNoteListDetailResponseBody setData(CustomerNoteListDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CustomerNoteListDetailResponseBodyData getData() {
        return this.data;
    }

    public CustomerNoteListDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CustomerNoteListDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CustomerNoteListDetailResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CustomerNoteListDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CustomerNoteListDetailResponseBodyDataAttachment extends TeaModel {
        /**
         * <p>The attachment signature.</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The attachment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>307</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The attachment name.</p>
         * 
         * <strong>example:</strong>
         * <p>Course Training</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The attachment signature.</p>
         * 
         * <strong>example:</strong>
         * <p>hF2UrEMc4XWy990sh9LGM0+ScI8=</p>
         */
        @NameInMap("Signature")
        public String signature;

        /**
         * <p>The attachment size in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>111222121</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The attachment type.</p>
         * 
         * <strong>example:</strong>
         * <p>image/png</p>
         */
        @NameInMap("Type")
        public String type;

        public static CustomerNoteListDetailResponseBodyDataAttachment build(java.util.Map<String, ?> map) throws Exception {
            CustomerNoteListDetailResponseBodyDataAttachment self = new CustomerNoteListDetailResponseBodyDataAttachment();
            return TeaModel.build(map, self);
        }

        public CustomerNoteListDetailResponseBodyDataAttachment setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public CustomerNoteListDetailResponseBodyDataAttachment setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CustomerNoteListDetailResponseBodyDataAttachment setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CustomerNoteListDetailResponseBodyDataAttachment setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public CustomerNoteListDetailResponseBodyDataAttachment setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public CustomerNoteListDetailResponseBodyDataAttachment setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CustomerNoteListDetailResponseBodyData extends TeaModel {
        /**
         * <p>The AI parsing result (JSON string).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TouchDate&quot;:&quot;2026-07-17 10:00:01&quot;}</p>
         */
        @NameInMap("AiResult")
        public String aiResult;

        /**
         * <p>The attachment list.</p>
         */
        @NameInMap("Attachment")
        public java.util.List<CustomerNoteListDetailResponseBodyDataAttachment> attachment;

        /**
         * <p>The contact information.</p>
         * 
         * <strong>example:</strong>
         * <p>13833333333</p>
         */
        @NameInMap("ContactInformation")
        public String contactInformation;

        /**
         * <p>The contact name.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>The UID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>291688841144601701</p>
         */
        @NameInMap("Creator")
        public Long creator;

        /**
         * <p>The logon name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The customer name.</p>
         * 
         * <strong>example:</strong>
         * <p>XXXX Co., Ltd</p>
         */
        @NameInMap("CustomerName")
        public String customerName;

        /**
         * <p>The customer UID.</p>
         * 
         * <strong>example:</strong>
         * <p>1271202085096245</p>
         */
        @NameInMap("CustomerUid")
        public Long customerUid;

        /**
         * <p>The creation time in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-07 10:27:46</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The note content.</p>
         * 
         * <strong>example:</strong>
         * <p>Note content</p>
         */
        @NameInMap("NoteContent")
        public String noteContent;

        /**
         * <p>The note ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1620737</p>
         */
        @NameInMap("NoteId")
        public Long noteId;

        /**
         * <p>The note type (CUSTOMER).</p>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMER</p>
         */
        @NameInMap("NoteType")
        public String noteType;

        /**
         * <p>The note type label.</p>
         * 
         * <strong>example:</strong>
         * <p>Customer</p>
         */
        @NameInMap("NoteTypeLabel")
        public String noteTypeLabel;

        /**
         * <p>The touch date (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1784266662000</p>
         */
        @NameInMap("TouchDate")
        public String touchDate;

        public static CustomerNoteListDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CustomerNoteListDetailResponseBodyData self = new CustomerNoteListDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CustomerNoteListDetailResponseBodyData setAiResult(String aiResult) {
            this.aiResult = aiResult;
            return this;
        }
        public String getAiResult() {
            return this.aiResult;
        }

        public CustomerNoteListDetailResponseBodyData setAttachment(java.util.List<CustomerNoteListDetailResponseBodyDataAttachment> attachment) {
            this.attachment = attachment;
            return this;
        }
        public java.util.List<CustomerNoteListDetailResponseBodyDataAttachment> getAttachment() {
            return this.attachment;
        }

        public CustomerNoteListDetailResponseBodyData setContactInformation(String contactInformation) {
            this.contactInformation = contactInformation;
            return this;
        }
        public String getContactInformation() {
            return this.contactInformation;
        }

        public CustomerNoteListDetailResponseBodyData setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public CustomerNoteListDetailResponseBodyData setCreator(Long creator) {
            this.creator = creator;
            return this;
        }
        public Long getCreator() {
            return this.creator;
        }

        public CustomerNoteListDetailResponseBodyData setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public CustomerNoteListDetailResponseBodyData setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public CustomerNoteListDetailResponseBodyData setCustomerUid(Long customerUid) {
            this.customerUid = customerUid;
            return this;
        }
        public Long getCustomerUid() {
            return this.customerUid;
        }

        public CustomerNoteListDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CustomerNoteListDetailResponseBodyData setNoteContent(String noteContent) {
            this.noteContent = noteContent;
            return this;
        }
        public String getNoteContent() {
            return this.noteContent;
        }

        public CustomerNoteListDetailResponseBodyData setNoteId(Long noteId) {
            this.noteId = noteId;
            return this;
        }
        public Long getNoteId() {
            return this.noteId;
        }

        public CustomerNoteListDetailResponseBodyData setNoteType(String noteType) {
            this.noteType = noteType;
            return this;
        }
        public String getNoteType() {
            return this.noteType;
        }

        public CustomerNoteListDetailResponseBodyData setNoteTypeLabel(String noteTypeLabel) {
            this.noteTypeLabel = noteTypeLabel;
            return this;
        }
        public String getNoteTypeLabel() {
            return this.noteTypeLabel;
        }

        public CustomerNoteListDetailResponseBodyData setTouchDate(String touchDate) {
            this.touchDate = touchDate;
            return this;
        }
        public String getTouchDate() {
            return this.touchDate;
        }

    }

}
