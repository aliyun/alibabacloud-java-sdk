// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetGlobalAcceleratorResourcesResponseBody extends TeaModel {
    @NameInMap("AssociatedResources")
    public java.util.List<GetGlobalAcceleratorResourcesResponseBodyAssociatedResources> associatedResources;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetGlobalAcceleratorResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalAcceleratorResourcesResponseBody self = new GetGlobalAcceleratorResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGlobalAcceleratorResourcesResponseBody setAssociatedResources(java.util.List<GetGlobalAcceleratorResourcesResponseBodyAssociatedResources> associatedResources) {
        this.associatedResources = associatedResources;
        return this;
    }
    public java.util.List<GetGlobalAcceleratorResourcesResponseBodyAssociatedResources> getAssociatedResources() {
        return this.associatedResources;
    }

    public GetGlobalAcceleratorResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGlobalAcceleratorResourcesResponseBodyAssociatedResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        @NameInMap("AcceleratorId")
        public String acceleratorId;

        /**
         * <strong>example:</strong>
         * <p>Associated</p>
         */
        @NameInMap("AssociatedMode")
        public String associatedMode;

        /**
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-x0r****gr1i</p>
         */
        @NameInMap("AssociatedResourceId")
        public String associatedResourceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("AssociatedResourceRegionId")
        public String associatedResourceRegionId;

        /**
         * <strong>example:</strong>
         * <p>WAF</p>
         */
        @NameInMap("AssociatedResourceType")
        public String associatedResourceType;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("State")
        public String state;

        public static GetGlobalAcceleratorResourcesResponseBodyAssociatedResources build(java.util.Map<String, ?> map) throws Exception {
            GetGlobalAcceleratorResourcesResponseBodyAssociatedResources self = new GetGlobalAcceleratorResourcesResponseBodyAssociatedResources();
            return TeaModel.build(map, self);
        }

        public GetGlobalAcceleratorResourcesResponseBodyAssociatedResources setAcceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }
        public String getAcceleratorId() {
            return this.acceleratorId;
        }

        public GetGlobalAcceleratorResourcesResponseBodyAssociatedResources setAssociatedMode(String associatedMode) {
            this.associatedMode = associatedMode;
            return this;
        }
        public String getAssociatedMode() {
            return this.associatedMode;
        }

        public GetGlobalAcceleratorResourcesResponseBodyAssociatedResources setAssociatedResourceId(String associatedResourceId) {
            this.associatedResourceId = associatedResourceId;
            return this;
        }
        public String getAssociatedResourceId() {
            return this.associatedResourceId;
        }

        public GetGlobalAcceleratorResourcesResponseBodyAssociatedResources setAssociatedResourceRegionId(String associatedResourceRegionId) {
            this.associatedResourceRegionId = associatedResourceRegionId;
            return this;
        }
        public String getAssociatedResourceRegionId() {
            return this.associatedResourceRegionId;
        }

        public GetGlobalAcceleratorResourcesResponseBodyAssociatedResources setAssociatedResourceType(String associatedResourceType) {
            this.associatedResourceType = associatedResourceType;
            return this;
        }
        public String getAssociatedResourceType() {
            return this.associatedResourceType;
        }

        public GetGlobalAcceleratorResourcesResponseBodyAssociatedResources setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
