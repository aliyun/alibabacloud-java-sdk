// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeUserRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <strong>example:</strong>
     * <p>alex</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("RequireExtraAttributes")
    public java.util.List<String> requireExtraAttributes;

    public static DescribeUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserRequest self = new DescribeUserRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public DescribeUserRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeUserRequest setRequireExtraAttributes(java.util.List<String> requireExtraAttributes) {
        this.requireExtraAttributes = requireExtraAttributes;
        return this;
    }
    public java.util.List<String> getRequireExtraAttributes() {
        return this.requireExtraAttributes;
    }

}
