// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetAccessRuleRequest extends TeaModel {
    @NameInMap("AccessGroupId")
    public String accessGroupId;

    @NameInMap("AccessRuleId")
    public String accessRuleId;

    @NameInMap("InputRegionId")
    public String inputRegionId;

    public static GetAccessRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccessRuleRequest self = new GetAccessRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetAccessRuleRequest setAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
        return this;
    }
    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    public GetAccessRuleRequest setAccessRuleId(String accessRuleId) {
        this.accessRuleId = accessRuleId;
        return this;
    }
    public String getAccessRuleId() {
        return this.accessRuleId;
    }

    public GetAccessRuleRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

}
