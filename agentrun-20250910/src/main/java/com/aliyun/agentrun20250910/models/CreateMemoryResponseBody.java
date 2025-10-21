// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateMemoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateMemoryResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0FB1162C-D50B-5DA7-AD04-3417ABBF133A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryResponseBody self = new CreateMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMemoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMemoryResponseBody setData(CreateMemoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMemoryResponseBodyData getData() {
        return this.data;
    }

    public CreateMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMemoryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default_workspace</p>
         */
        @NameInMap("cmsWorkspaceName")
        public String cmsWorkspaceName;

        public static CreateMemoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMemoryResponseBodyData self = new CreateMemoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMemoryResponseBodyData setCmsWorkspaceName(String cmsWorkspaceName) {
            this.cmsWorkspaceName = cmsWorkspaceName;
            return this;
        }
        public String getCmsWorkspaceName() {
            return this.cmsWorkspaceName;
        }

    }

}
