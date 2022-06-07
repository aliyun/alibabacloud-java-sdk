// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kubenest20220525.models;

import com.aliyun.tea.*;

public class ListAppInfoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-s-projectId")
    public String xSProjectId;

    @NameInMap("x-snow-user-data")
    public String xSnowUserData;

    public static ListAppInfoHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfoHeaders self = new ListAppInfoHeaders();
        return TeaModel.build(map, self);
    }

    public ListAppInfoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListAppInfoHeaders setXSProjectId(String xSProjectId) {
        this.xSProjectId = xSProjectId;
        return this;
    }
    public String getXSProjectId() {
        return this.xSProjectId;
    }

    public ListAppInfoHeaders setXSnowUserData(String xSnowUserData) {
        this.xSnowUserData = xSnowUserData;
        return this;
    }
    public String getXSnowUserData() {
        return this.xSnowUserData;
    }

}
