// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListSentinelMeshEnvoyRlsRulesOfGroupRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Lang")
    public String lang;

    public static ListSentinelMeshEnvoyRlsRulesOfGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSentinelMeshEnvoyRlsRulesOfGroupRequest self = new ListSentinelMeshEnvoyRlsRulesOfGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListSentinelMeshEnvoyRlsRulesOfGroupRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public ListSentinelMeshEnvoyRlsRulesOfGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ListSentinelMeshEnvoyRlsRulesOfGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
