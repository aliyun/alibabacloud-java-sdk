// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class SetInstanceModeOnDemandRequest extends TeaModel {
    /**
     * <p>The IDs of on-demand instances.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/152120.html">DescribeOnDemandInstance</a> operation to query the IDs of all on-demand instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-z2q1qzxb****</p>
     */
    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    /**
     * <p>Specifies the scheduling mode for on-demand instances. Valid values:</p>
     * <ul>
     * <li><strong>manual</strong>: manual scheduling</li>
     * <li><strong>netflow-auto</strong>: automatic scheduling</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>netflow-auto</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The region ID of the on-demand instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query all regions that are supported by Anti-DDoS Origin.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SetInstanceModeOnDemandRequest build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceModeOnDemandRequest self = new SetInstanceModeOnDemandRequest();
        return TeaModel.build(map, self);
    }

    public SetInstanceModeOnDemandRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public SetInstanceModeOnDemandRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public SetInstanceModeOnDemandRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
