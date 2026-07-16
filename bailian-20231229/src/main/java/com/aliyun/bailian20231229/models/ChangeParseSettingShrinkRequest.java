// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ChangeParseSettingShrinkRequest extends TeaModel {
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
