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
     * 
     * <strong>example:</strong>
     * <p>25589516-2A56-5159-AB88-4A1D9824E183</p>
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
         * <blockquote>
         * <p> This parameter is returned only when the value of the <strong>Status</strong> parameter is <strong>USED</strong> or <strong>REVOKE</strong>. The value USED indicates that the private CA instance is enabled, and the value REVOKE indicates that the instance is revoked.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1792944000000</p>
         */
        @NameInMap("AfterTime")
        public Long afterTime;

        /**
         * <p>The issuance date of the private CA certificate. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * <blockquote>
         * <p> This parameter is returned only when the value of the <strong>Status</strong> parameter is <strong>USED</strong> or <strong>REVOKE</strong>. The value USED indicates that the private CA instance is enabled, and the value REVOKE indicates that the instance is revoked.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1635177600000</p>
         */
        @NameInMap("BeforeTime")
        public Long beforeTime;

        /**
         * <p>The number of certificates that are issued by using the private CA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CertIssuedCount")
        public Integer certIssuedCount;

        /**
         * <p>The number of certificates that can be issued by using the private CA instance.</p>
         * <p>For a private root CA instance whose <strong>Type</strong> is <strong>ROOT</strong>, this parameter indicates the number of intermediate CA certificates that can be issued.</p>
         * <p>For a private intermediate CA instance whose <strong>Type</strong> is <strong>SUB_ROOT</strong>, this parameter indicates the total number of client certificates and server certificates that can be issued</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CertTotalCount")
        public Integer certTotalCount;

        /**
         * <p>The unique identifier of the private CA certificate.</p>
         * <blockquote>
         * <p> This parameter is returned only when the value of the <strong>Status</strong> parameter is <strong>USED</strong> or <strong>REVOKE</strong>. The value USED indicates that the private CA instance is enabled, and the value REVOKE indicates that the instance is revoked.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a7bb2dd212a2112128cd5cc9b753****</p>
         */
        @NameInMap("Identifier")
        public String identifier;

        /**
         * <p>The ID of the private CA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cas-member-0hmi****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the private CA instance. Valid values:</p>
         * <ul>
         * <li><strong>BUY</strong>: The private CA instance is purchased but is not enabled.</li>
         * <li><strong>USED</strong>: The private CA instance is enabled.</li>
         * <li><strong>REFUND</strong>: The private CA instance is refunded.</li>
         * <li><strong>REVOKE</strong>: The private CA instance is revoked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of the private CA instance. Valid values:</p>
         * <ul>
         * <li><strong>ROOT</strong>: root CA instance</li>
         * <li><strong>SUB_ROOT</strong>: intermediate CA instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ROOT</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The expiration date of the private CA instance. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * <blockquote>
         * <p> This parameter corresponds to the duration that you select when you purchase the private CA instance. The duration indicates the subscription period of the Private Certificate Authority (PCA) service.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1637251200000</p>
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
