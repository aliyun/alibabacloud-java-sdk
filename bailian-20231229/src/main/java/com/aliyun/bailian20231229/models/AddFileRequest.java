// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddFileRequest extends TeaModel {
    /**
     * <p>The primary key ID of the category to which the document is uploaded. This parameter corresponds to the <code>CategoryId</code>&lt;props=&quot;china&quot;&gt; returned by the <a href="https://www.alibabacloud.com/help/zh/model-studio/developer-reference/api-bailian-2023-12-29-addcategory">AddCategory</a> operation. You can also click the ID icon next to the category name on the Unstructured Data tab of the <a href="https://bailian.console.alibabacloud.com/#/data-center">Data Management</a> page to view the ID. You can set the parameter to default, which specifies the Default Category created by the system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3510024405</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    @NameInMap("CategoryType")
    public String categoryType;

    /**
     * <p>The lease ID, which corresponds to the <code>FileUploadLeaseId</code> parameter returned by the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-applyfileuploadlease">ApplyFileUploadLease</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68abd1dea7b6404d8f7d7b9f7fbd332d.1716698936847</p>
     */
    @NameInMap("LeaseId")
    public String leaseId;

    @NameInMap("OriginalFileUrl")
    public String originalFileUrl;

    /**
     * <p>The parser. Valid value:</p>
     * <ul>
     * <li>DASHSCOPE_DOCMIND: Intelligent document parsing by Alibaba Cloud.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DASHSCOPE_DOCMIND</p>
     */
    @NameInMap("Parser")
    public String parser;

    /**
     * <p>A list of tags associated with the document. The default value is null, which means no tags. You can specify up to 10 tags.</p>
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

    public AddFileRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
