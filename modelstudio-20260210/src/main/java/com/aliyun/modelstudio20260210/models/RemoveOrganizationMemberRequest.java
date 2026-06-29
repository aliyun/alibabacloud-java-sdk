// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class RemoveOrganizationMemberRequest extends TeaModel {
    /**
     * <p>The list of member account IDs to be removed.</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>The language. Valid values: zh-CN and en-US.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Locale")
    public String locale;

    public static RemoveOrganizationMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveOrganizationMemberRequest self = new RemoveOrganizationMemberRequest();
        return TeaModel.build(map, self);
    }

    public RemoveOrganizationMemberRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public RemoveOrganizationMemberRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

}
