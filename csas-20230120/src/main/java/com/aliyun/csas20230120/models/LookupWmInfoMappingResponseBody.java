// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class LookupWmInfoMappingResponseBody extends TeaModel {
    @NameInMap("Data")
    public LookupWmInfoMappingResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>7E9D7ACD-53D5-56EF-A913-79D148D06299</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static LookupWmInfoMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LookupWmInfoMappingResponseBody self = new LookupWmInfoMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public LookupWmInfoMappingResponseBody setData(LookupWmInfoMappingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public LookupWmInfoMappingResponseBodyData getData() {
        return this.data;
    }

    public LookupWmInfoMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class LookupWmInfoMappingResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>aGVsbG8gc2F*****</p>
         */
        @NameInMap("WmInfoBytesB64")
        public String wmInfoBytesB64;

        public static LookupWmInfoMappingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LookupWmInfoMappingResponseBodyData self = new LookupWmInfoMappingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LookupWmInfoMappingResponseBodyData setWmInfoBytesB64(String wmInfoBytesB64) {
            this.wmInfoBytesB64 = wmInfoBytesB64;
            return this;
        }
        public String getWmInfoBytesB64() {
            return this.wmInfoBytesB64;
        }

    }

}
