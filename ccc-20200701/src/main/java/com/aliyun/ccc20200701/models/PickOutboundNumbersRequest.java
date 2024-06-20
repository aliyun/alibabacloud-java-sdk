// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class PickOutboundNumbersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1388888****</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;skillgroup@ccc-test&quot;]</p>
     */
    @NameInMap("SkillGroupIdList")
    public String skillGroupIdList;

    public static PickOutboundNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        PickOutboundNumbersRequest self = new PickOutboundNumbersRequest();
        return TeaModel.build(map, self);
    }

    public PickOutboundNumbersRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public PickOutboundNumbersRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public PickOutboundNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PickOutboundNumbersRequest setSkillGroupIdList(String skillGroupIdList) {
        this.skillGroupIdList = skillGroupIdList;
        return this;
    }
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

}
