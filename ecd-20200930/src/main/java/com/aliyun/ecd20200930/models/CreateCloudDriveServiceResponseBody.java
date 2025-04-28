// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the enterprise drive.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-7782057786</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The name of the cloud disk that is created in Cloud Drive Service.</p>
     * 
     * <strong>example:</strong>
     * <p>CDS_Windows_1126</p>
     */
    @NameInMap("CdsName")
    public String cdsName;

    /**
     * <p>The ID of the CEN instance.</p>
     * <blockquote>
     * <p> To allow end users to connect to cloud computers via virtual private clouds (VPCs), attach your office network to a CEN instance. The CEN instance connects to your on-premises network through VPN Gateway or Express Connect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cen-638u3wxds9snyc****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The existing enterprise drive or its order that conflicts with the enterprise drive being created.</p>
     */
    @NameInMap("ConflictCdsAndOrder")
    public CreateCloudDriveServiceResponseBodyConflictCdsAndOrder conflictCdsAndOrder;

    /**
     * <p>The domain name of the enterprise AD office network.</p>
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
     * <p>The maximum storage capacity of the enterprise drive. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>213674622976</p>
     */
    @NameInMap("MaxSize")
    public String maxSize;

    /**
     * <p>The type of the office network.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>SIMPLE: convenience office network.</li>
     * <li>AD_CONNECTOR: enterprise AD office network.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AD_CONNECTOR</p>
     */
    @NameInMap("OfficeSiteType")
    public String officeSiteType;

    /**
     * <p>The ID of the order. You can obtain an order ID on the Orders page in the Expenses and Costs console.</p>
     * 
     * <strong>example:</strong>
     * <p>214552063030752</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>062B1439-709A-580E-85DF-CE97A1560565</p>
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
         * <p>The ID of the enterprise drive.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+cds-778205****</p>
         */
        @NameInMap("CdsId")
        public String cdsId;

        /**
         * <p>The ID of the region. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
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
         * <p>The ID of the enterprise drive. The enterprise drive cannot be used if the order is unpaid.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+cds-778205****</p>
         */
        @NameInMap("CdsId")
        public String cdsId;

        /**
         * <p>The ID of the order. You can obtain an order ID on the <strong>Orders</strong> page in the Expenses and Costs console.</p>
         * 
         * <strong>example:</strong>
         * <p>22442411898****</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        /**
         * <p>The ID of the region.</p>
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
         * <p>The conflicting enterprise drive.</p>
         */
        @NameInMap("ConflictCds")
        public java.util.List<CreateCloudDriveServiceResponseBodyConflictCdsAndOrderConflictCds> conflictCds;

        /**
         * <p>The subscription orders of the conflicting enterprise drives that are unpaid.</p>
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
