// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetCreateOneResponseBody extends TeaModel {
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
    public DatasetCreateOneResponseBodyNote note;

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

    public static DatasetCreateOneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DatasetCreateOneResponseBody self = new DatasetCreateOneResponseBody();
        return TeaModel.build(map, self);
    }

    public DatasetCreateOneResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DatasetCreateOneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DatasetCreateOneResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DatasetCreateOneResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DatasetCreateOneResponseBody setGmtPublished(String gmtPublished) {
        this.gmtPublished = gmtPublished;
        return this;
    }
    public String getGmtPublished() {
        return this.gmtPublished;
    }

    public DatasetCreateOneResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DatasetCreateOneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DatasetCreateOneResponseBody setNote(DatasetCreateOneResponseBodyNote note) {
        this.note = note;
        return this;
    }
    public DatasetCreateOneResponseBodyNote getNote() {
        return this.note;
    }

    public DatasetCreateOneResponseBody setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public DatasetCreateOneResponseBody setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }
    public String getPublishStatus() {
        return this.publishStatus;
    }

    public DatasetCreateOneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DatasetCreateOneResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DatasetCreateOneResponseBody setTypeId(Long typeId) {
        this.typeId = typeId;
        return this;
    }
    public Long getTypeId() {
        return this.typeId;
    }

    public static class DatasetCreateOneResponseBodyNote extends TeaModel {
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

        public static DatasetCreateOneResponseBodyNote build(java.util.Map<String, ?> map) throws Exception {
            DatasetCreateOneResponseBodyNote self = new DatasetCreateOneResponseBodyNote();
            return TeaModel.build(map, self);
        }

        public DatasetCreateOneResponseBodyNote setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DatasetCreateOneResponseBodyNote setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DatasetCreateOneResponseBodyNote setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DatasetCreateOneResponseBodyNote setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DatasetCreateOneResponseBodyNote setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class PCDatasetCreateOneResponseBodyNote extends TeaModel {
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

        public static PCDatasetCreateOneResponseBodyNote build(java.util.Map<String, ?> map) throws Exception {
            PCDatasetCreateOneResponseBodyNote self = new PCDatasetCreateOneResponseBodyNote();
            return TeaModel.build(map, self);
        }

        public PCDatasetCreateOneResponseBodyNote setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public PCDatasetCreateOneResponseBodyNote setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public PCDatasetCreateOneResponseBodyNote setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public PCDatasetCreateOneResponseBodyNote setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public PCDatasetCreateOneResponseBodyNote setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
