// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class GetAuditLogStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the audit log feature is enabled. Valid values:</p>
     * <ul>
     * <li>enable</li>
     * <li>disable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("AuditLogStatus")
    public String auditLogStatus;

    /**
     * <p>The bucket that stores audit logs.</p>
     * 
     * <strong>example:</strong>
     * <p>bucket-test</p>
     */
    @NameInMap("AuditOssBucket")
    public String auditOssBucket;

    /**
     * <p>Indicates whether Cloud Hardware Security Module is authorized to deliver logs. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GrantedServiceAccess")
    public Boolean grantedServiceAccess;

    /**
     * <p>A list of buckets that can be used to store audit logs.</p>
     */
    @NameInMap("OssBuckets")
    public java.util.List<String> ossBuckets;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAuditLogStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuditLogStatusResponseBody self = new GetAuditLogStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuditLogStatusResponseBody setAuditLogStatus(String auditLogStatus) {
        this.auditLogStatus = auditLogStatus;
        return this;
    }
    public String getAuditLogStatus() {
        return this.auditLogStatus;
    }

    public GetAuditLogStatusResponseBody setAuditOssBucket(String auditOssBucket) {
        this.auditOssBucket = auditOssBucket;
        return this;
    }
    public String getAuditOssBucket() {
        return this.auditOssBucket;
    }

    public GetAuditLogStatusResponseBody setGrantedServiceAccess(Boolean grantedServiceAccess) {
        this.grantedServiceAccess = grantedServiceAccess;
        return this;
    }
    public Boolean getGrantedServiceAccess() {
        return this.grantedServiceAccess;
    }

    public GetAuditLogStatusResponseBody setOssBuckets(java.util.List<String> ossBuckets) {
        this.ossBuckets = ossBuckets;
        return this;
    }
    public java.util.List<String> getOssBuckets() {
        return this.ossBuckets;
    }

    public GetAuditLogStatusResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAuditLogStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuditLogStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
