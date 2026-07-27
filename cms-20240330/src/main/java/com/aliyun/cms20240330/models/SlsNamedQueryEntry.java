// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SlsNamedQueryEntry extends TeaModel {
    @NameInMap("end")
    public Long end;

    @NameInMap("expr")
    public String expr;

    @NameInMap("start")
    public Long start;

    @NameInMap("timeUnit")
    public String timeUnit;

    @NameInMap("window")
    public Long window;

    public static SlsNamedQueryEntry build(java.util.Map<String, ?> map) throws Exception {
        SlsNamedQueryEntry self = new SlsNamedQueryEntry();
        return TeaModel.build(map, self);
    }

    public SlsNamedQueryEntry setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public SlsNamedQueryEntry setExpr(String expr) {
        this.expr = expr;
        return this;
    }
    public String getExpr() {
        return this.expr;
    }

    public SlsNamedQueryEntry setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public SlsNamedQueryEntry setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public SlsNamedQueryEntry setWindow(Long window) {
        this.window = window;
        return this;
    }
    public Long getWindow() {
        return this.window;
    }

}
