// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetResourceTagsOutput extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ALIYUN::FC::FUNCTION</p>
     */
    @NameInMap("resouceType")
    public String resouceType;

    /**
     * <strong>example:</strong>
     * <p>acs:fc:cn-shanghai:****:functions/demo</p>
     */
    @NameInMap("resourceArn")
    public String resourceArn;

    @NameInMap("tags")
    public java.util.Map<String, String> tags;

    public static GetResourceTagsOutput build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTagsOutput self = new GetResourceTagsOutput();
        return TeaModel.build(map, self);
    }

    public GetResourceTagsOutput setResouceType(String resouceType) {
        this.resouceType = resouceType;
        return this;
    }
    public String getResouceType() {
        return this.resouceType;
    }

    public GetResourceTagsOutput setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public GetResourceTagsOutput setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

}
