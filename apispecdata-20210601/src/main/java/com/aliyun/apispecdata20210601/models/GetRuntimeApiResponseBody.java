// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apispecdata20210601.models;

import com.aliyun.tea.*;

public class GetRuntimeApiResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetRuntimeApiResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetRuntimeApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuntimeApiResponseBody self = new GetRuntimeApiResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuntimeApiResponseBody setData(GetRuntimeApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRuntimeApiResponseBodyData getData() {
        return this.data;
    }

    public GetRuntimeApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRuntimeApiResponseBodyData extends TeaModel {
        // API ID
        @NameInMap("ApiId")
        public Long apiId;

        // API是否发布过线上
        @NameInMap("HasReleasedOnline")
        public Boolean hasReleasedOnline;

        // 主干变更ID
        @NameInMap("MasterBranchId")
        public Long masterBranchId;

        // API名称
        @NameInMap("Name")
        public String name;

        // API元数据
        @NameInMap("Schema")
        public String schema;

        public static GetRuntimeApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRuntimeApiResponseBodyData self = new GetRuntimeApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRuntimeApiResponseBodyData setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public GetRuntimeApiResponseBodyData setHasReleasedOnline(Boolean hasReleasedOnline) {
            this.hasReleasedOnline = hasReleasedOnline;
            return this;
        }
        public Boolean getHasReleasedOnline() {
            return this.hasReleasedOnline;
        }

        public GetRuntimeApiResponseBodyData setMasterBranchId(Long masterBranchId) {
            this.masterBranchId = masterBranchId;
            return this;
        }
        public Long getMasterBranchId() {
            return this.masterBranchId;
        }

        public GetRuntimeApiResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRuntimeApiResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

    }

}
