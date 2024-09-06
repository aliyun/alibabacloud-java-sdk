// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetJobResultResp extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ossinv</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("CopiedObjectCount")
    public Long copiedObjectCount;

    /**
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("CopiedObjectSize")
    public Long copiedObjectSize;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("FailedObjectCount")
    public Long failedObjectCount;

    /**
     * <strong>example:</strong>
     * <p>test_access_id</p>
     */
    @NameInMap("InvAccessId")
    public String invAccessId;

    /**
     * <strong>example:</strong>
     * <p>test_secret_key</p>
     */
    @NameInMap("InvAccessSecret")
    public String invAccessSecret;

    /**
     * <strong>example:</strong>
     * <p>test_sys_bucket</p>
     */
    @NameInMap("InvBucket")
    public String invBucket;

    /**
     * <strong>example:</strong>
     * <p>test_domain</p>
     */
    @NameInMap("InvDomain")
    public String invDomain;

    /**
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("InvLocation")
    public String invLocation;

    /**
     * <strong>example:</strong>
     * <p>mainfest.json</p>
     */
    @NameInMap("InvPath")
    public String invPath;

    /**
     * <strong>example:</strong>
     * <p>test_region_id</p>
     */
    @NameInMap("InvRegionId")
    public String invRegionId;

    /**
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("ReadyRetry")
    public String readyRetry;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalObjectCount")
    public Long totalObjectCount;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalObjectSize")
    public Long totalObjectSize;

    /**
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
