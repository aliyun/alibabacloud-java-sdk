// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Relation extends TeaModel {
    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("LineageRelation")
    public LineageRelation lineageRelation;

    @NameInMap("Result")
    public Boolean result;

    public static Relation build(java.util.Map<String, ?> map) throws Exception {
        Relation self = new Relation();
        return TeaModel.build(map, self);
    }

    public Relation setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public Relation setLineageRelation(LineageRelation lineageRelation) {
        this.lineageRelation = lineageRelation;
        return this;
    }
    public LineageRelation getLineageRelation() {
        return this.lineageRelation;
    }

    public Relation setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
