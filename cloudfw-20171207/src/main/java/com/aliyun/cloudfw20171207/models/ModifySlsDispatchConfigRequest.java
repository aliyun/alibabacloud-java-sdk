// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifySlsDispatchConfigRequest extends TeaModel {
    /**
     * <p>The detailed configuration to modify.</p>
     * <details>
     * <summary>Format for version 1</summary>
     * {"global":{"slsRegionId":"ap-southeast-1","logTime":180,"logStorage":1000}}
     * </details>
     * 
     * <details>
     * <summary>Format for version 2</summary>
     * {"cn":{"slsRegionId":"ap-southeast-1","logTime":180,"logStorage":3000},"intl":{"slsRegionId":"ap-southeast-1","logTime":180,"logStorage":2000}}
     * </details>
     * The fields are described as follows:
     * 
     * <ul>
     * <li>slsRegionId: The region ID to which logs are delivered.</li>
     * <li>logTime: The storage duration of logs. Unit: days.</li>
     * <li>logStorage: The log storage capacity. Unit: GB. The total capacity specified must not exceed the total capacity purchased by the user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;global&quot;:{&quot;slsRegionId&quot;:&quot;cn-hangzhou&quot;,&quot;logTime&quot;:180,&quot;logStorage&quot;:1000}}</p>
     */
    @NameInMap("DetailConfig")
    public String detailConfig;

    /**
     * <p>The log version. A value of 1 indicates one Logstore. A value of 2 indicates two Logstores.</p>
     * <blockquote>
     * <p>Notice: If ModifyType is set to version, set LogVersion to the target version. If ModifyType is set to config, set LogVersion to the current version of the user.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogVersion")
    public Integer logVersion;

    /**
     * <p>The modification type. Valid values:</p>
     * <ul>
     * <li><p>version: The version is changed. For example, the version is changed from 1 (logs are delivered to one Logstore) to 2 (logs are delivered to two Logstores).</p>
     * </li>
     * <li><p>config: The configuration is changed. For example, the log delivery region or the storage duration of logs is modified.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>version</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    public static ModifySlsDispatchConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySlsDispatchConfigRequest self = new ModifySlsDispatchConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifySlsDispatchConfigRequest setDetailConfig(String detailConfig) {
        this.detailConfig = detailConfig;
        return this;
    }
    public String getDetailConfig() {
        return this.detailConfig;
    }

    public ModifySlsDispatchConfigRequest setLogVersion(Integer logVersion) {
        this.logVersion = logVersion;
        return this;
    }
    public Integer getLogVersion() {
        return this.logVersion;
    }

    public ModifySlsDispatchConfigRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

}
