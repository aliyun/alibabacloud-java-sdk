// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class DocumentInfo extends TeaModel {
    @NameInMap("documentType")
    public String documentType;

    @NameInMap("id")
    public String id;

    @NameInMap("name")
    public String name;

    @NameInMap("processStatus")
    public String processStatus;

    public static DocumentInfo build(java.util.Map<String, ?> map) throws Exception {
        DocumentInfo self = new DocumentInfo();
        return TeaModel.build(map, self);
    }

    public DocumentInfo setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }
    public String getDocumentType() {
        return this.documentType;
    }

    public DocumentInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DocumentInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DocumentInfo setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public String getProcessStatus() {
        return this.processStatus;
    }

}
