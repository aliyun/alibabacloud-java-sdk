// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRoomRealTimeStreamAddressResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8DB7E25-6A35-161A-AA41-B7A658AF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The RTMP ingest URL.</p>
     */
    @NameInMap("RtmpAddress")
    public String rtmpAddress;

    public static CreateRoomRealTimeStreamAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRoomRealTimeStreamAddressResponseBody self = new CreateRoomRealTimeStreamAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRoomRealTimeStreamAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRoomRealTimeStreamAddressResponseBody setRtmpAddress(String rtmpAddress) {
        this.rtmpAddress = rtmpAddress;
        return this;
    }
    public String getRtmpAddress() {
        return this.rtmpAddress;
    }

}
