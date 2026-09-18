// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class GetSkillRequest extends TeaModel {
    /**
     * <p>The Skill name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>code-review</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type of the download URL. Valid values: public and internal. If omitted, no download URL is generated.</p>
     * 
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("Network")
    public String network;

    /**
     * <p>The release history version number to query. If omitted, the current Skill main record is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SkillVersion")
    public Long skillVersion;

    public static GetSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSkillRequest self = new GetSkillRequest();
        return TeaModel.build(map, self);
    }

    public GetSkillRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetSkillRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public GetSkillRequest setSkillVersion(Long skillVersion) {
        this.skillVersion = skillVersion;
        return this;
    }
    public Long getSkillVersion() {
        return this.skillVersion;
    }

}
