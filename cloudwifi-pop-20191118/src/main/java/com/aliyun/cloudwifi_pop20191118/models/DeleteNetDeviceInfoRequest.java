// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class DeleteNetDeviceInfoRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Ids")
    public String ids;

    public static DeleteNetDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetDeviceInfoRequest self = new DeleteNetDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetDeviceInfoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteNetDeviceInfoRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public DeleteNetDeviceInfoRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteNetDeviceInfoRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

}
