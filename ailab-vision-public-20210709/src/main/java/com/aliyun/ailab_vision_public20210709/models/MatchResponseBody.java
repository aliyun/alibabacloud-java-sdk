// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class MatchResponseBody extends TeaModel {
    @NameInMap("success")
    public Long success;

    @NameInMap("errmsg")
    public String errmsg;

    @NameInMap("results")
    public String results;

    public static MatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MatchResponseBody self = new MatchResponseBody();
        return TeaModel.build(map, self);
    }

    public MatchResponseBody setSuccess(Long success) {
        this.success = success;
        return this;
    }
    public Long getSuccess() {
        return this.success;
    }

    public MatchResponseBody setErrmsg(String errmsg) {
        this.errmsg = errmsg;
        return this;
    }
    public String getErrmsg() {
        return this.errmsg;
    }

    public MatchResponseBody setResults(String results) {
        this.results = results;
        return this;
    }
    public String getResults() {
        return this.results;
    }

}
