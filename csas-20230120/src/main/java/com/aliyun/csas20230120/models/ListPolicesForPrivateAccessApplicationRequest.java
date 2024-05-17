// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPolicesForPrivateAccessApplicationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    public static ListPolicesForPrivateAccessApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPolicesForPrivateAccessApplicationRequest self = new ListPolicesForPrivateAccessApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ListPolicesForPrivateAccessApplicationRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

}
