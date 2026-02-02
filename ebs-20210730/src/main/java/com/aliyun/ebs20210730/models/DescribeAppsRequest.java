// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeAppsRequest extends TeaModel {
    @NameInMap("AppIds")
    public java.util.List<String> appIds;

    /**
     * <strong>example:</strong>
     * <p>App1,App2</p>
     */
    @NameInMap("AppNames")
    public java.util.List<String> appNames;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>1485558146415628</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsRequest self = new DescribeAppsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppsRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public DescribeAppsRequest setAppNames(java.util.List<String> appNames) {
        this.appNames = appNames;
        return this;
    }
    public java.util.List<String> getAppNames() {
        return this.appNames;
    }

    public DescribeAppsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeAppsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DescribeAppsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
