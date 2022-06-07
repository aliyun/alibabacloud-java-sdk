// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kubenest20220525.models;

import com.aliyun.tea.*;

public class ListAppHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-s-projectId")
    public String xSProjectId;

    @NameInMap("x-snow-user-data")
    public String xSnowUserData;

    public static ListAppHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListAppHeaders self = new ListAppHeaders();
        return TeaModel.build(map, self);
    }

    public ListAppHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListAppHeaders setXSProjectId(String xSProjectId) {
        this.xSProjectId = xSProjectId;
        return this;
    }
    public String getXSProjectId() {
        return this.xSProjectId;
    }

    public ListAppHeaders setXSnowUserData(String xSnowUserData) {
        this.xSnowUserData = xSnowUserData;
        return this;
    }
    public String getXSnowUserData() {
        return this.xSnowUserData;
    }

}
