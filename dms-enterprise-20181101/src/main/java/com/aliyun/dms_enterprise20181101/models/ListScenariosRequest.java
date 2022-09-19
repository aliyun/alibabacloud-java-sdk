// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListScenariosRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    public static ListScenariosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScenariosRequest self = new ListScenariosRequest();
        return TeaModel.build(map, self);
    }

    public ListScenariosRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
