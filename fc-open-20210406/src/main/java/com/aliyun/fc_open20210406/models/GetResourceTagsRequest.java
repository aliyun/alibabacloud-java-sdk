// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetResourceTagsRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
     * <blockquote>
     * <p> You can use the value of this parameter to query information about the resource, such as the account, service, and region of the resource. You can manage tags only for services for top level resources.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-shanghai:188077086902****:services/demo</p>
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
