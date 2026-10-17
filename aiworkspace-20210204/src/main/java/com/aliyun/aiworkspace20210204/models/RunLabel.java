// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class RunLabel extends TeaModel {
    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-27T03:30:04Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-27T03:30:04Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The tag key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>is_evaluation</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The associated Run ID.</p>
     * 
     * <strong>example:</strong>
     * <p>run-1qJhzJ2YXgX****</p>
     */
    @NameInMap("RunId")
    public String runId;

    /**
     * <p>The tag value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Value")
    public String value;

    public static RunLabel build(java.util.Map<String, ?> map) throws Exception {
        RunLabel self = new RunLabel();
        return TeaModel.build(map, self);
    }

    public RunLabel setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public RunLabel setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public RunLabel setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public RunLabel setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public RunLabel setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
