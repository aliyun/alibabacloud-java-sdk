// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAllPublicMediaTagsRequest extends TeaModel {
    // 媒资业务类型
    @NameInMap("BusinessType")
    public String businessType;

    public static ListAllPublicMediaTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllPublicMediaTagsRequest self = new ListAllPublicMediaTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListAllPublicMediaTagsRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

}
