// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class AddDocumentResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example.pdf</p>
     */
    @NameInMap("docName")
    public String docName;

    @NameInMap("documentInfo")
    public DocumentInfo documentInfo;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static AddDocumentResult build(java.util.Map<String, ?> map) throws Exception {
        AddDocumentResult self = new AddDocumentResult();
        return TeaModel.build(map, self);
    }

    public AddDocumentResult setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public AddDocumentResult setDocumentInfo(DocumentInfo documentInfo) {
        this.documentInfo = documentInfo;
        return this;
    }
    public DocumentInfo getDocumentInfo() {
        return this.documentInfo;
    }

    public AddDocumentResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddDocumentResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
