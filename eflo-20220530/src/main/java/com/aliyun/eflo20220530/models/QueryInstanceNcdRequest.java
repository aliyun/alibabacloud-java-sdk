// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class QueryInstanceNcdRequest extends TeaModel {
    /**
     * <p>Instance 1ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lni-1235****</p>
     */
    @NameInMap("InstanceId1")
    public String instanceId1;

    /**
     * <p>Instance 2ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lni-1234****</p>
     */
    @NameInMap("InstanceId2")
    public String instanceId2;

    /**
     * <p>The parameter that specifies the instance type.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>node: Lingjun node.</li>
     * <li>lni: lingjun network interface controller.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lni</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static QueryInstanceNcdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceNcdRequest self = new QueryInstanceNcdRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstanceNcdRequest setInstanceId1(String instanceId1) {
        this.instanceId1 = instanceId1;
        return this;
    }
    public String getInstanceId1() {
        return this.instanceId1;
    }

    public QueryInstanceNcdRequest setInstanceId2(String instanceId2) {
        this.instanceId2 = instanceId2;
        return this;
    }
    public String getInstanceId2() {
        return this.instanceId2;
    }

    public QueryInstanceNcdRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public QueryInstanceNcdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
