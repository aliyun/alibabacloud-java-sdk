// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDispatchRuleRequest extends TeaModel {
    /**
     * <p>The name of the notification policy. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Prod</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <ul>
     * <li>The type of notification policies to be queried. Valid values: <code>false</code> (default): notification policies created in Application Real-Time Monitoring Service (ARMS).</li>
     * <li><code>true</code>: notification policies created in an external system.</li>
     * </ul>
     * <blockquote>
     * <p> You cannot use the ARMS console to modify the dispatch rules of a notification policy that is created in an external system.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("System")
    public Boolean system;

    public static ListDispatchRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDispatchRuleRequest self = new ListDispatchRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListDispatchRuleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDispatchRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDispatchRuleRequest setSystem(Boolean system) {
        this.system = system;
        return this;
    }
    public Boolean getSystem() {
        return this.system;
    }

}
