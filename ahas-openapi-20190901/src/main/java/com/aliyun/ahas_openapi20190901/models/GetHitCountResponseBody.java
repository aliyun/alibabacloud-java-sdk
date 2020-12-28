// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetHitCountResponseBody extends TeaModel {
    @NameInMap("Hits")
    public java.util.List<GetHitCountResponseBodyHits> hits;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetHitCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHitCountResponseBody self = new GetHitCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHitCountResponseBody setHits(java.util.List<GetHitCountResponseBodyHits> hits) {
        this.hits = hits;
        return this;
    }
    public java.util.List<GetHitCountResponseBodyHits> getHits() {
        return this.hits;
    }

    public GetHitCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHitCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHitCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHitCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHitCountResponseBodyHits extends TeaModel {
        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("Count")
        public Float count;

        public static GetHitCountResponseBodyHits build(java.util.Map<String, ?> map) throws Exception {
            GetHitCountResponseBodyHits self = new GetHitCountResponseBodyHits();
            return TeaModel.build(map, self);
        }

        public GetHitCountResponseBodyHits setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public GetHitCountResponseBodyHits setCount(Float count) {
            this.count = count;
            return this;
        }
        public Float getCount() {
            return this.count;
        }

    }

}
