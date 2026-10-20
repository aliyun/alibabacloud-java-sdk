// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddFilesFromAuthorizedOssRequest extends TeaModel {
    /**
     * <p>The ID of the destination category for the imported files. This is the CategoryId returned by the AddCategory operation. You can also obtain the category ID by clicking the ID icon next to the category name on the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a> &gt; Files tab&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> &gt; Files tab. You can set this parameter to default to use the default category created by the system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The category type. This parameter is optional. Default value: UNSTRUCTURED. Valid values:</p>
     * <ul>
     * <li>UNSTRUCTURED: category, used for building knowledge bases.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>This operation does not support importing SESSION_FILE for <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/file-interaction">session interaction</a> in agent applications. Use the <strong>AddFile</strong> operation to upload SESSION_FILE from your local machine.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UNSTRUCTURED</p>
     */
    @NameInMap("CategoryType")
    public String categoryType;

    /**
     * <p>The list of files to import. You can upload up to 10 files at a time.</p>
     * <blockquote>
     * <p>You can upload up to 10 files at a time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileDetails")
    public java.util.List<AddFilesFromAuthorizedOssRequestFileDetails> fileDetails;

    /**
     * <p>The name of the OSS bucket. For more information, see <a href="https://help.aliyun.com/document_detail/177682.html">Buckets</a>. Before you import data from OSS for the first time, you must complete the authorization as prompted in the Model Studio console and add a tag with the key bailian-datahub-access and the value read to the destination bucket. You must also authorize the OSS service-linked role as prompted in the Model Studio console (service name: datahub.sfm.aliyuncs.com).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bucketNamexxxxx</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The region ID of the OSS bucket. For more information about how to obtain the ID, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS regions and endpoints</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("OssRegionId")
    public String ossRegionId;

    /**
     * <p>Specifies whether to overwrite identical files in the category based on the OssKey. Default value: false, which means identical files are not overwritten.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OverWriteFileByOssKey")
    public Boolean overWriteFileByOssKey;

    /**
     * <p>The list of tags associated with the file. Default value: empty, which means the file is not associated with any tags. You can specify up to 10 tags.</p>
     */
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
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-vl-max</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The prompt used when calling Qwen VL parsing.</p>
         * 
         * <strong>example:</strong>
         * <h1>Role</h1>
         * <p>You are a professional image content annotator, skilled at identifying and describing the content in images.</p>
         * <h1>Task objective</h1>
         * <p>Based on the input image, describe the content in the image in detail</p>
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
         * <p>The name of the file to import. Make sure that the file name extension is included.</p>
         * <ul>
         * <li>Supported formats: pdf, docx, doc, txt, md, pptx, ppt, xlsx, xls, html, png, jpg, jpeg, bmp, and gif.</li>
         * <li>The file name must be 4 to 128 characters in length.</li>
         * <li>For more information about the limits on file uploads, see <a href="https://help.aliyun.com/document_detail/2880605.html">Knowledge base quotas and limits</a>.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: If the name of the imported file is the same as the name of an existing file in the knowledge base, the operation still returns SUCCESS for Status, but the file is not actually imported into the knowledge base and the existing file with the same name remains unchanged. Make sure that the name of each imported file is unique.</notice>
         * To add a data table and upload data, use the Alibaba Cloud Model Studio console. This is not supported by the API.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>this_is_temp_xxxx.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The key of the imported file in the OSS bucket. For more information, see <a href="https://help.aliyun.com/document_detail/273129.html">Object naming</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>root/path/this_is_temp_xxxx.pdf</p>
         */
        @NameInMap("OssKey")
        public String ossKey;

        /**
         * <p>The parser type. Valid values:</p>
         * <ul>
         * <li>DOCMIND (Intelligent document parsing)</li>
         * <li>DOCMIND_DIGITAL (Electronic document parsing)</li>
         * <li>DOCMIND_LLM_VERSION (Large model document parsing)</li>
         * <li>DASH_QWEN_VL_PARSER (Qwen VL parsing)</li>
         * <li>DOCMIND_LLM_VERSION_MEDIA (Audio and video parsing)</li>
         * <li>AUTO_SELECT (Automatic parser selection)</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;
         * <note>The uploaded file is parsed by using the specified parser. If you set this parameter to AUTO_SELECT, the parser configured for the category is used.</note></p>
         * <p>&lt;props=&quot;china&quot;&gt;
         * <note>If CategoryType is set to UNSTRUCTURED, the file is parsed based on the data parsing settings of the current category.</note>
         * <note>If CategoryType is set to SESSION_FILE, the system parses the file content by using the default method, which cannot be changed.</note></p>
         * 
         * <strong>example:</strong>
         * <p>AUTO_SELECT</p>
         */
        @NameInMap("Parser")
        public String parser;

        /**
         * <p>The parser configuration. This parameter is required only when the parser type is set to Qwen VL parsing.</p>
         */
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
