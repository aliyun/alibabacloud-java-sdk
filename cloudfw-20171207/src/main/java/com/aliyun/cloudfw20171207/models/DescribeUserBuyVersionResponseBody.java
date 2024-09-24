// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserBuyVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>119898001566xxxx</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <strong>example:</strong>
     * <p>1726934400000</p>
     */
    @NameInMap("Expire")
    public Long expire;

    /**
     * <strong>example:</strong>
     * <p>vipcloudfw-cn-xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("IpNumber")
    public Long ipNumber;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LogStatus")
    public Boolean logStatus;

    /**
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("LogStorage")
    public Long logStorage;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxOverflow")
    public Long maxOverflow;

    /**
     * <strong>example:</strong>
     * <p>F71B03EE-xxxxx-91D79CC6AA1A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1692504764000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UserStatus")
    public Boolean userStatus;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Version")
    public Integer version;

    /**
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("VpcNumber")
    public Long vpcNumber;

    public static DescribeUserBuyVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBuyVersionResponseBody self = new DescribeUserBuyVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserBuyVersionResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeUserBuyVersionResponseBody setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public DescribeUserBuyVersionResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeUserBuyVersionResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeUserBuyVersionResponseBody setIpNumber(Long ipNumber) {
        this.ipNumber = ipNumber;
        return this;
    }
    public Long getIpNumber() {
        return this.ipNumber;
    }

    public DescribeUserBuyVersionResponseBody setLogStatus(Boolean logStatus) {
        this.logStatus = logStatus;
        return this;
    }
    public Boolean getLogStatus() {
        return this.logStatus;
    }

    public DescribeUserBuyVersionResponseBody setLogStorage(Long logStorage) {
        this.logStorage = logStorage;
        return this;
    }
    public Long getLogStorage() {
        return this.logStorage;
    }

    public DescribeUserBuyVersionResponseBody setMaxOverflow(Long maxOverflow) {
        this.maxOverflow = maxOverflow;
        return this;
    }
    public Long getMaxOverflow() {
        return this.maxOverflow;
    }

    public DescribeUserBuyVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserBuyVersionResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeUserBuyVersionResponseBody setUserStatus(Boolean userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public Boolean getUserStatus() {
        return this.userStatus;
    }

    public DescribeUserBuyVersionResponseBody setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

    public DescribeUserBuyVersionResponseBody setVpcNumber(Long vpcNumber) {
        this.vpcNumber = vpcNumber;
        return this;
    }
    public Long getVpcNumber() {
        return this.vpcNumber;
    }

}
