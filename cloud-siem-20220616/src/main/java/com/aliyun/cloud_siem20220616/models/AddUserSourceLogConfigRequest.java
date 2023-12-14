// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddUserSourceLogConfigRequest extends TeaModel {
    @NameInMap("Deleted")
    public Integer deleted;

    @NameInMap("DisPlayLine")
    public String disPlayLine;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceLogCode")
    public String sourceLogCode;

    @NameInMap("SourceLogInfo")
    public String sourceLogInfo;

    @NameInMap("SourceProdCode")
    public String sourceProdCode;

    @NameInMap("SubUserId")
    public Long subUserId;

    public static AddUserSourceLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserSourceLogConfigRequest self = new AddUserSourceLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddUserSourceLogConfigRequest setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }
    public Integer getDeleted() {
        return this.deleted;
    }

    public AddUserSourceLogConfigRequest setDisPlayLine(String disPlayLine) {
        this.disPlayLine = disPlayLine;
        return this;
    }
    public String getDisPlayLine() {
        return this.disPlayLine;
    }

    public AddUserSourceLogConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddUserSourceLogConfigRequest setSourceLogCode(String sourceLogCode) {
        this.sourceLogCode = sourceLogCode;
        return this;
    }
    public String getSourceLogCode() {
        return this.sourceLogCode;
    }

    public AddUserSourceLogConfigRequest setSourceLogInfo(String sourceLogInfo) {
        this.sourceLogInfo = sourceLogInfo;
        return this;
    }
    public String getSourceLogInfo() {
        return this.sourceLogInfo;
    }

    public AddUserSourceLogConfigRequest setSourceProdCode(String sourceProdCode) {
        this.sourceProdCode = sourceProdCode;
        return this;
    }
    public String getSourceProdCode() {
        return this.sourceProdCode;
    }

    public AddUserSourceLogConfigRequest setSubUserId(Long subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public Long getSubUserId() {
        return this.subUserId;
    }

}
