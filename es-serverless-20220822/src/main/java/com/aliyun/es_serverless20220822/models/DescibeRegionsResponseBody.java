// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class DescibeRegionsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<DescibeRegionsResponseBodyResult> result;

    public static DescibeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescibeRegionsResponseBody self = new DescibeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescibeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescibeRegionsResponseBody setResult(java.util.List<DescibeRegionsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescibeRegionsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescibeRegionsResponseBodyResult extends TeaModel {
        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("localName")
        public String localName;

        @NameInMap("regionId")
        public String regionId;

        public static DescibeRegionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescibeRegionsResponseBodyResult self = new DescibeRegionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescibeRegionsResponseBodyResult setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescibeRegionsResponseBodyResult setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescibeRegionsResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
