// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetSearchCodePreviewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("docId")
    public String docId;

    @NameInMap("isDsl")
    public Boolean isDsl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    public static GetSearchCodePreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSearchCodePreviewRequest self = new GetSearchCodePreviewRequest();
        return TeaModel.build(map, self);
    }

    public GetSearchCodePreviewRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public GetSearchCodePreviewRequest setIsDsl(Boolean isDsl) {
        this.isDsl = isDsl;
        return this;
    }
    public Boolean getIsDsl() {
        return this.isDsl;
    }

    public GetSearchCodePreviewRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetSearchCodePreviewRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

}
