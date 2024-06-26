// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryConsortiumDeletableRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("Location")
    public String location;

    public static QueryConsortiumDeletableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConsortiumDeletableRequest self = new QueryConsortiumDeletableRequest();
        return TeaModel.build(map, self);
    }

    public QueryConsortiumDeletableRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public QueryConsortiumDeletableRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

}
