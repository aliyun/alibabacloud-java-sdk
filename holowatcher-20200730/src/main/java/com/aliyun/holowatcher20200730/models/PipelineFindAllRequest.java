// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class PipelineFindAllRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("Code")
    public String code;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("Exposed")
    public Boolean exposed;

    @NameInMap("IsRoot")
    public Boolean isRoot;

    public static PipelineFindAllRequest build(java.util.Map<String, ?> map) throws Exception {
        PipelineFindAllRequest self = new PipelineFindAllRequest();
        return TeaModel.build(map, self);
    }

    public PipelineFindAllRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public PipelineFindAllRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PipelineFindAllRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public PipelineFindAllRequest setExposed(Boolean exposed) {
        this.exposed = exposed;
        return this;
    }
    public Boolean getExposed() {
        return this.exposed;
    }

    public PipelineFindAllRequest setIsRoot(Boolean isRoot) {
        this.isRoot = isRoot;
        return this;
    }
    public Boolean getIsRoot() {
        return this.isRoot;
    }

}
