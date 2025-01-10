// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListInstancesByNcdRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lni-1234****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     * <p>Maximum network communication distance</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MaxNcd")
    public Integer maxNcd;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListInstancesByNcdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesByNcdRequest self = new ListInstancesByNcdRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesByNcdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstancesByNcdRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListInstancesByNcdRequest setMaxNcd(Integer maxNcd) {
        this.maxNcd = maxNcd;
        return this;
    }
    public Integer getMaxNcd() {
        return this.maxNcd;
    }

    public ListInstancesByNcdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
