// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetSentinelMeshFlowGroupDetailRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static GetSentinelMeshFlowGroupDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSentinelMeshFlowGroupDetailRequest self = new GetSentinelMeshFlowGroupDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetSentinelMeshFlowGroupDetailRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public GetSentinelMeshFlowGroupDetailRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public GetSentinelMeshFlowGroupDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetSentinelMeshFlowGroupDetailRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
