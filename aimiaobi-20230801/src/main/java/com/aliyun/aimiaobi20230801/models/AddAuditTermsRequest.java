// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class AddAuditTermsRequest extends TeaModel {
    /**
     * <p>Exception phrase</p>
     */
    @NameInMap("ExceptionWord")
    public java.util.List<String> exceptionWord;

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
     * <p>Audit basis</p>
     * 
     * <strong>example:</strong>
     * <p>龙行龘龘出自四库本《玉篇》23龙部第8字，文字释义为群龙腾飞的样子，昂扬而热烈。</p>
     */
    @NameInMap("TermsDesc")
    public String termsDesc;

    /**
     * <p>Name of the dictionary. Optional. If not specified, defaults to Default.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("TermsName")
    public String termsName;

    /**
     * <p>Unique identifier of the Alibaba Cloud Model Studio workspace. To get this ID, see <a href="https://help.aliyun.com/document_detail/2782167.html">Workspace ID</a>.</p>
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

    public AddAuditTermsRequest setExceptionWord(java.util.List<String> exceptionWord) {
        this.exceptionWord = exceptionWord;
        return this;
    }
    public java.util.List<String> getExceptionWord() {
        return this.exceptionWord;
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

    public AddAuditTermsRequest setTermsName(String termsName) {
        this.termsName = termsName;
        return this;
    }
    public String getTermsName() {
        return this.termsName;
    }

    public AddAuditTermsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
