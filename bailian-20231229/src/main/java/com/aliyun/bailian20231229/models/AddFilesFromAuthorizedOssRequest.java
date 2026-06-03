// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddFilesFromAuthorizedOssRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UNSTRUCTURED</p>
     */
    @NameInMap("CategoryType")
    public String categoryType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileDetails")
    public java.util.List<AddFilesFromAuthorizedOssRequestFileDetails> fileDetails;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bucketNamexxxxx</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("OssRegionId")
    public String ossRegionId;

    @NameInMap("OverWriteFileByOssKey")
    public Boolean overWriteFileByOssKey;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static AddFilesFromAuthorizedOssRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFilesFromAuthorizedOssRequest self = new AddFilesFromAuthorizedOssRequest();
        return TeaModel.build(map, self);
    }

    public AddFilesFromAuthorizedOssRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public AddFilesFromAuthorizedOssRequest setCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public String getCategoryType() {
        return this.categoryType;
    }

    public AddFilesFromAuthorizedOssRequest setFileDetails(java.util.List<AddFilesFromAuthorizedOssRequestFileDetails> fileDetails) {
        this.fileDetails = fileDetails;
        return this;
    }
    public java.util.List<AddFilesFromAuthorizedOssRequestFileDetails> getFileDetails() {
        return this.fileDetails;
    }

    public AddFilesFromAuthorizedOssRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public AddFilesFromAuthorizedOssRequest setOssRegionId(String ossRegionId) {
        this.ossRegionId = ossRegionId;
        return this;
    }
    public String getOssRegionId() {
        return this.ossRegionId;
    }

    public AddFilesFromAuthorizedOssRequest setOverWriteFileByOssKey(Boolean overWriteFileByOssKey) {
        this.overWriteFileByOssKey = overWriteFileByOssKey;
        return this;
    }
    public Boolean getOverWriteFileByOssKey() {
        return this.overWriteFileByOssKey;
    }

    public AddFilesFromAuthorizedOssRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public static class AddFilesFromAuthorizedOssRequestFileDetailsParserConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>qwen-vl-max</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>#角色 你是一个专业的图片内容标注人员，擅长识别并描述出图片中的内容。 # 任务目标 请结合输入图片，详细描述图片中的内容。</p>
         */
        @NameInMap("ModelPrompt")
        public String modelPrompt;

        public static AddFilesFromAuthorizedOssRequestFileDetailsParserConfig build(java.util.Map<String, ?> map) throws Exception {
            AddFilesFromAuthorizedOssRequestFileDetailsParserConfig self = new AddFilesFromAuthorizedOssRequestFileDetailsParserConfig();
            return TeaModel.build(map, self);
        }

        public AddFilesFromAuthorizedOssRequestFileDetailsParserConfig setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public AddFilesFromAuthorizedOssRequestFileDetailsParserConfig setModelPrompt(String modelPrompt) {
            this.modelPrompt = modelPrompt;
            return this;
        }
        public String getModelPrompt() {
            return this.modelPrompt;
        }

    }

    public static class AddFilesFromAuthorizedOssRequestFileDetails extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>this_is_temp_xxxx.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>root/path/this_is_temp_xxxx.pdf</p>
         */
        @NameInMap("OssKey")
        public String ossKey;

        /**
         * <strong>example:</strong>
         * <p>AUTO_SELECT</p>
         */
        @NameInMap("Parser")
        public String parser;

        @NameInMap("ParserConfig")
        public AddFilesFromAuthorizedOssRequestFileDetailsParserConfig parserConfig;

        public static AddFilesFromAuthorizedOssRequestFileDetails build(java.util.Map<String, ?> map) throws Exception {
            AddFilesFromAuthorizedOssRequestFileDetails self = new AddFilesFromAuthorizedOssRequestFileDetails();
            return TeaModel.build(map, self);
        }

        public AddFilesFromAuthorizedOssRequestFileDetails setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public AddFilesFromAuthorizedOssRequestFileDetails setOssKey(String ossKey) {
            this.ossKey = ossKey;
            return this;
        }
        public String getOssKey() {
            return this.ossKey;
        }

        public AddFilesFromAuthorizedOssRequestFileDetails setParser(String parser) {
            this.parser = parser;
            return this;
        }
        public String getParser() {
            return this.parser;
        }

        public AddFilesFromAuthorizedOssRequestFileDetails setParserConfig(AddFilesFromAuthorizedOssRequestFileDetailsParserConfig parserConfig) {
            this.parserConfig = parserConfig;
            return this;
        }
        public AddFilesFromAuthorizedOssRequestFileDetailsParserConfig getParserConfig() {
            return this.parserConfig;
        }

    }

}
