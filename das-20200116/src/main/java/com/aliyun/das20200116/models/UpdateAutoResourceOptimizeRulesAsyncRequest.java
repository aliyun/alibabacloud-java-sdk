// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoResourceOptimizeRulesAsyncRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The database instance IDs.</p>
     * <br>
     * <p>>  Set this parameter to a JSON array that consists of multiple instance IDs. Separate instance IDs with commas (,). Example: `[\\"Instance ID1\\", \\"Instance ID2\\"]`.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The ID of the asynchronous request.</p>
     * <br>
     * <p>>  You can leave this parameter empty when you call the operation to initiate the request for the first time, and use the value of this parameter contained in the response to the first request for subsequent requests.</p>
     */
    @NameInMap("ResultId")
    public String resultId;

    /**
     * <p>The fragmentation rate that triggers automatic fragment recycling of a single physical table. Valid values: **0.10** to **0.99**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableFragmentationRatio")
    public Double tableFragmentationRatio;

    /**
     * <p>The minimum storage usage that triggers automatic fragment recycling of a single physical table. Valid values: **5** to **100**. Unit: GB.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
