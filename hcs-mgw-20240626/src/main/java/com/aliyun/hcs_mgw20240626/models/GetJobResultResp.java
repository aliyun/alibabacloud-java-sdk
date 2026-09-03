// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetJobResultResp extends TeaModel {
    /**
     * <p>The data address type for the retry job. This value indicates that the data address is constructed from a failed file inventory. Use this value as the AddressType parameter when you create a data address for a retry job.</p>
     * 
     * <strong>example:</strong>
     * <p>ossinv</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The number of objects that were processed successfully. This value includes both migrated objects and skipped objects.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("CopiedObjectCount")
    public Long copiedObjectCount;

    /**
     * <p>The total size of objects that were processed successfully. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("CopiedObjectSize")
    public Long copiedObjectSize;

    /**
     * <p>The number of objects that failed to migrate.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("FailedObjectCount")
    public Long failedObjectCount;

    /**
     * <p>The AccessKey ID that is used to access the bucket where the failed file list is stored. Use this value as the InvAccessId parameter when you create a data address for a retry job.</p>
     * 
     * <strong>example:</strong>
     * <p>test_access_id</p>
     */
    @NameInMap("InvAccessId")
    public String invAccessId;

    /**
     * <p>The AccessKey secret that is used to access the bucket where the failed file list is stored. Use this value as the InvAccessSecret parameter when you create a data address for a retry job.</p>
     * 
     * <strong>example:</strong>
     * <p>test_secret_key</p>
     */
    @NameInMap("InvAccessSecret")
    public String invAccessSecret;

    /**
     * <p>The name of the bucket that stores the failed file list. Use this value as the InvBucket parameter when you create a data address for a retry job.</p>
     * 
     * <strong>example:</strong>
     * <p>test_sys_bucket</p>
     */
    @NameInMap("InvBucket")
    public String invBucket;

    /**
     * <p>The endpoint of the bucket that stores the failed file list. Use this value as the InvDomain parameter when you create a data address for a retry job.</p>
     * 
     * <strong>example:</strong>
     * <p>test_domain</p>
     */
    @NameInMap("InvDomain")
    public String invDomain;

    /**
     * <p>The storage type of the bucket that stores the failed file list, such as oss. Use this value as the InvLocation parameter when you create a data address for a retry job.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("InvLocation")
    public String invLocation;

    /**
     * <p>The path to the manifest file that lists the failed files. Use this value as the InvPath parameter when you create a data address for a retry job.</p>
     * 
     * <strong>example:</strong>
     * <p>mainfest.json</p>
     */
    @NameInMap("InvPath")
    public String invPath;

    /**
     * <p>The region ID of the bucket that stores the failed file list. Use this value as the InvRegionId parameter when you create a data address for a retry job.</p>
     * 
     * <strong>example:</strong>
     * <p>test_region_id</p>
     */
    @NameInMap("InvRegionId")
    public String invRegionId;

    /**
     * <p>The retry readiness status for failed files. Valid values: NoNeed indicates that all files were migrated successfully and no retry is required. Ready indicates that the failed file list has been generated and is available for retry. NotReady indicates that the failed file list is being generated.<br><br></p>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("ReadyRetry")
    public String readyRetry;

    /**
     * <p>The number of objects that were skipped during migration. Objects are skipped when they already exist at the destination and meet the configured skip conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("SkippedObjectCount")
    public Long skippedObjectCount;

    /**
     * <p>The total size of objects that were skipped during migration. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000</p>
     */
    @NameInMap("SkippedObjectSize")
    public Long skippedObjectSize;

    /**
     * <p>The total number of objects in the source data address.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalObjectCount")
    public Long totalObjectCount;

    /**
     * <p>The total size of all objects in the source data address. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalObjectSize")
    public Long totalObjectSize;

    /**
     * <p>The unique identifier of the migration job.</p>
     * 
     * <strong>example:</strong>
     * <p>test_job_id</p>
     */
    @NameInMap("Version")
    public String version;

    public static GetJobResultResp build(java.util.Map<String, ?> map) throws Exception {
        GetJobResultResp self = new GetJobResultResp();
        return TeaModel.build(map, self);
    }

    public GetJobResultResp setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public GetJobResultResp setCopiedObjectCount(Long copiedObjectCount) {
        this.copiedObjectCount = copiedObjectCount;
        return this;
    }
    public Long getCopiedObjectCount() {
        return this.copiedObjectCount;
    }

    public GetJobResultResp setCopiedObjectSize(Long copiedObjectSize) {
        this.copiedObjectSize = copiedObjectSize;
        return this;
    }
    public Long getCopiedObjectSize() {
        return this.copiedObjectSize;
    }

    public GetJobResultResp setFailedObjectCount(Long failedObjectCount) {
        this.failedObjectCount = failedObjectCount;
        return this;
    }
    public Long getFailedObjectCount() {
        return this.failedObjectCount;
    }

    public GetJobResultResp setInvAccessId(String invAccessId) {
        this.invAccessId = invAccessId;
        return this;
    }
    public String getInvAccessId() {
        return this.invAccessId;
    }

    public GetJobResultResp setInvAccessSecret(String invAccessSecret) {
        this.invAccessSecret = invAccessSecret;
        return this;
    }
    public String getInvAccessSecret() {
        return this.invAccessSecret;
    }

    public GetJobResultResp setInvBucket(String invBucket) {
        this.invBucket = invBucket;
        return this;
    }
    public String getInvBucket() {
        return this.invBucket;
    }

    public GetJobResultResp setInvDomain(String invDomain) {
        this.invDomain = invDomain;
        return this;
    }
    public String getInvDomain() {
        return this.invDomain;
    }

    public GetJobResultResp setInvLocation(String invLocation) {
        this.invLocation = invLocation;
        return this;
    }
    public String getInvLocation() {
        return this.invLocation;
    }

    public GetJobResultResp setInvPath(String invPath) {
        this.invPath = invPath;
        return this;
    }
    public String getInvPath() {
        return this.invPath;
    }

    public GetJobResultResp setInvRegionId(String invRegionId) {
        this.invRegionId = invRegionId;
        return this;
    }
    public String getInvRegionId() {
        return this.invRegionId;
    }

    public GetJobResultResp setReadyRetry(String readyRetry) {
        this.readyRetry = readyRetry;
        return this;
    }
    public String getReadyRetry() {
        return this.readyRetry;
    }

    public GetJobResultResp setSkippedObjectCount(Long skippedObjectCount) {
        this.skippedObjectCount = skippedObjectCount;
        return this;
    }
    public Long getSkippedObjectCount() {
        return this.skippedObjectCount;
    }

    public GetJobResultResp setSkippedObjectSize(Long skippedObjectSize) {
        this.skippedObjectSize = skippedObjectSize;
        return this;
    }
    public Long getSkippedObjectSize() {
        return this.skippedObjectSize;
    }

    public GetJobResultResp setTotalObjectCount(Long totalObjectCount) {
        this.totalObjectCount = totalObjectCount;
        return this;
    }
    public Long getTotalObjectCount() {
        return this.totalObjectCount;
    }

    public GetJobResultResp setTotalObjectSize(Long totalObjectSize) {
        this.totalObjectSize = totalObjectSize;
        return this;
    }
    public Long getTotalObjectSize() {
        return this.totalObjectSize;
    }

    public GetJobResultResp setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
