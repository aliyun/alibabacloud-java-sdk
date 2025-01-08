// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class OperateAppRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("AppId")
    public Integer appId;

    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    /**
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    public static OperateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateAppRequest self = new OperateAppRequest();
        return TeaModel.build(map, self);
    }

    public OperateAppRequest setAppId(Integer appId) {
        this.appId = appId;
        return this;
    }
    public Integer getAppId() {
        return this.appId;
    }

    public OperateAppRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public OperateAppRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

}
