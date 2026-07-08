// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class EditAuditTermsShrinkRequest extends TeaModel {
    /**
     * <p>Exception statements</p>
     */
    @NameInMap("ExceptionWord")
    public String exceptionWordShrink;

    /**
     * <p>Primary key ID</p>
     * 
     * <strong>example:</strong>
     * <p>20103</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Keyword</p>
     * 
     * <strong>example:</strong>
     * <p>龘</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>Suggested word</p>
     * 
     * <strong>example:</strong>
     * <p>龘(dá)</p>
     */
    @NameInMap("SuggestWord")
    public String suggestWord;

    /**
     * <p>Audit rationale</p>
     * 
     * <strong>example:</strong>
     * <p>龙行龘龘出自四库本《玉篇》23龙部第8字，文字释义为群龙腾飞的样子，昂扬而热烈。</p>
     */
    @NameInMap("TermsDesc")
    public String termsDesc;

    /**
     * <p>The unique identifier of your Alibaba Cloud Model Studio workspace. Get your <a href="https://help.aliyun.com/document_detail/2782167.html">workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static EditAuditTermsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EditAuditTermsShrinkRequest self = new EditAuditTermsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EditAuditTermsShrinkRequest setExceptionWordShrink(String exceptionWordShrink) {
        this.exceptionWordShrink = exceptionWordShrink;
        return this;
    }
    public String getExceptionWordShrink() {
        return this.exceptionWordShrink;
    }

    public EditAuditTermsShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public EditAuditTermsShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public EditAuditTermsShrinkRequest setSuggestWord(String suggestWord) {
        this.suggestWord = suggestWord;
        return this;
    }
    public String getSuggestWord() {
        return this.suggestWord;
    }

    public EditAuditTermsShrinkRequest setTermsDesc(String termsDesc) {
        this.termsDesc = termsDesc;
        return this;
    }
    public String getTermsDesc() {
        return this.termsDesc;
    }

    public EditAuditTermsShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
