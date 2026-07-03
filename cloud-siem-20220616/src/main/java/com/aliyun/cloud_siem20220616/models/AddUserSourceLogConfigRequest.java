// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class AddUserSourceLogConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to add or delete the log collection task. Valid values:</p>
     * <ul>
     * <li><p>-1: Deletes the task.</p>
     * </li>
     * <li><p>0: Adds the task.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Deleted")
    public Integer deleted;

    /**
     * <p>The detailed information about the SLS log to be collected.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai.siem-project.siem-logstore</p>
     */
    @NameInMap("DisPlayLine")
    public String disPlayLine;

    /**
     * <p>The region where the Data Management center of Threat Analysis is located. Select a region based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland or Hong Kong (China).</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are in regions outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The code of the log.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_siem_aegis_proc</p>
     */
    @NameInMap("SourceLogCode")
    public String sourceLogCode;

    /**
     * <p>The detailed information about the Simple Log Service (SLS) log to be collected. The value is a JSON string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;project&quot;:&quot;wafnew-project-1335759343513432-cn-hangzhou&quot;,&quot;logStore&quot;:&quot;wafnew-logstore&quot;,&quot;regionCode&quot;:&quot;cn-hangzhou&quot;,&quot;prodCode&quot;:&quot;waf&quot;}</p>
     */
    @NameInMap("SourceLogInfo")
    public String sourceLogInfo;

    /**
     * <p>The code of the product.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("SourceProdCode")
    public String sourceProdCode;

    /**
     * <p>The ID of the Alibaba Cloud account for which you want to collect logs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123XXXXXX</p>
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
