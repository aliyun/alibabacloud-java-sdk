// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PCDatasetCreateOneResponseBody extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("GmtPublished")
    public String gmtPublished;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Note")
    public PCDatasetCreateOneResponseBodyNote note;

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

    public static PCDatasetCreateOneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PCDatasetCreateOneResponseBody self = new PCDatasetCreateOneResponseBody();
        return TeaModel.build(map, self);
    }

    public PCDatasetCreateOneResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public PCDatasetCreateOneResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public PCDatasetCreateOneResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public PCDatasetCreateOneResponseBody setGmtPublished(String gmtPublished) {
        this.gmtPublished = gmtPublished;
        return this;
    }
    public String getGmtPublished() {
        return this.gmtPublished;
    }

    public PCDatasetCreateOneResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PCDatasetCreateOneResponseBody setNote(PCDatasetCreateOneResponseBodyNote note) {
        this.note = note;
        return this;
    }
    public PCDatasetCreateOneResponseBodyNote getNote() {
        return this.note;
    }

    public PCDatasetCreateOneResponseBody setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public PCDatasetCreateOneResponseBody setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }
    public String getPublishStatus() {
        return this.publishStatus;
    }

    public PCDatasetCreateOneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PCDatasetCreateOneResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PCDatasetCreateOneResponseBody setTypeId(Long typeId) {
        this.typeId = typeId;
        return this;
    }
    public Long getTypeId() {
        return this.typeId;
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
