// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoResourceOptimizeRulesAsyncRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("ResultId")
    public String resultId;

    @NameInMap("TableFragmentationRatio")
    public Double tableFragmentationRatio;

    @NameInMap("TableSpaceSize")
    public Double tableSpaceSize;

    public static UpdateAutoResourceOptimizeRulesAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoResourceOptimizeRulesAsyncRequest self = new UpdateAutoResourceOptimizeRulesAsyncRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoResourceOptimizeRulesAsyncRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public UpdateAutoResourceOptimizeRulesAsyncRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public UpdateAutoResourceOptimizeRulesAsyncRequest setResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }
    public String getResultId() {
        return this.resultId;
    }

    public UpdateAutoResourceOptimizeRulesAsyncRequest setTableFragmentationRatio(Double tableFragmentationRatio) {
        this.tableFragmentationRatio = tableFragmentationRatio;
        return this;
    }
    public Double getTableFragmentationRatio() {
        return this.tableFragmentationRatio;
    }

    public UpdateAutoResourceOptimizeRulesAsyncRequest setTableSpaceSize(Double tableSpaceSize) {
        this.tableSpaceSize = tableSpaceSize;
        return this;
    }
    public Double getTableSpaceSize() {
        return this.tableSpaceSize;
    }

}
