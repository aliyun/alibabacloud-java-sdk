// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class CustomerNoteListDetailResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CustomerNoteListDetailResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Msg")
    public String msg;

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
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("Size")
        public Long size;

        @NameInMap("Type")
        public String type;

        public static CustomerNoteListDetailResponseBodyDataAttachment build(java.util.Map<String, ?> map) throws Exception {
            CustomerNoteListDetailResponseBodyDataAttachment self = new CustomerNoteListDetailResponseBodyDataAttachment();
            return TeaModel.build(map, self);
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
        @NameInMap("AiResult")
        public String aiResult;

        @NameInMap("Attachment")
        public java.util.List<CustomerNoteListDetailResponseBodyDataAttachment> attachment;

        @NameInMap("ContactInformation")
        public String contactInformation;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("Creator")
        public Long creator;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("CustomerName")
        public String customerName;

        @NameInMap("CustomerUid")
        public Long customerUid;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("NoteContent")
        public String noteContent;

        @NameInMap("NoteId")
        public Long noteId;

        @NameInMap("NoteType")
        public String noteType;

        @NameInMap("NoteTypeLabel")
        public String noteTypeLabel;

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
