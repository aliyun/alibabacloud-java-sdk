// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateIspFlushCacheInstanceConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Lang")
    public String lang;

    public static UpdateIspFlushCacheInstanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIspFlushCacheInstanceConfigRequest self = new UpdateIspFlushCacheInstanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIspFlushCacheInstanceConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateIspFlushCacheInstanceConfigRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateIspFlushCacheInstanceConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
