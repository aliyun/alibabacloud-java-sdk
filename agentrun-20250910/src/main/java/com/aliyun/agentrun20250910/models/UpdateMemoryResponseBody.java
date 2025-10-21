// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateMemoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UpdateMemoryResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C0595DB0-D1EE-55C3-8DDD-790872C7EC2F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryResponseBody self = new UpdateMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateMemoryResponseBody setData(UpdateMemoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateMemoryResponseBodyData getData() {
        return this.data;
    }

    public UpdateMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateMemoryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default_workspace</p>
         */
        @NameInMap("cmsWorkspaceName")
        public String cmsWorkspaceName;

        public static UpdateMemoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateMemoryResponseBodyData self = new UpdateMemoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateMemoryResponseBodyData setCmsWorkspaceName(String cmsWorkspaceName) {
            this.cmsWorkspaceName = cmsWorkspaceName;
            return this;
        }
        public String getCmsWorkspaceName() {
            return this.cmsWorkspaceName;
        }

    }

}
