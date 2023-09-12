// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListProductGeneralBillsRequest extends TeaModel {
    @NameInMap("body")
    public GeneralBillPageQuery body;

    public static ListProductGeneralBillsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductGeneralBillsRequest self = new ListProductGeneralBillsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductGeneralBillsRequest setBody(GeneralBillPageQuery body) {
        this.body = body;
        return this;
    }
    public GeneralBillPageQuery getBody() {
        return this.body;
    }

}
