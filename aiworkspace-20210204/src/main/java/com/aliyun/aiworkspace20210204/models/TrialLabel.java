// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class TrialLabel extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2023-12-27T03:30:04Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2023-12-27T03:30:04Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("Key")
    public String key;

    @NameInMap("TrialId")
    public String trialId;

    /**
     * <strong>example:</strong>
     * <p>value</p>
     */
    @NameInMap("Value")
    public String value;

    public static TrialLabel build(java.util.Map<String, ?> map) throws Exception {
        TrialLabel self = new TrialLabel();
        return TeaModel.build(map, self);
    }

    public TrialLabel setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public TrialLabel setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public TrialLabel setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public TrialLabel setTrialId(String trialId) {
        this.trialId = trialId;
        return this;
    }
    public String getTrialId() {
        return this.trialId;
    }

    public TrialLabel setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
