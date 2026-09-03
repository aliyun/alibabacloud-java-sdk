// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class AddressDetail extends TeaModel {
    /**
     * <p>The AccessKey ID used to access the bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_access_id</p>
     */
    @NameInMap("AccessId")
    public String accessId;

    /**
     * <p>The AccessKey Secret used to access the bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_secret_key</p>
     */
    @NameInMap("AccessSecret")
    public String accessSecret;

    /**
     * <p>The address type. Valid values:</p>
     * <p>Object storage: <code>oss</code>, <code>s3</code>, <code>qiniu</code>, <code>cos</code>, <code>bos</code>, <code>obs</code>, <code>ks3</code>, <code>ucloud</code>, <code>upyun</code>, <code>azure</code>, <code>gcp</code>, and <code>tos</code>.</p>
     * <p>File storage: <code>local</code>, <code>obsfs</code>, and <code>ftp</code>.</p>
     * <p>Inventory: <code>inv</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ossinv</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>A list of agents required to access data over a leased line or a VPN connection.</p>
     * 
     * <strong>example:</strong>
     * <p>agent1,agent2</p>
     */
    @NameInMap("AgentList")
    public String agentList;

    /**
     * <p>The name of the bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_bucket</p>
     */
    @NameInMap("Bucket")
    public String bucket;

    /**
     * <p>Specifies the underlying storage type, such as <code>oss</code>, <code>s3</code>, or <code>obs</code>, when <code>AddressType</code> is <code>inv</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The domain of the bucket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_domain</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("HdfsAuthConfig")
    public HdfsAuthConfig hdfsAuthConfig;

    /**
     * <p>The AccessKey ID used to access the inventory bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>test_inv_access_id</p>
     */
    @NameInMap("InvAccessId")
    public String invAccessId;

    /**
     * <p>The AccessKey Secret used to access the inventory bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>test_inv_secret_key</p>
     */
    @NameInMap("InvAccessSecret")
    public String invAccessSecret;

    /**
     * <p>The name of the inventory bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>test_inv_bucket</p>
     */
    @NameInMap("InvBucket")
    public String invBucket;

    /**
     * <p>The domain of the inventory bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>test_inv_domain</p>
     */
    @NameInMap("InvDomain")
    public String invDomain;

    /**
     * <p>The type of the inventory bucket.<br>
     * Valid values: <code>oss</code> and <code>s3</code>.<br></p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("InvLocation")
    public String invLocation;

    /**
     * <p>The path to the manifest file, which lists the objects and their format.</p>
     * 
     * <strong>example:</strong>
     * <p>manifest.json</p>
     */
    @NameInMap("InvPath")
    public String invPath;

    /**
     * <p>The region of the inventory bucket. This parameter is required for OSS inventory buckets and eliminates the need to specify a domain. Use the OSS-specific region ID format.</p>
     * 
     * <strong>example:</strong>
     * <p>test_inv_region_id</p>
     */
    @NameInMap("InvRegionId")
    public String invRegionId;

    /**
     * <p>The authorization role for the inventory bucket. If the inventory bucket is an OSS bucket, you can use this role to grant access instead of an AccessKey.</p>
     * 
     * <strong>example:</strong>
     * <p>test_inv_role</p>
     */
    @NameInMap("InvRole")
    public String invRole;

    /**
     * <p>The object prefix in the bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>test_prefix</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    /**
     * <p>The region of the bucket. This parameter is required for OSS buckets and eliminates the need to specify a domain. Use the OSS-specific region ID format.</p>
     * 
     * <strong>example:</strong>
     * <p>test_region_id</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The authorization role. If the bucket is an OSS bucket, you can use this role to grant access instead of an AccessKey.</p>
     * 
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

    public AddressDetail setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public AddressDetail setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddressDetail setHdfsAuthConfig(HdfsAuthConfig hdfsAuthConfig) {
        this.hdfsAuthConfig = hdfsAuthConfig;
        return this;
    }
    public HdfsAuthConfig getHdfsAuthConfig() {
        return this.hdfsAuthConfig;
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
