// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class EmptySlsLogstoreRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static EmptySlsLogstoreRequest build(java.util.Map<String, ?> map) throws Exception {
        EmptySlsLogstoreRequest self = new EmptySlsLogstoreRequest();
        return TeaModel.build(map, self);
    }

    public EmptySlsLogstoreRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public EmptySlsLogstoreRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public EmptySlsLogstoreRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
