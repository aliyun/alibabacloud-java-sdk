// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class SelectedDomainListRequest extends TeaModel {
    @NameInMap("ListDate")
    public String listDate;

    public static SelectedDomainListRequest build(java.util.Map<String, ?> map) throws Exception {
        SelectedDomainListRequest self = new SelectedDomainListRequest();
        return TeaModel.build(map, self);
    }

    public SelectedDomainListRequest setListDate(String listDate) {
        this.listDate = listDate;
        return this;
    }
    public String getListDate() {
        return this.listDate;
    }

}
