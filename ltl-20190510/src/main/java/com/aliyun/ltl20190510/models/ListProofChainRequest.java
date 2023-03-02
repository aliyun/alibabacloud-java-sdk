// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListProofChainRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("Name")
    public String name;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("Size")
    public Integer size;

    public static ListProofChainRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProofChainRequest self = new ListProofChainRequest();
        return TeaModel.build(map, self);
    }

    public ListProofChainRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ListProofChainRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListProofChainRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public ListProofChainRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
