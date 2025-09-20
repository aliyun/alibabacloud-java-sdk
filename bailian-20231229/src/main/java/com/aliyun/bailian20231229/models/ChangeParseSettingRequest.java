// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ChangeParseSettingRequest extends TeaModel {
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
     * <p>pdf</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DOCMIND</p>
     */
    @NameInMap("Parser")
    public String parser;

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
         * <strong>example:</strong>
         * <p>qwen-vl-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

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
