// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdateDictRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("allowCover")
    public Boolean allowCover;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("files")
    public java.util.List<UpdateDictRequestFiles> files;

    /**
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <strong>example:</strong>
     * <p>MAIN</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static UpdateDictRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDictRequest self = new UpdateDictRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDictRequest setAllowCover(Boolean allowCover) {
        this.allowCover = allowCover;
        return this;
    }
    public Boolean getAllowCover() {
        return this.allowCover;
    }

    public UpdateDictRequest setFiles(java.util.List<UpdateDictRequestFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<UpdateDictRequestFiles> getFiles() {
        return this.files;
    }

    public UpdateDictRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdateDictRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateDictRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class UpdateDictRequestFilesOssObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bucket1</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <strong>example:</strong>
         * <p>oss/dic_0.dic</p>
         */
        @NameInMap("key")
        public String key;

        public static UpdateDictRequestFilesOssObject build(java.util.Map<String, ?> map) throws Exception {
            UpdateDictRequestFilesOssObject self = new UpdateDictRequestFilesOssObject();
            return TeaModel.build(map, self);
        }

        public UpdateDictRequestFilesOssObject setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public UpdateDictRequestFilesOssObject setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class UpdateDictRequestFiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dic_0.dic</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("ossObject")
        public UpdateDictRequestFilesOssObject ossObject;

        public static UpdateDictRequestFiles build(java.util.Map<String, ?> map) throws Exception {
            UpdateDictRequestFiles self = new UpdateDictRequestFiles();
            return TeaModel.build(map, self);
        }

        public UpdateDictRequestFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateDictRequestFiles setOssObject(UpdateDictRequestFilesOssObject ossObject) {
            this.ossObject = ossObject;
            return this;
        }
        public UpdateDictRequestFilesOssObject getOssObject() {
            return this.ossObject;
        }

    }

}
