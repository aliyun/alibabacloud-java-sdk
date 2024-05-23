// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeServcieScheduleRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter does not take effect.</p>
     */
    @NameInMap("PodConfigName")
    public String podConfigName;

    /**
     * <p>The UUID of the device.</p>
     * <br>
     * <p>This parameter is required.</p>
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
