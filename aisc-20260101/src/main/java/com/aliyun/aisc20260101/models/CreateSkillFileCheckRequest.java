// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class CreateSkillFileCheckRequest extends TeaModel {
    /**
     * <p>The file information.</p>
     */
    @NameInMap("Files")
    public java.util.List<CreateSkillFileCheckRequestFiles> files;

    public static CreateSkillFileCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSkillFileCheckRequest self = new CreateSkillFileCheckRequest();
        return TeaModel.build(map, self);
    }

    public CreateSkillFileCheckRequest setFiles(java.util.List<CreateSkillFileCheckRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<CreateSkillFileCheckRequestFiles> getFiles() {
        return this.files;
    }

    public static class CreateSkillFileCheckRequestFiles extends TeaModel {
        /**
         * <p>The public URL for downloading the file. The downloaded file must be a compressed package in tar.gz or zip format.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-hangzhou.aliyuncs.com/xxxx">https://test.oss-cn-hangzhou.aliyuncs.com/xxxx</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The file name. If this parameter is not specified, the file name is parsed from DownloadUrl.</p>
         * 
         * <strong>example:</strong>
         * <p>test-file</p>
         */
        @NameInMap("FileName")
        public String fileName;

        public static CreateSkillFileCheckRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            CreateSkillFileCheckRequestFiles self = new CreateSkillFileCheckRequestFiles();
            return TeaModel.build(map, self);
        }

        public CreateSkillFileCheckRequestFiles setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public CreateSkillFileCheckRequestFiles setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
