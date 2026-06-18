// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddFilesFromAuthorizedOssRequest extends TeaModel {
    /**
     * <p>Specifies the target category for file import. This is the <code>CategoryId</code> returned by the AddCategory operation. You can also obtain the category ID from the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a> - Files tab&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> - Files tab by clicking the ID icon next to the category name. You can also pass in default, which uses the system-created &quot;Default Category&quot;.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>Category type. Optional. The default value is UNSTRUCTURED. Valid values:</p>
     * <ul>
     * <li>UNSTRUCTURED: Category used for building knowledge base scenarios.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>This operation does not support importing SESSION_FILE used for agent application <a href="https://help.aliyun.com/zh/model-studio/user-guide/file-interaction">session interaction</a>. Please use the <strong>AddFile</strong> operation to upload SESSION_FILE from local.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UNSTRUCTURED</p>
     */
    @NameInMap("CategoryType")
    public String categoryType;

    /**
     * <p>The list of files to import. Up to 10 files can be uploaded at a time.</p>
     * <blockquote>
     * <p>Up to 10 files can be uploaded at a time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileDetails")
    public java.util.List<AddFilesFromAuthorizedOssRequestFileDetails> fileDetails;

    /**
     * <p>The OSS Bucket name. For details, see <a href="https://help.aliyun.com/document_detail/177682.html">Buckets</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bucketNamexxxxx</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The region ID of the OSS Bucket. For how to obtain it, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS regions and endpoints</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("OssRegionId")
    public String ossRegionId;

    /**
     * <p>Whether to overwrite the same file in the category by OssKey. The default value is false, meaning no overwrite.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OverWriteFileByOssKey")
    public Boolean overWriteFileByOssKey;

    /**
     * <p>The list of tags associated with the file. The default is empty, meaning the file is not associated with any tags. Up to 10 tags can be passed in.</p>
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
         * <p>Model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-vl-max</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The prompt used when invoking Qwen VL parsing.</p>
         * 
         * <strong>example:</strong>
         * <p>#角色
         * 你是一个专业的图片内容标注人员，擅长识别并描述出图片中的内容。</p>
         * <h1>任务目标</h1>
         * <p>请结合输入图片，详细描述图片中的内容。</p>
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
         * <p>The name of the file to import. Note that the suffix must include the file format type.</p>
         * <ul>
         * <li>Supported formats: pdf, docx, doc, txt, md, pptx, ppt, xlsx, xls, html, png, jpg, jpeg, bmp, gif.</li>
         * <li>The file name length is limited to 4-128 characters.</li>
         * <li>For file upload requirements and limits, see <a href="https://help.aliyun.com/document_detail/2880605.html">Knowledge base quotas and limits</a>.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: When the imported file name duplicates an existing file name in the knowledge base, the operation still returns <code>Status</code> as <code>SUCCESS</code>, but the file will not actually be imported into the knowledge base, and the existing file with the same name remains unchanged. Please ensure that each imported file name is unique.
         * To add a new data table and upload data, please use the Alibaba Cloud Model Studio console; the API does not support this.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>this_is_temp_xxxx.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The key name (Key) of the imported file in the OSS Bucket. For details, see <a href="https://help.aliyun.com/document_detail/273129.html">Object naming</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>root/path/this_is_temp_xxxx.pdf</p>
         */
        @NameInMap("OssKey")
        public String ossKey;

        /**
         * <p>Parser type. Possible values include:</p>
         * <ul>
         * <li>DOCMIND (Intelligent document parsing)</li>
         * <li>DOCMIND_DIGITAL (Digital document parsing)</li>
         * <li>DOCMIND_LLM_VERSION (LLM-based document parsing)</li>
         * <li>DASH_QWEN_VL_PARSER (Qwen VL parsing)</li>
         * <li>DOCMIND_LLM_VERSION_MEDIA (Audio/video parsing)</li>
         * <li>AUTO_SELECT (Automatically select parser)</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;
         * <note>The currently configured parser will be used to parse your uploaded files. If AUTO_SELECT is entered, the parser configured for the corresponding category will be used.</note></p>
         * <p>&lt;props=&quot;china&quot;&gt;
         * <note>When CategoryType is UNSTRUCTURED, the parser parses your uploaded files according to the data parsing settings of the current category.</note>
         * <note>When CategoryType is SESSION_FILE, the system uses the default method (not changeable) to parse file content.</note></p>
         * 
         * <strong>example:</strong>
         * <p>AUTO_SELECT</p>
         */
        @NameInMap("Parser")
        public String parser;

        /**
         * <p>Parser configuration. Required only when the parser type is set to Qwen VL parsing.</p>
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
