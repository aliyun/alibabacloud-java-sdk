// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListStandardGroupsRequest extends TeaModel {
    /**
     * <p>The error code returned if the request fails.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListStandardGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStandardGroupsRequest self = new ListStandardGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListStandardGroupsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
