// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddFilesFromAuthorizedOssRequest extends TeaModel {
    /**
     * <p>The ID of the category to which the files are imported. This is the <code>CategoryId</code> returned by the AddCategory operation. You can also obtain the category ID by clicking the ID icon next to the category name on the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a> - Files tab&lt;props=&quot;intl&quot;&gt;<a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> - Files tab. You can pass in <code>default</code> to use the system-created default category.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The category type. Optional. Default value: UNSTRUCTURED. Valid values:</p>
     * <ul>
     * <li>UNSTRUCTURED: category for building knowledge base scenarios.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>This operation does not support importing SESSION_FILE for agent application <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/file-interaction">conversation interaction</a>. Use the <strong>AddFile</strong> operation to upload SESSION_FILE from a local source.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UNSTRUCTURED</p>
     */
    @NameInMap("CategoryType")
    public String categoryType;

    /**
     * <p>The list of files to import. A maximum of 10 files can be uploaded at a time.</p>
     * <blockquote>
     * <p>A maximum of 10 files can be uploaded at a time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileDetails")
    public java.util.List<AddFilesFromAuthorizedOssRequestFileDetails> fileDetails;

    /**
     * <p>The name of the OSS bucket. For more information, see <a href="https://help.aliyun.com/document_detail/177682.html">Buckets</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bucketNamexxxxx</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The region ID of the OSS bucket. For more information, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS regions and endpoints</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("OssRegionId")
    public String ossRegionId;

    /**
     * <p>Specifies whether to overwrite files with the same OssKey in the category. Default value: false, which means files are not overwritten.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OverWriteFileByOssKey")
    public Boolean overWriteFileByOssKey;

    /**
     * <p>The list of tags associated with the file. Default value: empty, which means the file is not associated with any tags. A maximum of 10 tags can be specified.</p>
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
         * <p>The name of the file to import. The file name must include the file format extension.</p>
         * <ul>
         * <li>Supported formats: pdf, docx, doc, txt, md, pptx, ppt, xlsx, xls, html, png, jpg, jpeg, bmp, and gif.</li>
         * <li>The file name must be 4 to 128 characters in length.</li>
         * <li>For file upload requirements and limits, see <a href="https://help.aliyun.com/document_detail/2880605.html">Knowledge base quotas and limits</a>.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: If the name of the imported file is the same as an existing file in the knowledge base, the operation still returns a <code>Status</code> of <code>SUCCESS</code>, but the file is not actually imported. The existing file with the same name remains unchanged. Make sure that each imported file name is unique.
         * To create a data table and upload data, use the Model Studio console. This is not supported through the API.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>this_is_temp_xxxx.pdf</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The key of the file in the OSS bucket. For more information, see <a href="https://help.aliyun.com/document_detail/273129.html">Object naming conventions</a>.</p>
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
         * <li>DOCMIND: intelligent document parsing.</li>
         * <li>DOCMIND_DIGITAL: electronic document parsing.</li>
         * <li>DOCMIND_LLM_VERSION: LLM-based document parsing.</li>
         * <li>DASH_QWEN_VL_PARSER: Qwen VL parsing.</li>
         * <li>DOCMIND_LLM_VERSION_MEDIA: audio and video parsing.</li>
         * <li>AUTO_SELECT: automatic parser selection.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;
         * <note>The uploaded file is parsed by using the specified parser. If you set this parameter to AUTO_SELECT, the parser configured for the category is used.</note></p>
         * <p>&lt;props=&quot;china&quot;&gt;
         * <note>When CategoryType is UNSTRUCTURED, the parser parses the uploaded file based on the data parsing settings of the current category.</note>
         * <note>When CategoryType is SESSION_FILE, the system uses the default method (which cannot be changed) to parse the file content.</note></p>
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
