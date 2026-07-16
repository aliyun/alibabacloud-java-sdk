// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ChangeParseSettingRequest extends TeaModel {
    /**
     * <p>The category ID, which is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> operation. You can also obtain it by clicking the ID icon next to the category name on the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a> - Files tab&lt;props=&quot;intl&quot;&gt;<a href="https://bailian.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> - Unstructured Data tab.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The file type (extension). Valid values:</p>
     * <ul>
     * <li>doc</li>
     * <li>docx</li>
     * <li>ppt</li>
     * <li>pptx</li>
     * <li>xls</li>
     * <li>xlsx</li>
     * <li>md</li>
     * <li>txt</li>
     * <li>pdf</li>
     * <li>png</li>
     * <li>jpg</li>
     * <li>jpeg</li>
     * <li>bmp</li>
     * <li>gif</li>
     * <li>html</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pdf</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The parser identifier code. Different parsers are applicable to different scenarios. For more information, see &quot;Knowledge Base&quot;. Valid values:</p>
     * <ul>
     * <li>DOCMIND (Intelligent Document Parsing)</li>
     * <li>DOCMIND_DIGITAL (Electronic Document Parsing)</li>
     * <li>DOCMIND_LLM_VERSION (Large Model Document Parsing)</li>
     * <li>DASH_QWEN_VL_PARSER (Qwen VL Parsing)</li>
     * <li>DOCMIND_LLM_VERSION_MEDIA (Audio/Video Parsing)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DOCMIND</p>
     */
    @NameInMap("Parser")
    public String parser;

    /**
     * <p>The parser configuration. This parameter is required only when the parser is set to Qwen VL Parsing.</p>
     */
    @NameInMap("ParserConfig")
    public ChangeParseSettingRequestParserConfig parserConfig;

    public static ChangeParseSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeParseSettingRequest self = new ChangeParseSettingRequest();
        return TeaModel.build(map, self);
    }

    public ChangeParseSettingRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public ChangeParseSettingRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public ChangeParseSettingRequest setParser(String parser) {
        this.parser = parser;
        return this;
    }
    public String getParser() {
        return this.parser;
    }

    public ChangeParseSettingRequest setParserConfig(ChangeParseSettingRequestParserConfig parserConfig) {
        this.parserConfig = parserConfig;
        return this;
    }
    public ChangeParseSettingRequestParserConfig getParserConfig() {
        return this.parserConfig;
    }

    public static class ChangeParseSettingRequestParserConfig extends TeaModel {
        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-vl-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The prompt used when calling Qwen VL Parsing.</p>
         * 
         * <strong>example:</strong>
         * <p>#角色
         * 你是一个专业的图片内容标注人员，擅长识别并描述出图片中的内容。</p>
         * <h1>任务目标</h1>
         * <p>请结合输入图片，详细描述图片中的内容。</p>
         */
        @NameInMap("modelPrompt")
        public String modelPrompt;

        public static ChangeParseSettingRequestParserConfig build(java.util.Map<String, ?> map) throws Exception {
            ChangeParseSettingRequestParserConfig self = new ChangeParseSettingRequestParserConfig();
            return TeaModel.build(map, self);
        }

        public ChangeParseSettingRequestParserConfig setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ChangeParseSettingRequestParserConfig setModelPrompt(String modelPrompt) {
            this.modelPrompt = modelPrompt;
            return this;
        }
        public String getModelPrompt() {
            return this.modelPrompt;
        }

    }

}
