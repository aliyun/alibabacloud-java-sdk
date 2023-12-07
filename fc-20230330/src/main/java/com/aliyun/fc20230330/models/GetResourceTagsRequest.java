// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetResourceTagsRequest extends TeaModel {
    /**
     * <p>The resource ID.</p>
     */
    @NameInMap("arn")
    public String arn;

    public static GetResourceTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTagsRequest self = new GetResourceTagsRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceTagsRequest setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

}
