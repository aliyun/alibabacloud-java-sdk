// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceStatusResponseBody extends TeaModel {
    /**
     * <p>The number of unavailable addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AddrNotAvailableNum")
    public Integer addrNotAvailableNum;

    /**
     * <p>The number of unavailable address pools.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AddrPoolNotAvailableNum")
    public Integer addrPoolNotAvailableNum;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>389DFFA3-77A5-4A9E-BF3D-147C6F98A5BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the instance. Valid values:</p>
     * <ul>
     * <li><p>ALLOW: Operations are allowed.</p>
     * </li>
     * <li><p>DENY: Operations are denied.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALLOW</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>A list of reasons for the instance status. Valid values:</p>
     * <ul>
     * <li><p>INSTANCE_OPERATE_BLACK_LIST: The instance is in a blacklist.</p>
     * </li>
     * <li><p>BETA_INSTANCE: The instance is in public preview.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;BETA_INSTANCE&quot;]</p>
     */
    @NameInMap("StatusReason")
    public String statusReason;

    /**
     * <p>The number of access policies for which the active address pool is unavailable.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("StrategyNotAvailableNum")
    public Integer strategyNotAvailableNum;

    /**
     * <p>The number of access policies that are switched to the failover address pool.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SwitchToFailoverStrategyNum")
    public Integer switchToFailoverStrategyNum;

    public static DescribeGtmInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceStatusResponseBody self = new DescribeGtmInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceStatusResponseBody setAddrNotAvailableNum(Integer addrNotAvailableNum) {
        this.addrNotAvailableNum = addrNotAvailableNum;
        return this;
    }
    public Integer getAddrNotAvailableNum() {
        return this.addrNotAvailableNum;
    }

    public DescribeGtmInstanceStatusResponseBody setAddrPoolNotAvailableNum(Integer addrPoolNotAvailableNum) {
        this.addrPoolNotAvailableNum = addrPoolNotAvailableNum;
        return this;
    }
    public Integer getAddrPoolNotAvailableNum() {
        return this.addrPoolNotAvailableNum;
    }

    public DescribeGtmInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmInstanceStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGtmInstanceStatusResponseBody setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public DescribeGtmInstanceStatusResponseBody setStrategyNotAvailableNum(Integer strategyNotAvailableNum) {
        this.strategyNotAvailableNum = strategyNotAvailableNum;
        return this;
    }
    public Integer getStrategyNotAvailableNum() {
        return this.strategyNotAvailableNum;
    }

    public DescribeGtmInstanceStatusResponseBody setSwitchToFailoverStrategyNum(Integer switchToFailoverStrategyNum) {
        this.switchToFailoverStrategyNum = switchToFailoverStrategyNum;
        return this;
    }
    public Integer getSwitchToFailoverStrategyNum() {
        return this.switchToFailoverStrategyNum;
    }

}
