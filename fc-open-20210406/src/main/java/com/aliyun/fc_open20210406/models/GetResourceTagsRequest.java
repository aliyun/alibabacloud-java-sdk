// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetResourceTagsRequest extends TeaModel {
    /**
     * <p>The ARN of the resource. </p>
     * <p>> **Note:** You can use the value of this parameter to query the information about the resource, such as the account, service, and region information of the resource.</p>
     */
    @NameInMap("resourceArn")
    public String resourceArn;

    public static GetResourceTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTagsRequest self = new GetResourceTagsRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceTagsRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

}
