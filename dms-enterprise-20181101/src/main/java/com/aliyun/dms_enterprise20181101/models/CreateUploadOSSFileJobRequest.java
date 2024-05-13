// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateUploadOSSFileJobRequest extends TeaModel {
    /**
     * <p>The name of the file.</p>
     * <br>
     * <p>> The file name must end with .txt or .sql. For example, the file name can be text.txt.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The purpose of the file upload task. Valid values:</p>
     * <br>
     * <p>*   **datacorrect**: The file is uploaded to change data.</p>
     * <p>*   **order_info_attachment**: The file is uploaded as an attachment in a ticket.</p>
     * <p>*   **big-file**: The file is uploaded to import multiple data records at a time.</p>
     * <p>*   **sqlreview**: The file is uploaded for SQL review.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSource")
    public String fileSource;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](https://help.aliyun.com/document_detail/181330.html) topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The information about the OSS file to be uploaded.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UploadTarget")
    public CreateUploadOSSFileJobRequestUploadTarget uploadTarget;

    public static CreateUploadOSSFileJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadOSSFileJobRequest self = new CreateUploadOSSFileJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateUploadOSSFileJobRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateUploadOSSFileJobRequest setFileSource(String fileSource) {
        this.fileSource = fileSource;
        return this;
    }
    public String getFileSource() {
        return this.fileSource;
    }

    public CreateUploadOSSFileJobRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public CreateUploadOSSFileJobRequest setUploadTarget(CreateUploadOSSFileJobRequestUploadTarget uploadTarget) {
        this.uploadTarget = uploadTarget;
        return this;
    }
    public CreateUploadOSSFileJobRequestUploadTarget getUploadTarget() {
        return this.uploadTarget;
    }

    public static class CreateUploadOSSFileJobRequestUploadTarget extends TeaModel {
        /**
         * <p>The name of the OSS bucket.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The endpoint of the OSS bucket.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The name of the OSS object.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        public static CreateUploadOSSFileJobRequestUploadTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateUploadOSSFileJobRequestUploadTarget self = new CreateUploadOSSFileJobRequestUploadTarget();
            return TeaModel.build(map, self);
        }

        public CreateUploadOSSFileJobRequestUploadTarget setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public CreateUploadOSSFileJobRequestUploadTarget setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
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
