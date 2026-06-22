// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListWhatAppTemplateRequest extends TeaModel {
    /**
     * <p>The space ID of the ISV sub-customer or the instance ID of the direct customer.</p>
     * 
     * <strong>example:</strong>
     * <p>2983883892</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>This parameter is reserved for internal use.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("HetuParams")
    public String hetuParams;

    public static ListWhatAppTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWhatAppTemplateRequest self = new ListWhatAppTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListWhatAppTemplateRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListWhatAppTemplateRequest setHetuParams(String hetuParams) {
        this.hetuParams = hetuParams;
        return this;
    }
    public String getHetuParams() {
        return this.hetuParams;
    }

}
