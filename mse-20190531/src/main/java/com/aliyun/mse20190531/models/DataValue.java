// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DataValue extends TeaModel {
    /**
     * <p>The ID of the user to which the application belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The region where the application resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The microservice namespace where the application resides.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>example-app-name</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456abcde@12345abcde</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DataValue build(java.util.Map<String, ?> map) throws Exception {
        DataValue self = new DataValue();
        return TeaModel.build(map, self);
    }

    public DataValue setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DataValue setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DataValue setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DataValue setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DataValue setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
