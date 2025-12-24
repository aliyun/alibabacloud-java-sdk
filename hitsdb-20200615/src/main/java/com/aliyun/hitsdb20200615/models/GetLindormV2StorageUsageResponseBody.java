// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormV2StorageUsageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;AuthAction&quot;:&quot;xxx&quot;,&quot;AuthPrincipalDisplayName&quot;:&quot;222&quot;,&quot;AuthPrincipalOwnerId&quot;:&quot;111&quot;,&quot;AuthPrincipalType&quot;:&quot;SubUser&quot;,,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;,&quot;EncodedDiagnosticMessage&quot;:&quot;xxxxxx&quot;}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("CapacityByDiskCategory")
    public java.util.List<java.util.Map<String, ?>> capacityByDiskCategory;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;cn-hangzhou-i&quot;: {
     *       &quot;diskTypeCapacity&quot;: [
     *         {
     *           &quot;mode&quot;: &quot;CLOUD_STORAGE&quot;,
     *           &quot;perfLevel&quot;: &quot;PL1&quot;,
     *           &quot;usedCapacity&quot;: 0,
     *           &quot;category&quot;: &quot;PERF_CLOUD_ESSD_PL1&quot;,
     *           &quot;capacity&quot;: 4000
     *         }
     *       ],
     *       &quot;diskTypeUsage&quot;: [
     *         {
     *           &quot;usedLindormColumn3&quot;: 688935,
     *           &quot;usedLindormTable&quot;: 1086288931872,
     *           &quot;usedLindormTsdb&quot;: 0,
     *           &quot;usedOther&quot;: 0,
     *           &quot;usedLindormMessage3&quot;: 0,
     *           &quot;diskType&quot;: &quot;PerformanceCloudStorage&quot;,
     *           &quot;used&quot;: 1719816329046,
     *           &quot;usedLindormSearch3&quot;: 36339905446,
     *           &quot;usedLindormSpark&quot;: 2131936938,
     *           &quot;capacity&quot;: 4294967296000,
     *           &quot;usedLindormSearch&quot;: 0,
     *           &quot;usedLindormVector3&quot;: 595054865855
     *         }
     *       ]
     *     }
     *   }</p>
     */
    @NameInMap("InstanceStorageZoneMap")
    public java.util.Map<String, ?> instanceStorageZoneMap;

    /**
     * <strong>example:</strong>
     * <p>BDDB1954-002B-4249-B2DF-2CDDA0259668</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UsageByDiskCategory")
    public java.util.List<java.util.Map<String, ?>> usageByDiskCategory;

    public static GetLindormV2StorageUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormV2StorageUsageResponseBody self = new GetLindormV2StorageUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormV2StorageUsageResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetLindormV2StorageUsageResponseBody setCapacityByDiskCategory(java.util.List<java.util.Map<String, ?>> capacityByDiskCategory) {
        this.capacityByDiskCategory = capacityByDiskCategory;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getCapacityByDiskCategory() {
        return this.capacityByDiskCategory;
    }

    public GetLindormV2StorageUsageResponseBody setInstanceStorageZoneMap(java.util.Map<String, ?> instanceStorageZoneMap) {
        this.instanceStorageZoneMap = instanceStorageZoneMap;
        return this;
    }
    public java.util.Map<String, ?> getInstanceStorageZoneMap() {
        return this.instanceStorageZoneMap;
    }

    public GetLindormV2StorageUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLindormV2StorageUsageResponseBody setUsageByDiskCategory(java.util.List<java.util.Map<String, ?>> usageByDiskCategory) {
        this.usageByDiskCategory = usageByDiskCategory;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getUsageByDiskCategory() {
        return this.usageByDiskCategory;
    }

}
