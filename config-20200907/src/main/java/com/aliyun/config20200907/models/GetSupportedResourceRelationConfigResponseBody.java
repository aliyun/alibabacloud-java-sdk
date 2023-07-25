// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetSupportedResourceRelationConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The supported resource relationships.</p>
     */
    @NameInMap("ResourceRelationConfigList")
    public java.util.List<GetSupportedResourceRelationConfigResponseBodyResourceRelationConfigList> resourceRelationConfigList;

    public static GetSupportedResourceRelationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSupportedResourceRelationConfigResponseBody self = new GetSupportedResourceRelationConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSupportedResourceRelationConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSupportedResourceRelationConfigResponseBody setResourceRelationConfigList(java.util.List<GetSupportedResourceRelationConfigResponseBodyResourceRelationConfigList> resourceRelationConfigList) {
        this.resourceRelationConfigList = resourceRelationConfigList;
        return this;
    }
    public java.util.List<GetSupportedResourceRelationConfigResponseBodyResourceRelationConfigList> getResourceRelationConfigList() {
        return this.resourceRelationConfigList;
    }

    public static class GetSupportedResourceRelationConfigResponseBodyResourceRelationConfigList extends TeaModel {
        /**
         * <p>The relationship type.</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("TargetResourceType")
        public String targetResourceType;

        public static GetSupportedResourceRelationConfigResponseBodyResourceRelationConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetSupportedResourceRelationConfigResponseBodyResourceRelationConfigList self = new GetSupportedResourceRelationConfigResponseBodyResourceRelationConfigList();
            return TeaModel.build(map, self);
        }

        public GetSupportedResourceRelationConfigResponseBodyResourceRelationConfigList setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public GetSupportedResourceRelationConfigResponseBodyResourceRelationConfigList setTargetResourceType(String targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }
        public String getTargetResourceType() {
            return this.targetResourceType;
        }

    }

}
