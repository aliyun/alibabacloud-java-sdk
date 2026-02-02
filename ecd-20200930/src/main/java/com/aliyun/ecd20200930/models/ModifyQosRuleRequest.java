// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyQosRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Download")
    public Integer download;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-5605u0gelk200****</p>
     */
    @NameInMap("QosRuleId")
    public String qosRuleId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("QosRuleName")
    public String qosRuleName;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Upload")
    public Integer upload;

    public static ModifyQosRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyQosRuleRequest self = new ModifyQosRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyQosRuleRequest setDownload(Integer download) {
        this.download = download;
        return this;
    }
    public Integer getDownload() {
        return this.download;
    }

    public ModifyQosRuleRequest setQosRuleId(String qosRuleId) {
        this.qosRuleId = qosRuleId;
        return this;
    }
    public String getQosRuleId() {
        return this.qosRuleId;
    }

    public ModifyQosRuleRequest setQosRuleName(String qosRuleName) {
        this.qosRuleName = qosRuleName;
        return this;
    }
    public String getQosRuleName() {
        return this.qosRuleName;
    }

    public ModifyQosRuleRequest setUpload(Integer upload) {
        this.upload = upload;
        return this;
    }
    public Integer getUpload() {
        return this.upload;
    }

}
