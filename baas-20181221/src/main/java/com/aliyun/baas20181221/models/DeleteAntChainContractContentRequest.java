// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DeleteAntChainContractContentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GKX7KZX0</p>
     */
    @NameInMap("ContentId")
    public String contentId;

    public static DeleteAntChainContractContentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntChainContractContentRequest self = new DeleteAntChainContractContentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAntChainContractContentRequest setContentId(String contentId) {
        this.contentId = contentId;
        return this;
    }
    public String getContentId() {
        return this.contentId;
    }

}
