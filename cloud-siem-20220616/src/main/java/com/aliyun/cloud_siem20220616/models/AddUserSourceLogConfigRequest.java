// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddUserSourceLogConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to add logs or delete added logs. Valid values:</p>
     * <br>
     * <p>*   \-1: deletes added logs.</p>
     * <p>*   0: adds logs.</p>
     */
    @NameInMap("Deleted")
    public Integer deleted;

    /**
     * <p>The display details of the Logstore.</p>
     */
    @NameInMap("DisPlayLine")
    public String disPlayLine;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The log code.</p>
     */
    @NameInMap("SourceLogCode")
    public String sourceLogCode;

    /**
     * <p>The details of the Logstore that you want to use in the JSON string format.</p>
     */
    @NameInMap("SourceLogInfo")
    public String sourceLogInfo;

    /**
     * <p>The code of the cloud service.</p>
     */
    @NameInMap("SourceProdCode")
    public String sourceProdCode;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     */
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
