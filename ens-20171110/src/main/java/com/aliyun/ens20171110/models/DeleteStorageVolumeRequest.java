// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteStorageVolumeRequest extends TeaModel {
    /**
     * <p>The ID of the volume.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sv-***</p>
     */
    @NameInMap("VolumeId")
    public String volumeId;

    public static DeleteStorageVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageVolumeRequest self = new DeleteStorageVolumeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStorageVolumeRequest setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    public String getVolumeId() {
        return this.volumeId;
    }

}
