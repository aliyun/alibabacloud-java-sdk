// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class PrivatePoolOptions extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Open</p>
     */
    @NameInMap("MatchCriteria")
    public String matchCriteria;

    /**
     * <strong>example:</strong>
     * <p>eap-bp67acfmxazb4****</p>
     */
    @NameInMap("PrivatePoolIds")
    public java.util.List<String> privatePoolIds;

    public static PrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
        PrivatePoolOptions self = new PrivatePoolOptions();
        return TeaModel.build(map, self);
    }

    public PrivatePoolOptions setMatchCriteria(String matchCriteria) {
        this.matchCriteria = matchCriteria;
        return this;
    }
    public String getMatchCriteria() {
        return this.matchCriteria;
    }

    public PrivatePoolOptions setPrivatePoolIds(java.util.List<String> privatePoolIds) {
        this.privatePoolIds = privatePoolIds;
        return this;
    }
    public java.util.List<String> getPrivatePoolIds() {
        return this.privatePoolIds;
    }

}
