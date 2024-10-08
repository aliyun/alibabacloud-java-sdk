// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GeneratePictureUploadSignRequest extends TeaModel {
    @NameInMap("files")
    public java.util.List<GeneratePictureUploadSignRequestFiles> files;

    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("instanceId")
    public Long instanceId;

    /**
     * <strong>example:</strong>
     * <p>INCIDENT 事件 ALERT告警 PROBLEM故障</p>
     */
    @NameInMap("instanceType")
    public String instanceType;

    public static GeneratePictureUploadSignRequest build(java.util.Map<String, ?> map) throws Exception {
        GeneratePictureUploadSignRequest self = new GeneratePictureUploadSignRequest();
        return TeaModel.build(map, self);
    }

    public GeneratePictureUploadSignRequest setFiles(java.util.List<GeneratePictureUploadSignRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<GeneratePictureUploadSignRequestFiles> getFiles() {
        return this.files;
    }

    public GeneratePictureUploadSignRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public GeneratePictureUploadSignRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public static class GeneratePictureUploadSignRequestFiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>文件A</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("fileSize")
        public Long fileSize;

        /**
         * <strong>example:</strong>
         * <p>JPG</p>
         */
        @NameInMap("fileType")
        public String fileType;

        public static GeneratePictureUploadSignRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            GeneratePictureUploadSignRequestFiles self = new GeneratePictureUploadSignRequestFiles();
            return TeaModel.build(map, self);
        }

        public GeneratePictureUploadSignRequestFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GeneratePictureUploadSignRequestFiles setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GeneratePictureUploadSignRequestFiles setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

    }

}
