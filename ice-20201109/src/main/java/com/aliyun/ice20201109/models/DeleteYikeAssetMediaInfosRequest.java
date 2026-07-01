// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteYikeAssetMediaInfosRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a logical delete or a permanent delete. Valid values:</p>
     * <ul>
     * <li><p>true (default): Performs a logical delete. This action moves the media asset to the recycle bin and retains its associated file.</p>
     * </li>
     * <li><p>false: Performs a permanent delete. This action deletes both the media asset information and the associated file.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LogicDelete")
    public Boolean logicDelete;

    /**
     * <p>A comma-separated list of media asset IDs.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong>,<strong><strong>15d4a4b0448391508f2cb486</strong></strong></p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    public static DeleteYikeAssetMediaInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteYikeAssetMediaInfosRequest self = new DeleteYikeAssetMediaInfosRequest();
        return TeaModel.build(map, self);
    }

    public DeleteYikeAssetMediaInfosRequest setLogicDelete(Boolean logicDelete) {
        this.logicDelete = logicDelete;
        return this;
    }
    public Boolean getLogicDelete() {
        return this.logicDelete;
    }

    public DeleteYikeAssetMediaInfosRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

}
