// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateVolumesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VolumeIds")
    public VolumeIds volumeIds;

    public static CreateVolumesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVolumesResponseBody self = new CreateVolumesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVolumesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVolumesResponseBody setVolumeIds(VolumeIds volumeIds) {
        this.volumeIds = volumeIds;
        return this;
    }
    public VolumeIds getVolumeIds() {
        return this.volumeIds;
    }

    public static class VolumeIds extends TeaModel {
        @NameInMap("VolumeId")
        public java.util.List<String> volumeId;

        public static VolumeIds build(java.util.Map<String, ?> map) throws Exception {
            VolumeIds self = new VolumeIds();
            return TeaModel.build(map, self);
        }

        public VolumeIds setVolumeId(java.util.List<String> volumeId) {
            this.volumeId = volumeId;
            return this;
        }
        public java.util.List<String> getVolumeId() {
            return this.volumeId;
        }

    }

}
