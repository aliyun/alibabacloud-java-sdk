// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListCatalogsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("environment")
    public String environment;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static ListCatalogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogsRequest self = new ListCatalogsRequest();
        return TeaModel.build(map, self);
    }

    public ListCatalogsRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ListCatalogsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
