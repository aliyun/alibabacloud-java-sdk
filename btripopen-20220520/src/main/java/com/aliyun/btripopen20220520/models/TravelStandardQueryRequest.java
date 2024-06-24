// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TravelStandardQueryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("from_group")
    public Boolean fromGroup;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2006523763</p>
     */
    @NameInMap("rule_code")
    public Long ruleCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("service_type_list")
    public java.util.List<String> serviceTypeList;

    public static TravelStandardQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        TravelStandardQueryRequest self = new TravelStandardQueryRequest();
        return TeaModel.build(map, self);
    }

    public TravelStandardQueryRequest setFromGroup(Boolean fromGroup) {
        this.fromGroup = fromGroup;
        return this;
    }
    public Boolean getFromGroup() {
        return this.fromGroup;
    }

    public TravelStandardQueryRequest setRuleCode(Long ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public Long getRuleCode() {
        return this.ruleCode;
    }

    public TravelStandardQueryRequest setServiceTypeList(java.util.List<String> serviceTypeList) {
        this.serviceTypeList = serviceTypeList;
        return this;
    }
    public java.util.List<String> getServiceTypeList() {
        return this.serviceTypeList;
    }

}
