// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public ChangeResourceGroupResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceGroupResponseBody self = new ChangeResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeResourceGroupResponseBody setData(ChangeResourceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeResourceGroupResponseBodyData getData() {
        return this.data;
    }

    public ChangeResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ChangeResourceGroupResponseBodyData extends TeaModel {
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceId")
        public String resourceId;

        public static ChangeResourceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeResourceGroupResponseBodyData self = new ChangeResourceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeResourceGroupResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ChangeResourceGroupResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
