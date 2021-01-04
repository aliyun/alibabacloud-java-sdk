// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class CreateBizRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizName")
    public String bizName;

    @NameInMap("BizType")
    public Integer bizType;

    @NameInMap("UseCc")
    public Integer useCc;

    @NameInMap("CcQps")
    public Integer ccQps;

    @NameInMap("L4Rules")
    public String l4Rules;

    @NameInMap("Groups")
    public String groups;

    public static CreateBizRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBizRequest self = new CreateBizRequest();
        return TeaModel.build(map, self);
    }

    public CreateBizRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateBizRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateBizRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public CreateBizRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateBizRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public CreateBizRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public CreateBizRequest setUseCc(Integer useCc) {
        this.useCc = useCc;
        return this;
    }
    public Integer getUseCc() {
        return this.useCc;
    }

    public CreateBizRequest setCcQps(Integer ccQps) {
        this.ccQps = ccQps;
        return this;
    }
    public Integer getCcQps() {
        return this.ccQps;
    }

    public CreateBizRequest setL4Rules(String l4Rules) {
        this.l4Rules = l4Rules;
        return this;
    }
    public String getL4Rules() {
        return this.l4Rules;
    }

    public CreateBizRequest setGroups(String groups) {
        this.groups = groups;
        return this;
    }
    public String getGroups() {
        return this.groups;
    }

}
