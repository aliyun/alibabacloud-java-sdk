// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateStorageVolumeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7030AB96-57CF-1C68-9FEE-D60E547FD79C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array of volume IDs.</p>
     */
    @NameInMap("VolumeId")
    public java.util.List<String> volumeId;

    public static CreateStorageVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageVolumeResponseBody self = new CreateStorageVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStorageVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStorageVolumeResponseBody setVolumeId(java.util.List<String> volumeId) {
        this.volumeId = volumeId;
        return this;
    }
    public java.util.List<String> getVolumeId() {
        return this.volumeId;
    }

}
