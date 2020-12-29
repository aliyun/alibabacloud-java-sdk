// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainContractContentRequest extends TeaModel {
    @NameInMap("ContentId")
    public String contentId;

    @NameInMap("ParentContentId")
    public String parentContentId;

    @NameInMap("ContentName")
    public String contentName;

    @NameInMap("Content")
    public String content;

    public static UpdateAntChainContractContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainContractContentRequest self = new UpdateAntChainContractContentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainContractContentRequest setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public UpdateAntChainContractContentRequest setParentContentId(String parentContentId) {
        this.parentContentId = parentContentId;
        return this;
    }
    public String getParentContentId() {
        return this.parentContentId;
    }

    public UpdateAntChainContractContentRequest setContentName(String contentName) {
        this.contentName = contentName;
        return this;
    }
    public String getContentName() {
        return this.contentName;
    }

    public UpdateAntChainContractContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
