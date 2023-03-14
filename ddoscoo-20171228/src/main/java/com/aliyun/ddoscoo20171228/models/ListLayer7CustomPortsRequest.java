// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListLayer7CustomPortsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static ListLayer7CustomPortsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLayer7CustomPortsRequest self = new ListLayer7CustomPortsRequest();
        return TeaModel.build(map, self);
    }

    public ListLayer7CustomPortsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListLayer7CustomPortsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListLayer7CustomPortsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
