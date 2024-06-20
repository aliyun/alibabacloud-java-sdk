// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainContractContentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>update content</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>R6XMn59e</p>
     */
    @NameInMap("ContentId")
    public String contentId;

    /**
     * <strong>example:</strong>
     * <p>newFile</p>
     */
    @NameInMap("ContentName")
    public String contentName;

    /**
     * <strong>example:</strong>
     * <p>R38DYDop</p>
     */
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
