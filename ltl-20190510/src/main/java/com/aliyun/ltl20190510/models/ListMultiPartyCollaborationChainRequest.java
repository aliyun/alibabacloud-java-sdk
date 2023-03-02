// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListMultiPartyCollaborationChainRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("Name")
    public String name;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("Size")
    public Integer size;

    public static ListMultiPartyCollaborationChainRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMultiPartyCollaborationChainRequest self = new ListMultiPartyCollaborationChainRequest();
        return TeaModel.build(map, self);
    }

    public ListMultiPartyCollaborationChainRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ListMultiPartyCollaborationChainRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMultiPartyCollaborationChainRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public ListMultiPartyCollaborationChainRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
