// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDefaultIPSConfigResponseBody extends TeaModel {
    /**
     * <p>Indicates whether basic policies are enabled. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("BasicRules")
    public Integer basicRules;

    /**
     * <p>Indicates whether virtual patching is enabled. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("EnableAllPatch")
    public Integer enableAllPatch;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The mode of the intrusion prevention system (IPS). Valid values:</p>
     * <br>
     * <p>*   **1**: block mode</p>
     * <p>*   **0**: monitor mode</p>
     */
    @NameInMap("RunMode")
    public Integer runMode;

    public static DescribeVpcFirewallDefaultIPSConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallDefaultIPSConfigResponseBody self = new DescribeVpcFirewallDefaultIPSConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallDefaultIPSConfigResponseBody setBasicRules(Integer basicRules) {
        this.basicRules = basicRules;
        return this;
    }
    public Integer getBasicRules() {
        return this.basicRules;
    }

    public DescribeVpcFirewallDefaultIPSConfigResponseBody setEnableAllPatch(Integer enableAllPatch) {
        this.enableAllPatch = enableAllPatch;
        return this;
    }
    public Integer getEnableAllPatch() {
        return this.enableAllPatch;
    }

    public DescribeVpcFirewallDefaultIPSConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallDefaultIPSConfigResponseBody setRunMode(Integer runMode) {
        this.runMode = runMode;
        return this;
    }
    public Integer getRunMode() {
        return this.runMode;
    }

}
