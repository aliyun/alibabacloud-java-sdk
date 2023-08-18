// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetClusterEngineVersionsResponseBody extends TeaModel {
    @NameInMap("EngineVersions")
    public GetClusterEngineVersionsResponseBodyEngineVersions engineVersions;

    @NameInMap("RequestId")
    public String requestId;

    public static GetClusterEngineVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterEngineVersionsResponseBody self = new GetClusterEngineVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterEngineVersionsResponseBody setEngineVersions(GetClusterEngineVersionsResponseBodyEngineVersions engineVersions) {
        this.engineVersions = engineVersions;
        return this;
    }
    public GetClusterEngineVersionsResponseBodyEngineVersions getEngineVersions() {
        return this.engineVersions;
    }

    public GetClusterEngineVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetClusterEngineVersionsResponseBodyEngineVersions extends TeaModel {
        @NameInMap("EngineVersion")
        public java.util.List<String> engineVersion;

        public static GetClusterEngineVersionsResponseBodyEngineVersions build(java.util.Map<String, ?> map) throws Exception {
            GetClusterEngineVersionsResponseBodyEngineVersions self = new GetClusterEngineVersionsResponseBodyEngineVersions();
            return TeaModel.build(map, self);
        }

        public GetClusterEngineVersionsResponseBodyEngineVersions setEngineVersion(java.util.List<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public java.util.List<String> getEngineVersion() {
            return this.engineVersion;
        }

    }

}
