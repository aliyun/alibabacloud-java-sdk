// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the attached cloud disk.</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The name of the cloud disk that is created in Cloud Drive Service.</p>
     */
    @NameInMap("CdsName")
    public String cdsName;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("ConflictCdsAndOrder")
    public CreateCloudDriveServiceResponseBodyConflictCdsAndOrder conflictCdsAndOrder;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The maximum capacity of each instance in Cloud Drive Service. Unit: GiB</p>
     */
    @NameInMap("MaxSize")
    public String maxSize;

    @NameInMap("OfficeSiteType")
    public String officeSiteType;

    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCloudDriveServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudDriveServiceResponseBody self = new CreateCloudDriveServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudDriveServiceResponseBody setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public CreateCloudDriveServiceResponseBody setCdsName(String cdsName) {
        this.cdsName = cdsName;
        return this;
    }
    public String getCdsName() {
        return this.cdsName;
    }

    public CreateCloudDriveServiceResponseBody setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateCloudDriveServiceResponseBody setConflictCdsAndOrder(CreateCloudDriveServiceResponseBodyConflictCdsAndOrder conflictCdsAndOrder) {
        this.conflictCdsAndOrder = conflictCdsAndOrder;
        return this;
    }
    public CreateCloudDriveServiceResponseBodyConflictCdsAndOrder getConflictCdsAndOrder() {
        return this.conflictCdsAndOrder;
    }

    public CreateCloudDriveServiceResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCloudDriveServiceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateCloudDriveServiceResponseBody setMaxSize(String maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public String getMaxSize() {
        return this.maxSize;
    }

    public CreateCloudDriveServiceResponseBody setOfficeSiteType(String officeSiteType) {
        this.officeSiteType = officeSiteType;
        return this;
    }
    public String getOfficeSiteType() {
        return this.officeSiteType;
    }

    public CreateCloudDriveServiceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateCloudDriveServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictCds extends TeaModel {
        @NameInMap("CdsId")
        public String cdsId;

        @NameInMap("RegionId")
        public String regionId;

        public static CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictCds build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictCds self = new CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictCds();
            return TeaModel.build(map, self);
        }

        public CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictCds setCdsId(String cdsId) {
            this.cdsId = cdsId;
            return this;
        }
        public String getCdsId() {
            return this.cdsId;
        }

        public CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictCds setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictOrder extends TeaModel {
        @NameInMap("CdsId")
        public String cdsId;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("RegionId")
        public String regionId;

        public static CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictOrder build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictOrder self = new CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictOrder();
            return TeaModel.build(map, self);
        }

        public CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictOrder setCdsId(String cdsId) {
            this.cdsId = cdsId;
            return this;
        }
        public String getCdsId() {
            return this.cdsId;
        }

        public CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictOrder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictOrder setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateCloudDriveServiceResponseBodyConflictCdsAndOrder extends TeaModel {
        @NameInMap("ConflictCds")
        public java.util.List<CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictCds> conflictCds;

        @NameInMap("ConflictOrder")
        public java.util.List<CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictOrder> conflictOrder;

        public static CreateCloudDriveServiceResponseBodyConflictCdsAndOrder build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudDriveServiceResponseBodyConflictCdsAndOrder self = new CreateCloudDriveServiceResponseBodyConflictCdsAndOrder();
            return TeaModel.build(map, self);
        }

        public CreateCloudDriveServiceResponseBodyConflictCdsAndOrder setConflictCds(java.util.List<CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictCds> conflictCds) {
            this.conflictCds = conflictCds;
            return this;
        }
        public java.util.List<CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictCds> getConflictCds() {
            return this.conflictCds;
        }

        public CreateCloudDriveServiceResponseBodyConflictCdsAndOrder setConflictOrder(java.util.List<CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictOrder> conflictOrder) {
            this.conflictOrder = conflictOrder;
            return this;
        }
        public java.util.List<CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictOrder> getConflictOrder() {
            return this.conflictOrder;
        }

    }

}
