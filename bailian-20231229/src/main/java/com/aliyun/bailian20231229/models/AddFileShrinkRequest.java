// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddFileShrinkRequest extends TeaModel {
    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p>When CategoryType is set to UNSTRUCTURED, set this parameter to the category ID of the uploaded file, which is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> operation. You can also go to <a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>, click the File tab, and then click the ID icon next to the category name to obtain the category ID. You can set this parameter to default to use the system-created default category.</p>
     * </li>
     * <li><p>When CategoryType is set to SESSION_FILE, set this parameter to &quot;default&quot;.</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>Set this parameter to the category ID of the uploaded file, which is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> operation. You can also go to <a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>, click the File tab, and then click the ID icon next to the category name to obtain the category ID. You can set this parameter to default to use the system-created default category.</p>
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
     * <li>UNSTRUCTURED: category used for building knowledge base scenarios.</li>
     * </ul>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>SESSION_FILE: file used for <a href="https://www.alibabacloud.com/help/en/model-studio/user-guide/file-interaction">session interaction</a> in agent applications.
     * <note>When using <code>SESSION_FILE</code>, set the CategoryType parameter to <code>SESSION_FILE</code> when calling the ApplyFileUploadLease operation as well.</note>
     * <note>The file is valid only for the current user session. After the user closes the session, the file expires. The maximum validity period is 7 days. Long-term storage is not supported.</note></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UNSTRUCTURED</p>
     */
    @NameInMap("CategoryType")
    public String categoryType;

    /**
     * <p>The upload lease ID, which corresponds to the <code>FileUploadLeaseId</code> returned by the <strong>ApplyFileUploadLease</strong> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68abd1dea7b6404d8f7d7b9f7fbd332d.17166xxxxxxxx</p>
     */
    @NameInMap("LeaseId")
    public String leaseId;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>Specifies a URL for the file. The system records this URL when building a <a href="https://help.aliyun.com/document_detail/2807740.html">document search knowledge base</a>. When you use the Alibaba Cloud Model Studio console to interact with an <a href="https://help.aliyun.com/document_detail/2842749.html">agent application</a>, this URL is returned with the retrieval results of the file through the <code>docUrl</code> field.</p>
     * <blockquote>
     * <p>The agent application must have <strong>Knowledge Base</strong> enabled and the <strong>Show answer sources</strong> feature turned on. Otherwise, this parameter does not take effect.</p>
     * </blockquote>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>Specifies a URL for the file. The system records this URL when building a <a href="https://help.aliyun.com/document_detail/2807740.html">document search knowledge base</a>. When you use the Alibaba Cloud Model Studio console to interact with an <a href="https://help.aliyun.com/document_detail/2842749.html">agent application</a>, this URL is returned with the retrieval results of the file through the <code>docUrl</code> field.</p>
     * <blockquote>
     * <p>The agent application must have <strong>Knowledge Base</strong> enabled and the <strong>Show answer sources</strong> feature turned on. Otherwise, this parameter does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.test.com/111.docx">www.test.com/111.docx</a></p>
     */
    @NameInMap("OriginalFileUrl")
    public String originalFileUrl;

    /**
     * <p>The parser type. Valid values:</p>
     * <ul>
     * <li>DOCMIND: intelligent document parsing</li>
     * <li>DOCMIND_DIGITAL: electronic document parsing</li>
     * <li>DOCMIND_LLM_VERSION: large language model document parsing</li>
     * <li>DASH_QWEN_VL_PARSER: Qwen VL parsing</li>
     * <li>DOCMIND_LLM_VERSION_MEDIA: audio and video parsing</li>
     * <li>AUTO_SELECT: automatic parser selection</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;
     * <note>The uploaded file is parsed by using the currently specified parser. If you set this parameter to AUTO_SELECT, the parser configured for the category is used.</note></p>
     * <p>&lt;props=&quot;china&quot;&gt;
     * <note>When CategoryType is set to UNSTRUCTURED, the parser parses the uploaded file based on the data parsing settings of the current category.</note>
     * <note>When CategoryType is set to SESSION_FILE, the system parses the file content by using the default method, which cannot be changed.</note></p>
     * <p>This parameter is required.</p>
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
    public String parserConfigShrink;

    /**
     * <ul>
     * <li>The list of tags associated with the file. You can specify up to 100 tags, and the total character length of all tags cannot exceed 700.</li>
     * <li>Default value: empty, which means no tags are set.</li>
     * </ul>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static AddFileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFileShrinkRequest self = new AddFileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddFileShrinkRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public AddFileShrinkRequest setCategoryType(String categoryType) {
        this.categoryType = categoryType;
        return this;
    }
    public String getCategoryType() {
        return this.categoryType;
    }

    public AddFileShrinkRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public AddFileShrinkRequest setOriginalFileUrl(String originalFileUrl) {
        this.originalFileUrl = originalFileUrl;
        return this;
    }
    public String getOriginalFileUrl() {
        return this.originalFileUrl;
    }

    public AddFileShrinkRequest setParser(String parser) {
        this.parser = parser;
        return this;
    }
    public String getParser() {
        return this.parser;
    }

    public AddFileShrinkRequest setParserConfigShrink(String parserConfigShrink) {
        this.parserConfigShrink = parserConfigShrink;
        return this;
    }
    public String getParserConfigShrink() {
        return this.parserConfigShrink;
    }

    public AddFileShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
