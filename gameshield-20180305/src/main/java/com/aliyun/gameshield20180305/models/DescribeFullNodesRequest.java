// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFullNodesRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InUse")
    public Integer inUse;

    public static DescribeFullNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFullNodesRequest self = new DescribeFullNodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFullNodesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeFullNodesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeFullNodesRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeFullNodesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeFullNodesRequest setInUse(Integer inUse) {
        this.inUse = inUse;
        return this;
    }
    public Integer getInUse() {
        return this.inUse;
    }

}
