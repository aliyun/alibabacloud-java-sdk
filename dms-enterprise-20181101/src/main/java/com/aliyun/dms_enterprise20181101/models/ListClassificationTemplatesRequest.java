// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListClassificationTemplatesRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    public static ListClassificationTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClassificationTemplatesRequest self = new ListClassificationTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListClassificationTemplatesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
