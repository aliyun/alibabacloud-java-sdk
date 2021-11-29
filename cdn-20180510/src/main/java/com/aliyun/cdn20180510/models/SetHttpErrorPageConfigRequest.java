// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetHttpErrorPageConfigRequest extends TeaModel {
    @NameInMap("ConfigId")
    public Long configId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageUrl")
    public String pageUrl;

    public static SetHttpErrorPageConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetHttpErrorPageConfigRequest self = new SetHttpErrorPageConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetHttpErrorPageConfigRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public SetHttpErrorPageConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetHttpErrorPageConfigRequest setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SetHttpErrorPageConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetHttpErrorPageConfigRequest setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
        return this;
    }
    public String getPageUrl() {
        return this.pageUrl;
    }

}
