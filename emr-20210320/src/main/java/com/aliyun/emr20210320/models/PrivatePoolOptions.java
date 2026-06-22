// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class PrivatePoolOptions extends TeaModel {
    /**
     * <p>The type of private pool that you want to use to start ECS instances. A private pool is generated when an elasticity assurance or a capacity reservation takes effect. You can select a private pool for starting ECS instances. Valid values: Open, Target, and None. If you set the parameter to Open, the system selects an open private pool to start instances. If no matching open private pools exist, the resources in the public pool are used. In this case, you do not need to specify the ID of the private pool. If you set the parameter to Target, the resources in the specified private pool are used to start ECS instances. If the specified private pool does not exist, ECS instances cannot be started. You must specify the ID of the private pool when you set the parameter to Target. If you set the parameter to None, the resources in private pools are not used to start instances. Default value: None.</p>
     * 
     * <strong>example:</strong>
     * <p>Open</p>
     */
    @NameInMap("MatchCriteria")
    public String matchCriteria;

    /**
     * <p>The IDs of the private pools.</p>
     * 
     * <strong>example:</strong>
     * <p>eap-bp67acfmxazb4****</p>
     */
    @NameInMap("PrivatePoolIds")
    public java.util.List<String> privatePoolIds;

    public static PrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
        PrivatePoolOptions self = new PrivatePoolOptions();
        return TeaModel.build(map, self);
    }

    public PrivatePoolOptions setMatchCriteria(String matchCriteria) {
        this.matchCriteria = matchCriteria;
        return this;
    }
    public String getMatchCriteria() {
        return this.matchCriteria;
    }

    public PrivatePoolOptions setPrivatePoolIds(java.util.List<String> privatePoolIds) {
        this.privatePoolIds = privatePoolIds;
        return this;
    }
    public java.util.List<String> getPrivatePoolIds() {
        return this.privatePoolIds;
    }

}
