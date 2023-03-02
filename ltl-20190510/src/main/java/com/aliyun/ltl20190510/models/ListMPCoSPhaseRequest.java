// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListMPCoSPhaseRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Num")
    public Integer num;

    @NameInMap("PhaseGroupId")
    public String phaseGroupId;

    @NameInMap("Size")
    public Integer size;

    public static ListMPCoSPhaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMPCoSPhaseRequest self = new ListMPCoSPhaseRequest();
        return TeaModel.build(map, self);
    }

    public ListMPCoSPhaseRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ListMPCoSPhaseRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public ListMPCoSPhaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMPCoSPhaseRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public ListMPCoSPhaseRequest setPhaseGroupId(String phaseGroupId) {
        this.phaseGroupId = phaseGroupId;
        return this;
    }
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    public ListMPCoSPhaseRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
