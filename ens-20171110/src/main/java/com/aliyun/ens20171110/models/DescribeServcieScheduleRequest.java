// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeServcieScheduleRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>474bdef0-d149-4695-abfb-52912d9143f0</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("PodConfigName")
    public String podConfigName;

    /**
     * <p>The UUID of the device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hdm_f022bf160dc69e2d8eb421e508eb9170</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeServcieScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServcieScheduleRequest self = new DescribeServcieScheduleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServcieScheduleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeServcieScheduleRequest setPodConfigName(String podConfigName) {
        this.podConfigName = podConfigName;
        return this;
    }
    public String getPodConfigName() {
        return this.podConfigName;
    }

    public DescribeServcieScheduleRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
