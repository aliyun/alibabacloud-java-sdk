// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class AddressDetail extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_access_id</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_secret_key</p>
     */
    @NameInMap("AccessSecret")
    public String accessSecret;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ossinv</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("AgentList")
    public String agentList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_bucket</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_domain</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>test_inv_access_id</p>
     */
    @NameInMap("InvAccessId")
    public String invAccessId;

    /**
     * <strong>example:</strong>
     * <p>test_inv_secret_key</p>
     */
    @NameInMap("InvAccessSecret")
    public String invAccessSecret;

    /**
     * <strong>example:</strong>
     * <p>test_inv_bucket</p>
     */
    @NameInMap("InvBucket")
    public String invBucket;

    /**
     * <strong>example:</strong>
     * <p>test_inv_domain</p>
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
     * <p>manifest.json</p>
     */
    @NameInMap("InvPath")
    public String invPath;

    /**
     * <strong>example:</strong>
     * <p>test_inv_region_id</p>
     */
    @NameInMap("InvRegionId")
    public String invRegionId;

    /**
     * <strong>example:</strong>
     * <p>test_inv_role</p>
     */
    @NameInMap("InvRole")
    public String invRole;

    /**
     * <strong>example:</strong>
     * <p>test_prefix</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <strong>example:</strong>
     * <p>test_region_id</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>test_role</p>
     */
    @NameInMap("Role")
    public String role;

    public static AddressDetail build(java.util.Map<String, ?> map) throws Exception {
        AddressDetail self = new AddressDetail();
        return TeaModel.build(map, self);
    }

    public AddressDetail setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public AddressDetail setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public AddressDetail setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public AddressDetail setAgentList(String agentList) {
        this.agentList = agentList;
        return this;
    }
    public String getAgentList() {
        return this.agentList;
    }

    public AddressDetail setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public AddressDetail setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddressDetail setInvAccessId(String invAccessId) {
        this.invAccessId = invAccessId;
        return this;
    }
    public String getInvAccessId() {
        return this.invAccessId;
    }

    public AddressDetail setInvAccessSecret(String invAccessSecret) {
        this.invAccessSecret = invAccessSecret;
        return this;
    }
    public String getInvAccessSecret() {
        return this.invAccessSecret;
    }

    public AddressDetail setInvBucket(String invBucket) {
        this.invBucket = invBucket;
        return this;
    }
    public String getInvBucket() {
        return this.invBucket;
    }

    public AddressDetail setInvDomain(String invDomain) {
        this.invDomain = invDomain;
        return this;
    }
    public String getInvDomain() {
        return this.invDomain;
    }

    public AddressDetail setInvLocation(String invLocation) {
        this.invLocation = invLocation;
        return this;
    }
    public String getInvLocation() {
        return this.invLocation;
    }

    public AddressDetail setInvPath(String invPath) {
        this.invPath = invPath;
        return this;
    }
    public String getInvPath() {
        return this.invPath;
    }

    public AddressDetail setInvRegionId(String invRegionId) {
        this.invRegionId = invRegionId;
        return this;
    }
    public String getInvRegionId() {
        return this.invRegionId;
    }

    public AddressDetail setInvRole(String invRole) {
        this.invRole = invRole;
        return this;
    }
    public String getInvRole() {
        return this.invRole;
    }

    public AddressDetail setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public AddressDetail setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddressDetail setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
