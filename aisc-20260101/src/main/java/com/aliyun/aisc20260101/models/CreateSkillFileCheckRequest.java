// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class CreateSkillFileCheckRequest extends TeaModel {
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
        @NameInMap("DownloadUrl")
        public String downloadUrl;

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
