// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetDingTalkUserOrgByAliyunTmpCodeRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DingTalkChannel")
    public String dingTalkChannel;

    @NameInMap("TmpCode")
    public String tmpCode;

    @NameInMap("Version")
    public String version;

    public static GetDingTalkUserOrgByAliyunTmpCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDingTalkUserOrgByAliyunTmpCodeRequest self = new GetDingTalkUserOrgByAliyunTmpCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetDingTalkUserOrgByAliyunTmpCodeRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetDingTalkUserOrgByAliyunTmpCodeRequest setDingTalkChannel(String dingTalkChannel) {
        this.dingTalkChannel = dingTalkChannel;
        return this;
    }
    public String getDingTalkChannel() {
        return this.dingTalkChannel;
    }

    public GetDingTalkUserOrgByAliyunTmpCodeRequest setTmpCode(String tmpCode) {
        this.tmpCode = tmpCode;
        return this;
    }
    public String getTmpCode() {
        return this.tmpCode;
    }

    public GetDingTalkUserOrgByAliyunTmpCodeRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
