// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ChangeParseSettingShrinkRequest extends TeaModel {
    /**
     * <p>The category ID. This is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> operation. You can also obtain the ID from the &lt;props=&quot;china&quot;&gt;<a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a> - File tab&lt;props=&quot;intl&quot;&gt;<a href="https://bailian.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> - Unstructured Data tab by clicking the ID icon next to the category name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The file type, specified by its extension. Valid values:</p>
     * <ul>
     * <li><p>doc</p>
     * </li>
     * <li><p>docx</p>
     * </li>
     * <li><p>ppt</p>
     * </li>
     * <li><p>pptx</p>
     * </li>
     * <li><p>xls</p>
     * </li>
     * <li><p>xlsx</p>
     * </li>
     * <li><p>md</p>
     * </li>
     * <li><p>txt</p>
     * </li>
     * <li><p>pdf</p>
     * </li>
     * <li><p>png</p>
     * </li>
     * <li><p>jpg</p>
     * </li>
     * <li><p>jpeg</p>
     * </li>
     * <li><p>bmp</p>
     * </li>
     * <li><p>gif</p>
     * </li>
     * <li><p>html</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pdf</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The identifier for the parser. Different parsers are suitable for different scenarios. For more information, refer to the knowledge base. Valid values:</p>
     * <ul>
     * <li><p>DOCMIND (intelligent document parsing)</p>
     * </li>
     * <li><p>DOCMIND_DIGITAL (digital document parsing)</p>
     * </li>
     * <li><p>DOCMIND_LLM_VERSION (LLM-based document parsing)</p>
     * </li>
     * <li><p>DASH_QWEN_VL_PARSER (Qwen VL Parser)</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DOCMIND</p>
     */
    @NameInMap("Parser")
    public String parser;

    /**
     * <p>The parser configuration. This parameter is required only when the <code>Parser</code> parameter is set to <code>DASH_QWEN_VL_PARSER</code>.</p>
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
