// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateUploadOSSFileJobRequest extends TeaModel {
    @NameInMap("FileSource")
    public String fileSource;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("UploadType")
    public String uploadType;

    @NameInMap("UploadTarget")
    public CreateUploadOSSFileJobRequestUploadTarget uploadTarget;

    @NameInMap("Tid")
    public Long tid;

    public static CreateUploadOSSFileJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadOSSFileJobRequest self = new CreateUploadOSSFileJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadOSSFileJobRequest setFileSource(String fileSource) {
        this.fileSource = fileSource;
        return this;
    }
    public String getFileSource() {
        return this.fileSource;
    }

    public CreateUploadOSSFileJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateUploadOSSFileJobRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

    public CreateUploadOSSFileJobRequest setUploadTarget(CreateUploadOSSFileJobRequestUploadTarget uploadTarget) {
        this.uploadTarget = uploadTarget;
        return this;
    }
    public CreateUploadOSSFileJobRequestUploadTarget getUploadTarget() {
        return this.uploadTarget;
    }

    public CreateUploadOSSFileJobRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class CreateUploadOSSFileJobRequestUploadTarget extends TeaModel {
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("ObjectName")
        public String objectName;

        public static CreateUploadOSSFileJobRequestUploadTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateUploadOSSFileJobRequestUploadTarget self = new CreateUploadOSSFileJobRequestUploadTarget();
            return TeaModel.build(map, self);
        }

        public CreateUploadOSSFileJobRequestUploadTarget setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateUploadOSSFileJobRequestUploadTarget setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public CreateUploadOSSFileJobRequestUploadTarget setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

    }

}
