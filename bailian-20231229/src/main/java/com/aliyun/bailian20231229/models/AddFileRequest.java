// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddFileRequest extends TeaModel {
    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p>If <code>CategoryType</code> is set to <code>UNSTRUCTURED</code>, you must specify the ID of the category to which the file belongs. This is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> API. You can also obtain the category ID by navigating to the \<em>\<em>Application data\</em>\</em> &gt; \<em>\<em>Files\</em>\</em> tab and clicking the ID icon next to the category name. You can specify <code>default</code> to use the default category.</p>
     * </li>
     * <li><p>If <code>CategoryType</code> is set to <code>SESSION_FILE</code>, specify <code>default</code>.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>The ID of the category to which the file belongs. This is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> API. You can also obtain the category ID by navigating to the \<em>\<em>Application data\</em>\</em> &gt; \<em>\<em>Files\</em>\</em> tab and clicking the ID icon next to the category name. You can specify <code>default</code> to use the default category.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The type of category. This parameter is optional. Default value: <code>UNSTRUCTURED</code>. Valid values:</p>
     * <ul>
     * <li><code>UNSTRUCTURED</code>: A category used for building a knowledge base.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><code>SESSION_FILE</code>: A file used for interactions within an agent <a href="https://help.aliyun.com/zh/model-studio/user-guide/file-interaction">session</a>.<blockquote>
     * <p>If you set this parameter to <code>SESSION_FILE</code>, you must also set the <code>CategoryType</code> parameter to <code>SESSION_FILE</code> when you call the ApplyFileUploadLease API.
     * Files of this type are valid only for the current session and expire after the session is closed, with a maximum validity of 7 days. These files are not intended for long-term storage.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UNSTRUCTURED</p>
     */
    @NameInMap("CategoryType")
    public String categoryType;

    /**
     * <p>The upload lease ID. This value maps to the <code>FileUploadLeaseId</code> returned by the <strong>ApplyFileUploadLease</strong> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68abd1dea7b6404d8f7d7b9f7fbd332d.17166xxxxxxxx</p>
     */
    @NameInMap("LeaseId")
    public String leaseId;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The URL of the file. The system records this link when building a <a href="https://help.aliyun.com/document_detail/2807740.html">document retrieval-based knowledge base</a>. When you interact with an <a href="https://help.aliyun.com/document_detail/2842749.html">agent</a> in the Alibaba Cloud Model Studio console, this URL is returned with the retrieval results for the file in the <code>docUrl</code> field.</p>
     * <blockquote>
     * <p>For this parameter to take effect, the <strong>knowledge base</strong> feature must be enabled for the agent, and the <strong>display the source of the answer</strong> option must be enabled.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>The URL of the file. The system records this link when building a <a href="https://help.aliyun.com/document_detail/2807740.html">document retrieval-based knowledge base</a>. When you interact with an <a href="https://help.aliyun.com/document_detail/2842749.html">agent</a> in the Alibaba Cloud Model Studio console, this URL is returned with the retrieval results for the file in the <code>docUrl</code> field.</p>
     * <blockquote>
     * <p>For this parameter to take effect, the <strong>knowledge base</strong> feature must be enabled for the agent, and the <strong>display the source of the answer</strong> option must be enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.test.com/111.docx">www.test.com/111.docx</a></p>
     */
    @NameInMap("OriginalFileUrl")
    public String originalFileUrl;

    /**
     * <p>The type of parser. Valid values:</p>
     * <ul>
     * <li><p>DOCMIND: Intelligent Document Parsing</p>
     * </li>
     * <li><p>DOCMIND_DIGITAL: Digital Document Parsing</p>
     * </li>
     * <li><p>DOCMIND_LLM_VERSION: Large Language Model-based Document Parsing</p>
     * </li>
     * <li><p>DASH_QWEN_VL_PARSER: Qwen-VL Parsing</p>
     * </li>
     * <li><p>DOCMIND_LLM_VERSION_MEDIA: Audio and Video Parsing</p>
     * </li>
     * <li><p>AUTO_SELECT: Automatic Parser Selection</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <blockquote>
     * <p>The system uses the specified parser to parse the uploaded file. If you set this parameter to <code>AUTO_SELECT</code>, the parser configured for the category is used.</p>
     * </blockquote>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>If <code>CategoryType</code> is set to <code>UNSTRUCTURED</code>, the parser parses your uploaded file based on the category’s data parsing settings.
     * If <code>CategoryType</code> is set to <code>SESSION_FILE</code>, the system uses a default parsing method that cannot be changed.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO_SELECT</p>
     */
    @NameInMap("Parser")
    public String parser;

    /**
     * <p>The parser configuration. This parameter is required only if you set <code>Parser</code> to <code>DASH_QWEN_VL_PARSER</code>.</p>
     */
    @NameInMap("ParserConfig")
    public AddFileRequestParserConfig parserConfig;

    /**
     * <ul>
     * <li><p>A list of tags for the file. You can specify up to 100 tags. The total length of all tags cannot exceed 700 characters.</p>
     * </li>
     * <li><p>If this parameter is not specified, no tags are added.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static AddFileRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFileRequest self = new AddFileRequest();
        return TeaModel.build(map, self);
    }

    public AddFileRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public AddFileRequest setCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public String getCategoryType() {
        return this.categoryType;
    }

    public AddFileRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public AddFileRequest setOriginalFileUrl(String originalFileUrl) {
        this.originalFileUrl = originalFileUrl;
        return this;
    }
    public String getOriginalFileUrl() {
        return this.originalFileUrl;
    }

    public AddFileRequest setParser(String parser) {
        this.parser = parser;
        return this;
    }
    public String getParser() {
        return this.parser;
    }

    public AddFileRequest setParserConfig(AddFileRequestParserConfig parserConfig) {
        this.parserConfig = parserConfig;
        return this;
    }
    public AddFileRequestParserConfig getParserConfig() {
        return this.parserConfig;
    }

    public AddFileRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public static class AddFileRequestParserConfig extends TeaModel {
        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-vl-max</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The prompt to use when calling the Qwen-VL parser.</p>
         * 
         * <strong>example:</strong>
         * <p>#角色
         * 你是一个专业的图片内容标注人员，擅长识别并描述出图片中的内容。</p>
         * <h1>任务目标</h1>
         * <p>请结合输入图片，详细描述图片中的内容。</p>
         */
        @NameInMap("ModelPrompt")
        public String modelPrompt;

        public static AddFileRequestParserConfig build(java.util.Map<String, ?> map) throws Exception {
            AddFileRequestParserConfig self = new AddFileRequestParserConfig();
            return TeaModel.build(map, self);
        }

        public AddFileRequestParserConfig setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public AddFileRequestParserConfig setModelPrompt(String modelPrompt) {
            this.modelPrompt = modelPrompt;
            return this;
        }
        public String getModelPrompt() {
            return this.modelPrompt;
        }

    }

}
