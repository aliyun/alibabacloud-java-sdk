// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetStandardRoomJumpUrlResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetStandardRoomJumpUrlResponseBodyResult result;

    public static GetStandardRoomJumpUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStandardRoomJumpUrlResponseBody self = new GetStandardRoomJumpUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStandardRoomJumpUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStandardRoomJumpUrlResponseBody setResult(GetStandardRoomJumpUrlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetStandardRoomJumpUrlResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetStandardRoomJumpUrlResponseBodyResult extends TeaModel {
        // 样板间跳转协议地址
        @NameInMap("StandardRoomJumpUrl")
        public String standardRoomJumpUrl;

        public static GetStandardRoomJumpUrlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetStandardRoomJumpUrlResponseBodyResult self = new GetStandardRoomJumpUrlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetStandardRoomJumpUrlResponseBodyResult setStandardRoomJumpUrl(String standardRoomJumpUrl) {
            this.standardRoomJumpUrl = standardRoomJumpUrl;
            return this;
        }
        public String getStandardRoomJumpUrl() {
            return this.standardRoomJumpUrl;
        }

    }

}
