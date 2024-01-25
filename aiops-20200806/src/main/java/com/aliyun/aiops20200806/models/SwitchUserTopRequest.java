// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class SwitchUserTopRequest extends TeaModel {
    @NameInMap("SwitchFrontOperaUid")
    public String switchFrontOperaUid;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uid")
    public Long uid;

    public static SwitchUserTopRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchUserTopRequest self = new SwitchUserTopRequest();
        return TeaModel.build(map, self);
    }

    public SwitchUserTopRequest setSwitchFrontOperaUid(String switchFrontOperaUid) {
        this.switchFrontOperaUid = switchFrontOperaUid;
        return this;
    }
    public String getSwitchFrontOperaUid() {
        return this.switchFrontOperaUid;
    }

    public SwitchUserTopRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SwitchUserTopRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
