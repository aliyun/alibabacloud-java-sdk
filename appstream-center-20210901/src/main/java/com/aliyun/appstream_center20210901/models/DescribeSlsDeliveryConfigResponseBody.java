// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeSlsDeliveryConfigResponseBody extends TeaModel {
    /**
     * <p>The list of delivery configurations that match the filter conditions. If no configurations match the conditions, an empty list is returned.</p>
     */
    @NameInMap("DeliveryConfigs")
    public java.util.List<DescribeSlsDeliveryConfigResponseBodyDeliveryConfigs> deliveryConfigs;

    /**
     * <p>The request ID used to locate the current call.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSlsDeliveryConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsDeliveryConfigResponseBody self = new DescribeSlsDeliveryConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSlsDeliveryConfigResponseBody setDeliveryConfigs(java.util.List<DescribeSlsDeliveryConfigResponseBodyDeliveryConfigs> deliveryConfigs) {
        this.deliveryConfigs = deliveryConfigs;
        return this;
    }
    public java.util.List<DescribeSlsDeliveryConfigResponseBodyDeliveryConfigs> getDeliveryConfigs() {
        return this.deliveryConfigs;
    }

    public DescribeSlsDeliveryConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStoresDeliveryScopes extends TeaModel {
        /**
         * <p>The product type of the delivery scope. For example, <code>WuyingServer</code> indicates Enterprise Edition workstations.</p>
         * 
         * <strong>example:</strong>
         * <p>WuyingServer</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The current status of the delivery configuration. Valid values:</p>
         * <ul>
         * <li><code>Stopped</code>: Delivery is stopped.</li>
         * <li><code>Enabled</code>: Delivery is enabled.</li>
         * <li><code>AbnormalLogstoreDeleted</code>: The destination Logstore is deleted, and delivery is abnormal.</li>
         * <li><code>AbnormalProjectDeleted</code>: The destination project is deleted, and delivery is abnormal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStoresDeliveryScopes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStoresDeliveryScopes self = new DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStoresDeliveryScopes();
            return TeaModel.build(map, self);
        }

        public DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStoresDeliveryScopes setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStoresDeliveryScopes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStores extends TeaModel {
        /**
         * <p>The product delivery scopes of the Logstore and the delivery status of each scope.</p>
         */
        @NameInMap("DeliveryScopes")
        public java.util.List<DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStoresDeliveryScopes> deliveryScopes;

        /**
         * <p>The name of the destination SLS Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>wuying-session-audit</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>The data retention period configured for the destination Logstore, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        public static DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStores build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStores self = new DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStores();
            return TeaModel.build(map, self);
        }

        public DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStores setDeliveryScopes(java.util.List<DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStoresDeliveryScopes> deliveryScopes) {
            this.deliveryScopes = deliveryScopes;
            return this;
        }
        public java.util.List<DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStoresDeliveryScopes> getDeliveryScopes() {
            return this.deliveryScopes;
        }

        public DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStores setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStores setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

    public static class DescribeSlsDeliveryConfigResponseBodyDeliveryConfigs extends TeaModel {
        /**
         * <p>The list of Logstore delivery configurations under the project.</p>
         */
        @NameInMap("LogStores")
        public java.util.List<DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStores> logStores;

        /**
         * <p>The name of the destination SLS project.</p>
         * 
         * <strong>example:</strong>
         * <p>wuying-audit-cn-hangzhou</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The ID of the region where the destination SLS project is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SlsRegionId")
        public String slsRegionId;

        public static DescribeSlsDeliveryConfigResponseBodyDeliveryConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlsDeliveryConfigResponseBodyDeliveryConfigs self = new DescribeSlsDeliveryConfigResponseBodyDeliveryConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeSlsDeliveryConfigResponseBodyDeliveryConfigs setLogStores(java.util.List<DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStores> logStores) {
            this.logStores = logStores;
            return this;
        }
        public java.util.List<DescribeSlsDeliveryConfigResponseBodyDeliveryConfigsLogStores> getLogStores() {
            return this.logStores;
        }

        public DescribeSlsDeliveryConfigResponseBodyDeliveryConfigs setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeSlsDeliveryConfigResponseBodyDeliveryConfigs setSlsRegionId(String slsRegionId) {
            this.slsRegionId = slsRegionId;
            return this;
        }
        public String getSlsRegionId() {
            return this.slsRegionId;
        }

    }

}
