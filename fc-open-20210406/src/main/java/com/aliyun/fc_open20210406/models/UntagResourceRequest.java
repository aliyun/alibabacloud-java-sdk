// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UntagResourceRequest extends TeaModel {
    // 删除所有 tag，默认值为 false
    @NameInMap("all")
    public Boolean all;

    // 目前只能给 top level 资源 service 进行标签的相关操作, ARN 可以是类似 services/foo 或者 acs:fc:cn-shanghai:123456789:services/foo
    @NameInMap("resourceArn")
    public String resourceArn;

    // tag key 值列表， 最大为 20，当 all=false， length 至少为 1. 当 length 大于 1 时， 可以忽略 all 值
    @NameInMap("tagKeys")
    public java.util.List<String> tagKeys;

    public static UntagResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourceRequest self = new UntagResourceRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourceRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourceRequest setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }
    public String getResourceArn() {
        return this.resourceArn;
    }

    public UntagResourceRequest setTagKeys(java.util.List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

}
