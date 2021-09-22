// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class ReidBodyResponseBody extends TeaModel {
    @NameInMap("success")
    public Long success;

    @NameInMap("errmsg")
    public String errmsg;

    @NameInMap("vector")
    public java.util.List<java.util.List<Float>> vector;

    @NameInMap("valid")
    public java.util.List<Long> valid;

    public static ReidBodyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReidBodyResponseBody self = new ReidBodyResponseBody();
        return TeaModel.build(map, self);
    }

    public ReidBodyResponseBody setSuccess(Long success) {
        this.success = success;
        return this;
    }
    public Long getSuccess() {
        return this.success;
    }

    public ReidBodyResponseBody setErrmsg(String errmsg) {
        this.errmsg = errmsg;
        return this;
    }
    public String getErrmsg() {
        return this.errmsg;
    }

    public ReidBodyResponseBody setVector(java.util.List<java.util.List<Float>> vector) {
        this.vector = vector;
        return this;
    }
    public java.util.List<java.util.List<Float>> getVector() {
        return this.vector;
    }

    public ReidBodyResponseBody setValid(java.util.List<Long> valid) {
        this.valid = valid;
        return this;
    }
    public java.util.List<Long> getValid() {
        return this.valid;
    }

}
