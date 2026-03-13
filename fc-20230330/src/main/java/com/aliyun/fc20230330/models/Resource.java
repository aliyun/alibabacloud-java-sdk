// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class Resource extends TeaModel {
    /**
     * <p>The name of the resource type. Valid values: ALIYUN::FC::FUNCTION and ALIYUN::FC::SERVICE. The former name is used in Function Compute 3.0, and the latter name is used in earlier versions of Function Compute.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN::FC::FUNCTION</p>
     */
    @NameInMap("resouceType")
    public String resouceType;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc:cn-shanghai:****:functions/demo</p>
     */
    @NameInMap("resourceArn")
    public String resourceArn;

    /**
     * <p>The tag dictionary.</p>
     */
    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    public static Resource build(java.util.Map<String, ?> map) throws Exception {
        Resource self = new Resource();
        return TeaModel.build(map, self);
    }

    public Resource setResouceType(String resouceType) {
        this.resouceType = resouceType;
        return this;
    }
    public String getResouceType() {
        return this.resouceType;
    }

    public Resource setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public Resource setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

}
