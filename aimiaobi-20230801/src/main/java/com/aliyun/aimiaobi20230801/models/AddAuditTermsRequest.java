// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AddAuditTermsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>龘</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>龘(dá)</p>
     */
    @NameInMap("SuggestWord")
    public String suggestWord;

    /**
     * <strong>example:</strong>
     * <p>龙行龘龘出自四库本《玉篇》23龙部第8字，文字释义为群龙腾飞的样子，昂扬而热烈。</p>
     */
    @NameInMap("TermsDesc")
    public String termsDesc;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AddAuditTermsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAuditTermsRequest self = new AddAuditTermsRequest();
        return TeaModel.build(map, self);
    }

    public AddAuditTermsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public AddAuditTermsRequest setSuggestWord(String suggestWord) {
        this.suggestWord = suggestWord;
        return this;
    }
    public String getSuggestWord() {
        return this.suggestWord;
    }

    public AddAuditTermsRequest setTermsDesc(String termsDesc) {
        this.termsDesc = termsDesc;
        return this;
    }
    public String getTermsDesc() {
        return this.termsDesc;
    }

    public AddAuditTermsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
