// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetLiveReplayUrlResponseBody extends TeaModel {
    @NameInMap("replayUrl")
    public String replayUrl;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static GetLiveReplayUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLiveReplayUrlResponseBody self = new GetLiveReplayUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLiveReplayUrlResponseBody setReplayUrl(String replayUrl) {
        this.replayUrl = replayUrl;
        return this;
    }
    public String getReplayUrl() {
        return this.replayUrl;
    }

    public GetLiveReplayUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLiveReplayUrlResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetLiveReplayUrlResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
