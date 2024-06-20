// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmInfoMappingResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateWmInfoMappingResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>7E9D7ACD-53D5-56EF-A913-79D148D06299</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateWmInfoMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWmInfoMappingResponseBody self = new CreateWmInfoMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWmInfoMappingResponseBody setData(CreateWmInfoMappingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateWmInfoMappingResponseBodyData getData() {
        return this.data;
    }

    public CreateWmInfoMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateWmInfoMappingResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123***</p>
         */
        @NameInMap("WmInfoUint")
        public Long wmInfoUint;

        public static CreateWmInfoMappingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateWmInfoMappingResponseBodyData self = new CreateWmInfoMappingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateWmInfoMappingResponseBodyData setWmInfoUint(Long wmInfoUint) {
            this.wmInfoUint = wmInfoUint;
            return this;
        }
        public Long getWmInfoUint() {
            return this.wmInfoUint;
        }

    }

}
