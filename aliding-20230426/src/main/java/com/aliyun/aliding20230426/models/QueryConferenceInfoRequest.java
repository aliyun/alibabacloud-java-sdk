// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryConferenceInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    public static QueryConferenceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConferenceInfoRequest self = new QueryConferenceInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryConferenceInfoRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

}
