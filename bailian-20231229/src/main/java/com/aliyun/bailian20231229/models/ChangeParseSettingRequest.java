// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ChangeParseSettingRequest extends TeaModel {
    /**
     * <p>The category ID, which is the <code>CategoryId</code> returned by <strong>AddCategory</strong>. To view the category ID, click the ID icon next to the category name on the Unstructured Data tab of the <a href="https://bailian.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The file type. Valid values: pdf, docx, and doc.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pdf</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The parser code. Valid values:</p>
     * <ul>
     * <li>DOCMIND (Intelligent parsing)</li>
     * <li>DOCMIND_DIGITAL (Digital parsing)</li>
     * <li>DOCMIND_LLM_VERSION (LLM parsing)</li>
     * <li>DASH_QWEN_VL_PARSER (Qwen VL parsing)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DOCMIND</p>
     */
    @NameInMap("Parser")
    public String parser;

    /**
     * <p>The parser configuration. Currently, this is available only for Qwen VL parsing.</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li>qwen-vl-max</li>
         * <li>qwen-vl-plus</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>qwen-vl-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The prompt used for parsing.</p>
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
