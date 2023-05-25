// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlOptimizeAdviceRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("EndDt")
    public String endDt;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("Region")
    public String region;

    @NameInMap("StartDt")
    public String startDt;

    public static GetSqlOptimizeAdviceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSqlOptimizeAdviceRequest self = new GetSqlOptimizeAdviceRequest();
        return TeaModel.build(map, self);
    }

    public GetSqlOptimizeAdviceRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public GetSqlOptimizeAdviceRequest setEndDt(String endDt) {
        this.endDt = endDt;
        return this;
    }
    public String getEndDt() {
        return this.endDt;
    }

    public GetSqlOptimizeAdviceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetSqlOptimizeAdviceRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public GetSqlOptimizeAdviceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetSqlOptimizeAdviceRequest setStartDt(String startDt) {
        this.startDt = startDt;
        return this;
    }
    public String getStartDt() {
        return this.startDt;
    }

}
