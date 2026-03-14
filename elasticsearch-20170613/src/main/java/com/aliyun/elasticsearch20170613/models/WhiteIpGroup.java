// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class WhiteIpGroup extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PRIVATE_ES</p>
     */
    @NameInMap("WhiteIpType")
    public String whiteIpType;

    /**
     * <strong>example:</strong>
     * <p>test_group</p>
     */
    @NameInMap("groupName")
    public String groupName;

    @NameInMap("ips")
    public java.util.List<String> ips;

    public static WhiteIpGroup build(java.util.Map<String, ?> map) throws Exception {
        WhiteIpGroup self = new WhiteIpGroup();
        return TeaModel.build(map, self);
    }

    public WhiteIpGroup setWhiteIpType(String whiteIpType) {
        this.whiteIpType = whiteIpType;
        return this;
    }
    public String getWhiteIpType() {
        return this.whiteIpType;
    }

    public WhiteIpGroup setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public WhiteIpGroup setIps(java.util.List<String> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<String> getIps() {
        return this.ips;
    }

}
