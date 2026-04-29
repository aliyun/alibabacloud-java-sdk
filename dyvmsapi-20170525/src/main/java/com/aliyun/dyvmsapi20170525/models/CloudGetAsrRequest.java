// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetAsrRequest extends TeaModel {
    /**
     * <p>当all=true时按照beignTime的顺序返回两侧对话文本</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("All")
    public String all;

    /**
     * <p>通话类型；1:呼入,2:webcall,4:预览外呼,5:预测外呼,6:主叫外呼,9:内部呼叫</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CallType")
    public Long callType;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>主通道的唯一标识</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sip-2-1490862368.123</p>
     */
    @NameInMap("MainUniqueId")
    public String mainUniqueId;

    public static CloudGetAsrRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudGetAsrRequest self = new CloudGetAsrRequest();
        return TeaModel.build(map, self);
    }

    public CloudGetAsrRequest setAll(String all) {
        this.all = all;
        return this;
    }
    public String getAll() {
        return this.all;
    }

    public CloudGetAsrRequest setCallType(Long callType) {
        this.callType = callType;
        return this;
    }
    public Long getCallType() {
        return this.callType;
    }

    public CloudGetAsrRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudGetAsrRequest setMainUniqueId(String mainUniqueId) {
        this.mainUniqueId = mainUniqueId;
        return this;
    }
    public String getMainUniqueId() {
        return this.mainUniqueId;
    }

}
