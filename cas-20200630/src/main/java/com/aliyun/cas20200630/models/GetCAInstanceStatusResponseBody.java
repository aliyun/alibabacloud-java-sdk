// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class GetCAInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>The status information of the private CA instance.</p>
     */
    @NameInMap("InstanceStatusList")
    public java.util.List<GetCAInstanceStatusResponseBodyInstanceStatusList> instanceStatusList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCAInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCAInstanceStatusResponseBody self = new GetCAInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCAInstanceStatusResponseBody setInstanceStatusList(java.util.List<GetCAInstanceStatusResponseBodyInstanceStatusList> instanceStatusList) {
        this.instanceStatusList = instanceStatusList;
        return this;
    }
    public java.util.List<GetCAInstanceStatusResponseBodyInstanceStatusList> getInstanceStatusList() {
        return this.instanceStatusList;
    }

    public GetCAInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCAInstanceStatusResponseBodyInstanceStatusList extends TeaModel {
        /**
         * <p>The expiration date of the private CA certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * <br>
         * <p>>  This parameter is returned only when the value of the **Status** parameter is **USED** or **REVOKE**. The value USED indicates that the private CA instance is enabled, and the value REVOKE indicates that the instance is revoked.</p>
         */
        @NameInMap("AfterTime")
        public Long afterTime;

        /**
         * <p>The issuance date of the private CA certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * <br>
         * <p>>  This parameter is returned only when the value of the **Status** parameter is **USED** or **REVOKE**. The value USED indicates that the private CA instance is enabled, and the value REVOKE indicates that the instance is revoked.</p>
         */
        @NameInMap("BeforeTime")
        public Long beforeTime;

        /**
         * <p>The number of certificates that are issued by using the private CA instance.</p>
         */
        @NameInMap("CertIssuedCount")
        public Integer certIssuedCount;

        /**
         * <p>The number of certificates that can be issued by using the private CA instance.</p>
         * <br>
         * <p>For a private root CA instance whose **Type** is **ROOT**, this parameter indicates the number of intermediate CA certificates that can be issued.</p>
         * <br>
         * <p>For a private intermediate CA instance whose **Type** is **SUB_ROOT**, this parameter indicates the total number of client certificates and server certificates that can be issued</p>
         */
        @NameInMap("CertTotalCount")
        public Integer certTotalCount;

        /**
         * <p>The unique identifier of the private CA certificate.</p>
         * <br>
         * <p>>  This parameter is returned only when the value of the **Status** parameter is **USED** or **REVOKE**. The value USED indicates that the private CA instance is enabled, and the value REVOKE indicates that the instance is revoked.</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The ID of the private CA instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the private CA instance. Valid values:</p>
         * <br>
         * <p>*   **BUY**: The private CA instance is purchased but is not enabled.</p>
         * <p>*   **USED**: The private CA instance is enabled.</p>
         * <p>*   **REFUND**: The private CA instance is refunded.</p>
         * <p>*   **REVOKE**: The private CA instance is revoked.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the private CA instance. Valid values:</p>
         * <br>
         * <p>*   **ROOT**: root CA instance</p>
         * <p>*   **SUB_ROOT**: intermediate CA instance</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The expiration date of the private CA instance. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * <br>
         * <p>>  This parameter corresponds to the duration that you select when you purchase the private CA instance. The duration indicates the subscription period of the Private Certificate Authority (PCA) service.</p>
         */
        @NameInMap("UseExpireTime")
        public Long useExpireTime;

        public static GetCAInstanceStatusResponseBodyInstanceStatusList build(java.util.Map<String, ?> map) throws Exception {
            GetCAInstanceStatusResponseBodyInstanceStatusList self = new GetCAInstanceStatusResponseBodyInstanceStatusList();
            return TeaModel.build(map, self);
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setAfterTime(Long afterTime) {
            this.afterTime = afterTime;
            return this;
        }
        public Long getAfterTime() {
            return this.afterTime;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setBeforeTime(Long beforeTime) {
            this.beforeTime = beforeTime;
            return this;
        }
        public Long getBeforeTime() {
            return this.beforeTime;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setCertIssuedCount(Integer certIssuedCount) {
            this.certIssuedCount = certIssuedCount;
            return this;
        }
        public Integer getCertIssuedCount() {
            return this.certIssuedCount;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setCertTotalCount(Integer certTotalCount) {
            this.certTotalCount = certTotalCount;
            return this;
        }
        public Integer getCertTotalCount() {
            return this.certTotalCount;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCAInstanceStatusResponseBodyInstanceStatusList setUseExpireTime(Long useExpireTime) {
            this.useExpireTime = useExpireTime;
            return this;
        }
        public Long getUseExpireTime() {
            return this.useExpireTime;
        }

    }

}
