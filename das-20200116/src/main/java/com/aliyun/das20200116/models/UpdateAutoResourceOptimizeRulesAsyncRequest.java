// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class UpdateAutoResourceOptimizeRulesAsyncRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The database instance IDs.</p>
     * <blockquote>
     * <p> Set this parameter to a JSON array that consists of multiple instance IDs. Separate instance IDs with commas (,). Example: <code>[\\&quot;Instance ID1\\&quot;, \\&quot;Instance ID2\\&quot;]</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;rm-2ze8g2am97624****\&quot;,\&quot;rm-2ze9xrhze0709****\&quot;]</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The ID of the asynchronous request.</p>
     * <blockquote>
     * <p> Asynchronous calls do not immediately return the complete results. To obtain the complete results, you must use the value of <strong>ResultId</strong> returned in the response to re-initiate the call until the value of <strong>isFinish</strong> is <strong>true</strong>.**** In this case, you must call this operation at least twice.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>async__507044db6c4eadfa2dab9b084e80****</p>
     */
    @NameInMap("ResultId")
    public String resultId;

    /**
     * <p>The fragmentation rate that triggers automatic fragment recycling of a single physical table. Valid values: <strong>0.10</strong> to <strong>0.99</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("TableFragmentationRatio")
    public Double tableFragmentationRatio;

    /**
     * <p>The minimum storage usage that triggers automatic fragment recycling of a single physical table. Valid values: <strong>5</strong> to <strong>100</strong>. Unit: GB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
