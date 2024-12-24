// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20220307.models;

import com.aliyun.tea.*;

public class ApplyCoordinationWithCodeResponseBody extends TeaModel {
    @NameInMap("Data")
    public ApplyCoordinationWithCodeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>AD2D0761-1FE5-549D-B169******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApplyCoordinationWithCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyCoordinationWithCodeResponseBody self = new ApplyCoordinationWithCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyCoordinationWithCodeResponseBody setData(ApplyCoordinationWithCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ApplyCoordinationWithCodeResponseBodyData getData() {
        return this.data;
    }

    public ApplyCoordinationWithCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ApplyCoordinationWithCodeResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>co-0ad0f3p4n2******</p>
         */
        @NameInMap("CoId")
        public String coId;

        /**
         * <strong>example:</strong>
         * <p>COORDINATING</p>
         */
        @NameInMap("CoordinateStatus")
        public String coordinateStatus;

        /**
         * <strong>example:</strong>
         * <p>DQpbRGVza3RvcF0NCkZvcmNlVGxzVHlwZT0xDQ******</p>
         */
        @NameInMap("CoordinateTicket")
        public String coordinateTicket;

        /**
         * <strong>example:</strong>
         * <p>1126819517******</p>
         */
        @NameInMap("CoordinatorAliUid")
        public Long coordinatorAliUid;

        /**
         * <strong>example:</strong>
         * <p>bob</p>
         */
        @NameInMap("CoordinatorUserId")
        public String coordinatorUserId;

        /**
         * <strong>example:</strong>
         * <p>1126819517******</p>
         */
        @NameInMap("OwnerAliUid")
        public Long ownerAliUid;

        /**
         * <strong>example:</strong>
         * <p>alice</p>
         */
        @NameInMap("OwnerUserId")
        public String ownerUserId;

        /**
         * <strong>example:</strong>
         * <p>ecd-3vv4mf8zxg******</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>demo-desktop</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <strong>example:</strong>
         * <p>CloudDesktop</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ApplyCoordinationWithCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ApplyCoordinationWithCodeResponseBodyData self = new ApplyCoordinationWithCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ApplyCoordinationWithCodeResponseBodyData setCoId(String coId) {
            this.coId = coId;
            return this;
        }
        public String getCoId() {
            return this.coId;
        }

        public ApplyCoordinationWithCodeResponseBodyData setCoordinateStatus(String coordinateStatus) {
            this.coordinateStatus = coordinateStatus;
            return this;
        }
        public String getCoordinateStatus() {
            return this.coordinateStatus;
        }

        public ApplyCoordinationWithCodeResponseBodyData setCoordinateTicket(String coordinateTicket) {
            this.coordinateTicket = coordinateTicket;
            return this;
        }
        public String getCoordinateTicket() {
            return this.coordinateTicket;
        }

        public ApplyCoordinationWithCodeResponseBodyData setCoordinatorAliUid(Long coordinatorAliUid) {
            this.coordinatorAliUid = coordinatorAliUid;
            return this;
        }
        public Long getCoordinatorAliUid() {
            return this.coordinatorAliUid;
        }

        public ApplyCoordinationWithCodeResponseBodyData setCoordinatorUserId(String coordinatorUserId) {
            this.coordinatorUserId = coordinatorUserId;
            return this;
        }
        public String getCoordinatorUserId() {
            return this.coordinatorUserId;
        }

        public ApplyCoordinationWithCodeResponseBodyData setOwnerAliUid(Long ownerAliUid) {
            this.ownerAliUid = ownerAliUid;
            return this;
        }
        public Long getOwnerAliUid() {
            return this.ownerAliUid;
        }

        public ApplyCoordinationWithCodeResponseBodyData setOwnerUserId(String ownerUserId) {
            this.ownerUserId = ownerUserId;
            return this;
        }
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        public ApplyCoordinationWithCodeResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ApplyCoordinationWithCodeResponseBodyData setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public ApplyCoordinationWithCodeResponseBodyData setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public ApplyCoordinationWithCodeResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
