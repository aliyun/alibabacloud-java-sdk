// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUpdateOneResponseBody extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Code")
    public String code;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("GmtPublished")
    public String gmtPublished;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Message")
    public String message;

    @NameInMap("Note")
    public DatasetUpdateOneResponseBodyNote note;

    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("PublishStatus")
    public String publishStatus;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("TypeId")
    public Long typeId;

    public static DatasetUpdateOneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DatasetUpdateOneResponseBody self = new DatasetUpdateOneResponseBody();
        return TeaModel.build(map, self);
    }

    public DatasetUpdateOneResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DatasetUpdateOneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DatasetUpdateOneResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DatasetUpdateOneResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DatasetUpdateOneResponseBody setGmtPublished(String gmtPublished) {
        this.gmtPublished = gmtPublished;
        return this;
    }
    public String getGmtPublished() {
        return this.gmtPublished;
    }

    public DatasetUpdateOneResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DatasetUpdateOneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DatasetUpdateOneResponseBody setNote(DatasetUpdateOneResponseBodyNote note) {
        this.note = note;
        return this;
    }
    public DatasetUpdateOneResponseBodyNote getNote() {
        return this.note;
    }

    public DatasetUpdateOneResponseBody setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public DatasetUpdateOneResponseBody setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }
    public String getPublishStatus() {
        return this.publishStatus;
    }

    public DatasetUpdateOneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DatasetUpdateOneResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DatasetUpdateOneResponseBody setTypeId(Long typeId) {
        this.typeId = typeId;
        return this;
    }
    public Long getTypeId() {
        return this.typeId;
    }

    public static class DatasetUpdateOneResponseBodyNote extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static DatasetUpdateOneResponseBodyNote build(java.util.Map<String, ?> map) throws Exception {
            DatasetUpdateOneResponseBodyNote self = new DatasetUpdateOneResponseBodyNote();
            return TeaModel.build(map, self);
        }

        public DatasetUpdateOneResponseBodyNote setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DatasetUpdateOneResponseBodyNote setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DatasetUpdateOneResponseBodyNote setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DatasetUpdateOneResponseBodyNote setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DatasetUpdateOneResponseBodyNote setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
