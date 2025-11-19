// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetMemoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetMemoryResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5A362ADD-51FC-5F4A-B858-D77F6EFAE2E6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryResponseBody self = new GetMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMemoryResponseBody setData(GetMemoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMemoryResponseBodyData getData() {
        return this.data;
    }

    public GetMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMemoryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>my-cms-workspace</p>
         */
        @NameInMap("cmsWorkspaceName")
        public String cmsWorkspaceName;

        /**
         * <strong>example:</strong>
         * <p>1735870116</p>
         */
        @NameInMap("createTime")
        public Integer createTime;

        /**
         * <strong>example:</strong>
         * <p>365</p>
         */
        @NameInMap("longTtl")
        public Integer longTtl;

        /**
         * <strong>example:</strong>
         * <p>test-memory</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("shortTtl")
        public Integer shortTtl;

        @NameInMap("strategy")
        public java.util.List<String> strategy;

        public static GetMemoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryResponseBodyData self = new GetMemoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMemoryResponseBodyData setCmsWorkspaceName(String cmsWorkspaceName) {
            this.cmsWorkspaceName = cmsWorkspaceName;
            return this;
        }
        public String getCmsWorkspaceName() {
            return this.cmsWorkspaceName;
        }

        public GetMemoryResponseBodyData setCreateTime(Integer createTime) {
            this.createTime = createTime;
            return this;
        }
        public Integer getCreateTime() {
            return this.createTime;
        }

        public GetMemoryResponseBodyData setLongTtl(Integer longTtl) {
            this.longTtl = longTtl;
            return this;
        }
        public Integer getLongTtl() {
            return this.longTtl;
        }

        public GetMemoryResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMemoryResponseBodyData setShortTtl(Integer shortTtl) {
            this.shortTtl = shortTtl;
            return this;
        }
        public Integer getShortTtl() {
            return this.shortTtl;
        }

        public GetMemoryResponseBodyData setStrategy(java.util.List<String> strategy) {
            this.strategy = strategy;
            return this;
        }
        public java.util.List<String> getStrategy() {
            return this.strategy;
        }

    }

}
