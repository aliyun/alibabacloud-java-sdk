// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CreateRecoveryPlanRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("Name")
    public String name;

    @NameInMap("SitePairId")
    public String sitePairId;

    public static CreateRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecoveryPlanRequest self = new CreateRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecoveryPlanRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateRecoveryPlanRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public CreateRecoveryPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRecoveryPlanRequest setSitePairId(String sitePairId) {
        this.sitePairId = sitePairId;
        return this;
    }
    public String getSitePairId() {
        return this.sitePairId;
    }

}
