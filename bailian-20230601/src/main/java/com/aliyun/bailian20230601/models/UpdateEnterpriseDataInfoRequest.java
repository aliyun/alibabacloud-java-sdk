// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class UpdateEnterpriseDataInfoRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DataId")
    public String dataId;

    @NameInMap("DataName")
    public String dataName;

    @NameInMap("FilePreviewLink")
    public String filePreviewLink;

    public static UpdateEnterpriseDataInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnterpriseDataInfoRequest self = new UpdateEnterpriseDataInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnterpriseDataInfoRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateEnterpriseDataInfoRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateEnterpriseDataInfoRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateEnterpriseDataInfoRequest setDataName(String dataName) {
        this.dataName = dataName;
        return this;
    }
    public String getDataName() {
        return this.dataName;
    }

    public UpdateEnterpriseDataInfoRequest setFilePreviewLink(String filePreviewLink) {
        this.filePreviewLink = filePreviewLink;
        return this;
    }
    public String getFilePreviewLink() {
        return this.filePreviewLink;
    }

}
