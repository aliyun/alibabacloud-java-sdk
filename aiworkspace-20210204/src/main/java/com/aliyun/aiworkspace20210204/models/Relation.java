// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Relation extends TeaModel {
    /**
     * <p>ErrMsg</p>
     */
    @NameInMap("ErrMsg")
    public String errMsg;

    /**
     * <p>LineageRelation</p>
     */
    @NameInMap("LineageRelation")
    public LineageRelation lineageRelation;

    /**
     * <p>Result</p>
     */
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
