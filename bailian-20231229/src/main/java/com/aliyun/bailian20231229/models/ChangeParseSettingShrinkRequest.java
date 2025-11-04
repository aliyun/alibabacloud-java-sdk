// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ChangeParseSettingShrinkRequest extends TeaModel {
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
    public String parserConfigShrink;

    public static ChangeParseSettingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeParseSettingShrinkRequest self = new ChangeParseSettingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChangeParseSettingShrinkRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public ChangeParseSettingShrinkRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public ChangeParseSettingShrinkRequest setParser(String parser) {
        this.parser = parser;
        return this;
    }
    public String getParser() {
        return this.parser;
    }

    public ChangeParseSettingShrinkRequest setParserConfigShrink(String parserConfigShrink) {
        this.parserConfigShrink = parserConfigShrink;
        return this;
    }
    public String getParserConfigShrink() {
        return this.parserConfigShrink;
    }

}
