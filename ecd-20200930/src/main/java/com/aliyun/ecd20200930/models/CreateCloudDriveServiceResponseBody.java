// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the enterprise network disk.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-778205****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The name of the cloud storage service.</p>
     * 
     * <strong>example:</strong>
     * <p>CDS_Windows_1126</p>
     */
    @NameInMap("CdsName")
    public String cdsName;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     * <blockquote>
     * <p>If you want to connect to a cloud desktop through a VPC, you can add the office network to a CEN instance. This CEN instance connects to your on-premises network through a VPN or a dedicated line.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cen-638u3wxds9snyc****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The existing enterprise network disks or orders for enterprise network disks that conflict with the enterprise network disk that you want to create.</p>
     */
    @NameInMap("ConflictCdsAndOrder")
    public CreateCloudDriveServiceResponseBodyConflictCdsAndOrder conflictCdsAndOrder;

    /**
     * <p>The name of the Active Directory (AD) domain corresponding to the AD office network.</p>
     * 
     * <strong>example:</strong>
     * <p>test1.local</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ExistConflictCds</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The maximum storage usage of the enterprise network disk. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>5368709120</p>
     */
    @NameInMap("MaxSize")
    public String maxSize;

    /**
     * <p>The office network type.</p>
     * 
     * <strong>example:</strong>
     * <p>AD_CONNECTOR</p>
     */
    @NameInMap("OfficeSiteType")
    public String officeSiteType;

    /**
     * <p>The order ID. You can obtain the order ID on the Order Management page in the Alibaba Cloud User Center.</p>
     * 
     * <strong>example:</strong>
     * <p>214552063030752</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>062B1439-709A-580E-85DF-CE97A156****</p>
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
        /**
         * <p>The ID of the enterprise network disk.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+cds-778205****</p>
         */
        @NameInMap("CdsId")
        public String cdsId;

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions that are supported by Elastic Desktop Service.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
        /**
         * <p>The ID of the enterprise network disk (The order is not paid, and the enterprise network disk cannot be used).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+cds-778205****</p>
         */
        @NameInMap("CdsId")
        public String cdsId;

        /**
         * <p>The order ID. You can obtain the order ID on the <strong>Order Management</strong> page in the Alibaba Cloud User Center.</p>
         * 
         * <strong>example:</strong>
         * <p>22442411898****</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
        /**
         * <p>The information of conflicting enterprise network disks.</p>
         */
        @NameInMap("ConflictCds")
        public java.util.List<CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictCds> conflictCds;

        /**
         * <p>The information of conflicting unpaid orders for enterprise network disks (orders for subscription enterprise network disks).</p>
         */
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
