// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddContainerAppResponseBody extends TeaModel {
    @NameInMap("ContainerId")
    public AddContainerAppResponseBodyContainerId containerId;

    /**
     * <p>The ID of the container.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddContainerAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddContainerAppResponseBody self = new AddContainerAppResponseBody();
        return TeaModel.build(map, self);
    }

    public AddContainerAppResponseBody setContainerId(AddContainerAppResponseBodyContainerId containerId) {
        this.containerId = containerId;
        return this;
    }
    public AddContainerAppResponseBodyContainerId getContainerId() {
        return this.containerId;
    }

    public AddContainerAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddContainerAppResponseBodyContainerId extends TeaModel {
        @NameInMap("ContainerId")
        public java.util.List<String> containerId;

        public static AddContainerAppResponseBodyContainerId build(java.util.Map<String, ?> map) throws Exception {
            AddContainerAppResponseBodyContainerId self = new AddContainerAppResponseBodyContainerId();
            return TeaModel.build(map, self);
        }

        public AddContainerAppResponseBodyContainerId setContainerId(java.util.List<String> containerId) {
            this.containerId = containerId;
            return this;
        }
        public java.util.List<String> getContainerId() {
            return this.containerId;
        }

    }

}
