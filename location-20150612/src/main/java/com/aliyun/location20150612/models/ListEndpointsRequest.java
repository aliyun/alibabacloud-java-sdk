// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612.models;

import com.aliyun.tea.*;

public class ListEndpointsRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Id")
    public String id;

    @NameInMap("SerivceCode")
    public String serivceCode;

    public static ListEndpointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEndpointsRequest self = new ListEndpointsRequest();
        return TeaModel.build(map, self);
    }

    public ListEndpointsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListEndpointsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListEndpointsRequest setSerivceCode(String serivceCode) {
        this.serivceCode = serivceCode;
        return this;
    }
    public String getSerivceCode() {
        return this.serivceCode;
    }

}
