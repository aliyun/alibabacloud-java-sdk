// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateAntChainContractContentRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContentId")
    public String contentId;

    @NameInMap("ContentName")
    public String contentName;

    @NameInMap("ParentContentId")
    public String parentContentId;

    public static UpdateAntChainContractContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainContractContentRequest self = new UpdateAntChainContractContentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainContractContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateAntChainContractContentRequest setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

    public UpdateAntChainContractContentRequest setContentName(String contentName) {
        this.contentName = contentName;
        return this;
    }
    public String getContentName() {
        return this.contentName;
    }

    public UpdateAntChainContractContentRequest setParentContentId(String parentContentId) {
        this.parentContentId = parentContentId;
        return this;
    }
    public String getParentContentId() {
        return this.parentContentId;
    }

}
