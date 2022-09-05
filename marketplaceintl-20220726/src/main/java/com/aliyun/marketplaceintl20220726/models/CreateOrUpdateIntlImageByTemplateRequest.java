// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIntlImageByTemplateRequest extends TeaModel {
    @NameInMap("Ak")
    public String ak;

    @NameInMap("CreateOrUpdateIntlImageJson")
    public String createOrUpdateIntlImageJson;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Secret")
    public String secret;

    @NameInMap("Uid")
    public String uid;

    public static CreateOrUpdateIntlImageByTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateIntlImageByTemplateRequest self = new CreateOrUpdateIntlImageByTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateIntlImageByTemplateRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public CreateOrUpdateIntlImageByTemplateRequest setCreateOrUpdateIntlImageJson(String createOrUpdateIntlImageJson) {
        this.createOrUpdateIntlImageJson = createOrUpdateIntlImageJson;
        return this;
    }
    public String getCreateOrUpdateIntlImageJson() {
        return this.createOrUpdateIntlImageJson;
    }

    public CreateOrUpdateIntlImageByTemplateRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrUpdateIntlImageByTemplateRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public CreateOrUpdateIntlImageByTemplateRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
