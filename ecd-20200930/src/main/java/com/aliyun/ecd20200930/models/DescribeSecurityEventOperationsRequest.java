// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationsRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The code of the operation performed on the alert. Valid values:</p>
     * <br>
     * <p>*   mark_mis_info: adds the alert to the whitelist without configuring rules. This operation is triggered by adding multiple alerts to the whitelist at a time.</p>
     * <p>*   advance_mark_mis_inf: adds the alert to the whitelist by configuring advanced rules.</p>
     * <p>*   defense_mark_mis_info: adds the alert to the whitelist by configuring precise defense rules.</p>
     * <p>*   rm_mark_mis_info: removes the alert from the whitelist.</p>
     * <p>*   rm_defense_mark_mis_info: removes the alert from the whitelist configured with precise defense rules.</p>
     * <p>*   manual_handled: manually handles the alert.</p>
     * <p>*   ignore: ignores the alert.</p>
     * <p>*   quara: quarantines the source file of the malicious process.</p>
     * <p>*   block_ip: blocks access from the source IP address.</p>
     * <p>*   kill_and_quara: terminates the malicious process and quarantines the source file.</p>
     */
    @NameInMap("SecurityEventId")
    public Long securityEventId;

    public static DescribeSecurityEventOperationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationsRequest self = new DescribeSecurityEventOperationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSecurityEventOperationsRequest setSecurityEventId(Long securityEventId) {
        this.securityEventId = securityEventId;
        return this;
    }
    public Long getSecurityEventId() {
        return this.securityEventId;
    }

}
