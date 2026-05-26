// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SmartClusterConfig extends TeaModel {
    @NameInMap("Figure")
    public FigureClusterConfig figure;

    public static SmartClusterConfig build(java.util.Map<String, ?> map) throws Exception {
        SmartClusterConfig self = new SmartClusterConfig();
        return TeaModel.build(map, self);
    }

    public SmartClusterConfig setFigure(FigureClusterConfig figure) {
        this.figure = figure;
        return this;
    }
    public FigureClusterConfig getFigure() {
        return this.figure;
    }

}
