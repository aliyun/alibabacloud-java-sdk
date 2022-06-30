// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyResourceConnectionsRequest extends TeaModel {
    @NameInMap("ids")
    public java.util.List<Integer> ids;

    @NameInMap("regionId")
    public String regionId;

    public static ListSurveyResourceConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyResourceConnectionsRequest self = new ListSurveyResourceConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListSurveyResourceConnectionsRequest setIds(java.util.List<Integer> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Integer> getIds() {
        return this.ids;
    }

    public ListSurveyResourceConnectionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
